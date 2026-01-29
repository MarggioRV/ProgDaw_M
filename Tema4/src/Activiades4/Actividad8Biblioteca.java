package Activiades4;

import Activiades4.actividadesClases.*;

public class Actividad8Biblioteca {
    public static void main(String[] args) throws Exception { //Indica que esto puede lanzar una excepción

        Biblioteca bib=new Biblioteca("GallardosMunicipalidad");

        Libro2 l1=new Libro2("Viaje al centro de la Tierra","Aventuras",2);
        Libro2 l2=new Libro2("Harry Potter","Fantacia",5);
        Autor2 autor=new Autor2("FJ Marber");

        l1.setAutor(autor);
        bib.agregarLibro(l1);

        Libro2 salida=bib.buscarLibro(l2);
        if(salida!=null)
            System.out.println(salida);
        else{
            System.out.println("El libro no esta en la biblioteca");
        }
    }
}