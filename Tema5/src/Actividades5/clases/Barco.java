package Actividades5.clases;

public class Barco implements Acciones {

    @Override
    public void EmetirDOnido() {
        // TODO Auto-generated method stub
        System.out.println("El barco hace sonar la bocina: ¡Buuu!");
    }

    @Override
    public void Mover() {
        // TODO Auto-generated method stub
        System.out.println("El barco navega por el mar");
    }
    
}
