package Actividades5.clases;

public class Camion extends Vehiculo{

    public Camion(String matricula) {
        super(matricula);
    }

    public int velocidadMax() {
        return 90;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
    }
}
