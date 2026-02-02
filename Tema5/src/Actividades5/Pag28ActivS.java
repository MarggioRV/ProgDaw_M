package Actividades5;

import java.util.ArrayList;

public class Pag28ActivS {
    
    //MÉTODOS GENÉRICOS
  

    //Imprimir arrays de cualquier tipo T
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    //Imprimir ArrayList de cualquier tipo T
    public static <T> void imprimirArray(ArrayList<T> array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    
    //ACTIVIDADES
  
    //Actividad 1: Intercambiar dos posiciones de un array
    public static <T> void intercambiaPos(T[] vector, int pos1, int pos2) {
        T aux = vector[pos1];
        vector[pos1] = vector[pos2];
        vector[pos2] = aux;
    }

    //Actividad 2: Buscar un valor en un array
    public static <T> Integer buscarArray(T[] array, T valor) {
        int pos = 0;
        for (T s : array) {
            if (s.equals(valor))
                return pos; //Devuelve la posición si encuentra el valor
            pos++;
        }
        return -1; //-1 de no estar
    }

    //Actividad 3: Devuelve el máximo de dos valores
        //Comparable: Interfaz que define el orden natural de los objetos
    public static <T extends Comparable<T>> T maximoValor(T valor1, T valor2) {
        if (valor1.compareTo(valor2) > 0) return valor1;
        else return valor2; //Reg el mayor de los dos valores
    }

    //MAIN
    public static void main(String[] args) {

        //Array_Double
        Double[] numeros = {1.0, 3.2, 5.7, 7.2, 9.9, 2.0, 5.1, 6.3};

        //Imprimir array original
        System.out.print("Array original: ");
        imprimirArray(numeros);

        //Actividad 1
        intercambiaPos(numeros, 1, 6);
        System.out.print("Array después del intercambio: ");
        imprimirArray(numeros);

        //Actividad 2
        System.out.println("Posición del 23.0: " + buscarArray(numeros, 23.0));

        //Actividad 3
        Double max = maximoValor(7.5, 3.2);
        System.out.println("El mayor entre 7.5 y 3.2 es: " + max);
    }
}
