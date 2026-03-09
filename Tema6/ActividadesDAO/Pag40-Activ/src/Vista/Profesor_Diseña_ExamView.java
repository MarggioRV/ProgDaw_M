package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Profesor_Diseña_Exam;

public class Profesor_Diseña_ExamView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ DISEÑO DE EXÁMENES ---");
        System.out.println("1. Listar diseños");
        System.out.println("2. Insertar diseño");
        System.out.println("3. Eliminar diseño");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarDisenos(List<Profesor_Diseña_Exam> lista) {
        System.out.println("\nLISTADO DE DISEÑOS:");
        for (Profesor_Diseña_Exam d : lista) {
            System.out.println("Examen: " + d.getId_examen() +
                               " | Profesor: " + d.getId_profesor());
        }
    }

    public Profesor_Diseña_Exam pedirNuevoDiseno() {
        sc.nextLine();

        System.out.print("ID Examen: ");
        int idExamen = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();

        return new Profesor_Diseña_Exam(idExamen, idProfesor);
    }

    public int[] pedirIdsEliminar() {
        System.out.print("ID Examen: ");
        int idExamen = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();

        return new int[]{idExamen, idProfesor};
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
