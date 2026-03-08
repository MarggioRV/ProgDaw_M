package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // READ
    public List<Client> listar() {
        List<Client> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, ape1, ape2, direcc, email, idLocalidad FROM Client";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Integer idLoc = null;
                if (rs.getObject("idLocalidad") != null) {
                    idLoc = rs.getInt("idLocalidad");
                }

                lista.add(new Client(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("ape1"),
                        rs.getString("ape2"),
                        rs.getString("direcc"),
                        rs.getString("email"),
                        idLoc
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Client c) {
        String sql = "INSERT INTO Client (id, nombre, ape1, ape2, direcc, email, idLocalidad) VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApe1());
            ps.setString(4, c.getApe2());
            ps.setString(5, c.getDirecc());
            ps.setString(6, c.getEmail());
            ps.setObject(7, c.getIdLocalidad());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Client c) {
        String sql = "UPDATE Client SET nombre=?, ape1=?, ape2=?, direcc=?, email=?, idLocalidad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApe1());
            ps.setString(3, c.getApe2());
            ps.setString(4, c.getDirecc());
            ps.setString(5, c.getEmail());
            ps.setObject(6, c.getIdLocalidad());
            ps.setInt(7, c.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Client WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
