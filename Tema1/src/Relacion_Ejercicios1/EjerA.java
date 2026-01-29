// package Relación_Ejercicios1.src;

import java.util.Scanner;

/* 1. Desarrolla un algoritmo que calcule el volumen de un cilindro, conocidos su altura y 
diámetro e imprima el resultado. Similar al Actv7*/

public class EjerA {
 
final static double PI=3.14159;
    public static void main(String[] args) {

        //Leer de teclado la altura y el radio
        Scanner teclado=new Scanner(System.in);
        double altura;
        double radio;

        //Leer Parámetros
        System.out.println("Esc la h:");
        altura= teclado.nextDouble(); teclado.nextLine(); //Por si no lee el N*
        System.out.println("Esc el r:");
        radio=Double.parseDouble(teclado.nextLine());
        System.out.println("El volumen del cilindro es: " + imprimeVolumenCilindro(altura, radio));
    }

    public static double imprimeVolumenCilindro(double altura, double radio) { /* Si le quitas el static, falla */
        return PI * radio * radio * altura;
    }
}