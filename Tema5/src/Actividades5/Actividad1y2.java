package Actividades5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Actividad1y2 {
    //Sin buffers
    public static class Practica2BytesFichero {
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

    public static class Caja<T> {
        private T contenido;

        public Caja(T dato){
            this.contenido=dato;
        }

        public void guardar(T valor) {
            this.contenido = valor;
        }

        public T obtener() {
            return contenido;
        }

        public static void main(String[] args) {
            // Actividades5.Actividad1y2.Caja<Integer> caja1 = new Actividades5.Actividad1y2.Caja<Integer>();
        }
    }
}
