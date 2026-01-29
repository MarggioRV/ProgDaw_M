package Activiades4;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Activiades4.actividadesClases.*;
public class Actividad5Escuela {
    //Incializacion
    public static void main(String[] args) {
        //Crear profesor
        Profesor prof1 = new Profesor(12345678, "Juan Pérez", "Calle Mayor 10", "600123456");
        Profesor prof2 = new Profesor(12345678, "Romon Valdez", "Calle Menor 20", "656343456");
        System.out.println("Profesor inicial: " + prof1);

        //Cambiar teléfono y dirección
        prof1.cambiarContactos("62223456", "Calle Medio 20");
        System.out.println("Profesor actualizado: " + prof1);

        //Aluminos
        Alumno a1 = new Alumno(null, 1, "Goku", "Son", LocalDate.of(1989, 4, 16));
        Alumno a2 = new Alumno(null , 2, "Gohan", "Son", LocalDate.of(1993, 5, 18));
        Alumno a3 = new Alumno( null , 3, "Goten", "Son", LocalDate.of(1997, 2, 23));

        //LLamadas1

        a1.cambiarDelegado(a2); //Gohan delega ahora

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //Crear módulos
        Modulo m1 = new Modulo("BD", "Bases de Datos", prof1);
        Modulo m2 = new Modulo("PROG", "Programación", prof1);

        // Relación N:M (Cursa)
        List<Cursa> cursas = new ArrayList<>();
        cursas.add(new Cursa(a1, m1));
        cursas.add(new Cursa(a2, m1));
        cursas.add(new Cursa(a3, m2));

        //Mostrar las matrículas
        System.out.println("\n--- Matrículas ---");
        for (Cursa c : cursas) {
            System.out.println(c);
        }

        //Entrada-Datos 
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();
        System.out.print("Introduce nombre del módulo: ");
        String nombreModulo = scanner.nextLine();

        //LLamada2
        System.out.println("\n--- Esta Matriculadoo ---");
        boolean matriculadoUsuario = Cursa.estaMatriculado(nombreAlumno, nombreModulo, cursas);
        System.out.println("¿" + nombreAlumno + " está matriculado en " + nombreModulo + "? " + matriculadoUsuario);
    }
}
