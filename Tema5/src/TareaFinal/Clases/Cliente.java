package TareaFinal.Clases;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona{

    protected String telefono;
    protected List<Vehiculo2> vehiculos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String telefono, List<Vehiculo2> vehiculos) {
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    public Cliente(String dNI, String texto, String pape, String telefono) {
        super(dNI, texto, pape);
        this.telefono = telefono;
        this.vehiculos=new ArrayList<>();
    }

    //Getters and Setters

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo2> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo2> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    //Metodo propio

    //Nombre y Telefono
    public void nombXtelef() {
        System.out.println(nombre + ": " + telefono);
    }

    //Añadir Vehiculo
    public void addVehiculo(Vehiculo2 v) {
        vehiculos.add(v);
    }

    @Override
    public String toString() {
        return "Cliente [telefono=" + telefono + ", vehiculos=" + vehiculos + "]";
    }
}
