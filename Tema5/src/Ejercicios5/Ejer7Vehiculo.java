package Ejercicios5;

public abstract class Ejer7Vehiculo {
    protected String marca;

    //Contructor x Defecto
    public Ejer7Vehiculo() {
    }

    //Constructor 
    public Ejer7Vehiculo(String marca) { 
        this.marca = marca; 
    }

    //Metodo Abstrato (≠)
    abstract void arrancar();

    //Metodo Concreto (=)
    public void frenar(){
        System.out.println(marca + " esta frenando");
    }

    //Get y Set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    } 

}
