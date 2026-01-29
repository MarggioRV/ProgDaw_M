/* 4. Escribir un programa que valide el décimo de la bonoloto. Tendrás un array con los valores 
correctos y otro el que introduzca el usuario. El programa verificará cuántos aciertos ha tenido. */
package Relacion_Ejercicios3;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //Loteria
        int[] LOTERIA={10,20,30,40,50,60};
        
        //Insertar un Valores
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce tus #s de la suerte: ");
        
        //For que solo permite 6 valores
        for (int i = 0; i < 6; i++) {
        vector = push(vector, teclado.nextInt());
        }
        
        //Sin Ordenar
        System.out.println("Tus números son: ");
            for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" "); //Automatiza la impresión
        }
        
        //Comprobación Inicial
        if(Arrays.equals(LOTERIA, vector)){ /* Comparación Literal */
            System.out.println();
            System.out.println("\n¡Gamaste! Acertaste todos los #s");
        //Aplicación del conteo
        } else if (ContarNRepetidos(vector, LOTERIA) == 6) {
            System.out.println();
            System.out.println("\n¡Ganaste! Aunque los #s no estan orden correcto...");
        }else{
            System.out.println();
            System.out.println("\nAcertaste: " + ContarNRepetidos(vector, LOTERIA) + " número(s)");
        } 

        teclado.close();
    }
     
    //Función push
    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null) {longitud=0;}
        else {longitud=array.length;}
        //Crea un array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //copiar lo que has esñ ese momento 
        for (int i=0;i<longitud;i++){
            salida[i]=array[i];
        }
        salida[longitud]=valor;
        return salida;
    }
    
    //Contador_NRepetidos
    public static int ContarNRepetidos(int[] vector, int[] LOTERIA) {
        int contador = 0;
        
        /* 2 recorridos paralelos */
        for (int i=0; i<vector.length; i++) { 
            for (int j=0; j<LOTERIA.length; j++) {
                /* Comparamos de 1 en 1 */
                if (vector[i] == LOTERIA[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

}


