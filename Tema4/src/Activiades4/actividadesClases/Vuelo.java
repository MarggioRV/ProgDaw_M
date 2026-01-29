package Activiades4.actividadesClases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    //Atributos
    private int ID_vuelo;
    private LocalDate fecha;
    private LocalTime hora;
    private String origen;
    private String destino;
    private int plazasTotales;
    
    //Constructor
    public Vuelo(int iD_vuelo, LocalDate fecha, LocalTime hora, String origen, String destino, int plazasTotales) {
        ID_vuelo = iD_vuelo;
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
    }

    //Getters y Setters

    public int getID_vuelo() {
        return ID_vuelo;
    }

    public void setID_vuelo(int iD_vuelo) {
        this.ID_vuelo = iD_vuelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    @Override
    public String toString() {
        return "Vuelo [ID_vuelo=" + ID_vuelo + ", fecha=" + fecha + ", hora=" + hora + ", origen=" + origen
                + ", destino=" + destino + ", plazasTotales=" + plazasTotales + "]";
    }

    //Métodos

    //Funcion para retornar los tursitas del vuelo (List-ArrayList)
    public List<Turista> turistasAbordo(List<Toma> tomas) {
        //Usa turistas como lista, luego se declara un arrayList aux para el filtrado
        List<Turista> resultado = new ArrayList<>(); 
        //For each x coincidencias
        for (Toma t : tomas) {
            if (t.getVuelo().equals(this)) { //En este caso equals sirve
                resultado.add(t.getTurista());
            }
        }
        return resultado; //El hecho de que sea List sgf que se puede pasar cualquiera de sus clases
    }
}
