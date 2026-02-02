package Actividades5;

import java.util.ArrayList;
import Actividades5.clases.*;

public class Pag47Activ{

    public static void main(String[] args) {

        //Lista de Movible 
        ArrayList<Acciones> listMovible = new ArrayList<>();
        listMovible.add(new Avion());
        listMovible.add(new Barco());
        listMovible.add(new Coche2());

        System.out.println();
        System.out.println("=== MOVIMIENTOS ===");
        for (Acciones a : listMovible) {
            a.Mover();
        }

        //Lista de Sonoro
        ArrayList<Acciones> listSonoro = new ArrayList<>();
        listSonoro.add(new Avion());
        listSonoro.add(new Barco());
        listSonoro.add(new Coche2());

        System.out.println();
        System.out.println("=== SONIDOS ===");
        for (Acciones a : listSonoro) {
            a.EmetirDOnido();
        }
    }
}
