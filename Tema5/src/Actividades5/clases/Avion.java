package Actividades5.clases;

public abstract class Avion implements Acciones {

    @Override
    public void EmetirDOnido() {
        // TODO Auto-generated method stub
        System.out.println("El avion vuela por cielo");
    }

    @Override
    public void Mover() {
        // TODO Auto-generated method stub
        System.out.println("El avion hace ruido de motores ¡Vroom!");
    }
    
}
