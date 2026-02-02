package Actividades5;

import java.io.*;

public class PrubLectura {
    public static void main(String[] args) {

        //Se declara el objeto File que representa el archivo
        File archivo = null;
        //Leer el archivo como flujo de caracteres
        FileReader reader = null;
        //Leer el archivo línea por línea
        BufferedReader buffer = null;

        try {
            //Objeto File con la ruta del archivo
            archivo = new File("Tema5/src/poema.txt");
            //Incializacion_FR
            reader = new FileReader(archivo);
            //Y se envuelve en BR
            buffer = new BufferedReader(reader);

            //Contenedor_Linea
            String linea;

            //Lectura linea x linea hasta el final
            while ( (linea=buffer.readLine()) != null){
                System.out.println(linea);
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally { //El bloque finally se ejecuta siempre.

            try {
                if (buffer != null) {
                    buffer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
