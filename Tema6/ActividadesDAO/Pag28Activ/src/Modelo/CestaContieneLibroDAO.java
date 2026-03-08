package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CestaContieneLibroDAO {

    // READ
    public List<CestaContieneLibro> listar() {
        List<CestaContieneLibro> lista = new ArrayList<>();
        String sql = "SELECT id_cesta, id_libro, cantidad FROM CestaContieneLibro";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new CestaContieneLibro(
                        rs.getInt("id_cesta"),
                        rs.getInt("id_libro"),
                        rs.getInt("cantidad")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(CestaContieneLibro c) {
        String sql = "INSERT INTO CestaContieneLibro (id_cesta, id_libro, cantidad) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getId_cesta());
            ps.setInt(2, c.getId_libro());
            ps.setInt(3, c.getCantidad());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE (opcional, solo si quieres modificar la cantidad)
    public void actualizarCantidad(int idCesta, int idLibro, int nuevaCantidad) {
        String sql = "UPDATE CestaContieneLibro SET cantidad=? WHERE id_cesta=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevaCantidad);
            ps.setInt(2, idCesta);
            ps.setInt(3, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int idCesta, int idLibro) {
        String sql = "DELETE FROM CestaContieneLibro WHERE id_cesta=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCesta);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
