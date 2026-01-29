package Actividades5.clases;

public class Animal {
    protected String nombre;
    protected String tipo_comida;
    protected int edad;
    

    //constructor por defecto
    public Animal() {
    }

    //constructor con un parámetro
    public Animal(String nombre, String tipo_comida, int edad) {
        this.nombre = nombre;
        this.tipo_comida = tipo_comida;
        this.edad = edad;
    }
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método toString()                              
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
