
//Pag 22, Actv 1.

/* Calcular el máximo de 3 números si existe la función maximo(a,b).
Después aplica ambas para el caso de máximo de 5 números. Ten en cuenta que
una función se puede utilizar en una expresión Ej: int a= 5+maximo(3,7); o int
b=maximo(maximo(2,3),4); */

public class Actividad6 {
    // Función que devuelve el max de 2 numeros
    public static int maximo(int numero1, int numero2) {
        if(numero1>=numero2) return numero1;
        return numero2;
    }

    public static void main(String[] args) {
            //Maximo de 2 números
            System.out.println(maximo(5,7));   
            //Maximo de 5 números, anidando aún más
            System.out.println(maximo(maximo(maximo(3, 9), maximo(2, 6)), 7));
    }
}
