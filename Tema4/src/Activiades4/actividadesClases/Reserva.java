package Activiades4.actividadesClases;

import java.time.LocalDate;

//Relacion N:M:N
public class Reserva {
    //Atributos
    Hotel hotel=null;
    Turista turista=null;
    Sucursal sucursal=null;
    
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String regimen;

    //Constructores

    public Reserva(){}

    public Reserva(Hotel hotel, Turista turista, Sucursal sucursal, LocalDate fechaEntrada, LocalDate fechaSalida, String regimen) {
        this.hotel = hotel;
        this.turista = turista;
        this.sucursal = sucursal;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.regimen = regimen;
    }

    //Getters y Setters

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

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

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    @Override
    public String toString() {
        if (hotel!=null && sucursal!=null && turista!=null)
            
            return "Reserva [hotel=" + hotel + ", turista=" + turista + ", sucursal=" + sucursal + ", fechaEntrada="
                + fechaEntrada + ", fechaSalida=" + fechaSalida + ", regimen=" + regimen + "]";
        else
            return "No hay ";
    }
}
