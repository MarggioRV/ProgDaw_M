package Relacion_Ejercicios2;

import java.util.Scanner;

/* 4. Calcula la nota de un trimestre de la asignatura Programación. 
 El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. 
 Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado 
 y se mostrará la media. En caso de que la media sea un número menor que 5, el alumno habrá 
 tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se 
 debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). 
 Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene 
 la nota media anterior. */

public class Ejer4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota1;
        double nota2;
         
        //Leer Parametros
        System.out.println("Esc nota1: ");
        nota1 = teclado.nextInt();
        System.out.println("Esc nota2: ");
        nota2 = teclado.nextInt();

        //Calcular la x̅
        double media = (nota1 + nota2) / 2.0;

        //1era Divergencia
        if (media >= 5) {
            System.out.println("Alumno aprobado. Su Media es: " + media);
        }
        else if (media < 5) { 
            System.out.println("¿Cúal fue el resultado de su Examen_Recuperación? (Apto o No Apto)");
        
        //Leer Parametros 2
        teclado.nextLine();  //Para que lea la linea entera
        String resultado = teclado.nextLine();
        
        //2era Divergencia
            if (resultado.equals("Apto")) { //Falla con variaciones, alternativa: equalsIgnoreCase
                System.out.println("Entoces, tu no final es 5");
            }
            else if (resultado.equalsIgnoreCase("No Apto")) {
                System.out.println("Bueno, tu nota final queda en: " + media);
            }
        }
        teclado.close();
    } 
}