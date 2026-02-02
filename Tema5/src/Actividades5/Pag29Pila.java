package Actividades5;

import java.util.ArrayList;

//Clase Generica
public class Pag29Pila<T> {

    //ArrayList Interno
    private ArrayList<T> elementos;

    //Constructor
    public Pag29Pila() {
        elementos = new ArrayList<>();
    }

    //Método Push
    public void Push(T elemento) {
        elementos.add(elemento); // Se añade al final = top de la pila
    }

    //Metodo Pop
    public T Pop() {
        if (!estaVacia()) {//Pero no si la pila está vacía
            return elementos.remove(elementos.size() - 1); //Elimina y devuelve el top
        }
        return null; 
    }

    // 5. Método Peek (Devolver)
    public T devolver() {
        if (!estaVacia()) {
            return elementos.get(elementos.size() - 1); 
        }
        return null; 
    }

    //Método buscar
    public int buscar(T valor) {
        return elementos.indexOf(valor); // Devuelve -1 si no lo encuentra
    }

    //Funcion Aux
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila: " + elementos.toString(); 
    }

    //MAIN  
    public static void main(String[] args) {
        // Pag29Pila<Integer> MPila = new Pag29Pila<>();

        // //Insertar E
        // MPila.Push(10);
        // MPila.Push(20);
        // MPila.Push(30);
        // System.out.println(MPila);

            // Creamos una pila de Strings
        Pag29Pila<String> MPila = new Pag29Pila<>();

        MPila.Push("Hola,");
        MPila.Push("Buenos");
        MPila.Push("Dias");

        //Devolver 
        System.out.println("Top de la pila: " + MPila.devolver());

        //Borrar top
        System.out.println("Elemento borrado: " + MPila.Pop());
        System.out.println(MPila);

        //Buscar elemento
        System.out.println("Posición del 1: " + MPila.buscar("Hola"));
        // System.out.println("Posición del 5: " + MPila.buscar(1));

        //Comprobar contenido
        //condición ? valorSiVerdadero : valorSiFalso
        System.out.println("¿Está vacía la pila? " + (MPila.estaVacia() ? "Sí" : "No"));
    }
}


