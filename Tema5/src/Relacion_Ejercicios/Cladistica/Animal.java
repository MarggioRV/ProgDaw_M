package Relacion_Ejercicios.Cladistica;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void desplazarse();
    public abstract void alimentarse();

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre);
    }
}
