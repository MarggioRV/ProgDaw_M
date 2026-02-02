package Actividades5;

import Actividades5.clases.*;
import java.util.ArrayList;

public class Pag40Activ3Fig {
    public static void main(String[] args) {

        //Solo Círculos
        CajaFiguras<Circulo> cajaCir = new CajaFiguras<>(new ArrayList<>());

        cajaCir.guardar(new Circulo("Rojo", 10));
        cajaCir.guardar(new Circulo("Azul", 6));


        //Solo Rectangulos
        CajaFiguras<Rectangulo> cajaCuad = new CajaFiguras<>(new ArrayList<>());

        cajaCuad.guardar(new Rectangulo("Verde", 4, 5));
        cajaCuad.guardar(new Rectangulo("Amarillo", 3, 7));


        //Caja General
        CajaFiguras<Figura> cajaG = new CajaFiguras<>(new ArrayList<>());

        cajaG.guardar(new Circulo("Negro", 8));
        cajaG.guardar(new Rectangulo("Blanco", 6, 6));


        //Contenido y AreasTotal
        System.out.println("--- Caja de Círculos ---");
        cajaCir.verContenido();
        System.out.println("Área total: " + cajaCir.AreaTotal());

        System.out.println("--- Caja de Cuadrados ---");
        cajaCuad.verContenido();
        System.out.println("Área total: " + cajaCuad.AreaTotal());

        System.out.println("=== Caja General ===");
        cajaG.verContenido();
        System.out.println("Área total: " + cajaG.AreaTotal());
    }
}


