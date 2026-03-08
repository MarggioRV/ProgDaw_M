package ActividadesE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Conexion;

public class Profesor_Diseña_ExamDAO {

    // READ
    public List<Profesor_Diseña_Exam> listarDisenos() {
        List<Profesor_Diseña_Exam> lista = new ArrayList<>();
        String sql = "SELECT id_examen, id_profesor FROM Profesor_Diseña_Examen";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Profesor_Diseña_Exam(
                        rs.getInt("id_examen"),
                        rs.getInt("id_profesor")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


    // CREATE
    public void insertarDiseno(Profesor_Diseña_Exam ex) {
        String sql = "INSERT INTO Profesor_Diseña_Examen (id_examen, id_profesor) VALUES (?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ex.getId_examen());
            ps.setInt(2, ex.getId_profesor());

            ps.executeUpdate();
            System.out.println("Diseño insertado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar el diseño: " + e.getMessage());
        }
    }   


    // UPDATE: Al parecer en un relacion N:M, sin mas atributos, no es correcto poner este apartado


    // DELETE
    public void eliminarDiseno(int idExamen, int idProfesor) {
        String sql = "DELETE FROM Profesor_Diseña_Examen WHERE id_examen=? AND id_profesor=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idExamen);
            ps.setInt(2, idProfesor);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
