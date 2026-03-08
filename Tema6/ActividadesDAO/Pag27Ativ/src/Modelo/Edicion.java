package Modelo;

import java.sql.Date;

public class Edicion {
    private int id;
    private int idCurso;
    private Date fechaInicio;
    private Date fechaFin;
    private String horario;
    private String lugar;
    //Clave_Foranea
    private Integer idEmpleadoImparte; 
  
    //Constructor
    public Edicion(int id, int idCurso, Date fechaInicio, Date fechaFin, String horario, String lugar, Integer idEmpleadoImparte) {
        this.id = id;
        this.idCurso = idCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
        this.lugar = lugar;
        this.idEmpleadoImparte = idEmpleadoImparte;
    }

    // Getters y setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getIdEmpleadoImparte() {
        return idEmpleadoImparte;
    }

    public void setIdEmpleadoImparte(Integer idEmpleadoImparte) {
        this.idEmpleadoImparte = idEmpleadoImparte;
    }

    @Override
    public String toString() {
        return "Edicion [id=" + id + ", idCurso=" + idCurso + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
                + ", horario=" + horario + ", lugar=" + lugar + ", idEmpleadoImparte=" + idEmpleadoImparte + "]";
    }

}
