package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CestaDAO {

    // READ
    public List<Cesta> listar() {
        List<Cesta> lista = new ArrayList<>();
        String sql = "SELECT id, fecha_compra, id_cliente FROM Cesta";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Integer idCliente = null;
                if (rs.getObject("id_cliente") != null) {
                    idCliente = rs.getInt("id_cliente");
                }

                lista.add(new Cesta(
                        rs.getInt("id"),
                        rs.getDate("fecha_compra"),
                        idCliente
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Cesta c) {
        String sql = "INSERT INTO Cesta (id, fecha_compra, id_cliente) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setDate(2, c.getFecha_compra());
            ps.setObject(3, c.getId_cliente()); // puede ser null

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Cesta c) {
        String sql = "UPDATE Cesta SET fecha_compra=?, id_cliente=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDate(1, c.getFecha_compra());
            ps.setObject(2, c.getId_cliente());
            ps.setInt(3, c.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Cesta WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
