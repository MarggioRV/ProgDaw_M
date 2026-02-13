package Vista;

import java.util.List;
import java.util.Scanner;

import Modelos.CursoEscolar;


public class CursoEscolarView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Cursos");
        System.out.println("2. Insertar Cursos");
        System.out.println("3. Actualizar Cursos");
        System.out.println("4. Eliminar Cursos");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        System.out.println();
        return sc.nextInt();
    }

    public void mostrarCursos(List<CursoEscolar> cursoEscolar) {
        System.out.println("\nLISTADO:");
        for (CursoEscolar c : cursoEscolar) {
            System.out.println(c.getId() 
                + " - " + c.getAnyo_inicio()
                + " - " + c.getAnyo_fin());
        }
    }

    public CursoEscolar pedirNuevoCurso() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha de incio: ");
        String anyo_inicio = sc.nextLine();
        System.out.print("Fecha de fin: ");
        String anyo_fin = sc.nextLine();
        return new CursoEscolar(id, anyo_inicio, anyo_fin);
    }

    public CursoEscolar pedirCursoActualizar() {
        System.out.print("Curso a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo fecha_nacimiento: ");
        String anyo_inicio = sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String anyo_fin = sc.nextLine();
        return new CursoEscolar(id, anyo_inicio, anyo_fin);
    }

    public int pedirCursoEliminar() {
        System.out.print("Curso a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

