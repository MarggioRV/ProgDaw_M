package TareaFinal.Clases;

public class Moto2 extends Vehiculo2 {
        private boolean limitador;

    public Moto2(String matricula, String modelo, String marca, boolean limitador) {
        super(matricula, modelo, marca);
        this.limitador = limitador;
    }

    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "limitador=" + limitador +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
