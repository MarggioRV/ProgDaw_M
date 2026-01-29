// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerF {
    /*6. Desarrolla un algoritmo que obtenga e imprima el valor de Y a partir de 
    la ecuación: y= 3x a las 2 +7x–15, introduciendo el valor que queramos de X. */
    public static void main(String[] args) {
        
        //Leer
        double x;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Esc el valor X");
        x = teclado.nextInt(); 
          
        //Llamada
        double y = Formula(x); /* Importante el orden de declaración */
        //Imprimir RPTA
        System.out.println("Y: " + y);

        teclado.close();

    }
    
    //Formula dada a despejar
    public static double Formula(double x) {
        return 3 * x * x + 7 * x - 15;
    }

}   
