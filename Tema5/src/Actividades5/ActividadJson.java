package Actividades5;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ActividadJson {
    public static void main(String[] args) {

        try {
            // Leer el fichero como un ARRAY, no como objeto
            JSONArray lista = (JSONArray) new JSONParser().parse(
                    new FileReader("src/heroes.json")
            );

            int contador = 1;

            // Recorrer cada héroe del array
            for (Object item : lista) {
                JSONObject hero = (JSONObject) item;

                String publisher = (String) hero.get("publisher");

                // Filtrar solo los de Marvel
                if ("Marvel Comics".equals(publisher)) {

                    String nombre = (String) hero.get("superhero");
                    String alter = (String) hero.get("alter_ego");

                    // Mostrar en cascada enumerativa
                    System.out.println(contador + ". " + nombre + " -> " + alter);
                    contador++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el JSON");
        }
    }
}
