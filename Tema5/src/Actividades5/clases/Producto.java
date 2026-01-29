package Actividades5.clases;

public class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected double precio_final;
    
    public Producto() {
    }
    
    public Producto(int id, String nombre, double precio, double precio_final) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.precio_final = precio_final;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final + 1;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", precio_final=" + precio_final
                + "]";
    }
}
