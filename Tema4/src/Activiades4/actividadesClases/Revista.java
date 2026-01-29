package Activiades4.actividadesClases;

public class Revista {
    int numero;
    String titulo,tipo,periodicidad;

    public Revista(){}

    public Revista(int numero, String titulo, String tipo, String periodicidad) {
        this.numero = numero;
        this.titulo = titulo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista [numero=" + numero + ", titulo=" + titulo + ", tipo=" + tipo + ", periodicidad=" + periodicidad
                + "]";
    }
    
}
