package Modelo;

public class Empleado {

    // Atributos
    private int id;
    private String nombre;
    private String ape1;
    private String ape2;
    private String telefono;
    private String direccion;
    //EntidadessHijas agrupadas, al no tener atributos, como enum
    private TipoEmpleado tipo;

    // Constructor
    public Empleado(int id, String nombre, String ape1, String ape2, String telefono, String direccion,
            TipoEmpleado tipo) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    // Getters y Setters
    
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

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", telefono="
                + telefono + ", direccion=" + direccion + ", tipo=" + tipo + "]";
    }
}
