package Actividades5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Actividad3EnRaya {

    public static class Practica1LeerFichero {
        public static void main(String[] args) {
            File archivo = null;
            FileReader reader = null;
            BufferedReader buffer = null;

            System.out.println(new File(".").getAbsolutePath());

            try {
                archivo = new File ("src/heroes.json");
                System.out.println(archivo.getAbsolutePath());
                reader = new FileReader(archivo);
                buffer = new BufferedReader(reader);

                String linea;
                while ((linea=buffer.readLine()) != null){
                    System.out.println(linea);
                }
                reader.close();
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
    }
}
