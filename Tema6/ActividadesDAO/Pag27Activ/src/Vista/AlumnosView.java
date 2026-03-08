package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.*;


public class AlumnosView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Alumnos");
        System.out.println("2. Insertar Alumnos");
        System.out.println("3. Actualizar Alumnos");
        System.out.println("4. Eliminar Alumnos");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        System.out.println();
        return sc.nextInt();
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("\nLISTADO:");
        for (Alumno a : alumnos) {
            System.out.println(a.getNombre() 
                + " - " + a.getApe1()
                + " - " + a.getApe2()
                + " - " + a.getNumMatricula());
        }
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("#Matricula: ");
        int numMatricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha de Nacimiento: ");
        String fecha_nac = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        String Ape1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String Ape2 = sc.nextLine();
        System.out.print("telefono: ");
        String telefono = sc.nextLine();
        return new Alumno(numMatricula, fecha_nac, nombre, Ape1, Ape2, telefono);
    }

    public Alumno pedirAlumnoActualizar() {
        System.out.print("#Matricula a modificar: ");
        int numMatricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo fecha_nacimiento: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String fecha_nac = sc.nextLine();
        System.out.print("Nuevo apellido1: ");
        String Ape1 = sc.nextLine();
        System.out.print("Nuevo apellido2: ");
        String Ape2 = sc.nextLine();
        System.out.print("Nuevo telefono: ");
        String telefono = sc.nextLine();
        return new Alumno(numMatricula, fecha_nac, nombre, Ape1, Ape2, telefono);
    }

    public int pedirNumMatriculaEliminar() {
        System.out.print("#Matricula a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

