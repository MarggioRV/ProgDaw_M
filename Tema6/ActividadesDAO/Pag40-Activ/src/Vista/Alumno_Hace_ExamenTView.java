package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Alumno_Hace_ExamenT;

public class Alumno_Hace_ExamenTView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ EXÁMENES REALIZADOS ---");
        System.out.println("1. Listar exámenes hechos");
        System.out.println("2. Insertar examen hecho");
        System.out.println("3. Actualizar nota");
        System.out.println("4. Eliminar examen hecho");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarExamenes(List<Alumno_Hace_ExamenT> lista) {
        System.out.println("\nLISTADO:");
        for (Alumno_Hace_ExamenT a : lista) {
            System.out.println("Alumno: " + a.getId_alumno() +
                               " | Examen: " + a.getId_examen_teorico() +
                               " | Nota: " + a.getNota());
        }
    }

    public Alumno_Hace_ExamenT pedirNuevoExamenHecho() {
        sc.nextLine();

        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Examen Teórico: ");
        int idExamen = sc.nextInt();

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        return new Alumno_Hace_ExamenT(idAlumno, nota, idExamen);
    }

    public Alumno_Hace_ExamenT pedirExamenActualizar() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Examen Teórico: ");
        int idExamen = sc.nextInt();

        System.out.print("Nueva nota: ");
        int nota = sc.nextInt();

        return new Alumno_Hace_ExamenT(idAlumno, nota, idExamen);
    }

    public int[] pedirIdsEliminar() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Examen Teórico: ");
        int idExamen = sc.nextInt();

        return new int[]{idAlumno, idExamen};
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
