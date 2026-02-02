package Actividades5.clases;

public class Caballo extends Mamifero {

    //Atributos
    protected String comida;
    protected int ejercicio;

    //Constructores

    public Caballo () {
    }

    public Caballo(String comida, int ejercicio) {
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    public Caballo(String nombre, String tipo_comida, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_comida, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    //Getters y Setters

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

    @Override
    public String toString() {
        return "Caballo [nombre=" + nombre + ", gestacion=" + gestacion + ", tipo_comida=" + tipo_comida + ", comida="
                + comida + ", edad=" + edad + ", ejercicio=" + ejercicio + "]";
    }

}
