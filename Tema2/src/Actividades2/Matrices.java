package Actividades2;

import java.util.Scanner;

public class Matrices {

    public static void imprimeMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        //vamos a solicitar filas y columnas
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce #filas: ");
        int filas=teclado.nextInt();
        System.out.println("Introduzca #Columnas ");
        int columnas=teclado.nextInt();

        //Generar la matriz dinámica
        int[][] matriz = new int[filas][columnas];

        // for(int i=0; i<filas; i++){
        //     matriz[i][j]=(int)Math.random()*(100)+1;
        // }                
  
    }

    //Imprimir la matriz(
    //imprimeMatriz(matriz);

    //suma de los elementos de cada fila
    
    //Recorrer columnas
    // for(int i=0; i<columnas; j++){
    // int total=0;
    // for(int i=0; i<columnas; j++);
    // int total=total+matriz[j][i];
    // }
    
}
