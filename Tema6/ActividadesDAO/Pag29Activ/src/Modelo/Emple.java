package Modelo;

public class Emple {
    int id;
    String DNI;
    String nombre,apellido,telefono;
    Sucursal trabajo=null;

    public Emple(){}

    public Emple(int id, String dNI, String nombre, String apellido, String telefono) {
        this.id = id;
        DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Sucursal getTrabajo() {
        return trabajo;
    }
    public void setTrabajo(Sucursal trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        if(trabajo!=null)
            return "Empleado [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
                + telefono + "]+ "+trabajo.toString();
        else return "Empleado [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
                + telefono + "]";
    }

    
}
