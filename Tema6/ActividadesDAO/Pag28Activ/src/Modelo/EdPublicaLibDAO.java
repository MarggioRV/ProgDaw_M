package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EdPublicaLibDAO {

    // READ
    public List<EdPublicaLib> listar() {
        List<EdPublicaLib> lista = new ArrayList<>();
        String sql = "SELECT id_libro, id_editorial FROM EdPublicaLib";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new EdPublicaLib(
                        rs.getInt("id_libro"),
                        rs.getInt("id_editorial")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(EdPublicaLib epl) {
        String sql = "INSERT INTO EdPublicaLib (id_libro, id_editorial) VALUES (?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, epl.getId_libro());
            ps.setInt(2, epl.getId_editorial());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int idLibro, int idEditorial) {
        String sql = "DELETE FROM EdPublicaLib WHERE id_libro=? AND id_editorial=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.setInt(2, idEditorial);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
