package Actividades5.clases;

public class Gato extends Mamifero {
    protected String raza;

    public Gato() {
    }

    public Gato(String nombre, String tipo_comida, int edad, int gestacion, String raza) {
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
        return super.toString() + " -> de raza " + raza;
    }

}
