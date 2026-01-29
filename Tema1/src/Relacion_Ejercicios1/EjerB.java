// package Relación_Ejercicios1.src;

import java.util.Scanner;

public class EjerB {
/* 2. Desarrolla un algoritmo que permita saber si un número introducido es mayor, 
menor o igual a cero. */

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double num;   

        //Leer Parámetros
        System.out.println("Esc tu número");
        num=teclado.nextDouble(); teclado.nextLine();
        if (num == 0) {
            System.out.println("Tu numero = " + num);
        } else if  (num > 0){
            System.out.println("Tu numero = " + num + ", es mayor que 0");
        }else{
            //Caso por default, cualquier numero que no sea mayor o igual que 0, es menor
            System.out.println("Tu numero = " + num + ", es menor que 0");
        }

    }

}
