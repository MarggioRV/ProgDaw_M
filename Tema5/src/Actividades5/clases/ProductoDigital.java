package Actividades5.clases;

public class ProductoDigital extends Producto {
    protected String url;
    protected double mb;
    
    public ProductoDigital() {
    }

    //Constructores
    
    public ProductoDigital(String url, double mb) {
        this.url = url;
        this.mb = mb;
    }

    public ProductoDigital(int id, String nombre, double precio, String url, double mb) {
        super(id, nombre, precio);
        this.url = url;
        this.mb = mb;
    }

    //Getter y Setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    @Override
    public double calcPrecioFinal() {
        return precio; 
    }

    @Override
    public String toString() {
        return "ProductoDigital [id=" + id + ", nombre=" + nombre + ", url=" + url + ", mb=" + mb + ", precio=" + precio
                + ", precio_final=" + calcPrecioFinal() + "]";
    }    
}
