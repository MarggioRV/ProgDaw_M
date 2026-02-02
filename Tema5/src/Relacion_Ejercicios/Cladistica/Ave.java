package Relacion_Ejercicios.Cladistica;

public class Ave extends Vertebrado {

    protected String tipo_Ave;

    public Ave(String nombre, int promedio_huesos, String tipo_Ave) {
        super(nombre, promedio_huesos);
        this.tipo_Ave = tipo_Ave;
    }

    @Override
    public void desplazarse() {
        System.out.println("Vuela, nada o corre");
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de semillas o insectos, en el caso de no rapaces");
    }
}

