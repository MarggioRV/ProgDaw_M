package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProvinciaDAO {

    // READ
    public List<Provincia> listar() {
        List<Provincia> lista = new ArrayList<>();
        String sql = "SELECT id, nombre FROM Provincia";

        try (Connection conn = ConexionSuminis.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Provincia(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Provincia p) {
        String sql = "INSERT INTO Provincia (id, nombre) VALUES (?,?)";

        try (Connection conn = ConexionSuminis.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Provincia p) {
        String sql = "UPDATE Provincia SET nombre=? WHERE id=?";

        try (Connection conn = ConexionSuminis.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Provincia WHERE id=?";

        try (Connection conn = ConexionSuminis.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}

