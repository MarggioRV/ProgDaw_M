package Actividades3;

import java.util.Scanner;

/* Actividad: Crea una función que inserta un nuevo entero en la posición que le digas de
parámetro. Si le indicas un parámetro mayor al tamaño actual, rellenará con 0 */

public class Activ5 {
    public static void main(String[] args) {
        int[] vector = {3, 5, 7, 8};
        Scanner teclado = new Scanner(System.in);

        //Imprimir Array sin Modificar
        System.out.println("Vector inicial:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        //Entrada_Valores
        System.out.println();
        System.out.println("Esc el # a insertar (Recordar que se cuenta desde 0):");
        int valor = teclado.nextInt();

        System.out.println("Ahora, en donde hacerlo:");
        int posicion = teclado.nextInt();

        //Llamada
        vector = Agregar(vector, valor, posicion);

        //Imprimir Array Actulizado
        System.out.println("\nEntonces, queda como:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        teclado.close();
    }

    //Función Agrega, con lg especifico
    public static int[] Agregar(int[] array, int valor, int posicion) {
        int longitud = array.length;
        //Se amplia con 0, si la posicion es mayor
        int nuevaLongitud = Math.max(longitud + 1, posicion + 1);
        int[] salida = new int[nuevaLongitud];
        //Copia y pasar hasta la posición del nuevo valor
        for (int i = 0; i < posicion && i < longitud; i++) {
            salida[i] = array[i];
        }
        //Agregar Valor 
        salida[posicion] = valor;
        //Copiar y pasar el resto
        for (int i = posicion; i < longitud; i++) {
            salida[i + 1] = array[i];
        }
        return salida;
    }
}

