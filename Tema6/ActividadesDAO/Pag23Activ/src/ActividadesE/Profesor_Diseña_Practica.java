package ActividadesE;

public class Profesor_Diseña_Practica {
    protected int id_practica;
    protected int id_profesor;
    protected String fecha;
   
   
    public Profesor_Diseña_Practica(int id_practica, int id_profesor, String fecha) {
        this.id_practica = id_practica;
        this.id_profesor = id_profesor;
        this.fecha = fecha;
    }

    public int getId_practica() {
        return id_practica;
    }


    public void setId_practica(int id_practica) {
        this.id_practica = id_practica;
    }


    public int getId_profesor() {
        return id_profesor;
    }


    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Profesor_Diseña_Practica [id_practica=" + id_practica + ", id_profesor=" + id_profesor + ", fecha="
                + fecha + "]";
    }
}
