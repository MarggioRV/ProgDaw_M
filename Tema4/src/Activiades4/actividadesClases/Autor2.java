package Activiades4.actividadesClases;
import java.util.ArrayList;

public class Autor2 {

    //Atributos
    private String nombre;
    private ArrayList<Libro2> librosEscritos;

    public Autor2(){
        librosEscritos=new ArrayList<>();   
    }

    //Constructor
    public Autor2(String nombre){
        this.nombre=nombre;
        this.librosEscritos=new ArrayList<>();;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Libro2> getLibrosEscritos() {
        return librosEscritos;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setLibrosPrestados(ArrayList<Libro2> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    
    @Override
    public String toString() {
        if(librosEscritos!=null)
            return "Autor [nombre=" + nombre + ", librosEscritos=" + librosEscritos + "]";
        else return "El autor "+nombre+" no tiene libros escritos";
    }
    
    //Métodos propios

    //Func para agregar 1 Libro nuevo a la lista de librosEscritos
    public void nuevoLibro(Libro2 libro){
        if(librosEscritos!=null)
            if(!librosEscritos.contains(libro))
                librosEscritos.add(libro);
        else{
            librosEscritos.add(libro);
        }
    }
}
