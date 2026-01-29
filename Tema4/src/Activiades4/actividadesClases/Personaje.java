package Activiades4.actividadesClases;
public class Personaje {
    private int ataque; //Tipo_Ataque
    private String nombre;
    private int vida;
    private Tipo tipo;
    private int defensa;

    enum Tipo {Caballero, Mago, Orco}
    
    //Constructor
    public Personaje(int ataque, String nombre, int vida, Tipo tipo, int defensa) {
        this.ataque = ataque;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.defensa = defensa;
    }
    
    //Getters y Setters

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    // //Metodos Propios
    // @Override
    // public String toString() {
    //     return "Personaje [ataque=" + ataque + ", nombre=" + nombre + ", vida=" + vida + ", tipo=" + tipo + ", defensa="
    //             + defensa + "]";
    // }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") | Vida: " + vida + ", Ataque: " + ataque + ", Defensa: " + defensa;
    }

    //FuncionOkVida
    Boolean estaVivo() {
        return vida > 0;
    }

    //Funcion CalcDaño
    public void calcDaño(int daño){
        int dañoFinal = daño - this.defensa;
        if (dañoFinal > 0) {
            this.vida -= dañoFinal;
        }
    }

}
