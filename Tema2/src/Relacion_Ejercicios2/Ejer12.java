package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer12 {
    
    //Imprimir las RPTAs
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esc los dos #s: ");
        
        //Leer los valores de a y b
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        //Resultados Secantes
        int mcd = calcularMCD(a, b);
        int mcm = calcularMCM(a, b);

        System.out.println("Si su MCD es: " + mcd + "; entoces, su MCM es " + mcm);

        teclado.close();
    }

    //Calcular MCD
    public static int calcularMCD(int a, int b) {

        // Calc el V.Absoluto
        a = Math.abs(a);
        b = Math.abs(b);
        
        //MCD
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    //Calcular MCM, que según el alagoritmo de Euclides, sería: MCM(a,b) = (a*b) / MCD(a,b)
    public static int calcularMCM(int a, int b) {
        int mcd = calcularMCD(a, b);
        return Math.abs(a * b) / mcd;
    }

}
