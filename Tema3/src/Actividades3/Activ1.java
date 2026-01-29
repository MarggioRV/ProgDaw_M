package Actividades3;

import java.util.Arrays;
import java.util.Scanner;

public class Activ1 {
    public static void main(String[] args) {
        int[] notas = {5, 4, 9, 1}; 
        int num;
        Scanner teclado=new Scanner(System.in);

        //Insertar un Valores
        System.out.println(Arrays.toString(notas));
        System.out.println();
        
        System.out.println("Seleciona el i, de para buscar e imprimir el #");
        num= teclado.nextInt(); teclado.nextLine();
        
        //RPTA
        buscarN(notas, num);
    }
    
    //Recorrido a notas
    public static void buscarN(int[] notas, int num) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == num) {  /* Requisita que el # sea igual para dar su indice*/
                System.out.println("El # está en la posición: " + i);
                return;
            }
        }
        System.out.println("-1");
    }
}
