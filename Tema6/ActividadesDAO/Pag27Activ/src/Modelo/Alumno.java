package Modelo;

import java.sql.Date;

public class Alumno {

    //Atributos
    private int numMatricula;
    private Date fecha_nac;
    private String nombre;
    private String Ape1;
    private String Ape2;
    private String telefono;
    
    //Constructores

    public Alumno(int numMatricula, Date fecha_nac, String nombre, String ape1, String ape2, String telefono) {
        this.numMatricula = numMatricula;
        this.fecha_nac = fecha_nac;
        this.nombre = nombre;
        Ape1 = ape1;
        Ape2 = ape2;
        this.telefono = telefono;
    }

    //Getter y Setters

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Date getFecha_nacimiento() {
        return fecha_nac;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nac = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return Ape1;
    }

    public void setApe1(String ape1) {
        Ape1 = ape1;
    }

    public String getApe2() {
        return Ape2;
    }

    public void setApe2(String ape2) {
        Ape2 = ape2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno [numMatricula=" + numMatricula + ", fecha_nac=" + fecha_nac + ", nombre=" + nombre + ", Ape1="
                + Ape1 + ", Ape2=" + Ape2 + ", telefono=" + telefono + "]";
    }
}
