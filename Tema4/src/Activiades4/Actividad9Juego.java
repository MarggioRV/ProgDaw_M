package Activiades4;

import Activiades4.actividadesClases.Juego;
import Activiades4.actividadesClases.Jugador;

public class Actividad9Juego {
    //Incializacion de todo el codigo del juego
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Laura");
        Juego juego = new Juego(jugador);
        juego.setJugador(jugador);
        juego.iniciarJuego();
    }

}

