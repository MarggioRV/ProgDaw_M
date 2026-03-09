package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PracticaDAO {

    // READ
    public List<Practica> listarPracticas() {
        List<Practica> lista = new ArrayList<>();
        String sql = "SELECT id, titulo, dificultad FROM Practica";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Practica(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("dificultad")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertarPractica(Practica p) {
        String sql = "INSERT INTO Practica (id, titulo, dificultad) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getTitulo());
            ps.setString(3, p.getDificultad());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizarPractica(Practica p) {
        String sql = "UPDATE Practica SET titulo=?, dificultad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getDificultad());
            ps.setInt(3, p.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminarPractica(int id) {
        String sql = "DELETE FROM Practica WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
