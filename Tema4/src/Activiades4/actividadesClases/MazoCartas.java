package Activiades4.actividadesClases;
import java.util.Collections;
import java.util.ArrayList;

public class MazoCartas {
    private ArrayList<Cartas> mazo;

    //Constructor con llamada para llenar
    public MazoCartas() {
        mazo = new ArrayList<>();
        llenarMazo();
    }

    //Función para llenar el mazo
    public void llenarMazo() {
        
        //Limpiador
        mazo.clear(); 

        //Baraja española
        String[] palos = {"Espadas", "Copas", "Bastos", "Oros"};

        for (String palo : palos) {
            for (int i = 1; i <= 13; i++) {
                mazo.add(new Cartas(i, palo));
            }
        }
    }

    //Constructor con el mazo ya lleno
    // public MazoCartas(){
    //     mazo = new ArrayList<>();
    //     //Baraja española
    //     String[] palos = {"Espadas", "Copas", "Bastos", "Oros"};
    //     for (String palo : palos) {
    //         for (int i = 1; i <= 13; i++) {
    //             mazo.add(new Cartas(i, palo));
    //         }
    //     }
    //     //Nota: Se puede incluir barajar
    // }

    //Getters y Setters

    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    //Metodos Propios
    
    @Override
    public String toString() {
        return "Mazo_Cartas [mazo=" + mazo + "]";
    }
    
    //Metodo para barajar las cartas del mazo
    // public void barajar() {
    //     ArrayList<Cartas> mazoBarajado = new ArrayList<Cartas>();
    //     while (mazo.size() > 0) {
    //         int indiceAleatorio = (int) (Math.random() * mazo.size());
    //         mazoBarajado.add(mazo.remove(indiceAleatorio));
    //     }
    //     this.mazo = mazoBarajado;
    // }

    //Fucion para barajar usando Collections.shuffle
    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    //Funcion para mostrar carta, y luego eliminarla del mazo
    public Cartas sacarCarta() {
        if (estaVacio()) {
            System.out.println("El mazo está vacío. Game Over");
            return null;
        }
        return mazo.remove(0); 
    }

    //Funcion Bolean, verifica si mazo = vacio
    public boolean estaVacio() {
        return mazo.isEmpty(); // Metodo que dv =True, si esta vacio
    }
}
