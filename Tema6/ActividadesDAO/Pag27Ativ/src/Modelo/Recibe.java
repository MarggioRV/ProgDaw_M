package Modelo;

public class Recibe {
    
    //Atributos
    private int idEmpleado;
    private int idEdicion;

    //Constructor
    public Recibe(int idEmpleado, int idEdicion) {
        this.idEmpleado = idEmpleado;
        this.idEdicion = idEdicion;
    }

    // Getters y setters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEdicion() {
        return idEdicion;
    }

    public void setIdEdicion(int idEdicion) {
        this.idEdicion = idEdicion;
    }

    @Override
    public String toString() {
        return "Recibe [idEmpleado=" + idEmpleado + ", idEdicion=" + idEdicion + "]";
    }
}
