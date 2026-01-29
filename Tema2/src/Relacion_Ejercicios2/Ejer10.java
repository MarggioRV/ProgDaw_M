package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer10 {

/* 10. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay 
dentro de un número indicado por teclado. Genera dos funciones, una para que devuelva 
el número de pares y otra para el número de impares. Ejemplo de salida: El 406783 
contiene 4 dígitos pares y 2 dígitos impares. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        if (num == 0) { /* Caso especial para el número 0, recorde que es que par */
        System.out.println("El 0 contiene 1 dígito par y 0 dígitos impares.");
        } else {
        
        int pares = contarDigitosPares(num);
        int impares = contarDigitosImpares(num);
        
        System.out.println("Entonces, " + num + " tiene " + pares + " digito(s) par(es) y " + impares + " dígito(s) impar(es).");
        } 
        
        teclado.close();
    }
    
    //Función que cuentas Pares
    public static int contarDigitosPares(int num) {
        int contador = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            num /= 10;
        }
        return contador;
    }
    
    //Función que cuentas Impares
    public static int contarDigitosImpares(int num) {
        int contador = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                contador++;
            }
            num /= 10;
        }
        return contador;
    }
}


