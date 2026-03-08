package Modelo;

public class AlCurAsigSeMatri {
    
    //Atributos
    protected String numMatricula;
    protected int id_cursoEs;
    protected int cod_Asig;

    //Constructor
    public AlCurAsigSeMatri(String numMatricula, int id_cursoEs, int cod_Asig) {
        this.numMatricula = numMatricula;
        this.id_cursoEs = id_cursoEs;
        this.cod_Asig = cod_Asig;
    }

    //Gs y Ss

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getId_cursoEs() {
        return id_cursoEs;
    }

    public void setId_cursoEs(int id_cursoEs) {
        this.id_cursoEs = id_cursoEs;
    }

    public int getCod_Asig() {
        return cod_Asig;
    }

    public void setCod_Asig(int cod_Asig) {
        this.cod_Asig = cod_Asig;
    }

    @Override
    public String toString() {
        return "AlCurAsigSeMatri [numMatricula=" + numMatricula + ", id_cursoEs=" + id_cursoEs + ", cod_Asig="
                + cod_Asig + "]";
    }
}
