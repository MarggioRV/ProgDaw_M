package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Alumnos_Realiza_Practica;

public class Alumnos_Realiza_PracticaView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PRÁCTICAS REALIZADAS ---");
        System.out.println("1. Listar prácticas realizadas");
        System.out.println("2. Insertar práctica realizada");
        System.out.println("3. Actualizar práctica realizada");
        System.out.println("4. Eliminar práctica realizada");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarPracticas(List<Alumnos_Realiza_Practica> lista) {
        System.out.println("\nLISTADO:");
        for (Alumnos_Realiza_Practica a : lista) {
            System.out.println("Alumno: " + a.getId_alumno() + " | Práctica: " + a.getId_practica() + " | Fecha: " + a.getFecha() + " | Nota: " + a.getNota());
        }
    }

    public Alumnos_Realiza_Practica pedirNuevaPracticaHecha() {
        sc.nextLine();

        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();
        sc.nextLine();

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        return new Alumnos_Realiza_Practica(idAlumno, idPractica, fecha, nota);
    }

    public Alumnos_Realiza_Practica pedirPracticaActualizar() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();
        sc.nextLine();

        System.out.print("Nueva fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        System.out.print("Nueva nota: ");
        int nota = sc.nextInt();

        return new Alumnos_Realiza_Practica(idAlumno, idPractica, fecha, nota);
    }

    public int[] pedirIdsEliminar() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        return new int[]{idAlumno, idPractica};
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
