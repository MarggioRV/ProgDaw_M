package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Profesores;

public class ProfesoresView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PROFESORES ---");
        System.out.println("1. Listar profesores");
        System.out.println("2. Insertar profesor");
        System.out.println("3. Actualizar profesor");
        System.out.println("4. Eliminar profesor");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProfesores(List<Profesores> lista) {
        System.out.println("\nLISTADO DE PROFESORES:");
        for (Profesores p : lista) {
            System.out.println(p.getId() + " - " + p.getNif() + " - " + p.getNombre() + " " + p.getApe1());
        }
    }

    public Profesores pedirNuevoProfesor() {
        sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("NIF: ");
        String nif = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido1: ");
        String ape1 = sc.nextLine();

        System.out.print("Apellido2: ");
        String ape2 = sc.nextLine();

        return new Profesores(id, nif, nombre, ape1, ape2);
    }

    public Profesores pedirProfesorActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo NIF: ");
        String nif = sc.nextLine();

        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Nuevo apellido1: ");
        String ape1 = sc.nextLine();

        System.out.print("Nuevo apellido2: ");
        String ape2 = sc.nextLine();

        return new Profesores(id, nif, nombre, ape1, ape2);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

