/* 7. Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada 
una posición en el sentido de las agujas del reloj. La matriz debe tener 5 filas por 5 columnas 
y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz 
original como la matriz resultado.*/
package Relacion_Ejercicios3;
public class Ejer7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        //Doble for para rellenar
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matriz[i][j] = (int)(Math.random() * 101);

        //Llamadas e Impresiones

        //Matriz Original
        imprimirMatriz(matriz, "Matriz Original");

        //Rotación
        matriz = rotarMatriz(matriz);

        //Actulización
        imprimirMatriz(matriz, "Matriz Rotada");
    }

    //Función rodadora
    public static int[][] rotarMatriz(int[][] m) {
        int n = m.length;
        int[] temp = new int[n * n]; //Arreglo temporal
        int k = 0;  //contador para este

        //Se guardan todos los "e"
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = m[i][j];

        //Rotar hacia adelante
        int last = temp[temp.length - 1]; //Se guarda el último elemento
        for (int i = temp.length - 1; i > 0; i--)
            temp[i] = temp[i - 1]; //se mueve hacia la derecha, tipo teoría de ordenación
        temp[0] = last;

        //Se vuelve a llenar
        k = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = temp[k++]; //Salto de valores

        return m;
    }

    //Función para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        System.out.println("-------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

    

