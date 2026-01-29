package Activiades4.actividadesClases;

import java.util.ArrayList;

public class Hotel {

    //Atributos
    private int ID_hotel;
    private String nombreH;
    private String telefonoH;
    private int plazas;
    private String ciudadH;
    private String direccionH;

    //Constructor
    public Hotel(int ID_hotel, String nombreH, String telefonoH, int plazas, String ciudadH, String direccionH) {
        this.ID_hotel = ID_hotel;
        this.nombreH = nombreH;
        this.telefonoH = telefonoH;
        this.plazas = plazas;
        this.ciudadH = ciudadH;
        this.direccionH = direccionH;
    }

    //Getters y Setters

    public int getID_hotel() {
        return ID_hotel;
    }

    public void setID_hotel(int iD_hotel) {
        this.ID_hotel = iD_hotel;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getTelefonoH() {
        return telefonoH;
    }

    public void setTelefonoH(String telefonoH) {
        this.telefonoH = telefonoH;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getCiudadH() {
        return ciudadH;
    }

    public void setCiudadH(String ciudadH) {
        this.ciudadH = ciudadH;
    }

    public String getDireccionH() {
        return direccionH;
    }

    public void setDireccionH(String direccionH) {
        this.direccionH = direccionH;
    }

    @Override
    public String toString() {
        return "Hotel [ID_hotel=" + ID_hotel + ", nombreH=" + nombreH + ", telefonoH=" + telefonoH + ", plazas="
                + plazas + ", ciudadH=" + ciudadH + ", direccionH=" + direccionH + "]";
    }

    //Funcion para filtrar los turistas x hotel
    public ArrayList<Turista> turistasHospedados(ArrayList<Reserva> reservas) {
       
        //Declaracion de variables local, a su vez, de esta como arraylist
        ArrayList<Turista> rpta = new ArrayList<>();

        for (Reserva x : reservas) {
            // Se obtiene el Hotel de la reserva y se compara con el hotel actual (this)
            if (x.getHotel() != null && x.getHotel().getID_hotel() == this.getID_hotel()) {
                rpta.add(x.getTurista());
            }
        }

        // Imprimir mensaje solo si la lista de resultados está vacía después de buscar
        if (rpta.isEmpty()) {
            System.out.println("No hay resultados");
        }
        return rpta;
    }
}
