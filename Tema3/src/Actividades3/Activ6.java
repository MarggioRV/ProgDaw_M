package Actividades3;

public class Activ6 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 7, 1},
            {4, -4, 2},
            {5, 0, 5}
        };
        
        //Declaración_Filas/Columnas
        int filas = matriz.length;
        int columnas = matriz[0].length;

        //Imprimir Matriz Org
        System.out.println("La Matriz contiene: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println();
    
        //Recorremos todos los elementos como si fuera un array
        for (int i = 0; i < filas * columnas - 1; i++) {
            for (int j = 0; j < filas * columnas - i - 1; j++) {
                //Obtener índices (fila, columna) del elemento actual y siguiente
                int fila1 = j / columnas;
                int col1 = j % columnas;
                int fila2 = (j + 1) / columnas;
                int col2 = (j + 1) % columnas;

                //Comparar y hacer swap si es necesario
                if (matriz[fila1][col1] > matriz[fila2][col2]) {
                    int temp = matriz[fila1][col1];
                    matriz[fila1][col1] = matriz[fila2][col2];
                    matriz[fila2][col2] = temp;
                }
            }
        }

        //Imprimir Matriz ya Ordenada
        System.out.println("Y, ordenada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }        
    }
}