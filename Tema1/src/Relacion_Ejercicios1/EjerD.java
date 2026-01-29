// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerD {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int año;
        
        //LeerAño
        System.out.println("Esc el año");
        año=teclado.nextInt(); teclado.nextLine();

        //Llamada
        Bisiesto(año);

        teclado.close();
    }

    public static void Bisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) { /* La logica siempre es True||False */
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}   
