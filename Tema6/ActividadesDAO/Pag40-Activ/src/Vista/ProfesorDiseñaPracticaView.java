package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Profesor_Diseña_Practica;

public class ProfesorDiseñaPracticaView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ DISEÑO DE PRÁCTICAS ---");
        System.out.println("1. Listar diseños");
        System.out.println("2. Insertar diseño");
        System.out.println("3. Actualizar diseño");
        System.out.println("4. Eliminar diseño");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarDisenos(List<Profesor_Diseña_Practica> lista) {
        System.out.println("\nLISTADO DE DISEÑOS:");
        for (Profesor_Diseña_Practica p : lista) {
            System.out.println("Práctica: " + p.getId_practica() +
                               " | Profesor: " + p.getId_profesor() +
                               " | Fecha: " + p.getFecha());
        }
    }

    public Profesor_Diseña_Practica pedirNuevoDiseno() {
        sc.nextLine();

        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        return new Profesor_Diseña_Practica(idPractica, idProfesor, fecha);
    }

    public Profesor_Diseña_Practica pedirDisenoActualizar() {
        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();

        System.out.print("Nueva fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        return new Profesor_Diseña_Practica(idPractica, idProfesor, fecha);
    }

    public int[] pedirIdsEliminar() {
        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();

        return new int[]{idPractica, idProfesor};
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
