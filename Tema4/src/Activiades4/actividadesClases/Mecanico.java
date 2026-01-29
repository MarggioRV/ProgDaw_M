package Activiades4.actividadesClases;

public class Mecanico {
    //Atributos
    String nombre, DNI, telefono;
    Especialidad especialidad;
    
    //Constructor
    public Mecanico(String nombre, String dNI, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        DNI = dNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico [nombre=" + nombre + ", DNI=" + DNI + ", telefono=" + telefono + ", especialidad="
                + especialidad + "]";
    }
    
}
