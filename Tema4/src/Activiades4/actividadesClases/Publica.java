package Activiades4.actividadesClases;
public class Publica {

    Sucursal sucursal=null;
    Revista revista=null;

    public Publica(){}

    public Publica(Sucursal sucursal, Revista revista) {
        this.sucursal = sucursal;
        this.revista = revista;
    }
    
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        if(sucursal!=null && revista!=null)
            return "Publica [sucursal=" + sucursal.toString() + ", revista=" + revista.toString() + "]";
        else return "No hay datos de sucursal y revista";
    }
    
}
