package Actividades5;


import java.io.File;
// import java.nio.file.*;

public class Tema5 {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        try {
            // System.out.println("user.dir = " + System.getProperty("user.dir"));
            File fichero = new File("src/heroes.json");
            // System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
            // System.out.println("Existe? " + fichero.exists());
            // Path ruta = Paths.get("src/Tema5/src/heroes.json"); 
            // File fichero = ruta.toFile();
            System.out.println(fichero.exists());
            System.out.println("Nombre " + fichero.getName());
            System.out.println("Permiso_Lectura " + fichero.canRead());
            System.out.println("Permiso_Escritura " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

