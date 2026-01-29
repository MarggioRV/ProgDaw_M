package Actividades5;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Pag32Tarea {
        public static void main(String[] args) {

        try {
            //Leer el fichero como un ARRAY, no como objeto
            JSONArray lista = (JSONArray) new JSONParser().parse(
                new FileReader("src/heroes.json")
            );

            //Declaración del Map 
            Map<String, List<String>> mapa = new HashMap<>();

            for (Object item : lista) {
                JSONObject hero = (JSONObject) item;
                
                //Obtencion_Claves
                String publisher = (String) hero.get("publisher");
                String nombre = (String) hero.get("superhero");
                String alter = (String) hero.get("alter_ego");

                //Intermediario
                String entrada = nombre + " -> " + alter;

                //Crear lista, si no existe -> Añadir entrada

                /* Por pasos */
                if  (!mapa.containsKey(publisher)) { 
                    mapa.put(publisher, new ArrayList<>());
                }
                mapa.get(publisher).add(entrada);

                /* Version concisa */
                // mapa.computeIfAbsent(publisher, k -> new ArrayList<>()).add(entrada);
            }

            //Imprimir por Editorial
            for (String clave : mapa.keySet()) {
                System.out.println(clave + ":");
                for (String heroe : mapa.get(clave)) {
                    System.out.println(" - " + heroe);
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el JSON");
        }
    }
}
