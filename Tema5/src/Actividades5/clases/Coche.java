package Actividades5.clases;

public class Coche extends Vehiculo{

    public Coche(String matricula) {
        super(matricula);
    }

    public int velocidadMax() {
        return 100;
    }

    public void acelerar(){
        System.out.println("Estoy acelerando a la velocidad máxima");
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
    }
}
