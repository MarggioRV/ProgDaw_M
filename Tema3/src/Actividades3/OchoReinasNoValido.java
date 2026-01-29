package Actividades3;

import java.util.Scanner;

public class OchoReinasNoValido {
// ALGORITMO OchoReinas
//  CREAR tablero[8][8] con ceros
//  LEER primeraColumna
//  tablero[0][primeraColumna] 1 ←
//  SI resolver(tablero, 1) = VERDADERO ENTONCES
//  imprimirTablero(tablero)
//  SINO
//  ESCRIBIR "No hay solución con la reina en esa columna"
//  FIN_SI
// FIN_ALGORITMO
    
    static final char CAMINO = '0';
    static final char PIEZA = '#';

    public static void main(String[] args) {

        //Tablero
        char[][] tablero = {
            {'0', '#', '#', '0', '#', '0', '#', '0'},
            {'#', '0', '#', '#', '0', '#', '0', '0'},
            {'0', '#', '0', '0', '0', '0', '#', '#'},
            {'#', '0', '#', '#', '#', '#', '0', '0'},
            {'0', '#', '0', '#', '0', '#', '0', '0'},
            {'#', '0', '#', '0', '#', '0', '#', '0'},
            {'0', '#', '0', '#', '0', '0', '#', '#'},
            {'#', '0', '0', '#', '0', '0', '#', '0'},
        };

        //Matriz solución
        int[][] solucion = new int[tablero.length][tablero[0].length];

        //Mostrar 1era columna
        for (int i = 0; i < tablero.length; i++) {
            char primeraColumna = tablero[i][0]; 
            System.out.println(primeraColumna);
        }

        Scanner teclado = new Scanner(System.in);

        //Imprimir tablero inicial
        impTablero(tablero);

        //Viendo Coordenadas Validad
        int xValor, yValor;
        boolean valido;
        do {
            System.out.println();
            System.out.println("Esc de x (fila 0-" + (tablero.length-1) + "): ");
            xValor = teclado.nextInt();
            System.out.println("Esc y (columna 0-" + (tablero[0].length-1) + "): ");
            yValor = teclado.nextInt();

            valido = !(xValor < 0 || xValor >= tablero.length ||
                       yValor < 0 || yValor >= tablero[0].length ||
                       tablero[xValor][yValor] != CAMINO);

            if(!valido){
                System.out.println("No es válida");
            }
        } while(!valido);

        System.out.println("Elegiste : " + (tablero[xValor][yValor]) + " en ("+xValor+","+yValor+")");

        //Intentar resolver desde coordenadas válidas
        if(resolverDesde(xValor, yValor, tablero, solucion)){
            System.out.println("Solución encontrada:");
            System.out.println();
            impSolucion(solucion);
        } else {
            System.out.println("No hay solución desde esas coordenadas.");
        }

        // //Leer 1era columna
        // System.out.println();
        // System.out.println("Esc valor de x: " );
        // int fila = teclado.nextInt();
        // System.out.println();
        // System.out.println("E" + fila + ": " + tablero[fila][0]);
        teclado.close();
    }


    //1era, detecta la meta
    public static boolean noMeta(int x, int y, char[][] tablero, int[][] solucion){
        if(x == tablero.length - 1 && y == tablero[0].length - 1){
            solucion[x][y]=1;
            return true;
        }
        return false;
    }

    //Ver si es cruzable
    public static boolean esSeguro(int x, int y, char[][] tablero){
        return x >= 0 && x < tablero.length &&
               y >= 0 && y < tablero[0].length &&
               tablero[x][y] == CAMINO;
    }

    public static boolean puedeSaltar(int x, int y, int cambioX, int cambioY, char[][] tablero){
    //Lógica: inicio (x,y), medio (pieza a saltar), final
        int saltoIntermedioX = x + cambioX;      
        int saltoIntermedioY = y + cambioY;
        int saltoDestinoX = x + 2 * cambioX;   
        int saltoDestinoY = y + 2 * cambioY;
        //Comprobando limites
        if(saltoDestinoX < 0 || saltoDestinoX >= tablero.length || 
           saltoDestinoY < 0 || saltoDestinoY >= tablero[0].length){
            return false;
        }
     /* Hay salto, solo si el del medio es una pieza */
        return tablero[saltoIntermedioX][saltoIntermedioY] == PIEZA && tablero[saltoDestinoX][saltoDestinoY] == CAMINO;
    }

    //ResolverDesde 
    public static boolean resolverDesde(int x, int y, char[][] tablero, int[][] solucion){
    
        if(!esSeguro(x, y, tablero)) {
            return false;
        }

        if(solucion[x][y] == 1){
            return false;
        }

        solucion[x][y] = 1;

        if(noMeta(x, y, tablero, solucion)) {
            return true;
        }

        //Movimientos normales
        if(resolverDesde(x+1, y, tablero, solucion)) return true;
        if(resolverDesde(x, y+1, tablero, solucion)) return true;
        if(resolverDesde(x-1, y, tablero, solucion)) return true;
        if(resolverDesde(x, y-1, tablero, solucion)) return true;

        //Movimientos con salto
        if(puedeSaltar(x, y, 1, 0, tablero) && resolverDesde(x+2, y, tablero, solucion)) return true;
        if(puedeSaltar(x, y, 0, 1, tablero) && resolverDesde(x, y+2, tablero, solucion)) return true;
        if(puedeSaltar(x, y, -1, 0, tablero) && resolverDesde(x-2, y, tablero, solucion)) return true;
        if(puedeSaltar(x, y, 0, -1, tablero) && resolverDesde(x, y-2, tablero, solucion)) return true;
           
        //Backtracking***
        solucion[x][y] = 0; 
        return false;
    }
    
    //Funcion_ImpTablero
    public static void impTablero(char[][] tablero){
        System.out.println("Tablero:");
        for(int i=0; i<tablero.length; i++){
            for(int j=0; j<tablero[0].length; j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //Funcion_ImpSolucion
    public static void impSolucion(int[][] solucion){
        System.out.println("Solución:");
        for(int i=0; i<solucion.length; i++){
            for(int j=0; j<solucion[0].length; j++){
                System.out.print(solucion[i][j]+" ");
            }
            System.out.println();
        }
    }
}


