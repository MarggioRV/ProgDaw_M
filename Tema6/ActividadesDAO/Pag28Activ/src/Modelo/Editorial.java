package Modelo;

public class Editorial {
    //Atributos
    protected int id;
    protected String nombre;
    protected String direcc, telefono, url;
    //FK
    protected Integer idLocalidad;
    
    public Editorial(int id, String nombre, String direcc, String telefono, String url, Integer idLocalidad) {
        this.id = id;
        this.nombre = nombre;
        this.direcc = direcc;
        this.telefono = telefono;
        this.url = url;
        this.idLocalidad = idLocalidad;
    }

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

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        return "Editorial [id=" + id + ", nombre=" + nombre + ", direcc=" + direcc + ", telefono=" + telefono + ", url="
                + url + ", idLocalidad=" + idLocalidad + "]";
    }
}
