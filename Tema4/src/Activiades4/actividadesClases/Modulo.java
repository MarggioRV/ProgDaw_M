package Activiades4.actividadesClases;

public class Modulo {
    //Atributos
    String modulo;
    String nombre;
    Profesor profesor;
    
    //Constructor
    public Modulo(String modulo, String nombre, Profesor profesor) {
        this.modulo = modulo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //Getters y Setters

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Modulo [modulo=" + modulo + ", nombre=" + nombre + ", profesor=" + profesor + "]";
    }
}
