package Actividades5.clases;

public abstract class Personaje {

    //Atributos
    protected String nombre;
    protected int vida;

    //Constructores

    public Personaje() {
    }

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    //Metodos Concretos
    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0;
    }

    //Meotodo Abstrato
    public abstract int atacar(); 

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + " (Vida: " + vida + ")";
    }
}
