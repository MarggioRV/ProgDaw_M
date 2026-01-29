package Actividades3;

import java.util.Arrays;
import java.util.Scanner;

/* Actividad: Crea una función que borra un valor en el array. Ej: Quitar 2 → {3,5,7,8} */
public class Activ4 {
    public static void main(String[] args) {

        //Array y variable
        int[] array = {3,5,7,8};
        int borrar;
        
        //Insertar un Valores
        Scanner teclado=new Scanner(System.in);
        do {
        System.out.println("Esc un # del siguiente arreglo para borrarlo: " + Arrays.toString(array));
        /* Usar array, solo imprimiria una cadena con simbolos */ 
        borrar = teclado.nextInt();
        } while (borrar < 3 || borrar > 8); //Rango Valido, asi no contamos otros #
        System.out.println();
        
        //Se completa los elementos para sacar el nuevo Array
        int[] nuevoArray = PopMore(array, borrar);
        
        //Impresión

        /*==Por Metodo Integrado==*/
        System.out.println("Quedaría como: " + Arrays.toString(nuevoArray));
        System.out.println();
        
        /*==Por Metodos No Integrados==*/

        /* Por for */
        System.out.println("Repito:"); 
        for(int i=0; i<nuevoArray.length; i++){
            System.out.print(" " + (nuevoArray[i]));
        }

        /* Por for-each */
        System.out.println("\nRepito por 3ra vez:"); /* +Simple, pero no usa indice, no sirve en ciertos casos.*/
        for(int i: nuevoArray){
            System.out.print(" "+ (i));
        }
        
        teclado.close();
    }
    
    //Funcion para no borrar solo el último valor
    public static int[] PopMore(int[] array, int valor){
        int contador=0;
        //Contador con for each
        for (int num:array) {
            if (num==valor) { /* Cualq E que sea = # */
                contador++;
            }
        }
        //Nuevo Array, con tamaño justo
        int [] nuevoArray= new int[array.length-contador];
        int indice=0; /* Es necesario ingresar un indice para el nuevo array */
        //Rellenar el Array, obviando al #
        for (int num:array) {
            if (num!=valor) { /* Cualq elemento que No sea el mismo # */
                nuevoArray[indice]=num;
                indice++; /* Desde el indice, reemplaza al anterior */
            }
        }
        return nuevoArray;
    }
}
