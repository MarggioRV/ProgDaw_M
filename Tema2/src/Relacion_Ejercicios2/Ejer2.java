package Relacion_Ejercicios2;

import java.util.Scanner;

/* 2. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta 
que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
A partir de la hora 41, se pagan a 16 euros la hora.
Ejemplos de salida:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros
 */

public class Ejer2 {
    public static void main(String[] args) {

        //Leer de teclado la altura y el radio
        Scanner teclado=new Scanner(System.in);

        //Entrada
        System.out.println("Esc las horas hechas: ");
        int num1 = teclado.nextInt();

        if (num1 <= 40) { /* Condicionales para cada formula  */
            int resultado1; /* Se debe declarar otra nueva variable */
            resultado1 = Formula1(num1);
            System.out.println("El sueldo semanal que le corresponde es de: " + resultado1 + " euros"); 
        } /* Cada parte de la rpta se agrega con '+'' */

        else if (num1 > 40) {
            int resultado2; /* Lo dicho */
            resultado2 = Formula2(num1);
            System.out.println("El sueldo semanal que le corresponde es de: " + resultado2 + " euros");
        } 
      }

    public static int Formula1(int num1) { /* F' para caso de '< 40' */
    return 12*num1;}

    public static int Formula2(int num1) { /* F' cuando sea '40 <' , mulp solo el resto */
    return (40*12)+((num1-40)*16);}
}



