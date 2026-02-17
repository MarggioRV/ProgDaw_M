package Modelos;

public class Asignatura {

    //Atributos

    private int codAsignatura;
    private String nombre;
    private int numHoras;
    
    //Constructores
    public Asignatura(int codAsignatura, String nombre, int numHoras) {
        this.codAsignatura = codAsignatura;
        this.nombre = nombre;
        this.numHoras = numHoras;
    }

    //Getter y Setters
    
    public int getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(int codAsignatura) {
        this.codAsignatura = codAsignatura;
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
}
