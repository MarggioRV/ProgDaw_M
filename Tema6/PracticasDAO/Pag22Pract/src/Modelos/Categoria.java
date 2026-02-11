package Modelos;

public class Categoria  {
    private int cod_cat;
    private String nombreCat;
    
    public Categoria(int cod_cat, String nombreCat) {
        this.cod_cat = cod_cat;
        this.nombreCat = nombreCat;
    }

    public int getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(int cod_cat) {
        this.cod_cat = cod_cat;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
}