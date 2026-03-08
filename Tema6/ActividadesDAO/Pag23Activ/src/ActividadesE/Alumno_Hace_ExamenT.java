package ActividadesE;

public class Alumno_Hace_ExamenT {
    
    //Atributos
    protected int id_alumno;
    protected int nota;
    protected int id_examen_teorico;
  
     //Constructor
    public Alumno_Hace_ExamenT(int id_alumno, int nota, int id_examen_teorico) {
        this.id_alumno = id_alumno;
        this.nota = nota;
        this.id_examen_teorico = id_examen_teorico;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_examen_teorico() {
        return id_examen_teorico;
    }

    public void setId_examen_teorico(int id_examen_teorico) {
        this.id_examen_teorico = id_examen_teorico;
    }

    @Override
    public String toString() {
        return "Alumno_Hace_ExamenT [id_alumno=" + id_alumno + ", nota=" + nota + ", id_examen_teorico="
                + id_examen_teorico + "]";
    }
}
