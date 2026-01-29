package Activiades4.actividadesClases;

public class Maquinista {
    //Atributos
    String nombre;
    String DNI; 
    String rango;
    double sueldo;

    //Constructor
    public Maquinista(String nombre, String dNI, String rango, double sueldo) {
        this.nombre = nombre;
        this.DNI = dNI;
        this.rango = rango;
        this.sueldo = sueldo;
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
    public void setDNI(String dni) {
        this.DNI = dni;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Maquinista [nombre=" + nombre + ", DNI=" + DNI + ", rango=" + rango + ", sueldo=" + sueldo + "]";
    }    
    
}
