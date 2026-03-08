package Modelo;

public class EdPublicaLib {
    protected int id_libro;
    protected int id_editorial;
    
    public EdPublicaLib(int id_libro, int id_editorial) {
        this.id_libro = id_libro;
        this.id_editorial = id_editorial;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    @Override
    public String toString() {
        return "EdPublicaLib [id_libro=" + id_libro + ", id_editorial=" + id_editorial + "]";
    }
}
