
import java.util.Scanner;
//Pag 17, Actvs 6
public class Actividad4B{
    public static void main(String[] args) {
        int opcion;
        int numero1,numero2;
        boolean salida=false;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("**** CALCULADORA DAW ****");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("Introduce una opción o -1 para salir: ");
            opcion=teclado.nextInt();
            switch(opcion){

                case 1: System.out.println("Introduzca los números: ");
                        numero1=teclado.nextInt();
                        numero2=teclado.nextInt();
                        System.out.println("La suma es: "+(numero1+numero2));
                        break;
                case 2: System.out.println("Introduzca los números: ");
                        numero1=teclado.nextInt();
                        numero2=teclado.nextInt();
                        System.out.println("La resta es: "+(numero1-numero2));
                        break;
                case 3: System.out.println("Introduzca los números: ");
                        numero1=teclado.nextInt();
                        numero2=teclado.nextInt();
                        System.out.println("La multiplicación es: "+(numero1*numero2));
                        break;
                        
                default: //Caso -1
                        salida=true;
                        System.out.println("Adiooooos...");
            }
        } while (opcion!=-1);
    }
}