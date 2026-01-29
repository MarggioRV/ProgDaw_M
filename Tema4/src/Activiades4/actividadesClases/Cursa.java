package Activiades4.actividadesClases;

import java.util.List;

public class Cursa {
    //Atributos
    Alumno alumno;
    Modulo modulo;
   
    //Constructor
    public Cursa(Alumno alumno, Modulo modulo) {
        this.alumno = alumno;
        this.modulo = modulo;
    }

    //Getters y Setters

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Cursa [alumno=" + alumno + ", modulo=" + modulo + "]";
    }

    //Métodos 

    //Func si un alumno esta matriculado 
    public static boolean estaMatriculado(String nombAl, String nombMod, List<Cursa> lista) {
        for (Cursa c : lista) {
            if (c.getAlumno().getNombreA().equalsIgnoreCase(nombAl) && c.getModulo().getNombre().equalsIgnoreCase(nombMod)) {
                return true;
            }
        }
        return false;
    }
}
