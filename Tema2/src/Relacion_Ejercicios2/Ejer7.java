package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer7 {
/*  7. Realiza un programa que introduzca números hasta poner 0 y te diga 
    cuántos positivos y negativos has introducido. */
    public static void main(String[] args) {

        int ContadorNega = 0;
        int ContadorPvo = 0;
        Scanner teclado = new Scanner(System.in);
        int num1; 
        
        do {
            System.out.println("Esc los números (0 para salir): ");
            num1=teclado.nextInt();
        
        //Contadores
        
            if (num1 > 0) {
                ContadorPvo++;  
            }

            if (num1 < 0) { 
                ContadorNega++;  
            }

        } while (num1!=0);

        System.out.println("La cantidad de # Positvos es " + ContadorPvo + ", mientras la de Negativos es " + ContadorNega);
        teclado.close();
    }
}
