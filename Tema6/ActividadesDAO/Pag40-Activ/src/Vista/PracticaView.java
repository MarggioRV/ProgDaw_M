package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Practica;

public class PracticaView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PRÁCTICAS ---");
        System.out.println("1. Listar prácticas");
        System.out.println("2. Insertar práctica");
        System.out.println("3. Actualizar práctica");
        System.out.println("4. Eliminar práctica");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarPracticas(List<Practica> lista) {
        System.out.println("\nLISTADO DE PRÁCTICAS:");
        for (Practica p : lista) {
            System.out.println(p.getId() + " - " + p.getTitulo() + " - " + p.getDificultad());
        }
    }

    public Practica pedirNuevaPractica() {
        sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();

        return new Practica(id, titulo, dificultad);
    }

    public Practica pedirPracticaActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo título: ");
        String titulo = sc.nextLine();

        System.out.print("Nueva dificultad: ");
        String dificultad = sc.nextLine();

        return new Practica(id, titulo, dificultad);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
