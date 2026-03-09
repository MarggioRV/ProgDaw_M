package  Modelo;

public class Profesor_Diseña_Exam {
    protected int id_examen;
    protected int id_profesor;
    
    public Profesor_Diseña_Exam(int id_examen, int id_profesor) {
        this.id_examen = id_examen;
        this.id_profesor = id_profesor;
    }

    public int getId_examen() {
        return id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    @Override
    public String toString() {
        return "Profesor_Diseña_Exam [id_examen=" + id_examen + ", id_profesor=" + id_profesor + "]";
    }
}
