package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlmacenDAO {

    // READ
    public List<Almacen> listar() {
        List<Almacen> lista = new ArrayList<>();
        String sql = "SELECT id, telef, direcc, url, idLocalidad FROM Almacen";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Integer idLoc = null;
                if (rs.getObject("idLocalidad") != null) {
                    idLoc = rs.getInt("idLocalidad");
                }

                lista.add(new Almacen(
                        rs.getInt("id"),
                        rs.getString("telef"),
                        rs.getString("direcc"),
                        rs.getString("url"),
                        idLoc
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Almacen a) {
        String sql = "INSERT INTO Almacen (id, telef, direcc, url, idLocalidad) VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getId());
            ps.setString(2, a.getTelef());
            ps.setString(3, a.getDirecc());
            ps.setString(4, a.getUrl());
            ps.setObject(5, a.getIdLocalidad());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Almacen a) {
        String sql = "UPDATE Almacen SET telef=?, direcc=?, url=?, idLocalidad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getTelef());
            ps.setString(2, a.getDirecc());
            ps.setString(3, a.getUrl());
            ps.setObject(4, a.getIdLocalidad());
            ps.setInt(5, a.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Almacen WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
