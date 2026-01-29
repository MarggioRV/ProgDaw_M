package Activiades4.actividadesClases;

public class Profesor {
    //Atributos
    int DNI;
    String nombre,direccion;
    String telefono;

    //Constructor
    public Profesor(int dni, String nombre, String direccion, String telefono) {
        this.DNI = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Getters y Setters

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Profesor [DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
                + "]";
    }

    //Metodos

    //Función para cambiar info_contacto
    public void cambiarContactos(String nuevoTfno, String nuevaDireccion) {
        this.telefono = nuevoTfno;
        this.direccion = nuevaDireccion;
        System.out.println("Infor_Contacto actualizada: Teléfono=" + telefono + ", Dirección=" + direccion);
    }
    
}
