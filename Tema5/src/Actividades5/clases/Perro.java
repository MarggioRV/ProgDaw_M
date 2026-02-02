package Actividades5.clases;

public class Perro extends Mamifero {
    protected String raza;

    public Perro () {
    }

    public Perro(String nombre, String tipo_comida, int edad, int gestacion, String raza) {
        super(nombre, tipo_comida, edad, gestacion);
        this.raza=raza;
    }

    //Getter y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", gestacion=" + gestacion + ", raza=" + raza + ", tipo_comida="
                + tipo_comida + ", edad=" + edad + "]";
    }
}
