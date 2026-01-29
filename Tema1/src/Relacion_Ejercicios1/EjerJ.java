// package Relación_Ejercicios1.src;
import java.util.Scanner;

public class EjerJ {
    public static void main(String[] args) {
        //Inic0i
        int BC = 0;
        int BC2 = 0;
        int BV = 0;
        int BD = 0;
        int BM = 0;
        
        //Adicional, al final
        int resto = 0;

        //Lectura N
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce N: ");
        int N = teclado.nextInt();

        //C = N
        int C = N;

    // Si (N >= 50000) Entonces
    //     BC = BC + 1;
    //     C = C - 50000;
    //     Mostrar C;
    //     Retornar;
    // FinSi
    //.
    //.
    //.
    //SINO Si N >= 1000 Entonces
    //      BM = BM + 1
    //      C = C - 1000
    //      SINO
    //      Resto = C
    // Fin_Si

        if (N >= 50000) {
            BC = BC + 1;
            C = C - 50000;
            System.out.println("C= " + C);
            return;
        }  
        
        else if (N >= 20000) {
            BV = BV + 1;
            C = C - 20000;
            System.out.println("C= " + C);
            return;
        } 

        else if (N >= 10000) {
            BD = BD + 1;
            C = C - 10000;
            System.out.println("C= " + C);
            return;
        } 

        else if (N >= 5000) {
            BC2 = BC2 + 1;
            C = C - 5000;
            System.out.println("C= " + C);
            return;
        } 

        else if (N >= 1000) {
            BM = BM + 1;
            C = C - 1000;
            System.out.println("C= " + C);
            return;
        } 

        else {
            BM++; /* Lo que queda, por conatador */
            resto = C;
            System.out.println("Resto = " + resto);
        }

        // Área de impresión
        System.out.println();
        System.out.println("RPTAs finales:");
        System.out.println("N = " + N);
        System.out.println("BC = " + BC);
        System.out.println("BV = " + BV);
        System.out.println("BD = " + BD);
        System.out.println("BC2 = " + BC2);
        System.out.println("BM = " + BM);
        System.out.println("Resto = " + resto);
        System.out.println("C = " + C);
    }
}
