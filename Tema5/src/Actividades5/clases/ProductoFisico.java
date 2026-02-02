package Actividades5.clases;

public class ProductoFisico extends Producto {
    protected double peso; //Kg
    protected double coste_envio;
    
    public ProductoFisico() {
    }

    //Constructores

    public ProductoFisico(double peso, double coste_envio) {
        this.peso = peso;
        this.coste_envio = coste_envio;
    }

    public ProductoFisico(int id, String nombre, double precio, double peso, double coste_envio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.coste_envio = coste_envio;
    }

    //Getter y Setters

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCoste_envio() {
        return coste_envio;
    }

    public void setCoste_envio(double coste_envio) {
        this.coste_envio = coste_envio;
    }

    @Override
    public double calcPrecioFinal() {
        double precioFinal = precio + coste_envio;
        if (peso > 2) {
            precioFinal *= 1.10;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "ProductoFisico [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", precio=" + precio
                + ", coste_envio=" + coste_envio + ", precio_final=" + calcPrecioFinal() + "]";
    }
    
}
