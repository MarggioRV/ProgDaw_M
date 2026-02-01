package Ejercicios5;

public class Ejer8Helicop extends Ejer7Vehiculo implements Ejer8Volador {
    
    public Ejer8Helicop (String marca) {
        super(marca);
    }

    @Override
    void arrancar() {
        System.out.println("El helicoptero " + marca + " está arrancando");
    }

    @Override
    public void volar() {
        System.out.println("El helicoptero " + marca + " está volando");
    }
}
