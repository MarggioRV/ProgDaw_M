package Actividades5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrubEscritura {
        public static void main(String[] args) {
        String contenido = "El IES Cura Valera tiene los mejores alumnos en prgoramación y los van a contratar a todos.";
        try {
            FileWriter archivo = new FileWriter("Tema5/src/Prueba3.txt",true); 
            BufferedWriter escritor = new BufferedWriter(archivo); 

            escritor.write(contenido);  // Escribimos la cadena en el archivo
            escritor.newLine();         // Añadimos una nueva línea
            escritor.flush();           // Aseguramos que se escriban los datos

            escritor.close();           // Cerramos el BufferedWriter
            System.out.println("¡Archivo escrito con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
