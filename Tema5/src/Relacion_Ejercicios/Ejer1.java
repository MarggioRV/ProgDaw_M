package Relacion_Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer1 {
//Usando Scanner
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ruta1
        System.out.print("Ruta del 1er fichero: "); 
        //C:\\Users\\Marggio\\Documents\\Repositorios\\ProgDaw_M\\Tema5\\src\\fichero1.txt
        String ruta1 = sc.nextLine();

        //Ruta2
        System.out.print("Ruta del 2do fichero: ");
        //C:\\Users\\Marggio\\Documents\\Repositorios\\ProgDaw_M\\Tema5\\src\\fichero2.txt
        String ruta2 = sc.nextLine();

        //RutaFinal
        System.out.print("Ruta del directorio destino: ");
        //Tema5/src/
        String rutaDestino = sc.nextLine();

        try {
            //Crear objetos File
            File f1 = new File(ruta1);
            File f2 = new File(ruta2);

            //Obtener nombres sin extensión
            String nombre1 = f1.getName();
            String nombre2 = f2.getName();
            //QuitarPunto
            String base1 = nombre1.substring(0, nombre1.lastIndexOf("."));
            String base2 = nombre2.substring(0, nombre2.lastIndexOf("."));

            //Crear nombre final
            String nombreFinal = base1 + "_" + base2 + ".txt";

            //Crear fichero destino
            File ficheroFinal = new File(rutaDestino + "/" + nombreFinal);

            //Preparar Agentes
            Scanner lector1 = new Scanner(f1);
            Scanner lector2 = new Scanner(f2);
            PrintWriter escritor = new PrintWriter(ficheroFinal);

            //Copiar contenido_1ero
            while (lector1.hasNextLine()) {
                escritor.println(lector1.nextLine());
            }

            //Copiar contenido_2do
            while (lector2.hasNextLine()) {
                escritor.println(lector2.nextLine());
            }

            //Cerrar
            lector1.close();
            lector2.close();
            escritor.close();

            System.out.println("Fichero creado correctamente en: " + ficheroFinal.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo acceder a uno de los ficheros.");
        }

        sc.close();
    }
}

