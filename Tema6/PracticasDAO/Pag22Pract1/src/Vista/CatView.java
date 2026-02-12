package Vista;

import java.util.List;
import java.util.Scanner;
import Modelos.Categoria;


public class CatView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Cats");
        System.out.println("2. Insertar Cats");
        System.out.println("3. Actualizar Cats");
        System.out.println("4. Eliminar Cats");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        System.out.println();
        return sc.nextInt();
    }

    public void mostrarCategorias(List<Categoria> categoria) {
        System.out.println("\nLISTADO:");
        for (Categoria c : categoria) {
            System.out.println(c.getCod_cat() + " - " + c.getNombreCat());
        }
    }

    public Categoria pedirNuevaCategoria() {
        sc.nextLine();
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(codigo, nombre);
    }

    public Categoria pedirCatActualizar() {
        System.out.print("Codigo a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(codigo, nombre);
    }

    public int pedirCodEliminar() {
        System.out.print("Codigo a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
