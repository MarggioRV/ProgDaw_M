package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer5B {

/* 5. Escribe un programa que muestre tu horario de clase. Si le pides un día de la semana (1 a 5) 
te indicará las materias de ese día, si le indicas 6 devolverá el horario completo (hazle formato) 
y con 7 se cerrará el programa. */
     public static void main(String[] args) {

        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};

        String[][] horario = {
            {"IPE", "SIST.INF", "GBD", "GBD", "PROG","PROG"},
            {"LMSGI", "SIST.INF", "SIST.INF", "PROG","PROG", "ENT-DESA"},
            {"GBD", "GBD", "SIST.INF", "SIST.INF", "PROG", "PROG"},
            {"PROG", "ENT-DESA", "ENT-DESA", "IPE","GBD", "SOSTB"},
            {"GBD", "Digit", "LMSGI", "LMSGI","IPE", "PROG"}
        };
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        boolean valido;

        do {
            System.out.println("Elige el #Día para ver el horario (1-5), o 7 para salir ");
            if (teclado.hasNextInt()) { /* Numero entero valido */
                opcion = teclado.nextInt();
                if ((opcion >= 1 && opcion <= 5) || opcion == 7) {
                    valido = true;
                } else {
                    valido = false;
                }
            } else {
                valido = false;
                teclado.next(); //  Despeja, en caso de entrada no válida
            }
            
            if (valido && opcion != 7) {
                System.out.println();
                System.out.println("···====···====···====···====···====···====···====···====···");
                System.out.println();
                System.out.println(  "      Hora       |    "+ dias[opcion - 1]); /* Solo con dias, no funciona */
                System.out.println("----------------------------------");
                System.out.println("  08:00-09:00    |  " + horario[opcion - 1][0]); /* Se empieza desde 0 */
                System.out.println("  09:00-10:00    |  " + horario[opcion - 1][1]);
                System.out.println("  10:00-11:00    |  " + horario[opcion - 1][2]);
                System.out.println("==================================");
                System.out.println("  08:00-09:00    |  " + horario[opcion - 1][3]);
                System.out.println("  09:00-10:00    |  " + horario[opcion - 1][4]);
                System.out.println("  10:00-11:00    |  " + horario[opcion - 1][5]);
                System.out.println();
            }
        } while (opcion != 7);

        teclado.close(); 
    }
}