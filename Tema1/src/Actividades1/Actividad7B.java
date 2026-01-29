
import java.util.Scanner;

public class Actividad7B {
//Pag 24, Actividad 2: 

/* Crear las funciones esPar, esDivisible3 y un
procedimiento para imprimir los números pares divisibles por 3 que
hay entre 1 y 20 */

/*
*Pseudocódigo
*inicio_programa
*Generar numero1 aleatorio
*Generar numero2 aleatorio
*Hacer cuentas (cociente, media, potencia, raiz cuadrada)
* Imprimir cociente, media, potencia y raiz de cada número
*fin_programa
*/

public static void main(String[] args) {ParesDivi3();}

public static boolean esPar(int numero1) {
return numero1 % 2 == 0;}

public static boolean esDivisible3(int numero1) {
return numero1 % 3 == 0;}

public static void ParesDivi3() {
        System.out.println("Números entre 1 y 20, que son pares y divisibles por 3:");
        for (int i=1; i <= 20; i++)
        {
            if (esPar(i) && esDivisible3(i)) {System.out.println(i);}
        } 
    }
}