package Actividades3;

import java.util.Scanner;

/* Actividad 9: Del sub-postulado 1-4*/
public class Activ9 {

    public static String[] modulos = { "Programación", "Entornos", "B.Datos", "Sistemas" };
    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };    
    public static double[][] notas = new double[5][4]; 

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        //De tener tamaños fijos, no es necesario una función push
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < modulos.length; j++) {
                notas[i][j] = Math.random() * 10; //nota aleatoria entre 0 y 10
            }
        }

        //Imprimir Formato tabla1
        System.out.printf("%-10s", "Alumno");
        for (String modulo : modulos) {
            System.out.printf("%-15s", modulo);
        }
        System.out.println();
        //Imprimir Formato tabla2
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("%-10s", alumnos[i]);
            for (int j = 0; j < modulos.length; j++) {
                System.out.printf("%-15.2f", notas[i][j]);
            }
            System.out.println();
        } 
        System.out.println();
        AlumnosOk();
        System.out.println();
        System.out.println("Enter, para continuar");
        System.out.println("-----------------------");

        //Limpiador_buffer
        teclado.nextLine();
        
        //Lista_AlumnosCreados
        System.out.println("Selecciona un alumno por su índice:");
        //Impresion_Lista
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i+1) + ". " + alumnos[i]);
        }
        System.out.println();

        //Seleccion_Alumno
        int fulano = teclado.nextInt();
        System.out.println("Has elegido: " + alumnos[fulano-1]);
        System.out.println();
        
        CalcularDatos(fulano-1); /* Aqui tambien se ponia -1, sino no se ajustaba al indice creado */

    }
    
    //Funcion para Calcular los Datos x Alumno
    public static void CalcularDatos(int fulano) {
        //Variables a tratar
        double contadorSumaNota=0;
        int modulosOk = 0; /* Contador_ModulosAprovados */
        /* Estas sirven de arranque */
        double maxNota = notas[fulano][0];
        double minNota = notas[fulano][0];
        
        //Recorre todas las asignaturas, del Alumno, y extrae las notas 
        for (int j = 0; j < modulos.length; j++) {
            double nota = notas[fulano][j];
            contadorSumaNota += nota; /* Acumula la nota */
            
            // Con esto, se determina cual es cual en cada caso */
            // if (nota > maxNota) {
            //     maxNota = nota;
            // } else if (nota < minNota) { 
            //     minNota = nota;
            // }
            
            ////Math.max / Math.min, pueden sustituir a los if en en estos casos
            maxNota = Math.max(maxNota, nota);
            minNota = Math.min(minNota, nota);
            
            //Contando los aprovados, se puede simplificar con modulosAprobados += (nota >= 5) ? 1 : 0;
            if (nota >= 5) { 
                modulosOk++;
            } else {
                modulosOk += 0;
            }
        }
        
        //Calculo de la media, modulos.length hace de #modulos
        double media = contadorSumaNota / modulos.length;

        //Impresiones
        System.out.println("\nResultados de " + alumnos[fulano] + ":");
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Máxima: %.2f\n", maxNota);
        System.out.printf("Mínima: %.2f\n", minNota);
        System.out.println("Módulos aprobados: " + modulosOk + "/" + modulos.length);
    }

    //Funcion Impresora_AlumnosOk
    public static void AlumnosOk() {
        System.out.println("Han aprobado:");
        //Se recorre y verifica cada alumno
        for (int i = 0; i < alumnos.length; i++) {
            boolean aprobado = false;
            for (int j = 0; j < modulos.length; j++) {
                double nota = notas[i][j];
                if (nota >= 5) {
                    aprobado = true;
                }
            }
            if (aprobado) {
            System.out.println(alumnos[i]);
            }
        }
    }

}
