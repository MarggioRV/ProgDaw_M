package Activiades4.actividadesClases;

public class Ciudad {
    private int codigo; 
    private String nombreC;
    private int indicativo;

	//Constructor
    public Ciudad(){ 
    }

    public Ciudad(int codigo, String nombreC, int indicativo){
        this.codigo=codigo;
        this.nombreC=nombreC;
        this.indicativo=indicativo;
    }
    
    //Tratamiento de V@, metodos get y set

    public void setDia(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNombreC(String nombreC){
        this.nombreC=nombreC;
    }
    public String getNombreC(){
        return this.nombreC;
    }

    public void setIndicativo(int indicativo){
        this.indicativo=indicativo;
    }
    public int getIndicativo(){
        return this.indicativo;
    }
    
    //Metodos

    public void imprimeCiudad(){
        System.out.println("De: " +  this.nombreC + ", código: " + this.codigo + ", indicativo: " + this.indicativo);
    }
}
