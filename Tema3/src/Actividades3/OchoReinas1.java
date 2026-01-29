package Actividades3;

import java.util.Scanner;

public class OchoReinas1 {

    static final int N = 8; //Tamaño del tablero (8x8)

    public static void main(String[] args) {
        int[][] tablero = new int[N][N]; //Esto es = a Inicializar con ceros 
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la columna (0-7) donde colocar la primera reina en la fila 0: ");
        int primeraColumna = teclado.nextInt();

        //Validacion_EntradaUsuario
        if (primeraColumna < 0 || primeraColumna >= N) {
            System.out.println("Columna inválida. Debe estar entre 0 y 7.");
            return;
        }

        tablero[0][primeraColumna] = 1; //Coloca la primera reina

        if (resolver(tablero, 1)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución con la reina en esa columna.");
        }
        teclado.close();
    }

    //Función para poner las Reinas, fila x fila
    public static boolean resolver(int[][] tablero, int fila) {
        // Caso base: todas las reinas colocadas
        if (fila == N) {
            return true;
        }

        //Intentar colocar una reina en cada columna
        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1; // Colocar
                //Para la sg fila
                if (resolver(tablero, fila + 1)) {
                    return true;
                }
                tablero[fila][col] = 0; /* Si no funciona, quitar la reina (backtracking) */
            }
        }

        return false; 
    }

    //Verifica si es seguro colocar una reina en (fila, col)
    public static boolean esSeguro(int[][] tablero, int fila, int col) {
        // Revisar columna hacia arriba
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        }

        //Revisar diagonal superior izquierda
        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        //Revisa diagonal superior derecha
        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        return true; 
    }

    //Imprimir el tablero con las posiciones de las reinas
    public static void imprimirTablero(int[][] tablero) {
        System.out.println("Solución encontrada:\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((tablero[i][j] == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
    }
}