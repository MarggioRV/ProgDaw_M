package Actividades5;

import java.util.ArrayList;
import Actividades5.clases.Moto;
import Actividades5.clases.Coche;
import Actividades5.clases.Camion;
import Actividades5.clases.Vehiculo;

public class Pag39ActivVehiculos {
    public static void main(String[] args) {
        
        //ArrayList para guardarlos
        ArrayList<Vehiculo> listaVeh = new ArrayList<>();

        //Implantar
        listaVeh.add(new Moto("MOTO-123"));
        listaVeh.add(new Coche("COCHE-456"));
        listaVeh.add(new Camion("CAMION-789"));

        //Recorrer
        for (Vehiculo v : listaVeh) {
            System.out.println("-----");
            v.mostrarInfo(); 
            System.out.println("Velocidad máxima: " + v.velocidadMax() + " km/h");

            //Comportamiento Especifico
            if (v instanceof Coche) {
                ((Coche) v).acelerar();
            }
        }
    }
}
 