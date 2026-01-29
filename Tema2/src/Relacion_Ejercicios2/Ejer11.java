package Relacion_Ejercicios2;

import java.util.Scanner;
/* '11', similar a la 4B, pero con más funciones. Siendo Procedural. */

public class Ejer11 {
    public static void main(String[] args) {
        int opcion;
        boolean salida=false;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("***#####***** CALCULADORA DAW *****#####***");
            System.out.println("--------------------------------------------");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("--------------------------------------------");
            System.out.println("Sino, introduce -1 para salir: ");
            System.out.println("--------------------------------------------");

            opcion=teclado.nextInt();

            switch(opcion){

                case 1:
                    sumar(teclado);
                    break;
                case 2:
                    restar(teclado);
                    break;
                case 3:
                    multiplicar(teclado);
                    break;
                case 4:
                    dividir(teclado);
                    break;
                case -1:
                    System.out.println("¡Adiós!");
                    break;
                        
                default: //Caso -1
                    salida=true;
                    System.out.println("Adiooooos...");
            }
        } while (opcion!=-1);
        teclado.close();
    }

    //F.Sumar
    public static void sumar(Scanner teclado) {
        System.out.println("Introduzca los #s :");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println("=> La suma es: " + (a + b));
    }

    //F.Restar
    public static void restar(Scanner teclado) {
        System.out.println("Introduzca los #s ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println("=> La resta es: " + (a - b));
    }

    // F.Multiplicar
    public static void multiplicar(Scanner teclado) {
        System.out.println("Introduzca los #s ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println("=> La multiplicación es " + (a * b));
    }

    // F.División
    public static void dividir(Scanner teclado) {
        System.out.println("Introduzca los #s ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println("=> La divición es " + (a / b));
    }
} 

