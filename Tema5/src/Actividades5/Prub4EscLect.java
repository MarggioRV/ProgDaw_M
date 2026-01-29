// package Tema5.src;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;

// public class LecturaEscritura {
//     private static final String FILE = "src/puntos.txt";
//     public static void main(String[] args) {
//         //Variables_Escritura
//         // String linea1 = "j4  |   2";
//         // String linea2 = "j3  |   5";
//         //Variables_Lectura
//         File conteo = new File(FILE);
//         FileReader reader = null;
//         BufferedReader buffer = null;

//         try {
//             conteo = new File ("src/puntos.txt");
//             System.out.println(conteo.exists());
//             System.out.println(conteo.getAbsolutePath());
//             reader = new FileReader(conteo);
//             buffer = new BufferedReader(reader);

//             String linea;
//             while ((linea=buffer.readLine()) != null){
//                 System.out.println(linea);
//             }
//             reader.close();
            
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

package Actividades5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prub4EscLect {
    private static final String FILE = "src/puntos.txt";
    public static void main(String[] args) {
        // Datos para escribir en el archivo
        String linea1 = "j4  |   2";
        String linea2 = "j3  |   5";

        System.out.println("Escribiendo en el archivo: " + FILE);
        try (FileWriter fileWriter = new FileWriter(FILE);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            
            writer.write(linea1);
            writer.newLine(); 
            writer.write(linea2);
            writer.newLine();
            System.out.println("Escritura completada.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        System.out.println("\nLeyendo el contenido del archivo:");
        try (FileReader fileReader = new FileReader(FILE);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

