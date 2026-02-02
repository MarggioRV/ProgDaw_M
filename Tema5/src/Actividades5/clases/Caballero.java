package Actividades5.clases;

import java.util.Random;

public class Caballero extends Personaje {

    //Constructores

    public Caballero() {
    }

    public Caballero(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        Random r = new Random();
        return r.nextInt(15) + 10; // Espada: daño entre 15 y 25
    }
}
