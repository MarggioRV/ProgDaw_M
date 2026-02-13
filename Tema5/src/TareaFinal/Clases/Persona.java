package TareaFinal.Clases;

public class Persona implements Identificacion{
    protected String DNI;
    protected String nombre;
    protected String pape;
    
    public Persona() {
    }

    public Persona(String dNI, String nombre, String pape) {
        DNI = dNI;
        this.nombre = nombre;
        this.pape = pape;
    }

    @Override
    public String identificate() {
        return DNI + " - " + nombre + " " + pape;
    }

    // public void identificate() {
    //     // TODO Auto-generated method stub
    //     System.out.println(DNI + nombre + pape);
    // }

    //Getters and Setters

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPape() {
        return pape;
    }

    public void setPape(String pape) {
        this.pape = pape;
    }

    //Metdod Propio
    protected void Datos_DNI(){
        System.out.println("Sus datos de DNI son " + DNI + pape);
    }

    @Override
    public String toString() {
        return "Persona [DNI=" + DNI + ", texto=" + nombre + ", pape=" + pape + "]";
    }
}
