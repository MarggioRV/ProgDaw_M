package Ejercicios5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class Ejer3B_Gson {
    
    //Clases Contenedores x parLlaves para procesar objetos
    
    //Curso
    public class Curso{
        String curso; 
        Alumnos[] alumnos; //Gson lo rellena automáticamente
    }

    //Alumnos
    public class Alumnos{
        String nombre; 
        int[] notas; //Igual que su par
    }

    public static void main(String[] args) {
        try {
            //Crear Gson y leer JSON
            Gson gson = new Gson();
            Curso data = gson.fromJson(new FileReader("Tema5/src/Prueba2.json"), Curso.class);

            //Map para estadisticas
            Map<Categoria, Integer> e = new HashMap<>();
            
            for (Categoria c : Categoria.values()) {
                e.put(c, 0);
            }

            //Recorrer Alumnos
            for (Alumnos a : data.alumnos) {

                //Aviso_Lectura
                System.out.println("Alumno leído: " + a.nombre);
                
                //Calc Media
                double suma = 0;

                //Recorrer Notas
                for (int n : a.notas) suma += n;
                double media = suma / a.notas.length;

                //Determinar Categoria
                Categoria cat;
                if (media < 5) cat = Categoria.Suspensos; 
                else if (media < 7) cat = Categoria.Aprobados; 
                else if (media < 9) cat = Categoria.Notables; 
                else cat = Categoria.Sobresalientes;

                //Separador
                System.out.println(a.nombre + " -> media = " + String.format("%.2f", media) + " | " + cat);
                
                //Actualizar 
                e.merge(cat, 1, Integer::sum);
                
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
         
        } catch (FileNotFoundException e) { 
            System.out.println("Ruta no coincidente"); 
        } catch (Exception e) {
             System.out.println("No se puedo abrir");
        }
    }

    enum Categoria { 
        Suspensos, 
        Aprobados, 
        Notables, 
        Sobresalientes 
    }
}
