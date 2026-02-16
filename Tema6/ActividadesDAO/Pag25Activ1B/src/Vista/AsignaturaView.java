package Vista;

import java.util.List;
import java.util.Scanner;

import Modelos.Asignatura;

public class AsignaturaView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu(){
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Asig");
        System.out.println("2. Insertar Asig");
        System.out.println("3. Actualizar Asig");
        System.out.println("4- Eliminar Asig");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        System.out.println();
        return sc.nextInt();
    }

    public void mostrarAsig(List<Asignatura> asignatura){
        System.out.println("\nLISTADO");
        for (Asignatura a : asignatura) {
            System.out.println(a.getCodAsignatura()
                + "-" + a.getNumHoras()
                + "-" + a.getNombre()
                + "-" + a.getNumHoras());
        }
    }

    public Asignatura pedirNuevaAsignatura() {
        sc.nextLine();
        System.out.print("Cod: ");
        int cod = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nomb = sc.nextLine();
        System.out.print("#Horas: ");
        int numH = sc.nextInt();
        return new Asignatura(cod, nomb, numH);
    }

    public Asignatura pedirAsignaturaActualizar() {
        sc.nextLine();
        System.out.print("Cod: ");
        int cod = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nomb = sc.nextLine();
        System.out.print("#Horas: ");
        int numH = sc.nextInt();
        return new Asignatura(cod, nomb, numH);
    }

    public int pedirAsignaturaEliminar() {
        System.out.print("Curso a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
