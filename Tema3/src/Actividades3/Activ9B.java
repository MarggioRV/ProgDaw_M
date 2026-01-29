package Actividades3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Actividad 9: Cumpliendo el sub-postulado 5*/
public class Activ9B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Arrays semilla, serán heredados 
        String[] modulosBase = { "Programación", "Entornos", "B.Datos", "Sistemas" };
        String[] alumnosBase = { "José", "Ana", "María", "Luis", "Domingo" };

        //Conversión: Arrays Semilla a ListasDina
        ArrayList<String> modulos = new ArrayList<>(Arrays.asList(modulosBase));
        ArrayList<String> alumnos = new ArrayList<>(Arrays.asList(alumnosBase));
        ArrayList<ArrayList<Double>> notas = new ArrayList<>();

        //Rellenar con notas Aleatorias
        for (int i = 0; i < alumnos.size(); i++) {
            ArrayList<Double> filaNotas = new ArrayList<>();
            for (int j = 0; j < modulos.size(); j++) {
                filaNotas.add(Math.random() * 10);
            }
            notas.add(filaNotas);
        }

        //Imprimir Tabla
        imprimirTabla(alumnos, modulos, notas);
        System.out.println();

        //Imprimir Alumnos que han aprobado
        AlumnosOk(alumnos, modulos, notas);

        //Menu_Opciones
        System.out.println("\n¿Qué quieres hacer?");
        System.out.println("1. Añadir un nuevo alumno");
        System.out.println("2. Borrar Programación y sus notas");
        System.out.println("3. Continuar");
        System.out.println("--------------------------------------");

        int opcion = teclado.nextInt();
        //Limpiar buffer
        teclado.nextLine(); 

        if (opcion == 1) {
            agregarAlumno(teclado, alumnos, modulos, notas);
        } else if (opcion == 2) {
            eliminarModulo("Programación", modulos, notas);
        } else {
            System.out.println("Continuando...");
        }
        //Imprimir Tabla Actulizada
        imprimirTabla(alumnos, modulos, notas);
        //Imprimir Alumnos que han aprobado (Por si el caso)
        AlumnosOk(alumnos, modulos, notas);

        //Lista_AlumnosCreados
        System.out.println("\nSelecciona un alumno por su índice:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i));
        }
        //Seleccion_Alumno
        int fulano = teclado.nextInt();
        teclado.nextLine();

        //Llamada a Datos x Alumno
        CalcularDatos(fulano - 1, alumnos, modulos, notas);
    }

    //Funcion para imprimir la tabña
    public static void imprimirTabla(ArrayList<String> alumnos, ArrayList<String> modulos, ArrayList<ArrayList<Double>> notas) {
        System.out.printf("%-10s", "Alumno");
        for (String modulo : modulos) {
            System.out.printf("%-15s", modulo);
        }
        System.out.println();
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.printf("%-10s", alumnos.get(i));
            for (int j = 0; j < modulos.size(); j++) {
                System.out.printf("%-15.2f", notas.get(i).get(j));
            }
            System.out.println();
        }
    }

    //Funcion pata Añadir NuevoAlumno
    public static void agregarAlumno(Scanner teclado, ArrayList<String> alumnos, ArrayList<String> modulos, ArrayList<ArrayList<Double>> notas) {
        System.out.println("Introduce el nombre del nuevo alumno:");
        String nuevoNombre = teclado.nextLine();
        ArrayList<Double> nuevasNotas = new ArrayList<>();
        for (String modulo : modulos) {
            System.out.println("Introduce la nota de " + nuevoNombre + " en " + modulo + ":");
            nuevasNotas.add(teclado.nextDouble());
        }
        teclado.nextLine();
        alumnos.add(nuevoNombre);
        notas.add(nuevasNotas);
        System.out.println("Alumno añadido correctamente.");
    }

    //Funcion para Elimnar Prog_LosModulos
    public static void eliminarModulo(String nombreModulo, ArrayList<String> modulos, ArrayList<ArrayList<Double>> notas) {
        int indice = modulos.indexOf(nombreModulo);
        if (indice != -1) {
            modulos.remove(indice);
            for (ArrayList<Double> filaNotas : notas) {
                filaNotas.remove(indice);
            }
            System.out.println("Módulo '" + nombreModulo + "' eliminado correctamente.");
        } else {
            System.out.println("El módulo '" + nombreModulo + "' no existe.");
        }
    }

    //Funcion para Calcular los Datos x Alumno
    public static void CalcularDatos(int fulano, ArrayList<String> alumnos, ArrayList<String> modulos, ArrayList<ArrayList<Double>> notas) {
        double contadorSumaNota = 0;
        int modulosOk = 0;
        double maxNota = notas.get(fulano).get(0);
        double minNota = notas.get(fulano).get(0);

        for (int j = 0; j < modulos.size(); j++) {
            double nota = notas.get(fulano).get(j);
            contadorSumaNota += nota;
            maxNota = Math.max(maxNota, nota);
            minNota = Math.min(minNota, nota);
            //Ternaria antes mencionada
            modulosOk += (nota >= 5) ? 1 : 0;
        }
        
        //Con size sabemos directamente su tamaño
        double media = contadorSumaNota / modulos.size();
        
        //Impresiones
        System.out.println("\nResultados de " + alumnos.get(fulano) + ":");
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Máxima: %.2f\n", maxNota);
        System.out.printf("Mínima: %.2f\n", minNota);
        System.out.println("Módulos aprobados: " + modulosOk + "/" + modulos.size());
    }
    
    //Funcion Impresora_AlumnosOk
    public static void AlumnosOk(ArrayList<String> alumnos, ArrayList<String> modulos, ArrayList<ArrayList<Double>> notas) {
        System.out.println("Han aprobado:");
        //Se recorre y verifica cada alumno
        for (int i = 0; i < alumnos.size(); i++) {
            boolean aprobado = false;
            for (Double nota : notas.get(i)) {   
                if (nota >= 5) {
                aprobado = true;
                }
            }
            if (aprobado) {
            System.out.println(alumnos.get(i)); //get es un metodo para acedder al elmento
            }
        }   
    }
}

