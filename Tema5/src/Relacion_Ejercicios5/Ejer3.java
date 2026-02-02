package Relacion_Ejercicios5;

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
            Map<Categoria, Integer> e = new HashMap<>();

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

                //Recorrer Notas
                for (Object n : notas) {
                    suma += ((Number) n).doubleValue();
                }
                double media = suma / notas.size();

                //Asiganacion_Categoria
                Categoria cat;

                if (media < 5) {
                    cat = Categoria.Suspensos;
                } else if (media < 7) {
                    cat = Categoria.Aprobados;
                } else if (media < 9) {
                    cat = Categoria.Notables;
                } else {
                    cat = Categoria.Sobresalientes;
                }

                //Separador
                System.out.println(nombre + " -> media = " + String.format("%.2f", media) + " | " + cat);

                //Actualizar contador x Merge
                e.merge(cat, 1, Integer::sum); //Lo suma, no es necs verificar

                System.out.println();
            }

            //Impresion final
            System.out.println("Estadisticas Finales:");
            System.out.println("------------------------");
            System.out.println("Suspensos: " + e.get(Categoria.Suspensos));
            System.out.println("Aprobados: " + e.get(Categoria.Aprobados));
            System.out.println("Notables: " + e.get(Categoria.Notables));
            System.out.println("Sobresalientes: " + e.get(Categoria.Sobresalientes));
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
        Suspensos,
        Aprobados,
        Notables,
        Sobresalientes
    }
}
