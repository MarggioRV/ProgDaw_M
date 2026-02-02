package Actividades5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pag18Activ3y4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero CSV de alumnos:");
        String ruta = scanner.nextLine();

        File f = new File(ruta);
        if (!f.exists() || f.isDirectory()) {
            System.out.println("Error: El fichero no existe o es un directorio.");
            scanner.close();
            return;
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ GESTIÓN DE ALUMNOS ---");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Insertar nuevo alumno");
            System.out.println("3. Modificar nombre de un alumno");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            //Validar que la entrada sea un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Introduce un número válido.");
                scanner.next(); //Limpiar el buffer
                System.out.print("Elige una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); //Consumir el salto de línea

            switch (opcion) {
                case 1:
                    mostrarAlumnos(ruta);
                    break;
                case 2:
                    insertarAlumno(ruta, scanner);
                    break;
                case 3:
                    // modificarNombreAlumno(ruta, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    /**
     * Lee y muestra por consola todos los datos del fichero CSV.
     */
    public static void mostrarAlumnos(String ruta) {
        System.out.println("\n--- LISTA DE ALUMNOS ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea.replace(",", "\t|\t"));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    /*
     * Insertar un nuevo alumno al final del fichero CSV.
     */
    public static void insertarAlumno(String ruta, Scanner scanner) {
        System.out.println("\n--- Insertar ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ruta));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {

            String cabecera = br.readLine();

            String[] columnas = cabecera.split(";");
            StringBuilder nuevo = new StringBuilder();

            for (int i = 0; i < columnas.length; i++) {
                System.out.print("Introduce el valor para '" + columnas[i] + "': ");
                nuevo.append(scanner.nextLine());
                if (i < columnas.length - 1) {
                    nuevo.append(";");
                }
            }

            // Nueva Linea
            bw.newLine();
            bw.write(nuevo.toString());
            bw.close();
            System.out.println("Alumno ha sido insertado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al insertar el alumno: " + e.getMessage());
        }
        scanner.close();
    }

    // Actividad 4 (Pag18)
    
    /*
     * modificar el nombre de un alumno tras pasar el ID.
     */

    public static void modificarNombre(String ruta, Scanner scanner) {
        System.out.println("\n--- Modificar Nombre de Alumno ---");

        ArrayList<String> lineas = new ArrayList<>();

        //Leer todas las líneas y guardarlas en el ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return;
        }

        if (lineas.isEmpty()) {
            System.out.println("El fichero está vacío.");
            return;
        }

        //Mostrar alumnos para ayudar al usuario
        System.out.println("\n--- Alumnos actuales ---");
        for (String l : lineas) {
            System.out.println(l);
        }

        //Pedir ID
        System.out.print("\nIntroduce el ID del alumno a modificar: ");
        String idBuscado = scanner.nextLine();

        boolean encontrado = false;

        //Buscar la línea con ese ID (empezamos en 1 para saltar cabecera)
        for (int i = 1; i < lineas.size(); i++) {
            String[] campos = lineas.get(i).split(";");

            if (campos[0].equals(idBuscado)) {
                System.out.println("Alumno encontrado: " + lineas.get(i));

                System.out.print("Introduce el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();

                campos[1] = nuevoNombre; // modificar solo el nombre

                // reconstruir la línea modificada
                lineas.set(i, String.join(";", campos));

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existe un alumno con ID " + idBuscado);
            return;
        }

        //Sobrescribir el fichero completo con el ArrayList actualizado
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }
            System.out.println("Nombre modificado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}   