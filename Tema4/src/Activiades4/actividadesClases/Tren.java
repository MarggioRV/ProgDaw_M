package Activiades4.actividadesClases;
public class Tren {
    //Atributos
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;

    //Constructor
    public Tren(){
        locomotora=null;
        vagones=null;
        maquinista=null;
    }

    //Getters y Setters

    public Locomotora getLocomotora() {
        return locomotora;
    }
    public Maquinista getMaquinista() {
        return maquinista;
    }
    public Vagon[] getVagones() {
        return vagones;
    }
    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }
    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }
    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Tren ===\n");
        sb.append("Locomotora:\n").append("  ").append(locomotora).append("\n");
        sb.append("Maquinista:\n").append("  ").append(maquinista).append("\n");
        sb.append("Vagones:\n");
        for (Vagon v : vagones) {
            sb.append("  ").append(v).append("\n");
        }
        return sb.toString();
    }

}
