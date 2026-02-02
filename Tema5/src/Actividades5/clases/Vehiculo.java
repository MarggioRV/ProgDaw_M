package Actividades5.clases;

public abstract class Vehiculo {
    protected String Matricula;

    public Vehiculo(){}

    public Vehiculo(String matricula) {
        Matricula = matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    //Metodo Abstrato
    public abstract int velocidadMax();
    
    //Metodo Concreto
    public void mostrarInfo() {
        System.out.println("Matricula: " + Matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo [Matricula=" + Matricula + "]";
    }
}
