package Actividades5;

import java.util.ArrayList;

public class Pag28ActivS {
    
    // MÉTODOS GENÉRICOS (TEMPLATE)

    //Imprimir arrays de cualquier tipo T
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    //Imprimir ArrayList de cualquier...
    public static <T> void imprimirArray(ArrayList<T> array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    //ACTIVIDADES

    //Actividad1: Intercambiar dos posiciones...entre si
    public static <T> void intercambiaPos(T[] vector, int pos1, int pos2) {
        T aux = vector[pos1];
        vector[pos1] = vector[pos2];
        vector[pos2] = aux;
    }

    //Actividad2: Buscar un valor en un array...
    public static <T> Integer buscarArray(T[] array, T valor) {
        int pos = 0;
        for (T s : array) {
            if (s.equals(valor))
                return pos;
            pos++;
        }
        return -1; // Devuelve la posición o -1 si no está
    }


    //Activadad3: Devuelve el máximo de dos valores
    //Usa Comparable: Interfaz que define el orden natural de los objetos 
    public static <T extends Comparable<T>> T maximoValor(T valor1, T valor2) {
        if (valor1.compareTo(valor2) > 0) return valor1;
        else return valor2; //Devuelve el mayor de los dos valores
    }

    //MAIN 
    public static void main(String[] args) {

        // Creamos un array de Double
        Double[] numeros = {1.0, 3.2, 5.7, 7.2, 9.9, 2.0, 5.1, 6.3};

        //Imprimimos el array original
        imprimirArray(numeros);

        //Actividad1
        intercambiaPos(numeros, 1, 6); //Intercambio
        imprimirArray(numeros); 

        // Buscamos el valor 23 en el array (no está)
        System.out.println("Está en la posición: " + buscarArray(numeros, 23));
    }
}

