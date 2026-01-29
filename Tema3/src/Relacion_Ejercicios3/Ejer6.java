/* 6. Escribir una función que dadas dos matrices devuelve la matriz donde la primera columna es la 
suma, la segunda columna el producto y la tercera columna la media de las correspondientes columnas de
las matrices pasadas como argumento. */
package Relacion_Ejercicios3;
public class Ejer6 {
    public static void main(String[] args) {

        //Declaración_matrices 

        double[][] matriz1 = {
            {1, 2, 3}, 
            {4, 5, 6}
        };

        double[][] matriz2 = {
            {7, 8, 9}, 
            {10, 11, 12}
        };

        //Obtener calculo_filas
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        //Llamada
        double[][] rpta = combinarMatrices(matriz1, matriz2, filas, columnas);

        //Imprimir 
        for (int i = 0; i < rpta.length; i++) {
            System.out.println("Fila " + i + ":");
            System.out.println("  Suma: " + rpta[i][0]);
            System.out.println("  Producto: " + rpta[i][1]);
            System.out.println("  Media: " + rpta[i][2]);
        }

    }

    //Función combinadora
    public static double[][] combinarMatrices(double[][] m1, double[][] m2, int filas, int columnas) {
        double[][] rpta = new double[filas][3]; /* Exactamente, las 3 */

        for (int i = 0; i < filas; i++) {
            double suma = 0;
           /*  El contador poducto No puede ser 0, debido a la logica (1 * x = x) */
            double producto = 1;
            double media = 0;
            
            /*  Sin +=, no se va acumlando las operaciones en el recorrido */
            for (int j = 0; j < columnas; j++) {
                suma += m1[i][j] + m2[i][j];
                producto *= m1[i][j] * m2[i][j];
                media += (m1[i][j] + m2[i][j]) / 2.0;
            }

            rpta[i][0] = suma;
            rpta[i][1] = producto;
            rpta[i][2] = media;
        }

        return rpta;
    }
  
}
