package Activiades4.actividadesClases;

import java.time.LocalDate;

public class Alumno {
    //Atributos
    private Alumno delegado;
    private int expediente;
    private String nombreA;
    private String apellidosA;
    private LocalDate fechaNacimiento;
    
    //Constructor
    public Alumno(Alumno delegado, int expediente, String nombreA, String apellidosA, LocalDate fechaNacimiento) {
        this.delegado = delegado;
        this.expediente = expediente;
        this.nombreA = nombreA;
        this.apellidosA = apellidosA;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters y Setters

    public Alumno getDelegado() {
        return delegado;
    }

    public void setDelegado(Alumno delegado) {
        this.delegado = delegado;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getApellidosA() {
        return apellidosA;
    }

    public void setApellidosA(String apellidosA) {
        this.apellidosA = apellidosA;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        if (delegado != null) {
            return "Alumno [delegado=" + delegado + ", expediente=" + expediente + ", nombreA=" + nombreA
                + ", apellidosA=" + apellidosA + ", fechaNacimiento=" + fechaNacimiento + "]";
        }
        return "";
    }

    //Metodos

    //Función para asignar/cambiar delegado
    public void cambiarDelegado(Alumno nuevoDelegado) {
        if (nuevoDelegado == null) {
            System.out.println("Debe asignarse un delegado válido.");
            return;
        }
        this.delegado = nuevoDelegado;
        System.out.println("El nuevo delegado de " + nombreA + " es " + delegado.getNombreA());
    }
}
