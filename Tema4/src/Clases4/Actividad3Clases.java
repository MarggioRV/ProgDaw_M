package Clases4;

import Clases4.clases.Editorial;
import Clases4.clases.Libro;

public class Actividad3Clases {
    public static void main(String[] args) {
        //Crear los objetos
        Libro libro1 = new Libro("5555", "Java para principiantes", 2020, 1, 29.99);
        Editorial ed1= new Editorial(1,"Santillana",1984);

        //Imprimir el contenido
        libro1.imprimeLibro();
        ed1.imprimeEditorial();
        libro1.setEditorial(ed1);
        System.out.println("-----------------------------");
        ed1.setAnyo(2025);
        libro1.imprimeLibro();
    }
}