package Relacion_Ejercicios2;

import java.util.Scanner;
/* 8. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
   El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula 
   sumando los dos anteriores, por lo que tendríamos que los términos son: 
   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...El número n se debe introducir por teclado. */

public class Ejer8 {
    
   //Lectura_Número
   public static int leerNumero() {
         Scanner teclado = new Scanner(System.in);
         int num1; /* En otro caso, se puede juntar: int num1 = teclado.nextInt();  */

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
   public static void mostrarFibonacci(int num1) {
         int a = 0, b = 1;

         System.out.println("Los primeros " + num1 + " términos de la serie de Fibonacci son:");

         for (int i = 0; i < num1; i++) {
           
         if (i == 0) 
            {
            System.out.print(a);
            } else if (i == 1){
            System.out.print(", " + b);
            } else {
               int siguiente = a + b;
               System.out.print(", " + siguiente);
               a = b;
               b = siguiente;
            }
         }

         System.out.println(); 
   }

   //Invocacón
   public static void main(String[] args) {
      int num1 = leerNumero();
      mostrarFibonacci(num1);
   }
}
