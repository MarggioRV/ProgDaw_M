
import java.util.Scanner;
//Pag 24, Actividad 1: 
public class Actividad7 {

/*
*Pseudocódigo
*inicio_programa
*Generar numero1 aleatorio
*Generar numero2 aleatorio
*Hacer cuentas (cociente, media, potencia, raiz cuadrada)
* Imprimir cociente, media, potencia y raiz de cada número
*fin_programa
*/
 
final static double PI=3.14159;
public static void main(String[] args) {

    //Leer de teclado la altura y el radio
    Scanner teclado=new Scanner(System.in);
    double altura;
    double radio;

    //Leer Parámetros
    System.out.println("Esc la h ");
    altura= teclado.nextDouble(); teclado.nextLine(); //Por si no lee el N*
    System.out.println("Esc el r ");
    radio=Double.parseDouble(teclado.nextLine());
    System.out.println("El área del cilindro es: " + imprimeVolumenCilindro(altura, radio));
    System.out.println("El volumen del cilindro es: " + imprimeAreaCilindro(altura, radio));
}

public static double imprimeVolumenCilindro(double altura, double radio) { /* Si le quitas el static, falla */

    return 2 * PI * ( radio + altura);
}

public static double imprimeAreaCilindro(double altura, double radio) { /* Si le quitas el static, falla */
    return PI * radio * radio * altura;
}
}