package Modelo;

public class Almacen {
    //Atributos
    protected int id;
    protected String telef;
    protected String direcc;
    protected String url;
    //FK
    protected Integer idLocalidad;
    
    public Almacen(int id, String telef, String direcc, String url, Integer idLocalidad) {
        this.id = id;
        this.telef = telef;
        this.direcc = direcc;
        this.url = url;
        this.idLocalidad = idLocalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Override
    public String toString() {
        return "Almacen [id=" + id + ", telef=" + telef + ", direcc=" + direcc + ", url=" + url + ", idLocalidad="
                + idLocalidad + "]";
    }
}
