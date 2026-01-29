package Actividades5.clases;

public abstract class Futbol extends SeleccionFutbol{

    //Atributos
    private int dorsal;
    private String Demarcacion;


    //Construcutores1

    public Futbol() {
    }

    public Futbol(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        Demarcacion = demarcacion;
    }


    //Metodos_herencia

    @Override
    public void Concentrarse() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Entrenar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void JugarPartido() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Viajar() {
        // TODO Auto-generated method stub
        
    }

    //Construcutores2

    public Futbol(int iD, String nombre, String ape, int edad, int dorsal, String demarcacion) {
        super(iD, nombre, ape, edad);
        this.dorsal = dorsal;
        Demarcacion = demarcacion;
    }

    //Metodo Propio
    public int getDorsal() {
        return dorsal;
    }

    //Getters and Setters

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        Demarcacion = demarcacion;
    }
    
    public void entrevista() {
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "Futbol [dorsal=" + dorsal + ", Demarcacion=" + Demarcacion + "]";
    }
}
