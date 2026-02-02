package Actividades5;

import java.util.ArrayList;
import Actividades5.clases.Lectores;


public class Listas {
    public static void main(String[] args) {
        //Array_enteros 
        int[] num = { 1, 2, 3, 4 }; 
        Lectores.leerInt(num); 
        
        //Array_chars 
        char[] letras = { 'A', 'B', 'C' }; 
        Lectores.leerChar(letras); 
        
        //Array_Strings 
        String[] palabras = { "Uno", "Dos", "Tres" }; 
        Lectores.leerString(palabras); 

        //Array Doubles
        Double[] decimales = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5};
        
        // ImprimirArrayGenerico(decimales);
        
        //ArrayList_Intenger 
        ArrayList<Integer> lista = new ArrayList<>(); 
            lista.add(10); 
            lista.add(20);
            lista.add(30);
            Lectores.leerArrayListIntenger(lista);

        //Vector Bidimensional
        
        int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        Lectores.leerMatrizInt(matriz);
    }
}
