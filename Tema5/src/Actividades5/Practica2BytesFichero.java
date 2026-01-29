package Actividades5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Sin buffers
public class Practica2BytesFichero {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("entrada.txt");
        FileOutputStream out = new FileOutputStream("salida.txt");
        int n = 0, c;
        System.out.print("\nCopiando ...");
        while ((c = in.read()) != -1) {
            out.write(c);
            n++;
        }
        in.close();
        out.close();
        System.out.print("\nSe han copiado " + n + " Bytes\n");
    }
}
