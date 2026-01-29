package Activiades4.actividadesClases;

public class Locomotora {
    //Atributos
    String matricula;
    int potencia;
    String fecha_fabricacion;
    Mecanico mecanico;
    
    //Constructor
    public Locomotora(String matricula, int potencia, String fecha_fabricacion) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.fecha_fabricacion = fecha_fabricacion;
    }

    //Getters y Setters
    public String getFecha_fabricacion() {
        return fecha_fabricacion;
    }
    public String getMatricula() {
        return matricula;
    }
    public Mecanico getMecanico() {
        return mecanico;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setFecha_fabricacion(String fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        if(mecanico!=null)
            return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", fecha_fabricacion="
                + fecha_fabricacion + ", mecanico=" + mecanico + "]";
        else
            return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", fecha_fabricacion="
                + fecha_fabricacion+". No hay mecánico asignado ";
    }
}
