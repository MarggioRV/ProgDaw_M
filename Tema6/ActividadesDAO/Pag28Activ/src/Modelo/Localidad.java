package Modelo;

public class Localidad {
    //Atributos
    protected int id;
    protected String nombre;
    //Clave_Foranea
    protected Integer idProvincia;
    
    public Localidad(int id, String nombre, Integer idProvincia) {
        this.id = id;
        this.nombre = nombre;
        this.idProvincia = idProvincia;
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

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public String toString() {
        return "Localidad [id=" + id + ", nombre=" + nombre + ", idProvincia=" + idProvincia + "]";
    } 
}
