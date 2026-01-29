
public class ActividadRecursividad {

/* Función que devuelve la cantidad de dígitos de un número positivo */
     
    /*  Modo Iterativo */
    public static int numeroDigitos(int n){
        int contador=0;
        while(n>0){
            n=n/10; //Debido a que los números estan en base 10
            contador++;
        }
        return contador;
    }

    /* Modo Recursivo*/
    public static int numeroDigitosRecursivo(int n){
        if(n>=0 && n<10){ //Caso base
            return 1;
        }
        else{
            return 1+numeroDigitosRecursivo(n/10);
        }
    }

/* Función que devuelve la suma de los números naturales desde 1 hasta N. 
   Compara el código con el que se obtendría iterativo.*/

    /*  Modo Iterativo */
    public static int sumaNumeros(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=i;
        }
        return suma;
    }
    
    /* Modo Recursivo*/
    public static int sumaNumerosRecursivo(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumaNumerosRecursivo(n-1);
        }

    }


    //Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
        }else{
	     //Se llevan los n-1 de origen al auxiliar
           Hanoi(n-1, origen, destino, auxiliar);
	     //Se llevan el que queda a destino
           System.out.println("mover disco de "+ origen + " a " + destino);
	     //Se llevan los n-1 de auxiliar a destino
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }

/* Función que calcula ab usando recursividad. Recordad que 
   aPotenciaB=a*aPotenciaB-1 */

    public static double potencia(int base, int exponente){
        //Caso base
        if(exponente==0) return 1;
        else return base*potencia(base,exponente-1);
    }
   
/*  Método recursivo para pasar un número decimal, que
    compruebe que es positivo, y pasarlo a binario mediante
    sucesivas divisiones por 2 */

    public static String pasarBinario(int num) {
    if (num == 0) {
        return "";
    } else {
        return pasarBinario(num / 2) + (num % 2);
    }
}

//Llaves de "Invocación"
    public static void main(String[] args) {
        int numero=234; //Esto aplica a ambos métodos de numeroDigitos
        // System.out.println(numeroDigitos(numero));
        // System.out.println(numeroDigitosRecursivo(numero));
        // System.out.println(sumaNumeros(4));
        // System.out.println(sumaNumerosRecursivo(4));
        // Hanoi(6,1,2,3);
        System.out.println(potencia(2,10));
        System.out.println(pasarBinario(200));
    }
}
