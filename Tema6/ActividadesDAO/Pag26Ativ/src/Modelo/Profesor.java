package Modelo;
public class Profesor {
    
    //Atributos
    protected int id;
    protected String nombre;
    protected String ape1;
    protected String ape2;
    protected String especialidad;
    protected String telefono;

    //Constructores

    public Profesor(int id, String nombre, String ape1, String ape2, String especialidad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApe1() {
        return ape1;
    }
    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }
    public String getApe2() {
        return ape2;
    }
    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Profesor [id=" + id + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", especialidad="
                + especialidad + ", telefono=" + telefono + "]";
    }   
}
