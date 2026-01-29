package Activiades4.actividadesClases;

public class Fecha {
    private int dia; 
    private int mes;
    private int anio;

	//Constructor
    public Fecha(){ 
    }

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    
    //Tratamiento de V@, metodos get y set

    public void setDia(int dia){
        this.dia=dia;
    }
    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        this.mes=mes;
    }
    public int getMes(){
        return this.mes;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }
    public int getAnio(){
        return this.anio;
    }

    //Metodos

    public void imprimeFecha(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
    }
}
