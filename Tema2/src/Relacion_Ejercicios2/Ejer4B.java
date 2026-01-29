package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer4B {
    /* La 4ta, pero siendo una variación con do while */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    //Valido = True
        boolean valido;

    //Leer nota1
        double nota1 = 0;

        do {
            System.out.println("Esc la nota1: ");
            valido = teclado.hasNextDouble(); /* Esto checkea si la entrada es un #decimal válido */
                if (valido) {
                nota1 = teclado.nextDouble(); /* Entonces, de serlo, lo lee */
                } else {
                System.out.println("Entrada inválida. Esc un número válido:");
                }
            teclado.nextLine(); 
            } while (!valido);

    //Leer nota2
        double nota2 = 0;

        do {
            System.out.println("Esc la nota2: ");
            valido = teclado.hasNextDouble();
                if (valido) {
                nota2 = teclado.nextDouble();
                } else {
                System.out.println("Entrada inválida. Esc un número válido:");
                }
            teclado.nextLine(); 
            } while (!valido);

    //Calcular la x̅
         double media = (nota1 + nota2) / 2;

    //1era Divergencia
        if (media >= 5) {
            System.out.println("Alumno aprobado. Su Media es: " + media);
        }
        else if (media < 5) {
        String resultado; /* Declarar, por separado */
        
        do { 
            System.out.println("¿Cúal fue el resultado de su Examen_Recuperación? (Apto o No Apto)");
            //Leer 3
            resultado = teclado.nextLine();

    //2era Divergencia
            if (resultado.equals("Apto")) { /* Falla con variaciones, alternativa: equalsIgnoreCase */
                System.out.println("Entoces, tu no final es 5");
            }
            else if (resultado.equalsIgnoreCase("No Apto")) {
                System.out.println("Bueno, tu nota final queda en: " + media);
            }

        } while ((!resultado.equals("Apto") && !resultado.equalsIgnoreCase("No Apto")));
        
        teclado.close();
    }
  }
}
