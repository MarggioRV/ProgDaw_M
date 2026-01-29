/* 3. Escribir una función que devuelve un array que contiene el valor máximo y mínimo del 
array introducido como parámetro.*/
package Relacion_Ejercicios3;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce 7 números para odenar:");

        for (int i = 0; i < 7; i++) {
        vector = push(vector, teclado.nextInt());
        }
        
        //Sin Ordenar
        System.out.println();
        System.out.println("Vector sin ordenar: ");
            for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" "); // Automatiza la impresión
        }

        //Ordenamiento_Burbuja
        for(int i=0; i < vector.length-1; i++){
            for(int j=0; j < (vector.length-1-i); j++){  
                if(vector[j] > vector[j+1]){  
                    int aux=vector[j];                 
                    vector[j]=vector[j+1];           
                    vector[j+1]=aux;
                }    
            }
        }
        System.out.println();
        System.out.println("\nVector ordenado: ");
            
        for(int i=0;i<vector.length;i++){
        System.out.print(vector[i]+" ");
        } 
        
        //Numero Mayor y Menor
        System.out.println();
        System.out.println("\nEl máximo es: "+ vector[6]);
        System.out.println("El minimo es: "+ vector[0]);
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
}
