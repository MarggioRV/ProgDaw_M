package ClasesVarias4;

import java.util.Arrays;

public class ClasesVarias {
    public static void main(String[] args) throws Exception {
        //Comprobar que dos cadenas tienen lo mismo
        char[] cadena1={'D','o','m','i','n','g','o'};
        char[] cadena2={'D','o','m','i','n','g','o',' '};
        if(compararCadenas(cadena1,cadena2)) System.out.println("Son iguales");
        else System.out.println("Son diferentes");

        String palabra1="Domingo";
        String palabra2="Domingo";
        if(palabra1.equals(palabra2)) System.out.println("Son iguales");
        else System.out.println("Son diferentes");

        String resultado=palabra1.concat(palabra2);
        System.out.println(resultado);

        int[] numeros={3,5,7,9,1,3,54};
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }

    }
    public static boolean compararCadenas(char[] cadena1,char[] cadena2){
        if(cadena1.length!=cadena2.length) return false;
        for(int i=0;i<cadena1.length;i++){
            if(cadena1[i]!=cadena2[i]) return false;
        }
        return true;
    }
}
