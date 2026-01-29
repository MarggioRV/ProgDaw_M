
import java.util.Scanner;
//Pag 17, Actvs 7, part 2
public class Actividad4D {
    public static void main(String[] args) {
    // Leer los valores de a y b
        System.out.println("Introduce los N*: "); /* Println crea un salto de linea */
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();

    // Calc el V.Absoluto
        a = Math.abs(a); //Importante pues el MCM siempre es positivo
        b = Math.abs(b);

        int mayor = Math.max(a, b); 
        int mcm = mayor; //Mayor de los dos N*

    // MCM
        while ((mcm % a != 0) || (mcm % b != 0)) { mcm += mayor;}

    System.out.println("El RPTA es: " + mcm);
    }
}
