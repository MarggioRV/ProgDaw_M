package Relacion_Ejercicios3;
import java.text.Normalizer;
import java.util.Scanner;

public class Ejer8_Palindroma {
    public static void main(String[] args) {
        
        //Declaracion_Variablels
        Scanner sc = new Scanner(System.in);
        String frase;

        // Entrada_Datos
        System.out.println("Introduce una frase:");
        frase = sc.nextLine(); //Funcion: String.nextLine() (lee toda la línea como String)

        //Llamada a función
        if (esPalindroma(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase NO es palíndroma.");
        }

        sc.close();
    }

    // Función_Comprobacion_si es palíndroma
    public static boolean esPalindroma(String frase) {
        //Normaliza la frase 
        String limpia = normalizar(frase);

        //Invertir la frase
        String invertida = new StringBuilder(limpia).reverse().toString(); 
        //Funcion: StringBuilder.reverse() (invierte la cadena)
        //Funcion: StringBuilder.toString() (convierte a String)

        //Comparar Ambas
        return limpia.equals(invertida); //Funcion: String.equals() (compara cadenas)
    }

    //Funcion para Normalizar al 100% la frase
    public static String normalizar(String frase) {
        //Pasar a minúsculas
        String resultado = frase.toLowerCase(); //Funcion: String.toLowerCase()

        //Normalizer prepara el texto separando letras y tildes.
        resultado = Normalizer.normalize(resultado, Normalizer.Form.NFD);
        resultado = resultado.replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""); 
        //Funcion: String.replaceAll() (elimina caracteres con regex)

        //Quitar espacios
        resultado = resultado.replaceAll("\\s+", ""); //Se suprimen

        return resultado;
    }
}
