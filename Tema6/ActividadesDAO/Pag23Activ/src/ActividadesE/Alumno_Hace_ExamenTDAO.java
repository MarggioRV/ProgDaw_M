package ActividadesE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Conexion;

public class Alumno_Hace_ExamenTDAO {

    // READ (lista de Persona)
    public List<Alumno_Hace_ExamenT> ListarExamenesHechos() {
        List<Alumno_Hace_ExamenT> ahe = new ArrayList<>();
        String sql = "SELECT id_alumno, nota, id_examen_teorico FROM Alumno_Hace_ExamenT";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ahe.add(new Alumno_Hace_ExamenT(
                        rs.getInt("id_alumno"),
                        rs.getInt("nota"),
                        rs.getInt("id_examen_teorico")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ahe;
    }

    // CREATE
    public void insertarExamenHecho(Alumno_Hace_ExamenT t) {
        String sql = "INSERT INTO Alumno_Hace_ExamenT (SELECT id_alumno, nota, id_examen_teorico FROM Alumno_Hace_ExamenT) VALUES (?,?,?,?,?,?)";

        System.out.println(t);
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, t.getId_alumno());
            ps.setInt(1, t.getNota());
            ps.setInt(1, t.getId_examen_teorico());
            ps.executeUpdate();
            System.out.println("Registro insertado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());
        }
    }

    // UPDATE
    public void actualizarExamenesHecho(Alumno_Hace_ExamenT a) {
        String sql = "UPDATE alumno SET id_alumno=?, nota=?, id_examen_teorico=? WHERE id_alumno=?, id_examen_teorico=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(6, a.getId_alumno());
            ps.setInt(6, a.getNota());
            ps.setInt(6, a.getId_examen_teorico());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminarExamenHecho(int id_alumno, int id_examen_teorico) {
        String sql = "DELETE FROM Alumno_Hace_ExamenT WHERE id_alumno=? AND id_examen_teorico=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id_alumno);
            ps.setInt(2, id_examen_teorico);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}