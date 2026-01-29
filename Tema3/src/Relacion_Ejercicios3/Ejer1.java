package Relacion_Ejercicios3;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //inserta un valor
        vector=push(vector,3);
        vector=push(vector,5);

        int num;
        int opcion;

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce #s o esc 0 para concluir ");
            do { /* Do while para con el vector */
                num = teclado.nextInt();
                if (num != 0) {
                    vector=push(vector, num);
                }
            } while (num !=-0);
        
        //Imprimir Vector actulizado
        System.out.println("\nTu nuevo vector es: ");
        
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        
        //Imprimir la posible rpta de la Funcion Pop
        System.out.println();
        System.out.println("¿Quieres elimnar el ultimo numero? Selecciona la opción (#) del indice");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println();
        opcion = teclado.nextInt();
        if (opcion == 1) {
            //Llamada
            vector = pop(vector);  
            System.out.println("Entonces queda como: ");
            for(int i=0;i<vector.length;i++){
                System.out.print(vector[i]+" ");
            }
        }
        else
        System.out.println("Entonces, adios: ");

        teclado.close();
    }

    //Función Push
    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null) {longitud=0;}
        else {longitud=array.length;}
        //Crea un array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //copiar lo que hasta en ese momento 
        for (int i=0;i<longitud;i++){
            salida[i]=array[i];
        }
        salida[longitud]=valor;
        return salida;
    }
    
    public static int[] pop(int[] array) { 

        int eliminado = array[array.length - 1]; /* Se guarda el último # */
        System.out.println();
        System.out.println("Número eliminado: " + eliminado);
        System.out.println();

        int[] salida = new int[array.length - 1]; /* Actulizado */
        //Se copia todo, menos el último
        for (int i = 0; i < salida.length; i++) {
            salida[i] = array[i]; 
        }

    return salida; 
    }
}


