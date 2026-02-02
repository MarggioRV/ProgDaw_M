package Relacion_Ejercicios;

/* 4. Crea una clase genérica Caja completa que almacene un valor de cualquier
tipo y lo muestre. Por completa se refiere a que tiene su constructor, 
métodos get-set y de salida. Haz varias pruebas de su uso */

public class Ejer4Caja<T> {

    //T es un tipo genérico, se decide al crear la caja
    private T contenido;

    //Constructor por defecto
    public Ejer4Caja() {
    }

    //Constructor + dato inicial
    public Ejer4Caja(T dato) {
        this.contenido = dato;
    }

    //Metodos
    
    //Setter
    public void guardar(T valor) {
        this.contenido = valor;
    }

    //Getter
    public T obtener() {
        return contenido;
    }

    //Método_Salida
    public void mostrar() {
        System.out.println("Contenido de la caja: " + contenido);
    }

    public static void main(String[] args) {

        //Prueba-1
        Ejer4Caja<Integer> caja1 = new Ejer4Caja<Integer>();
        caja1.guardar(3);
        caja1.mostrar();
        System.out.println("Obtenido: " + caja1.obtener());
        System.out.println();

        //Prueba-2
        Ejer4Caja<String> caja2 = new Ejer4Caja<>();
        caja2.guardar("Domingo");
        caja2.mostrar();
        System.out.println("Obtenido: " + caja2.obtener());
        System.out.println();

        //Prueba-3
        Ejer4Caja<Double> caja3 = new Ejer4Caja<>();
        caja3.guardar(9.81);
        caja3.mostrar();
        System.out.println("Obtenido: " + caja3.obtener());
        System.out.println();

        //Prueba-4
        Ejer4Caja<Boolean> caja4 = new Ejer4Caja<>(true);
        caja4.mostrar();
        System.out.println("Obtenido: " + caja4.obtener());

        //Prueba-5
        Ejer4Caja<Character> caja5 = new Ejer4Caja<>();
        caja5.guardar('A');
        caja5.mostrar();
        System.out.println("Obtenido: " + caja5.obtener());
    }
}
