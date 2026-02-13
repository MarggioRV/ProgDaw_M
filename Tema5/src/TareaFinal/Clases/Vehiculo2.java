package TareaFinal.Clases;

public abstract class Vehiculo2 implements Identificacion {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo2() {
    }

    public Vehiculo2(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String identificate() {
        return matricula + " - " + marca + " " + modelo;
    }

    // public String identificate() {
    //     // TODO Auto-generated method stub
    //     System.out.println(marca + ", " + modelo + ", " + matricula);
    // }


    //Getters y Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
