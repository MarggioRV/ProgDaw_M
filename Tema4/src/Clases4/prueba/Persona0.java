package Clases4.prueba;

public class Persona0 {
    protected String nombre;
    int edad;

    public Persona0(){

    }
    public Persona0(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void setNombre(String cadena){
        this.nombre=cadena;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int anyos){
        this.edad=anyos;
    }
    public int getEdad(){
        return this.edad;
    }

    public void imprimePersona(){
        System.out.println("Me llamo "+this.nombre+" y tengo "+this.edad+" años.");
    }
}
