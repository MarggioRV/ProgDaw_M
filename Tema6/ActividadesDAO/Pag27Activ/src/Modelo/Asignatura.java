package Modelo;

public class Asignatura {
    
    //Atributos
    protected int cod;
    protected String nombre;
    protected int numHoras;

    
    //Constructores

    public Asignatura(int cod, String nombre, int numHoras) {
        this.cod = cod;
        this.nombre = nombre;
        this.numHoras = numHoras;
    }

    //Getters and Setters

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumHoras() {
        return numHoras;
    }
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public String toString() {
        return "Asignatura [cod=" + cod + ", nombre=" + nombre + ", numHoras=" + numHoras + "]";
    }
}
