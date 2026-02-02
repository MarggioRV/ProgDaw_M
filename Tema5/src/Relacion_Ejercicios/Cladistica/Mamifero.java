package Relacion_Ejercicios.Cladistica;

public class Mamifero extends Vertebrado {

    protected int meses_gestacion;
    
    public Mamifero(String nombre, int promedio_huesos, int meses_gestacion) {
        super(nombre, promedio_huesos);
        this.meses_gestacion = meses_gestacion;
    }

    @Override
    public void desplazarse() {
        System.out.println("Camina o corre, algunos vuelan"); //
    }

    @Override
    public void alimentarse() {
        System.out.println("Diferentes nichos, pero de leche materna al nacer");
    }
}
