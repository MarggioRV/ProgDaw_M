package Actividades5.clases;

public class Moto extends Vehiculo{

    public Moto(String matricula) {
        super(matricula);
    }

    public int velocidadMax() {
        return 200;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
    }
}
