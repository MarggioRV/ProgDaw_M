package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExamenTeoricoDAO {

    
    // READ
    public List<ExamenTeorico> listarExamenesTeoricos() {
        List<ExamenTeorico> examenes = new ArrayList<>();
        String sql = "SELECT id, titulo, numero_preguntas, fecha, id_profesor FROM examen_teorico";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                examenes.add(new ExamenTeorico(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getInt("numero_preguntas"),
                        rs.getDate("fecha"),
                        rs.getInt("id_profesor")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return examenes;
    }


    // CREATE
    public void insertarExamenTeorico(ExamenTeorico e) {
        String sql = "INSERT INTO examen_teorico (id, titulo, numero_preguntas, fecha, id_profesor) VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, e.getId());
            ps.setString(2, e.getTitulo());
            ps.setInt(3, e.getNumero_preguntas());
            ps.setDate(4, e.getFecha());
            ps.setInt(5, e.getId_profesor());

            ps.executeUpdate();
            System.out.println("Examen teórico insertado correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al insertar el examen: " + ex.getMessage());
        }
    }


    // UPDATE
    public void actualizarExamenTeorico(ExamenTeorico e) {
        String sql = "UPDATE examen_teorico SET titulo=?, numero_preguntas=?, fecha=?, id_profesor=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getTitulo());
            ps.setInt(2, e.getNumero_preguntas());
            ps.setDate(3, e.getFecha());
            ps.setInt(4, e.getId_profesor());
            ps.setInt(5, e.getId());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    // DELETE
    public void eliminarExamenTeorico(int id) {
        String sql = "DELETE FROM examen_teorico WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
