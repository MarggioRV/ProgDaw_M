package Actividades5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pag16Activ2 {

    public static void main(String[] args) {

        //Ruta del fichero
        File fichero = new File("Tema5/src/numeros2.txt"); 
        
        //Contadores
        int suma = 0;
        int contador = 0;

        try {
            //Scanner leyendo desde fichero
            Scanner sc = new Scanner(fichero);

            //Cambio_Delimitador
            // sc.useDelimiter(","); En caso de No tener espacios
            sc.useDelimiter(",\\s*"); //"," + cualquier espcio

            //Bucle, mientras haya un entero
            while (sc.hasNextInt()) {
                int numero = sc.nextInt();
                suma += numero;
                contador++;
            }

            sc.close();

            //Imprimir RPTAs
            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.println("Suma total = " + suma);
                System.out.println("Media = " + media);
            } else {
                System.out.println("El fichero no contiene números.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el fichero.");
        }
    }
}
