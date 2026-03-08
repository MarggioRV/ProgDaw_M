package Modelo;

public class CestaContieneLibro {
    protected int id_cesta;
    protected int id_libro;
    protected int cantidad;
    
    public CestaContieneLibro(int id_cesta, int id_libro, int cantidad) {
        this.id_cesta = id_cesta;
        this.id_libro = id_libro;
        this.cantidad = cantidad;
    }

    public int getId_cesta() {
        return id_cesta;
    }

    public void setId_cesta(int id_cesta) {
        this.id_cesta = id_cesta;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CestaContieneLibro [id_cesta=" + id_cesta + ", id_libro=" + id_libro + ", cantidad=" + cantidad + "]";
    }
}
