// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerH {
/*     8. Desarrolla un algoritmo que permita calcular el promedio de notas que se introducen 
    por teclado hasta leer -1 */
    public static void main(String[] args) {
        
        double nota;  
        double sumaNota = 0;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esc las notas, o -1 para salir: ");

        do {
            nota = teclado.nextDouble();
              if (nota != -1) { //Acumula si no es -1
                  sumaNota += nota;   //Es a sumaNota = sumaNota + nota
                  contador++;
              }

        } while (nota != -1);
        double media = sumaNota / contador;
        System.out.println("Su media es: " + media);
    }
}
