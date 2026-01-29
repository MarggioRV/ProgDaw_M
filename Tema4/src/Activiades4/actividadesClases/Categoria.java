package Activiades4.actividadesClases;

public class Categoria {

    //Atributos
    private int codigo;
    private String nombre;
    
    //Constructores
    public Categoria(){
    }
    
    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Getters y Setters
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
}