package Activiades4.actividadesClases;


public class Seccion {
    String titulo, extension;
    Revista revista=null;

    public Seccion(){}

    public Seccion(String titulo, String extension) {
        this.titulo = titulo;
        this.extension = extension;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        if(revista!=null)
            return "Seccion [titulo=" + titulo + ", extension=" + extension + "] "+revista.toString();
        else return "Seccion [titulo=" + titulo + ", extension=" + extension + "] ";
    }

}
