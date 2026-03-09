package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Modelos.Alumno_Hace_ExamenT;
import Modelos.Conexion;

public class Alumno_Hace_ExamenTDAO {

    // READ
    public List<Alumno_Hace_ExamenT> listarExamenesHechos() {
        List<Alumno_Hace_ExamenT> lista = new ArrayList<>();
        String sql = "SELECT id_alumno, nota, id_examen_teorico FROM Alumno_Hace_ExamenT";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Alumno_Hace_ExamenT(
                        rs.getInt("id_alumno"),
                        rs.getInt("nota"),
                        rs.getInt("id_examen_teorico")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertarExamenHecho(Alumno_Hace_ExamenT a) {
        String sql = "INSERT INTO Alumno_Hace_ExamenT (id_alumno, nota, id_examen_teorico) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getId_alumno());
            ps.setInt(2, a.getNota());
            ps.setInt(3, a.getId_examen_teorico());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizarExamenHecho(Alumno_Hace_ExamenT a) {
        String sql = "UPDATE Alumno_Hace_ExamenT SET nota=? WHERE id_alumno=? AND id_examen_teorico=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getNota());
            ps.setInt(2, a.getId_alumno());
            ps.setInt(3, a.getId_examen_teorico());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminarExamenHecho(int idAlumno, int idExamen) {
        String sql = "DELETE FROM Alumno_Hace_ExamenT WHERE id_alumno=? AND id_examen_teorico=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idExamen);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
