package Relacion_Ejercicios.Cladistica;

public class Pez extends Vertebrado {

    protected String tipo_Pez;

    public Pez(String nombre, int promedio_huesos, String tipo_Pez) {
        super(nombre, promedio_huesos);
        this.tipo_Pez = tipo_Pez;
    }

    @Override
    public void desplazarse() {
        System.out.println("Por lo general, solo nada");
    }

    @Override
    public void alimentarse() {
        System.out.println("Diferentes nichos");
    }
}
