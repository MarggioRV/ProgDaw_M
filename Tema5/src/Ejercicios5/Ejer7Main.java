package Ejercicios5;

public class Ejer7Main {
    public static void main(String[] args) {
        
        Ejer7Vehiculo coche = new Ejer7Coche("Tesla");
        Ejer7Vehiculo moto = new Ejer7Moto("Yamaha");

        coche.arrancar();
        coche.frenar();

        moto.arrancar();
        moto.frenar();
    }
}
