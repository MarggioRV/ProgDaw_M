package Actividades5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Pag17Activi2Bonoloto {
    public static void main(String[] args) {

        int[] BONOLOTO = {11, 12, 20};
        
        try {
            FileWriter respuesta = new FileWriter("src/bonoloto.txt");
            BufferedWriter escrito = new BufferedWriter(respuesta); 

            //Escribimos la cadena en el archivo
            
            escrito.write("Números de la Bonoloto:");
            for (int numero : BONOLOTO) {
                escrito.newLine(); 
                escrito.write(String.valueOf(numero));
            }
            escrito.newLine(); 
            escrito.flush();
            escrito.close();
            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
