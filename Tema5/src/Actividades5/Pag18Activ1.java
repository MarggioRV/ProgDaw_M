package Actividades5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Pag18Activ1 {
    // 1) Implementa una clase que lee el contenido de un fichero, solicita una
    // palabra por teclado y dice cuántas veces aparece en el texto. Utiliza
    // split("\\s+") para separar por uno o varios espacios.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu ruta: ");

        String ruta=scanner.nextLine();
       
        //Verificacion_Existencia
        File f=new File(ruta);
        BufferedReader br=null;
       
        if(!f.exists()){ //Verificacion_Existencia
            System.out.println("No existe");
        }
        else{

            String palab;

            System.out.println("Introduce la palabra que deseas buscar: ");
            
            palab=scanner.nextLine();
            
            int conteo=0;
            
            try{
                br=new BufferedReader(new FileReader(ruta));
                String linea;
                while((linea=br.readLine()) !=null){
                    String[] palabras=linea.split("\\s+");
                    for (String p : palabras) {
                        if(p.contains(palab)){
                            conteo++;
                        }
                    }
                }
                System.out.println("Hay un total de " + conteo +" palabras que buscaste");
            }catch(Exception e){
                System.out.println("No se encontro el archivo");
            }
            scanner.close();
        }
    }
}
