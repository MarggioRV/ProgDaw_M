package Actividades5;

import Actividades5.clases.ProductoDigital;
import Actividades5.clases.ProductoFisico;
import Actividades5.clases.Producto;

public class Pag37ActivProductos {
    public static void main(String[] args) {
        
        //Físicos
        ProductoFisico f1 = new ProductoFisico(1, "Libro Java", 25.0, 0.5, 5.0);

        //Digitales
        ProductoDigital d1 = new ProductoDigital(2, "Curso Java Online", 50.0, "https://cursojava.com", 2000);

        //Imprimir x E
        System.out.println(f1);
        System.out.println();
        System.out.println(d1);

        //Guardarlos en 1 arreglo
        Producto[] productos = {f1, d1};

        //Imprimir todos
        System.out.println("\nTodos los productos: ");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}


