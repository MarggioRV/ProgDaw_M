package Actividades5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Pag18Activ2 {
    public static void main(String[] args) { 
        //Peticion de ruta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu ruta: ");

        String ruta=scanner.nextLine();

        //Verificacion_Existencia
        File f=new File(ruta);
        BufferedReader br=null;
        BufferedWriter bw=null;

        //Vb que existe por fuera
        String nuevoNomb = "";

        if(!f.exists()){ //Verificacion_Existencia
            System.out.println("No existe");
            scanner.close(); 
            return;
        }

        else{

            //Obtener nombre y extensión
            System.out.println("El archivo existe");
            String nombre = f.getName();
            String nombreSinExtension = nombre.substring(0, nombre.lastIndexOf('.'));
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1);

            //LocalDate
            LocalDate fecha=LocalDate.now();
            int año = fecha.getYear();
            int mes = fecha.getMonthValue();
            int dia = fecha.getDayOfMonth();

            //NuevoNomb
            nuevoNomb = nombreSinExtension + "_copia_" + año + "_" + mes + "_" + dia + "." + extension;
        }
  
        try {
            br = new BufferedReader(new FileReader(f));
            bw = new BufferedWriter(new FileWriter(nuevoNomb)); 

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Copia creada correctamente: " + nuevoNomb);

        } catch (Exception e) {
            System.out.println("Error al copiar: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos");
            }
        }
        scanner.close();
    }
}
