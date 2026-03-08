package Modelo;

public class Curso_Escolar {
    
    //Atributos
    protected int id;
    protected int anio_inicio;
    protected int anio_fin;
    
    //Constructor
    public Curso_Escolar(int id, int anio_inicio, int anio_fin) {
        this.id = id;
        this.anio_inicio = anio_inicio;
        this.anio_fin = anio_fin;
    }

    //Gs y Ss

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(int anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public int getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(int anio_fin) {
        this.anio_fin = anio_fin;
    }

    @Override
    public String toString() {
        return "Curso_Escolar [cod=" + id + ", anio_inicio=" + anio_inicio + ", anio_fin=" + anio_fin + "]";
    }
}
