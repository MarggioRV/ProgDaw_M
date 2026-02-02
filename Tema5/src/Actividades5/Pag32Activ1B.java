package Actividades5;

import java.util.HashMap;
import java.util.Map;

public class Pag32Activ1B {

    /* Dada una lista de marcas de coches, crea un programa que
       usa hashMap<String,Integer>, donde Integer tenga las veces que
       aparece cada marca en la lista. Hazlo usando Map usando sus métodos
       containsKey, get y put. */

    public static void main(String[] args) {

        //Semilla
        String[] coches = {"BMW", "Audi", "BMW", "Tesla", "Audi", "BMW", "Toyota","Tesla","Dlorean"};

        //Map
        Map<String, Integer> mapa = new HashMap<>();

        //Recorre lista y conteo de apariciones
        for (String marca : coches) {

            //Si la marca existe, se incrementa contador
            if (mapa.containsKey(marca)) {
                mapa.put(marca, mapa.get(marca) + 1);
            } 
            else { //Sino, se añade con valor 1
                mapa.put(marca, 1);
            }
        }

        //Imprimir
        System.out.println("Conteo de marcas:");
        System.out.println(mapa);
    }
}
