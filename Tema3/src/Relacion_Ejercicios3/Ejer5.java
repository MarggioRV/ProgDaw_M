/* El 4, pero con ArrayList<Integer> */
package Relacion_Ejercicios3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        ArrayList<Integer> vector = new ArrayList<>();
        //Loteria
        ArrayList<Integer> LOTERIA = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        
        //Insertar un Valores
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce tus #s de la suerte: ");
        
        //For que solo permite 6 valores
        for (int i = 0; i < 6; i++) {
        vector.add(teclado.nextInt()); //Con add, se añade directamente
        }
        
        //Sin Ordenar 
        System.out.println("Tus números son: ");
        /* for each solo salla en ordenamiento, se puede usar*/
        for (int num : vector) {
             System.out.print(num + " ");
        }
        
        //Comprobación Inicial
        if (vector.equals(LOTERIA)) { /* Aqui, rg true si tienen los mismos elementos en el mismo orden */
            System.out.println("\n¡Ganaste! Acertaste todos los números en orden.");
        } else if (ContarNRepetidos(vector, LOTERIA) == 6) {
            System.out.println("\n¡Ganaste! Todos los números acertados, pero el orden no coincide.");
        } else {
            System.out.println("\nAcertaste: " + ContarNRepetidos(vector, LOTERIA) + " número(s)");
        }
        teclado.close();
    }
    
    //Contador_NRepetidos
    public static int ContarNRepetidos(ArrayList<Integer> vector, ArrayList<Integer> LOTERIA) {
    int contador=0;
    for (int num : vector) {
        if (LOTERIA.contains(num)) {
            contador++;
        }
    }
    return contador;
    }

}

