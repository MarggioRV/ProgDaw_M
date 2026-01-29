package Actividades5.clases;

public class Mamifero extends Animal {
    protected int gestacion;

    //constructor por defecto
    public Mamifero() {}

    //constructor con un parámetro
    public Mamifero(String nombre, String tipo_comida, int edad, int gestacion) {
        super(nombre, tipo_comida, edad);
        this.gestacion = gestacion;
        System.out.println("...");
    }

    //Getter y Setters
    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Mamifero";
    }
}
