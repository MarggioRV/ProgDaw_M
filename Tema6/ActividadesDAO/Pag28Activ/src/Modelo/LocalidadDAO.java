package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LocalidadDAO {

    // READ
    public List<Localidad> listar() {
        List<Localidad> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, idProvincia FROM Localidad";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Integer idProv = null;
                if (rs.getObject("idProvincia") != null) {
                    idProv = rs.getInt("idProvincia");
                }

                lista.add(new Localidad(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        idProv
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Localidad l) {
        String sql = "INSERT INTO Localidad (id, nombre, idProvincia) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, l.getId());
            ps.setString(2, l.getNombre());
            ps.setObject(3, l.getIdProvincia()); // puede ser null

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Localidad l) {
        String sql = "UPDATE Localidad SET nombre=?, idProvincia=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getNombre());
            ps.setObject(2, l.getIdProvincia());
            ps.setInt(3, l.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Localidad WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}

