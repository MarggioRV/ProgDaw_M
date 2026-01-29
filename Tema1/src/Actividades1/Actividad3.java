// package Actividades.src;
public class Actividad3 {
//Pag 16, Actvs 1. N* Entre 50 y 200 los múltiplos de 2 y 3
    public static void main(String[] args) {

        // //Repetir de 50 a 200
        // //  Si numero%2=0 Y numero%3=0 entonces
        // //      Imprimir numero
        // //fin_repetir

        // //Entre 50 y 200 los múltiplos de 2 y 3
        // for(int numero=50;numero<=200;numero++){
        //     if(numero%2==0 && numero%3==0){
        //         System.out.println(numero);
        //     }
        // }

    for (int i=50;i<=200;i++){
    if (i% 2==0 && i%3==0){  //También se podría usar el MCM del N*, 6 en este caso
      System.out.println(i);
    }}

}
}

