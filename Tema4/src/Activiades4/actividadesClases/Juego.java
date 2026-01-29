package Activiades4.actividadesClases;
import java.util.Scanner;


public class Juego {
    MazoCartas mazo;
    Jugador jugador;
    private Scanner teclado = new Scanner(System.in); //Esto es para evitar errores de cierre

    //Constructor
    public Juego(Jugador jugador){ //Se inyecta desde fuera, sino, hay un jugador interno
        this.mazo = new MazoCartas();
        this.jugador = jugador; 
    }
    
    //Getters y Setters

    public MazoCartas getMazo() {
        return mazo;
    }

    public void setMazo(MazoCartas mazo) {
        this.mazo = mazo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //Metodos del juego del adivino de cartas

    //Funcion para iniciar el juego
    public void iniciarJuego() {

        //1era Entrada_Datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Quieres iniciar? 1-Si 2-No");
        int rptaUs = teclado.nextInt();
        
        //Opncion1
        if (rptaUs == 1) {
            System.out.println("Bienvenido " + jugador.getNombre() + "... Iniciando juego");

            boolean seguirJugando = true;

            //BucleAtomico While para otra tanda
            while (seguirJugando) {
                mazo.llenarMazo();
                mazo.barajar();

                //BucleAtomio Do While para Iteracion_Rondas
                do {
                    jugarRonda();
                } while (!mazo.estaVacio());

                //Eres Ludopata? Repetir
                System.out.println();
                System.out.println("==============================");
                System.out.println("¿Eres Ludopata? 1-Sí | 2-No");
                System.out.println("==============================");
                int repetir = teclado.nextInt();

                if (repetir == 2) {
                    seguirJugando = false;
                    System.out.println("No vuelves a intentar?. Game Over.");
                }
            }

        } else if (rptaUs == 2) {
            System.out.println("Como quieras");
        } else {
            System.out.println("Respuesta no valida");
        }

        teclado.close();
    }


    //Funcion para jugar una ronda
    public void jugarRonda() {

        //1era Carta, llamada para sacar
        Cartas cartaActual = mazo.sacarCarta();
        //1eraImpresion
        System.out.println("Secreto: La carta actual es: " + cartaActual);
    
        //Entrada-Datos
        Scanner teclado = new Scanner(System.in);
        int rptaUs2 = 0;

        //Logica

        //1ero, se pregunta si es mayor o menor...
        System.out.println("Ahora, adivina si valor de la siguiente carta será: 1-Mayor o 2-Menor");
            do {
                //1era-Entrada-Datos
                rptaUs2 = teclado.nextInt();
                //Opcion1
                if (rptaUs2 == 1) {
                    System.out.println("Elegiste Mayor.");
                        
                //Opcion2
                } else if (rptaUs2 == 2) {
                    System.out.println("Elegiste Menor");
                }
                else { 
                //rpta default
                    System.out.println("Respuesta no valida");
                }

            } while (rptaUs2 != 1 && rptaUs2 != 2);

        //2ero, se compara con la nuevaCarta
        Cartas nuevaCarta = mazo.sacarCarta();
        System.out.println("La nueva carta es: " + nuevaCarta + ". Entonces:");

        //Comparcion por Metodo Intenger
        int resolucion = Integer.compare(nuevaCarta.getValor(), cartaActual.getValor()); //Devuelve: a > b = 1;  a < b = -1; a == b = 0

        switch (resolucion) {
        //Disyunciones
        case 1: 
            System.out.println("La siguiente carta es mayor.");
            if (rptaUs2 == 1) {
                jugador.sumarPuntos(1); //Acumulador
                System.out.println("Puntuación actual: " + jugador.getPuntuacion());
                System.out.println();
            } else {
                System.out.println("Fallaste.");
                System.out.println();
            }
            break;

        case -1: 
            System.out.println("La siguiente carta es menor.");
            if (rptaUs2 == 2) {
                jugador.sumarPuntos(1);
                System.out.println("Puntuación actual: " + jugador.getPuntuacion());
                System.out.println();
            } else {
                System.out.println("Fallaste.");
                System.out.println();
            }
            break;
        }
        
    }

    // private int leerOpcionBinaria(Scanner teclado) {
    //     int valido;
    //     do {
    //         while (!teclado.hasNextInt()) {
    //             System.out.println("Entrada no válida. Usa 1 o 2.");
    //             teclado.next(); //Solo acepta aquellos #
    //         }
    //         valido = teclado.nextInt();
    //         if (valido != 1 && valido != 2) {
    //             System.out.println("Respuesta no válida. Usa 1 o 2.");
    //         }
    //     } while (valido != 1 && valido != 2);
    //     return valido;
    // }

}
