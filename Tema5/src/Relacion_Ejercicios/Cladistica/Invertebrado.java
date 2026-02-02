package Relacion_Ejercicios.Cladistica;

public abstract class Invertebrado extends Animal {

 
    protected String tipo_exoesqueleto;

    public Invertebrado(String nombre, String tipo_exoesqueleto) {
        super(nombre);
        this.tipo_exoesqueleto = tipo_exoesqueleto;
    }

    public String getTipo_exoesqueleto() {
        return tipo_exoesqueleto;
    }


    public void setTipo_exoesqueleto(String tipo_exoesqueleto) {
        this.tipo_exoesqueleto = tipo_exoesqueleto;
    }

    public void tieneExoesqueleto() {
        System.out.println("No tiene columna vertebral");
    }
}

