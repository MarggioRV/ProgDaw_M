package Modelo;

public class Curso {

    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private int duracion;
    private double coste;
    
    //Constructor
    public Curso(int id, String nombre, String descripcion, int duracion, double coste) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.coste = coste;
    }

    //Gs y Ss

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracion=" + duracion
                + ", coste=" + coste + "]";
    }
}
