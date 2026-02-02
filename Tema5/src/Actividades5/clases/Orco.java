package Actividades5.clases;

import java.util.Random;

public class Orco extends Personaje {

    //Constructores

    public Orco() {
    }

    public Orco(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        Random r = new Random();
        return r.nextInt(30); //No varia
    }
}

