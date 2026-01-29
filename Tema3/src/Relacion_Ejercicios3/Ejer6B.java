/* 6. Escribir una función que dadas dos matrices devuelve la matriz donde la primera columna es la suma, 
la segunda columna el producto y la tercera columna la media de las correspondientes columnas de las 
matrices pasadas como argumento. */
package Relacion_Ejercicios3;
public class Ejer6B {
    public static void main(String[] args) {

        // Declaración de matrices
        double[][] matriz1 = {
            {1, 2, 3}, 
            {4, 5, 6}
        };

        double[][] matriz2 = {
            {7, 8, 9}, 
            {10, 11, 12}
        };

        //Llamada a la función
        double[][] resultado = operarMatrices(matriz1, matriz2);

        //Impresión
        System.out.println("Resultado de la operación entre matrices:");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s%n", "SUMA", "PRODUCTO", "MEDIA");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f%n", 
                              resultado[i][0], 
                              resultado[i][1], 
                              resultado[i][2]);
        }
    }

    // Función que calcula suma, producto y media
    public static double[][] operarMatrices(double[][] a, double[][] b) {

        int filas = a.length;
        int columnas = a[0].length;

        double[][] rpta = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            //Columna_SUMA
            rpta[i][0] = a[i][0] + b[i][0];

            //Columa_PRODUCTO
            rpta[i][1] = a[i][1] * b[i][1];

            //Columna_MEDIA
            rpta[i][2] = (a[i][2] + b[i][2]) / 2.0;
        }

        return rpta;
    }
}
