
import java.util.Scanner;

/* Pag 14, Actv 2: Haz un programa que nos pide una nota y nos indica la calificación
(sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta). Usa if-else y switch */

public class Actividad2B {
    public static void main(String[] args) {
        //Para introducir la nota
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota=teclado.nextInt();

        //  if (nota < 0 || nota > 10) {
        //     System.out.println("Nota Incorrecta");} 
            
        // else if (nota < 5) {
        //     System.out.println("SUSPENSO");} 

        // else if (nota == 5) {
        //     System.out.println("SUFICIENTE");} 
        
        // else if (nota == 6) {
        //     System.out.println("BIEN");} 
            
        // else if (nota == 7) {
        //     System.out.println("Muy bien");}

        // else if (nota == 8) {
        //     System.out.println("NOTABLE");}
        
        // else if (nota == 9) {
        //     System.out.println("SOBRESALIENTE");}
            
        // else if (nota == 10) {
        //     System.out.println("EXCELENTE");} /* Según parece esto teclado.close(); es bueno cerrar el Scanner*/

        /* Tambien, versión Corregida_Profesor */

        if(nota>=0 && nota <5){
            System.out.println("SUSPENSO");
        }
        else if (nota>=5 && nota<7){
            System.out.println("APROBADO");
        }
        else if(nota>=7 && nota <9){
            System.out.println("NOTABLE");
        }
        else if(nota>=9 && nota <=10){
            System.out.println("SOBRESALIENTE");
        }
        else{
            System.out.println("Nota incorrecta");
        }

        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("SUSPENSO");break;
            case 5:
            case 6: System.out.println("APROBADO");break;
            case 7:
            case 8: System.out.println("NOTABLE");break;
            case 9:
            case 10: System.out.println("SOBRESALIENTE");break;
            default:System.out.println("Nota incorrecta");break;
        }
    }

    public static class Actividad1 {
        public static void main(String[] args) throws Exception {
            //Actividad, tema 2, diapositiva 9
            //Realiza un programa que genera dos números aleatorios y devuelva el cociente....
            /*
             * Pseudocódigo
             * inicio_programa
             *      Generar numero1 aleatorio
             *      Generar numero2 aleatorio
             *      Hacer cuentas (cociente, media, potencia, raiz cuadrada)
             *      Imprimir cociente, media, potencia y raiz de cada número
             * fin_programa
             */
            //Generar números
            int min=1, max=10;
            int numero1=(int)(Math.random()*(max-min+1))+min;
            int numero2=(int)(Math.random()*(max-min+1))+min;
            //Hacer las cuentas
            double cociente=numero1/(double)numero2;
            double media=(numero1+numero2)/2.0;
            double potencia=Math.pow(numero1,numero2);
            double raiz1=Math.sqrt(numero1);
            double raiz2=Math.sqrt(numero2);
            //Sacar resultados
            System.out.println("Los números generados son: "+ numero1+" y "+numero2);
            System.out.println("El cociente es: "+cociente);
            System.out.println("La media es: "+media);
            System.out.println("El potencia es: "+potencia);
            System.out.println("El raiz cuadrada de numero1 es: "+raiz1);
            System.out.println("El raiz cuadrada de numero2 es: "+raiz2);
        }
    }

    public static class Prueba {
        public class HolaMundo {
        public static void main(String[] args) {
            System.out.println("¡Hola, Mundo!"); // Muestra el mensaje en la consola
        }
    }
    }
}
