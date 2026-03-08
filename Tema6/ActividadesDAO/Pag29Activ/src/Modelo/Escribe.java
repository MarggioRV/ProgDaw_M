package Modelo;

public class Escribe {
    Periodista periodista=null;
    Revista revista=null;

    public Escribe(){}

    public Escribe(Periodista periodista, Revista revista) {
        this.periodista = periodista;
        this.revista = revista;
    }

    public Periodista getPeriodista() {
        return periodista;
    }

    public void setPeriodista(Periodista periodista) {
        this.periodista = periodista;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        if(periodista!=null && revista!=null)
            return "Escribe [periodista=" + periodista.toString() + ", revista=" + revista.toString() + "]";
        else
            return "No hay periodista ni revista";
    }
    
}
