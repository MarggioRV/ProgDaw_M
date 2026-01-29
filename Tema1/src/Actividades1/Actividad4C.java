
import java.util.Scanner;
//Pag 17, Actvs 7, part 1
public class Actividad4C {

/* Leer a, b  
a ← valor absoluto de a  
b ← valor absoluto de b  
Mientras b ≠ 0 hacer  
    resto ← a mod b  
        a ← b  
        b ← resto  
FinMientras  

Escribir "El MCD es: ", a   
FinAlgoritmo*/

    public static void main(String[] args) {
    // Leer los valores de a y b
        System.out.println("Introduce los N*: "); /* Println crea un salto de linea */
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();

    // Calc el V.Absoluto
        a = Math.abs(a);
        b = Math.abs(b);

    // MCD
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

    System.out.println("El MCD es: " + a);
    }

}


