package Activiades4.actividadesClases;
public class Vagon {
    int numero;
    double cargaMax, cargaActual;
    String tipoMercancia;
    
    public Vagon(int numero, double cargaMax, double cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", cargaMax=" + cargaMax + ", cargaActual=" + cargaActual
                + ", tipoMercancia=" + tipoMercancia + "]";
    }
    
    
}
