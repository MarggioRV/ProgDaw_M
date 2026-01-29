// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerE {
/* 5. Desarrolla un algoritmo que calcule el factorial de un número introducido y muestre 
el resultado. Es decir, si introduces 4 te devolverá el resultado de 4!=4*3*2*1 */
        public static void main(String[] args) {

        //Lectura
        int producto=1;
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        numero=teclado.nextInt();
        
        //Factorizacion con For
        for(int i=1; i<=numero;i++){
            producto=producto*i;
        }
        System.out.println(producto); /* Falla y da 0 con numeros cuyas cifras sea +3 */
    }
}
