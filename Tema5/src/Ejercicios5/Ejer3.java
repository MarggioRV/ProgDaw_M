package Ejercicios5;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ejer3 {
    public static void main(String[] args) {
        try {

            //Crear JSONParser
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("Tema5/src/Prueba2.json"));

            //Convertir a JSONObject
            JSONObject json = (JSONObject) obj;

            // Obtener el array "alumnos" → JSONArray
            JSONArray alumnos = (JSONArray) json.get("alumnos");

            //Creacion de HashMap para las estadisticas
            Map<String, Integer> estadisticas = new HashMap<>();
            estadisticas.put("suspensos", 0);
            estadisticas.put("aprovados", 0);
            estadisticas.put("notables", 0);
            estadisticas.put("sobresalientes", 0);

            //Recorrer cada Alumno
            for (Object item : alumnos) {

                JSONObject alumno = (JSONObject) item;
                String nombre = (String) alumno.get("nombre");
                JSONArray notas = (JSONArray) alumno.get("notas");

                //Cacl la media
                double suma = 0;
                for (Object n : notas) {
                    suma += ((Number) n).doubleValue();
                }
                double media = suma / notas.size();

                //Asiganacion_Categoria
                Categoria categoria;
                if (media < 5) {
                    categoria = Categoria.SUSPENSO;
                } else if (media < 7) {
                    categoria = Categoria.APROBADO;
                } else if (media < 9) {
                    categoria = Categoria.NOTABLE;
                } else {
                    categoria = Categoria.SOBRESALIENTE;
                }

                //Separador
                System.out.println(nombre + " → media = " + String.format("%.2f", media)  + " | " + categoria);

                //Actualizar contador x Merge
                 estadisticas.merge(
                        categoria.name().toLowerCase() + "s",
                        1,
                        Integer::sum);

                System.out.println();

                //Impresion final
                System.out.println("Estadisticas Finales");
                System.out.println(estadisticas);
            }
        } catch (Exception e) {
            System.out.println("Error leyendo el JSON");
            e.printStackTrace();
        }
    }

    enum Categoria {
        SUSPENSO,
        APROBADO,
        NOTABLE,
        SOBRESALIENTE
    }

}
