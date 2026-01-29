package Activiades4.actividadesClases;

public class Libro2 {

    //Atributos
    private String titulo;
    private Autor2 autor;
    private String categoria;
    private int totalExistencias;

    public Libro2(){autor=null;}

    //Constructor
    public Libro2(String titulo,String categoria,int existencias){
        this.titulo=titulo;
        this.categoria=categoria;
        this.totalExistencias=existencias;
        this.autor=null;
    }

    //Getters y setters

    public void setAutor(Autor2 autor) {
        this.autor = autor;
    }
    public Autor2 getAutor() {
        return autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTotalExistencias(int totalExistencias) {
        this.totalExistencias = totalExistencias;
    }
    public int getTotalExistencias() {
        return totalExistencias;
    }
    
    
    @Override
    public String toString() {
        if(autor!=null)
            return "Libro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", totalExistencias="+ totalExistencias + "]";
        else return "No hay libro";
    }

    //Métodos propios

    //Funcion para controlar el número de existencias
    public void modificarExistencias(int num){
        if(num>0){ //En caso de ser + = existencias, se suma
            this.totalExistencias=this.totalExistencias+num;
        }
        else{// en caso de - = existencias, se resta, y en caso de ser negativo se vuelve 0
            if(this.totalExistencias==0) return;
            this.totalExistencias=this.totalExistencias-num;
            if (this.totalExistencias<0) this.totalExistencias=0;
        }
    }
}

