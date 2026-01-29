package Activiades4.actividadesClases;

public class Persona2 {
    private String nombre; 
    private String cedula;
    private String apellido;
    private char genero;

    private Fecha fecha; //Clave Foranea
    private Ciudad nacimiento; //Clave Foranea

	//Constructor Por Defecto
    public Persona2(){ 
    }

    public Persona2(String nombre, String cedula, String apellido, char genero){
        this.nombre=nombre;
        this.cedula=cedula;
        this.apellido=apellido;
        this.genero=genero;
    }
    
    //Constructor x Copia
    public Persona2(Persona2 p){
        this.nombre=p.getNombre();
        this.apellido=p.getApellido();
        this.cedula=p.getCedula();
        this.genero=p.getGenero();
    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getCedula(){
        return this.cedula;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }

    public void setGenero(char genero){
        this.genero=genero;
    }
    public char getGenero(){
        return this.genero;
    }

    //Clave Foranea 1
    public void setFecha(Fecha f){
        this.fecha=f;
    }

    public Fecha getFecha(){
        return fecha;
    }
    
    //Clave Foranea 2
    public void CiudadNacimiento(Ciudad nCiudad){
        this.nacimiento=nCiudad;
    }

    public Ciudad getCiudadNacimiento(){
        return nacimiento;
    }
     
    //Métodos

    public void saludar(){ 
        System.out.println("Hola a todos, soy "+nombre);
    }
    public void imprimeDatos(){
        System.out.println("Mi nombre completo es "+nombre + " " + apellido + ", mi genero es "+genero+" y mi #cedula es " + cedula);
        System.out.println("Fecha_Nacimiento: ");
        if(fecha != null && nacimiento != null) {
            this.fecha.imprimeFecha();
            this.nacimiento.imprimeCiudad();
        } else {
            System.out.println("Datos insuficientes");
        }     
    }
}