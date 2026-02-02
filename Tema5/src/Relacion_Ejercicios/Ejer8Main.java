package Relacion_Ejercicios;

import java.util.ArrayList;

public class Ejer8Main {

    public static void main(String[] args) {

        ArrayList<Ejer7Vehiculo> lista = new ArrayList<>();

        //Añadir elementos
        lista.add(new Ejer7Coche("DLorean"));
        lista.add(new Ejer8Avion("Boeing"));
        lista.add(new Ejer8Helicop("Airbus"));
        lista.add(new Ejer7Coche("Ford"));
        lista.add(new Ejer8Avion("Xioami"));

        //Recorrer lista
        for (Ejer7Vehiculo v : lista) {
            //Llamada para arrancar todos
            v.arrancar();

            //Solo se llama a volar vuelan si implementan Volador
            if (v instanceof Ejer8Volador) { //instanceof, en este lg, reviza si la inferfaz ∉ o ∈
                ((Ejer8Volador) v).volar();
            }
            System.out.println();
        }
    }
}

