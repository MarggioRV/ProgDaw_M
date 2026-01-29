package Relacion_Ejercicios4;

public class Pais {
    private String nombre;
    private double PBI;
    private long poblacion; //tp dato + apropiado

    public Pais(String nombre, double PBI, long poblacion) {
        this.nombre = nombre;
        this.PBI= PBI;
        this.poblacion = poblacion;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPBI() {
        return PBI;
    }

    public void setPBI(double PBI) {
        PBI = PBI;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + PBI + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    //Metodos

    //Operacion
    public void calcPPC() {
        double PBIPC = getPBI() / getPoblacion();
        System.out.println("PIB per cápita de " + getNombre() + ": " + PBIPC);
    }

}
