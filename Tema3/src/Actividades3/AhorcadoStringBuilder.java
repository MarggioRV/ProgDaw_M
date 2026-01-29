package Actividades3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//Variante, usando StringBuilder, conversion a char y con validacidacion_LRep.
public class AhorcadoStringBuilder {
    public static void main(String[] args) {

        //Crear el vector dinamico
        String[] vector = new String[0];
        //Palabras a la suerte
        String[] palabras = {"Peral", "Tomas", "Lunes", "Angirus",};
        //Número Ramdon, objeto
        Random random = new Random();
        //Número Ramdon, int
        //int ramdon=(int)(Math.ramdon()*(palabras.length-1+1)
        
        Scanner teclado = new Scanner(System.in); 
        
        //Insertar un Valores
        String entrada; /* Para la vs do while, doble función */
        System.out.println("Esc palabras para agregar o -1 para comenzar: ");

        do {
            entrada = teclado.nextLine();
                if (!entrada.equals("-1")) { /* Cualq cosa menos eso */
                palabras = push(palabras, entrada); /* Ya no es neceseario leer por segunda vez, directo la variable */
                }
        } while (!entrada.equals("-1"));

        //System.out.println("Introduce tus #s de la suerte: ");
        //For que solo permite 6 valores
        // for (int i = 0; i < 1; i++) {
        //     palabras = push(palabras, teclado.nextLine());
        // }
        
        //Area_Impresion
        System.out.println("Tus palabras de la suerte son: " + Arrays.toString(palabras));
        System.out.println();
        
        String secreta = (randomSeleccion(random, palabras)); /* Al declararla como variable es + facil de testear */
        System.out.println("Tu palabra de la suerte es: " + secreta);
        System.out.println();
        
        //Llamada_Cod
        /* Solo Impresion, String es inmutable*/
        secretoCodImpresión(secreta);
        /* Reutilizable */
        secretoCod(secreta);
 
        //Declaración_progreso, para asi guardar (Sin impM) el resultado_secretoCod()
        StringBuilder progreso = secretoCod(secreta);
        System.out.println("Codificada: " + progreso.toString());
        System.out.println();

        //Logitud_PalabraSecreta
        int logitud = secreta.length();

        //Llamada_PrubDiv
        dividirPalab1(secreta);
        System.out.println();
        dividirPalab2(secreta);

        //Contadores
        final int PRUEBASMAX=7;
        int pruebas=0;
        int aciertos=0;
        int fallos=0;

        //Juego
        System.out.println("\nEscb una de las posibles letras de la palabra secreta");
        
        //Set es una coleccion que guarda elementos No repetidos
        Set<Character> letrasUsadas = new HashSet<>(); /* Mientras character, especifica que es para char */
        do {
            String prub = teclado.nextLine();
            //Declaración de String a char
            char letraChar = prub.charAt(0);

            pruebas++;
            
            if (letraRepetida(letrasUsadas, letraChar)) {

                boolean rpta=false;
        
             // Perdio su funcion, este for arch recorria lo generado por Split(). El array String
             // String[] letras = secreta.split("(?<=.)");
             //     for (String letra : letras) {
             //         if (letra.equalsIgnoreCase(prub)) {
             //             rpta = true;
             //         } 
             //     }
        
            //En cosecuencia, se puede recorrer con un For clasico
                for (int i = 0; i < secreta.length(); i++) {
                    if (Character.toLowerCase(secreta.charAt(i)) == Character.toLowerCase(letraChar)) { /* Convierte cada letra de Mayus a Minus */
                    // if (String.valueOf(secreta.charAt(i)).equalsIgnoreCase(String.valueOf(letter))) Ignora Mayus
                    progreso.setCharAt(i, letraChar);
                    rpta = true;
                    }
                }
            
                //El conteo debe darse por separado, sino se hace todo de una.
                if (rpta == true) { /* Es lo mismo que escb rpta a secas */
                    System.out.println("Bien");
                    aciertos++;
                } else {
                    System.out.println("Mal");
                    fallos++;
                }

                //Progreso
                System.out.println();
                System.out.println("Progreso: " + progreso.toString());
                System.out.println("Pruebas: " + pruebas + " | Aciertos: " + aciertos + " | Fallos: " + fallos); 
                System.out.println();
                Correspondencia(fallos);

                if (aciertos == logitud) {
                    // if (progreso.indexOf("*") == 1) { Este podría ser mejor, en caso de repitir palabras
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + secreta);
                } else if (fallos == PRUEBASMAX){
                    System.out.println("Game Over");
                }
            
            } else {
                System.out.println("Prueba invalida, ya la usaste.");
            }

        } while (aciertos + fallos < PRUEBASMAX && logitud > aciertos);
        teclado.close(); 
    } 
    
    // Función push para String
    public static String[] push(String[] vector, String push) {
        String[] palabras = new String[vector.length + 1];
        for (int i = 0; i < vector.length; i++)
            palabras[i] = vector[i];
        palabras[vector.length] = push;
        return palabras;
    }

    //Elección_PalabraRandom 
    public static String randomSeleccion(Random random, String[] palabras) {
        int indice = random.nextInt(palabras.length);
        return palabras[indice];
    }
    
    // Solo, y Unicamente solo, impresion de la conversión de secretocod
        public static void secretoCodImpresión(String palabras) {
    // Se va construyendo una cadena de asteriscos con la misma longitud que la palabra.
            StringBuilder simbolo = new StringBuilder(); 
            for (int i = 0; i < palabras.length(); i++) { 
                simbolo.append("*"); 
            }
            System.out.println("Codificada: " + simbolo.toString());
        }

    // Conversión a *, reutilizable
    public static StringBuilder secretoCod(String palabra) {
        StringBuilder simbolo = new StringBuilder(); /* Clase que permite crear y modificar cadenas de texto*/
            for (int i = 0; i < palabra.length(); i++) {
                simbolo.append("*"); /* Metodo de la clase anterior, añade un valor a una secuencia */
            }
        return simbolo; 
    }

    //Frag usando metodo String, Split()
    public static void dividirPalab1(String palabras) {
        String[] letras = palabras.split("(?<=.)"); /* Regex: Indica dónde dividir una cadena */
        System.out.println(Arrays.toString(letras));
    }

    //Frag usando metodo String y, For each, en este caso en orden porque es Split()
    //Este sí sirve para ralizar una comparación
    public static void dividirPalab2(String palabras) {
        String[] letras = palabras.split("(?<=.)"); 
        /* Por cada vuelta, se toma 1E, y se guarda en la Vb */
        for (String letra : letras) {
            System.out.println(letra);
        }
    }
    
    //Dibujo del ahorcado según fallos
    public static void Correspondencia(int fallos) {

        if (fallos == 7) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 6) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }

        else if (fallos == 5) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |           |");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 4) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 3) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }        

        else if (fallos == 2) {
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }
        
        else if (fallos == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("_____________________");
        }
    }

    //Comprobar que las letras ≠, probando nueva comprovación
    public static boolean letraRepetida(Set<Character> letrasUsadas, char letra) {

        if (letrasUsadas.contains(letra)) { /* Contains tmb es metodo_colecc, usado asi = ¿Esta X en coleccionY? */
            System.out.println(letra + ", ya esta usada");
            return false; //Sí está repetida
        } else {
            letrasUsadas.add(letra); //Se pRocede a registrar
            return true; 
        }
    }

}



