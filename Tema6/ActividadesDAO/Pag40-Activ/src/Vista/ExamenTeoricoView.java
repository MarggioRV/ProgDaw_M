package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.ExamenTeorico;

public class ExamenTeoricoView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ EXÁMENES TEÓRICOS ---");
        System.out.println("1. Listar exámenes");
        System.out.println("2. Insertar examen");
        System.out.println("3. Actualizar examen");
        System.out.println("4. Eliminar examen");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarExamenes(List<ExamenTeorico> lista) {
        System.out.println("\nLISTADO DE EXÁMENES:");
        for (ExamenTeorico e : lista) {
            System.out.println(e.getId() + " - " + e.getTitulo() + " - Preguntas: " + e.getNumero_preguntas());
        }
    }

    public ExamenTeorico pedirNuevoExamen() {
        sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Número de preguntas: ");
        int numPreg = sc.nextInt();

        System.out.print("Fecha (YYYY-MM-DD): ");
        java.sql.Date fecha = java.sql.Date.valueOf(sc.next());

        System.out.print("ID Profesor: ");
        int idProf = sc.nextInt();

        return new ExamenTeorico(id, titulo, numPreg, fecha, idProf);
    }

    public ExamenTeorico pedirExamenActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo título: ");
        String titulo = sc.nextLine();

        System.out.print("Nuevo número de preguntas: ");
        int numPreg = sc.nextInt();

        System.out.print("Nueva fecha (YYYY-MM-DD): ");
        java.sql.Date fecha = java.sql.Date.valueOf(sc.next());

        System.out.print("Nuevo ID Profesor: ");
        int idProf = sc.nextInt();

        return new ExamenTeorico(id, titulo, numPreg, fecha, idProf);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

