package Relacion_Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        //Hashmap para Usuario-root
        Map<String, String> credenciales = new HashMap<>();

        try {
            //Abrir y preparar fichero para lectura
            BufferedReader  br = new BufferedReader(new FileReader("Tema5/src/UsRoots.txt"));
            String linea;

            //Leer cada linea del fichero
            while ((linea = br.readLine()) !=null){
                //Formato esperado: Usuario-root
                String[] partes = linea.split("-");
                
               //Guardar ambos
               String us = partes[0];
               String passw = partes[1]; 

               //Insertar en el HasMap
               credenciales.put(us, passw);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer el fichero");
            return;
        }

        Scanner sc = new Scanner(System.in);
        boolean check = false;

        //3 Intentos
        for (int intento = 1; intento <= 3; intento++) {
            
            System.out.println("Usuario: ");
            String u = sc.nextLine();

            System.out.println("Clave: ");
            String p = sc.nextLine();

            //Validacion

            if (credenciales.containsKey(u) && credenciales.get(u).equals(p)) {
                check = true;
                break;
            } else {
                System.out.println("Datos incorrectos. Intento: " + intento + " de 3");
            }
        }

        if (check) {
            System.out.println("Ha accedido al área restringida");
        } else {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }
}
