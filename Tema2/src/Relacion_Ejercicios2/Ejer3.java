package Relacion_Ejercicios2;

import java.util.Scanner;

/* 3. Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento.
Ejemplo: día:15 mes: 8 → LEO */

public class Ejer3 {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int dia;
        int mes;

        //Leer Parámetros
        System.out.println("Esc el mes ");
        mes = teclado.nextInt();
        System.out.println("Esc el dia ");
        dia = teclado.nextInt();
    

    switch (mes) {
        
        case 1:

            if (dia >= 1 && dia <= 19) {
                System.out.println("Tu signo es Capricornio");} 

            else if (dia >= 20 && dia <= 31) { 
                System.out.println("Tu signo es Acuario");}
            else {
            System.out.println("Día inválido");}
                break;

        case 2:

            if (dia >= 1 && dia <= 18) {
                System.out.println("Tu signo es Acuario");} 

            else if (dia >= 19 && dia <= 28) {
                System.out.println("Tu signo es Piscis");}
            else {
                System.out.println("Día inválido");}
                break;

        case 3:

            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo es Piscis");} 
   
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Aries");}
            else {
                System.out.println("Día inválido");}
                break;

        case 4:

            if (dia >= 1 && dia <= 19) {
                System.out.println("Tu signo es Aries");} 

            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Tauro");}
            else {
                System.out.println("Día inválido");}
                break;
    
        case 5:

            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo es Tauro");} 

            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Géminis");}
            else {
                System.out.println("Día inválido");}
                break;

        case 6:

            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo es Géminis");} 

            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Cancer");}
            else {
                System.out.println("Día inválido");}
                break;
            
        case 7:

            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo es Cáncer");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Leo");}
            else {
                System.out.println("Día inválido");}
                break;

        case 8:

            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo es Leo");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Virgo");}
            else {
                System.out.println("Día inválido");}
                break;

        case 9: 

            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo es Virgo");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Libra");}
            else {
                System.out.println("Día inválido");}
                break;
    
        case 10:

            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo es Libra");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Escorpio");}
            else {
                System.out.println("Día inválido");}
                break;

        case 11:

            if (dia >= 1 && dia <= 21) {
                System.out.println("Tu signo es Escorpio");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Sagitario");}
            else {
                System.out.println("Día inválido");}
                break;
            
        case 12:

            if (dia >= 1 && dia <= 21) {
                System.out.println("Tu signo es Sagitario");} 
            
            else if (dia >= 19 && dia <= 28) { 
                System.out.println("Tu signo es Capricornio");}
            else {
                System.out.println("Día inválido");}
                break;
    
        default:
            System.out.println("Mes invalido"); break;
    }
  }
}
