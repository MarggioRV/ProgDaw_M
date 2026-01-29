package Activiades4.actividadesClases;
import java.util.ArrayList;

public class Biblioteca {
/*  Actividad: Crea las clases en JAVA para hacer un sistema de préstamos
    de una biblioteca. En este caso usarás ArrayList. */
    
    //Atributos
    private String nombre;
    private ArrayList<Libro2> libros;

    public Biblioteca(){this.libros=new ArrayList<>();}

    //Constructor
    public Biblioteca(String nombre){
        this.nombre=nombre;
        this.libros=new ArrayList<>();
    }

    //Getters y Setters

    public ArrayList<Libro2> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro2> libros) {
        this.libros = libros;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        if(libros!=null)
            return "Biblioteca [nombre=" + nombre + ", libros=" + libros + "]";
        else return "No hay libros en la biblioteca "+nombre;
    }

    //Métodos propios

    //Funcion para agregar libros a la biblioteca
    public void agregarLibro(Libro2 libro){
        if(this.libros!=null)
            if(!libros.contains(libro))
                this.libros.add(libro);
        else
            this.libros.add(libro);
    }

    //Func para buscar un libro mediante su index
    public Libro2 buscarLibro(Libro2 libro){
        //Posicion del libro en la lista
        int posicion=libros.indexOf(libro);
        if (posicion==-1)
            return null;
        else{
            return libros.get(posicion); //get para obtener
        }
    }

    //Func para eliminar un libro por su index (-1)
    public void eliminaLibro(Libro2 libro){
        int posicion=libros.indexOf(libro);
        if(posicion!=-1)
            libros.remove(posicion);
    }

    //Func para buscar libros por autor, recorriendo el arreglo y usando un arreglo aux
    public ArrayList<Libro2> buscarPorAutor(String autor){
        ArrayList<Libro2> salida = new ArrayList();
        for(int i=0;i<libros.size();i++){
            if(autor.equals(libros.get(i).getAutor().getNombre()))
                salida.add(libros.get(i));
        }
        return salida;
    }
    
}