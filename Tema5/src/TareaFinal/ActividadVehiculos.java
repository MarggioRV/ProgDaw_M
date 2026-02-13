package TareaFinal;

import java.util.ArrayList;

import TareaFinal.Clases.*;

public class ActividadVehiculos {
    public static void main(String[] args) {

    Propietario p1 = new Propietario("1231","Bob","Spongebob","Santadilla");
    Cliente cl1 = new Cliente("1345689","Aurora","YYYY","12345678");

    Taller t1=new Taller("Tuercas", "Gallardos", p1);
    Moto2 m1 = new Moto2("d", "w", "2", false);
    Coche3 c1 = new Coche3(15,20);

        ArrayList<Vehiculo2> array = new ArrayList<>();
            array.add(m1); 
            array.add(c1);
       
        cl1.addVehiculo(c1);
        cl1.addVehiculo(m1);
        t1.addCliente(cl1);

        //Recorrer y imprimir
        for (Vehiculo2 v : array) {
            System.out.println(v);
        }
    }
}
