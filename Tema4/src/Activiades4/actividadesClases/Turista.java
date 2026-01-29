package Activiades4.actividadesClases;

public class Turista {
    //Atributos
    private int ID_turista;
    private String direcc;
    private String nombre;
    private String ape1, ape2;
    private String telefono;

    //Constructor
    public Turista(int ID_turista, String direcc, String nombre, String ape1, String ape2, String telefono) {
        this.ID_turista = ID_turista;
        this.direcc = direcc;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.telefono = telefono;
    }

    //Getters and Setters

    public int getID_turista() {
        return ID_turista;
    }

    public void setID_turista(int iD_turista) {
        this.ID_turista = iD_turista;
    }

    public String gerDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Turista [ID_turista=" + ID_turista + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2
                + ", telefono=" + telefono + "]";
    }
}
