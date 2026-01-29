// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerI {
/*   9. Desarrolla un algoritmo que determine la calificación cualitativa 
    (suspenso, aprobado, notable y sobresaliente) a partir de calcular la nota media de las 
    tareas y examen con el siguiente porcentaje: nota=60% examen + 40% (media de las tareas). 
    Se introduce por teclado la nota de 3 tareas y 1 examen. */
    public static void main(String[] args) {
        //Lectura, en su mayoría Double por los decimales
        double tareaN;
        double examN;
        double sumaT = 0;
        int numT = 3; /* Como no se indica un numero indfinifo de tareas, para un dowhile, opte por de plano un numero fijo y ponerlo en el for. */

        Scanner teclado = new Scanner(System.in);
        
        //Introduccion fija de notas de tareas
        for (int i = 1; i < 4; i++) {
            System.out.println("¿Cual es la nota de tu tarea " + i +  "?"); /* i va siguiendo el flujo */
            tareaN=teclado.nextDouble();
            sumaT += tareaN; /* Va sumando  */
        }
        
        //Leer examen
        System.out.println();
        System.out.println("Introduce la nota del examen: ");
        examN = teclado.nextDouble();

        //Nota Final
        double notaFinal = FormulaFinal(examN, sumaT, numT);
        
        //String de Salida
        String calificacion;
        if (notaFinal < 5) {
            calificacion = "Suspenso";
        } else if (notaFinal >= 5 && notaFinal < 7) {
            calificacion = "Aprobado";
        } else if (notaFinal >= 7 && notaFinal < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";;
        }

        System.out.println("Tu nota final es: " + notaFinal + " que es un " + calificacion);
        System.out.println("O");
        // %.2f Redondea a 2 cifras luego de la coma, ademas calificacion no puede ir con '+' con printf'
        System.out.printf("Tu nota final es: %.2f, por tanto estás %s.%n", notaFinal, calificacion);
    }

    public static double FormulaFinal(double examenN, double sumaT, int numT) {
        return 0.6 * examenN + 0.4 * FormulaMediaTareas(sumaT, numT);
    }

    public static double FormulaMediaTareas(double sumaT, int numT) {
        return sumaT / numT;
    }
}
