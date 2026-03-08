package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Alumnos;

public class AlumnosView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ ALUMNOS ---");
        System.out.println("1. Listar alumnos");
        System.out.println("2. Insertar alumno");
        System.out.println("3. Actualizar alumno");
        System.out.println("4. Eliminar alumno");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarAlumnos(List<Alumnos> lista) {
        System.out.println("\nLISTADO DE ALUMNOS:");
        for (Alumnos a : lista) {
            System.out.println(a.getId() + " - " + a.getNif() + " - " + a.getNombre() + " " + a.getApellido1());
        }
    }

    public Alumnos pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("NIF: ");
        String nif = sc.nextLine();

        System.out.print("Grupo: ");
        String grupo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido1: ");
        String ape1 = sc.nextLine();

        System.out.print("Apellido2: ");
        String ape2 = sc.nextLine();

        return new Alumnos(id, nif, grupo, nombre, ape1, ape2);
    }

    public Alumnos pedirAlumnoActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo NIF: ");
        String nif = sc.nextLine();

        System.out.print("Nuevo grupo: ");
        String grupo = sc.nextLine();

        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Nuevo apellido1: ");
        String ape1 = sc.nextLine();

        System.out.print("Nuevo apellido2: ");
        String ape2 = sc.nextLine();

        return new Alumnos(id, nif, grupo, nombre, ape1, ape2);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
