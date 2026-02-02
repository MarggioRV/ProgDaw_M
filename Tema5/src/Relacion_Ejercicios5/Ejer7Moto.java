package Relacion_Ejercicios5;

public class Ejer7Moto extends Ejer7Vehiculo {

    public Ejer7Moto(String marca) {
        super(marca);
    }

    @Override
    void arrancar() {
        System.out.println("La moto " + marca + " está arrancando");
    }
}
