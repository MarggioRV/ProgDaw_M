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

            //Obtener el array "alumnos" -> JSONArray
            JSONArray alumnos = (JSONArray) json.get("alumnos");

            //Crear HashMap para estadisticas
            Map<String, Integer> e = new HashMap<>();
            e.put("suspensos", 0);
            e.put("aprobados", 0);
            e.put("notables", 0);
            e.put("sobresalientes", 0);

            //Recorrer cada Alumno
            for (Object item : alumnos) {

                //Referir item
                JSONObject a = (JSONObject) item;

                //Obtener nombre
                String nombre = (String) a.get("nombre");

                //Otener notas
                JSONArray notas = (JSONArray) a.get("notas");

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
                e.merge(
                        cat.name().toLowerCase() + "s",
                        1,
                        Integer::sum); //Lo suma, no es necs verificar

                System.out.println();
            }

            //Impresion final
            System.out.println("Estadisticas Finales:");
            System.out.println("------------------------");
            System.out.println("Suspensos: " + e.get("suspensos"));
            System.out.println("Aprobados: " + e.get("aprobados"));
            System.out.println("Notables: " + e.get("notables"));
            System.out.println("Sobresalientes: " + e.get("sobresalientes"));
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
