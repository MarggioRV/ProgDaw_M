package Clases4;

// package Clases.src;
public class Vehiculo {
    // Datos mienbros de la clase
    boolean usedFlag;
    String model;
    int numTires;

    // Constructor
    public Vehiculo(boolean useF, String Modelo, int tires) {
        usedFlag = useF;
        model = Modelo;
        numTires = tires;
    }

    public void turnStart() {
        System.out.println("Comienza a Moverse");
    }

    public void turnLeft() {
        System.out.println("Moveerse a la izquierda");
    }

    public void turnRight() {
        System.out.println("Moverse a la derecha");
    }

    public void Stop() {
        System.out.println("Pararse");
    }

    public void forward(int speed) {
        System.out.println("Moverse a hacia a adenlante a una velocidad" + speed);
    }

    // Main

}
