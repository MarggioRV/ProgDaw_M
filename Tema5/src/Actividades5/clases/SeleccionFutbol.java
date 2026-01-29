package Actividades5.clases;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int ID;
    protected String nombre;
    protected String Ape;
    protected int Edad;

    public SeleccionFutbol() {
    }

    // @Override
    // public void Viajar(); 

    public SeleccionFutbol(int iD, String nombre, String ape, int edad) {
        ID = iD;
        this.nombre = nombre;
        Ape = ape;
        Edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return Ape;
    }

    public void setApe(String ape) {
        Ape = ape;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol [ID=" + ID + ", nombre=" + nombre + ", Ape=" + Ape + ", Edad=" + Edad + "]";
    }
}
