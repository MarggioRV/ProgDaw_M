package Actividades5.clases;

import java.util.Random;

public class Mago extends Personaje {

    //Constructores

    public Mago() {
    }

    public Mago(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        Random r = new Random();
        return r.nextInt(25) + 10; // Hechizo: Entre 25 a 35
    }
}
