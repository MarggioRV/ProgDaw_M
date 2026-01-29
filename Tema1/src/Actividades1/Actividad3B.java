// package Actividades.src;
import java.util.Scanner;

public class Actividad3B {
//Pag 16, Actvs 2
    public static void main(String[] args) {
        // Factorizar el número
        // int producto=1,numero=5;
        // for(int i=1;i<=numero;i++){
        //     producto=producto*i;
        // }
        // System.out.println(producto);
    
  /*   Con Entrada_Teclado */

        int producto=1;
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        numero=teclado.nextInt();

        for(int i=1; i<=numero;i++){
            producto=producto*i;
        }
        System.out.println(producto); /* Falla y da 0 con numeros cuyas cifras sea +3 */
    }
}
