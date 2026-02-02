package Relacion_Ejercicios.Cladistica;

public abstract class Vertebrado extends Animal {

    protected int promedio_huesos;

    public Vertebrado(String nombre, int promedio_huesos) {
        super(nombre);
        this.promedio_huesos = promedio_huesos;
    }

    public void tieneColumnaVertebral() {
        System.out.println("Tiene columna vertebral");
    }
}

