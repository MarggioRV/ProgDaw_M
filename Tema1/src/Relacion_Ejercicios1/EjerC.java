// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerC {
/* 3. Desarrolla un algoritmo que indique cuántas veces es divisible un número por 2. 
(Usa la operación Módulo) */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Esc un numero");
        int num = teclado.nextInt(); 

        int contador=0;
        //Bucle 
        while (num % 2 == 0 && num != 0) { /* Mientras no sea = 0 */
            num = num % 2;  /* No sirve con todas las variables */
            contador++;
        }
        System.out.println("La veces que tu # es divisible entre 2 es: " + contador);
        teclado.close();
    }
}
