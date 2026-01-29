// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerG {
/*     7. Desarrolla un algoritmo que permita leer dos valores distintos, 
    determinar cual de los dos valores es el mayor y escribirlo. */

    public static void main(String[] args) {
        
        //Lectura
        double num1; 
        double num2;
        Scanner teclado = new Scanner(System.in);
         
        //Introdución
        System.out.println("Esc el #1: ");
        num1 = teclado.nextInt(); 
        System.out.println("Esc el #2: ");
        num2 = teclado.nextInt(); 
        
        //Salida, luego de disyunciones
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que" + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que" + num1);
            
        } else{
            System.out.println("Son iguales");
        }
        teclado.close();
    } 
}
