package Vista;

import java.util.List;
import java.util.Scanner;

import Modelos.Profesor;


public class ProfesorView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Profesores");
        System.out.println("2. Insertar Profesor");
        System.out.println("3. Actualizar Profesor");
        System.out.println("4. Eliminar Profesor");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        System.out.println();
        return sc.nextInt();
    }

    public void mostrarProfesor(List<Profesor> profesor) {
        System.out.println("\nLISTADO:");
        for (Profesor c : profesor) {
            System.out.println(c.getId() 
                + " - " + c.getNombre()
                + " - " + c.getApe1()
                + " - " + c.getApe2()
                + " - " + c.getEspecialidad()
                + " - " + c.getTelefono());
        }
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nomb = sc.nextLine();
        System.out.print("Ape1: ");
        String ape1 = sc.nextLine();
        System.out.print("Ape2: ");
        String ape2 = sc.nextLine();
        System.out.print("Especialidad: ");
        String espec = sc.nextLine();   
        System.out.print("Telefono: ");
        String telef = sc.nextLine();    
        return new Profesor(id, nomb, ape1, ape2, espec, telef);
    }

    public Profesor pedirProfesorFichactualizar() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nomb = sc.nextLine();
        System.out.print("Ape1: ");
        String ape1 = sc.nextLine();
        System.out.print("Ape2: ");
        String ape2 = sc.nextLine();
        System.out.print("Especialidad: ");
        String espec = sc.nextLine();   
        System.out.print("Telefono: ");
        String telef = sc.nextLine();    
        return new Profesor(id, nomb, ape1, ape2, espec, telef);
    }

    public int pedirProfesorEliminar() {
        System.out.print("Profesor a eliminar: ");
        return sc.nextInt();

    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

