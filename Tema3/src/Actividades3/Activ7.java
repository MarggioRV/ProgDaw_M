package Actividades3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Activ7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        String nombre = ""; /* Manera de inicilizar una variables String */

        while (!nombre.equalsIgnoreCase("fin")) {
            nombre = teclado.nextLine().trim(); /* Se recomienda usar trim para elimniar espacios */
            //Disyuncion para evitar nombres repetidos
            if (!nombre.equalsIgnoreCase("Fin")) {
                if (nombres.contains(nombre)) {
                    System.out.println("Esc otro nombre");
                } else {
                    nombres.add(nombre); /* Agrega otro elemento */
                }
            }
        }
        
        //0rdendena la colección creada
        Collections.sort(nombres);
        
        //Area de Impresion 
        System.out.println("Nombres ordenados:");
        System.out.println();
        
        /* Contador para la enumaracion */
        System.out.println(nombres.toString());
        
        /* Contador para la enumaracion */
        int contador = 1;

        /* Impresion ya Ordenada y Enumerada */
        for (String n : nombres) {
            System.out.println(contador + ". " + n);
            contador++;
        }
        teclado.close();
    }
}

 