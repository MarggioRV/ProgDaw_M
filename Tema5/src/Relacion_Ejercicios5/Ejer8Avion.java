package Relacion_Ejercicios5;

public class Ejer8Avion extends Ejer7Vehiculo implements Ejer8Volador {
    
    public Ejer8Avion (String marca) {
        super(marca);
    }

    @Override
    void arrancar() {
        System.out.println("El avión " + marca + " está arrancando");
    }

    @Override
    public void volar() {
        System.out.println("El avión " + marca + " está volando");
    }
}
