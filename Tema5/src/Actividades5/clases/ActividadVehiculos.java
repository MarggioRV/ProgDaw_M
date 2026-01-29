package Actividades5.clases;

import java.util.ArrayList;

public class ActividadVehiculos {
    public static void main(String[] args) {
        Moto m1 = new Moto("1234 XCD");
        Coche c1 = new Coche("3210 RTX");
        Camion ca1 = new Camion("9999 HJK");

        ArrayList<Vehiculo> array = new ArrayList<>();
        array.add(m1); array.add(c1); array.add(ca1);

        //Recorrer los objetos
        for(Vehiculo v : array){
            v.mostrarInfo();
            if (v instanceof Coche){//Comprobamos si el objeto guardado en la lista es un Coche para hacer uso de su función
                Coche coche=(Coche)v;
                coche.acelerar();
            }
                
        }
    }
}
