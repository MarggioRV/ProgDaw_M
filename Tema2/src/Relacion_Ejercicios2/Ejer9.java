package Relacion_Ejercicios2;

import java.util.Scanner;
/* Es el 8, pero recursico */

public class Ejer9 {

    //Lectura_Número 
    public static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int num1; 
    
        do {
            System.out.println("Esc la cantidad de términos de la serie de Fibonacci: ");
            num1 = teclado.nextInt();
            if (num1 <= 0) {
                System.out.println("El # debe de ser x > 0.");
            }
        } while (num1 <= 0);

        teclado.close();
        return num1;
    }
    
    //Los 1ros # términos de la serie de Fibonacci
    public static void mostrarFibonacciRec(int a, int b, int n, boolean esPrimero) {
        if (n == 0) {
            System.out.println(); 
            return;
        }
        if (esPrimero) {
            System.out.print(a); 
        } else {
            System.out.print(", " + a);
        }
        mostrarFibonacciRec(b, a + b, n - 1, false);
    }
    
    //Invocacón
    public static void main(String[] args) {
        int num1 = leerNumero();
        System.out.println("Los primeros " + num1 + " términos de la serie de Fibonacci son:");
        mostrarFibonacciRec(0, 1, num1, true);
    }
}

