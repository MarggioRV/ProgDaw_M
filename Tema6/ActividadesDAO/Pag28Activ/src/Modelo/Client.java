package Modelo;

public class Client {
    //Atributos
    protected int id;
    protected String nombre;
    protected String ape1;
    protected String ape2;
    protected String direcc;
    protected String email;
    //FK
     protected Integer idLocalidad;
     
     public Client(int id, String nombre, String ape1, String ape2, String direcc, String email, Integer idLocalidad) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.direcc = direcc;
        this.email = email;
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

     public String getDirecc() {
         return direcc;
     }

     public void setDirecc(String direcc) {
         this.direcc = direcc;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public Integer getIdLocalidad() {
         return idLocalidad;
     }

     public void setIdLocalidad(Integer idLocalidad) {
         this.idLocalidad = idLocalidad;
     }

     @Override
     public String toString() {
        return "Client [id=" + id + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", direcc=" + direcc
                + ", email=" + email + ", idLocalidad=" + idLocalidad + "]";
     }

    
    
}
