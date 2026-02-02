package Relacion_Ejercicios5;

public class Ejer7Coche extends Ejer7Vehiculo {

    public Ejer7Coche(String marca) {
        super(marca);
    }

    @Override
    void arrancar() {
        System.out.println("El coche " + marca + " está arrancando");
    }
}
