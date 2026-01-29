package Relacion_Ejercicios2;

import java.util.Scanner;

public class Ejer13Amp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorPrimos = 0;

        System.out.println("Esc los #s en orden ascendente hasta disparse el msg");
            
            //Bucle ContadorIncrmental
            while (contadorPrimos < 100) {
                int num = teclado.nextInt();

                if (esPrimo(num)) {
                    contadorPrimos++;
                    System.out.println(num + " es primo. Encontrados: " + contadorPrimos + "/100");
                } else {
                    System.out.println(num + " no es primo.");
                }
            }
        
        //Disparador, al concluir el while
        System.out.println("¡Se encontraron los 1eros 100 números primos!");

        teclado.close();
    }

// Boolean para verificar si es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

