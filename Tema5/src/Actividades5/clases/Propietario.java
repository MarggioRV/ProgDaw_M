package Actividades5.clases;

public abstract class Propietario extends Persona{
    private String direccion;
    
    public Propietario () {
    }

    public Propietario(String direccion) {
        this.direccion = direccion;
    }

    public Propietario(String dNI, String texto, String pape, String direccion) {
        super(dNI, texto, pape);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo propio
    public void direccionNomb(){
        System.out.println(direccion + "de" + nombre);
    }

    @Override
    public String toString() {
        return "Propietario [direccion=" + direccion + "]";
    } 
}
