package Actividades5.clases;

import java.util.ArrayList;

public class CajaFiguras<T extends Figura> {

    //ArrayList para guardar ls figuras
    private ArrayList<T> figuras;

    public CajaFiguras(ArrayList<T> figuras) {
        this.figuras = figuras;
    }

    //Metodos
    
    //Añadir
    public void guardar(T figura) {
        figuras.add(figura);
    }

    //SumaTotal_Areas
    public double AreaTotal() {
        double total = 0;
        for (T figura : figuras) {
            total += figura.area();
        }
        return total;
    }

    //Mostrar
    public void verContenido() {
        for (T figura : figuras) {
            System.out.println("Color: " + figura.getColor() + " | Área: " + figura.area() + " | Perímetro: " + figura.perímetro());
        }
    }
}
    

