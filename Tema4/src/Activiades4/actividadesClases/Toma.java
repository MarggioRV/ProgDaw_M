package Activiades4.actividadesClases;

public class Toma {
    //Atributos
    Turista turista=null;
    Sucursal sucursal=null;
    Vuelo vuelo=null;
    ClaseVuelo clase;

    //Constructores

    public Toma() {
    }

    public Toma(Turista turista, Sucursal sucursal, Vuelo vuelo, ClaseVuelo clase) {
        this.turista = turista;
        this.sucursal = sucursal;
        this.vuelo = vuelo;
        this.clase = clase;
    }

    public enum ClaseVuelo {
        TURISTA,PREMIUM;
    }

    //Getters y Setters

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ClaseVuelo getClase() {
        return clase;
    }

    public void setClase(ClaseVuelo clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        if (turista!=null && sucursal!=null && vuelo!=null)
            
            return "Toma [vuelo=" + vuelo + ", clase=" + clase + ", sucursal=" + sucursal + ", turista=" + turista + "]";
        else
            return "No hay ";
    }    
}
