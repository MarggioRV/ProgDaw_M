package Actividades5.clases;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente extends Persona{

    protected String telefono;
    List<Vehiculo> vehiculos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String telefono, List<Vehiculo> vehiculos) {
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    public Cliente(String dNI, String texto, String pape, String telefono, List<Vehiculo> vehiculos) {
        super(dNI, texto, pape);
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    //Getters and Setters

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    //Metodo propio
    public void nombXtelef() {
        System.out.println(nombre + ": " + telefono);
    }

    @Override
    public String toString() {
        return "Cliente [telefono=" + telefono + ", vehiculos=" + vehiculos + "]";
    }
}
