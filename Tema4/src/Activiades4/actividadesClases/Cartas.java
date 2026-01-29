package Activiades4.actividadesClases;

public class Cartas {

    //Atributos

    int valor;
    String palo;

    //Constructor

    public Cartas(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    //Getters y Setters

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }


    @Override
    // public String toString() {
    //     return "Cartas [valor=" + valor + ", palo=" + palo + "]";
    // }
    public String toString() {
        String nombreValor;
        switch (valor) {
            case 1: nombreValor = "As"; 
                    break;
            case 11: nombreValor = "Sota"; 
                    break;
            case 12: nombreValor = "Caballo"; 
                    break;
            case 13: nombreValor = "Rey"; 
                    break;
            default: nombreValor = String.valueOf(valor);
        }
        return nombreValor + " de " + palo;
    }
}
