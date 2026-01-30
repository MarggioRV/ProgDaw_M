package Ejercicios5;

import java.io.FileNotFoundException;
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
            
            //Ruta
            Object obj = parser.parse(new FileReader("Tema5/src/Prueba2.json"));

            //Convertir a JSONObject
            JSONObject json = (JSONObject) obj;

            //Obtener el array "alumnos" → JSONArray
            JSONArray alumnos = (JSONArray) json.get("alumnos");

            //Creacion de HashMap para las estadisticas
            Map<String, Integer> estadisticas = new HashMap<>();
            estadisticas.put("suspensos", 0);
            estadisticas.put("aprobados", 0);
            estadisticas.put("notables", 0);
            estadisticas.put("sobresalientes", 0);

            //Recorrer cada Alumno
            for (Object item : alumnos) {

                //Referir item
                JSONObject alumno = (JSONObject) item;

                //Obtener nombre
                String nombre = (String) alumno.get("nombre");

                //Otener notas
                JSONArray notas = (JSONArray) alumno.get("notas");

                //Cacl la media
                double suma = 0;
                for (Object n : notas) {
                    suma += ((Number) n).doubleValue();
                }
                double media = suma / notas.size();

                //Asiganacion_Categoria
                Categoria cat;

                if (media < 5) {
                    cat = Categoria.SUSPENSO;
                } else if (media < 7) {
                    cat = Categoria.APROBADO;
                } else if (media < 9) {
                    cat = Categoria.NOTABLE;
                } else {
                    cat = Categoria.SOBRESALIENTE;
                }

                //Separador
                System.out.println(nombre + " -> media = " + String.format("%.2f", media) + " | " + cat);

                //Actualizar contador x Merge
                estadisticas.merge(
                        cat.name().toLowerCase() + "s",
                        1,
                        Integer::sum);

                System.out.println();
            }

            //Impresion final
            System.out.println("Estadisticas Finales:");
            System.out.println("------------------------");
            System.out.println("Suspensos: " + estadisticas.get("suspensos"));
            System.out.println("Aprobados: " + estadisticas.get("aprobados"));
            System.out.println("Notables: " + estadisticas.get("notables"));
            System.out.println("Sobresalientes: " + estadisticas.get("sobresalientes"));
            System.out.println();
        
        //Sub-catch para ver si lo que falla es la ruta
        } catch (FileNotFoundException e) { 
        System.out.println("Ruta no coincidente"); 

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
