package Modelos;

import java.sql.Date;

public class ExamenTeorico {
    protected int id;
    protected String titulo;
    protected int numero_preguntas;
    protected Date fecha;
    protected int id_profesor;

    public ExamenTeorico(int id, String titulo, int numero_preguntas, Date fecha, int id_profesor) {
        this.id = id;
        this.titulo = titulo;
        this.numero_preguntas = numero_preguntas;
        this.fecha = fecha;
        this.id_profesor = id_profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_preguntas() {
        return numero_preguntas;
    }

    public void setNumero_preguntas(int numero_preguntas) {
        this.numero_preguntas = numero_preguntas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    @Override
    public String toString() {
        return "ExamenTeorico [id=" + id + ", titulo=" + titulo + ", numero_preguntas=" + numero_preguntas + ", fecha="
                + fecha + ", id_profesor=" + id_profesor + "]";
    }
}