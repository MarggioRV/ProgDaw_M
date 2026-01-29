package Actividades5.clases;

public class Coche3 extends Vehiculo2 {
    private int anchura;
    private int altura;
    
    //Constructores

    public Coche3() {
    }

    public Coche3(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public Coche3(String matricula, String marca, String modelo, int anchura, int altura) {
        super(matricula, marca, modelo);
        this.anchura = anchura;
        this.altura = altura;
    }
    
    //Meotodo Propio
    public int velocidadMax() {
        return 400;
    }
    
    //Getters y Setters

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
