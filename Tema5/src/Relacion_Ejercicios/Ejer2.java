package Relacion_Ejercicios;

/*
 Lee el fichero heroes.json para obtener un formato 
 tabla de salida con la información de los héroes de DC 
 cuyo superhero empieza por ‘G’.
*/

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ejer2 {
    public static void main(String[] args) {
        try {

            //Objeto + Ruta
            JSONArray lista = (JSONArray) new JSONParser().parse(
                new FileReader("Tema5/src/heroes.json")
            );

            //Mapa para agrupar héroes x publisher
            Map<String, List<String>> mapa = new HashMap<>();

            for (Object senal : lista) {
                JSONObject heroe = (JSONObject) senal;

                //Claves del JSON
                String publisher = (String) heroe.get("publisher");
                String nombre = (String) heroe.get("superhero");
                String alter_ego = (String) heroe.get("alter_ego");

                //Separador
                String separador = nombre + ": " + alter_ego;

                //Agrupar x publisher
                mapa.putIfAbsent(publisher, new ArrayList<>());
                mapa.get(publisher).add(separador);
            }

            //List para filtrar solo los heores de DC
            List<String> heroesDC = mapa.get("DC Comics");

            if (heroesDC != null) {
                System.out.println("Héroes de DC cuyo nombre empieza por G:\n");

                //Filtro_Impresion x Letra
                for (String heroe : heroesDC) {
                    if (heroe.startsWith("G")) {
                        System.out.println(heroe);
                    }
                }
            } else {
                System.out.println("No se encontraron héroes de DC en el JSON.");
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el JSON");
        }
    }
}
