package Activiades4.actividadesClases;

enum Color{
    ROJO, VERDE, AZUL, AMARILLO, VIOLETA;}
public class Pieza {
    private int codigo;
    private String nombre;
    private String color;
    private double precio;
    private Categoria cat; //Clave Foranea

    //Constructores
    public Pieza(){
    }
    
    public Pieza(int codigo, String nombre, String color, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.color=color;
        this.precio=precio;
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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCat() {
        return cat;
    }
    public void setCat(Categoria cat) {
        this.cat = cat;
    }    
    
    //Validacion Color
    public Color getColorEnum() {
        return Color.valueOf(color.toUpperCase());
    }
    
    @Override
    public String toString() {
        if(cat!=null) 
            return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", color=" + color + ", precio=" + precio +"\n "+cat.toString()+"]";
        else return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", color=" + color + ", precio=" + precio +"]";
    }
}

