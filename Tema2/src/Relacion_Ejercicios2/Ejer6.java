package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer6 {

/* 6. Escribe un programa que genere la nómina (bien desglosada) de un empleado según las 
siguientes condiciones:

•Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), 
los días que ha estado de viaje visitando clientes durante el mes y 
su estado civil (1 - Soltero, 2 - Casado).

•El sueldo base según el cargo es de 950€, 1200€ y 1600€ euros según si se trata de un 
prog.junior, un prog. senior o un jefe de proyecto respectivamente.

•Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. 
Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero 
y un 20% en caso de estar casado. */

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int num1;
        int num2;
        int num3;

    //VariablesProfundasIncializadas
        int cargo = 0;  
        double estado = 0;
    
    //1ra Lectura
        System.out.println("Introduzca el # correspondiente al cargo del empleado");
        System.out.println("=====================");
        System.out.println("1) Prog.Junior");
        System.out.println("2) Prog.Senior");
        System.out.println("3) Jefe_Proyecto");
        System.out.println("=====================");
        num1 = teclado.nextInt();

        switch (num1) {
            case 1 -> cargo = 950;
            case 2 -> cargo = 1200;
            case 3 -> cargo = 1600;
        }

    //2da Lectura
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
        num2 = teclado.nextInt();

    //3ra Lectura
        System.out.println("Indica su estado civil");
        System.out.println("=====================");
        System.out.println("1) Soltero");
        System.out.println("2) Casado");
        System.out.println("=====================");

        num3 = teclado.nextInt();
     
        switch (num3) {
            case 1 -> estado = num3 * 0.25; /* Casado */
            case 2 -> estado = num3 * 0.20; /* Soltero */
        }
    
    //Invocando RPTAs
        //Bruto
        //System.out.println("Sueldo bruto          " + bruto(cargo, num2, estado));
        //Dietas
        //System.out.println("Dietas                " + num2);
        //Estado
        //System.out.println("Retención IRPF (20%)  " + estado);
        //Neto
        //System.out.println("Su nomina es          " + neto(bruto(cargo, num2, estado),estado));

    //Invocando RPTAs en Formato
        System.out.println("-----------------------------------------------|");
        System.out.println("| Sueldo Base                          " + cargo);
        System.out.println("| Dietas                               " + num2);
        System.out.println("|----------------------------------------------|");
        System.out.println("| Sueldo bruto                         " + bruto(cargo, num2, estado));
        System.out.println("| Retención IRPF (%)                   " + estado);
        System.out.println("|----------------------------------------------|");
        System.out.println("| Sueldo neto                          " + neto(bruto(cargo, num2, estado),estado));
        System.out.println("------------------------------------------------");

        teclado.close();
    }

    //Formula1
    public static double bruto(int cargo, int num2, double estado) {
        return cargo + (num2*30);
    }
    
    //Formula2
    public static double neto(double bruto, double estado) {
        return bruto - estado;
    }
}
