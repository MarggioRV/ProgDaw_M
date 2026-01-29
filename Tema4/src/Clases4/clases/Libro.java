package Clases4.clases;
public class Libro {
    //Atributos
    private String ISBN;
    private String titulo;
    private int apoyo;
    private int anyo;   
    private double precio;
    private Editorial editorial;

    //Costrutores
    public Libro(){}

    public Libro(String ISBN, String titulo, int anyo,int apoyo, double precio){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.apoyo=apoyo;
        this.anyo=anyo;
        this.precio=precio;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public String getISBN(){
        return this.ISBN;
    }

    public void setApoyo(int apoyo){
        this.apoyo=apoyo;
    }
    public int getApoyo(){
        return this.apoyo;
    }

    public void setAnyo(int anyo){
        this.anyo=anyo;
    }
    public int getAnyo(){
        return this.anyo;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void setEditorial(Editorial ed){
        //Opcion 1: una referencia
        this.editorial=ed;
        //Opcion 2: una copia
        // this.editorial=new Editorial();
        // this.editorial.setAnyo(ed.getAnyo());
        // this.editorial.setNombre(ed.getNombre());
        // this.editorial.setCodigo(ed.getCodigo());
    }

    public Editorial getEditorial(){
        return editorial;
    }


    public void imprimeLibro(){
        System.out.println("Imprme persona" + this.ISBN);
        System.out.println("Imprme persona" + this.titulo);
        System.out.println("Imprme persona" + this.apoyo);
        System.out.println("Imprme persona" + this.anyo);
        System.out.println("Imprme persona" + this.precio);
        if(editorial!=null)
            this.editorial.imprimeEditorial();
    }
}


