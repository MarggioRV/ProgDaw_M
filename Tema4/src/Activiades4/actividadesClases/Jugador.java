package Activiades4.actividadesClases;

public class Jugador {
    String nombre;
    int puntuacion;

//Constructor
    public Jugador(String nombre) {
        this.nombre = nombre; //Debe ser asi!
        this.puntuacion = 0;
    }


//Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    //Funcion Void ContadorSumaPuntos, retorna puntuacion
    public void sumarPuntos(int puntos) {
        this.puntuacion += puntos; // Esto hace la suma acumulativa
    }
}
