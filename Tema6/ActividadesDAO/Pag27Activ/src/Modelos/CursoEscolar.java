package Modelos;

public class CursoEscolar {
    //Atributos
    private int id;
    private String anyo_inicio;
    private String anyo_fin;
    
    //Contructor
    public CursoEscolar(int id, String anyo_inicio, String anyo_fin) {
        this.id = id;
        this.anyo_inicio = anyo_inicio;
        this.anyo_fin = anyo_fin;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnyo_inicio() {
        return anyo_inicio;
    }

    public void setAnyo_inicio(String anyo_inicio) {
        this.anyo_inicio = anyo_inicio;
    }

    public String getAnyo_fin() {
        return anyo_fin;
    }

    public void setAnyo_fin(String anyo_fin) {
        this.anyo_fin = anyo_fin;
    }
}
