package Modelo;

public class Alumnos_Realiza_Practica {
    //Atributos
    protected int id_alumno;
    protected int id_practica;
    protected String fecha;
    protected int nota;

    //Constructor
    public int getId_practica() {
        return id_practica;
    }

    public Alumnos_Realiza_Practica(int id_alumno, int id_practica, String fecha, int nota) {
        this.id_alumno = id_alumno;
        this.id_practica = id_practica;
        this.fecha = fecha;
        this.nota = nota;
    }

    //G&S

    public void setId_practica(int id_practica) {
        this.id_practica = id_practica;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos_Realiza_Practica [alumno=" + id_alumno + ", practica=" + id_practica + ", fecha=" + fecha + ", nota="
                + nota + "]";
    }
}
