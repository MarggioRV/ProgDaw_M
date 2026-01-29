package Actividades5.clases;

import java.util.ArrayList;

public class Lectores {
    public static void leerInt(int[] datos) {
        System.out.println("Leyendo array de enteros:");
        for (int a : datos) {
            System.out.println("- " + a);
        }
    }

    public static void leerChar(char[] datos) {
        System.out.println("Leyendo array de chars:");
        for (char b : datos) {
            System.out.println("- " + b);
        }
    }

    public static void leerString(String[] datos) {
        System.out.println("Leyendo array de Strings:");
        for (String c : datos) {
            System.out.println("- " + c);
        }
    }

    public static void leerDouble(double[] datos) {
        System.out.println("Leyendo array de doubles:");
        for (double d : datos) {
            System.out.println("- " + d);
        }
    }

    public static void leerArrayListIntenger(ArrayList<Integer> lista) {
        System.out.println("Leyendo lista dinámica de enteros:");
        for (Integer e : lista) {
            System.out.println("- " + e);
        }
    }

    public static void leerMatrizInt(int[][] matriz) {
        System.out.println("Leyendo matriz de enteros:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println(); 
        }
    }

    //Metodo Generico
    public static <T> void ImprimirArrayGenerico(T[] datos) {//ArrayList<T>();
        System.out.println("Leyendo array genérico:");
        for (T elemento : datos) {
            System.out.println(elemento + "- ");
        }
    }
}
