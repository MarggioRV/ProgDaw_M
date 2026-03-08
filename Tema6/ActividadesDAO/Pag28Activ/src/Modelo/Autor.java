package Modelo;

public class Autor {
    //Atributos
    protected int id;
    protected String direcc;
    protected String telef;
    protected String nombre;
    protected String ape1;
    protected String ape2;
     protected String url;
    //FK
     protected Integer idLocalidad;
     
     public Autor(int id, String direcc, String telef, String nombre, String ape1, String ape2, String url,
            Integer idLocalidad) {
        this.id = id;
        this.direcc = direcc;
        this.telef = telef;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.url = url;
        this.idLocalidad = idLocalidad;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getDirecc() {
         return direcc;
     }

     public void setDirecc(String direcc) {
         this.direcc = direcc;
     }

     public String getTelef() {
         return telef;
     }

     public void setTelef(String telef) {
         this.telef = telef;
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
        return "Autor [id=" + id + ", direcc=" + direcc + ", telef=" + telef + ", nombre=" + nombre + ", ape1=" + ape1
                + ", ape2=" + ape2 + ", url=" + url + ", idLocalidad=" + idLocalidad + "]";
     }

     
}
