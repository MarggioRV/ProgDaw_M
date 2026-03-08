package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    // READ
    public List<Autor> listar() {
        List<Autor> lista = new ArrayList<>();
        String sql = "SELECT id, direcc, telef, nombre, ape1, ape2, url, idLocalidad FROM Autor";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Integer idLoc = null;
                if (rs.getObject("idLocalidad") != null) {
                    idLoc = rs.getInt("idLocalidad");
                }

                lista.add(new Autor(
                        rs.getInt("id"),
                        rs.getString("direcc"),
                        rs.getString("telef"),
                        rs.getString("nombre"),
                        rs.getString("ape1"),
                        rs.getString("ape2"),
                        rs.getString("url"),
                        idLoc
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(Autor a) {
        String sql = "INSERT INTO Autor (id, direcc, telef, nombre, ape1, ape2, url, idLocalidad) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getId());
            ps.setString(2, a.getDirecc());
            ps.setString(3, a.getTelef());
            ps.setString(4, a.getNombre());
            ps.setString(5, a.getApe1());
            ps.setString(6, a.getApe2());
            ps.setString(7, a.getUrl());
            ps.setObject(8, a.getIdLocalidad());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // UPDATE
    public void actualizar(Autor a) {
        String sql = "UPDATE Autor SET direcc=?, telef=?, nombre=?, ape1=?, ape2=?, url=?, idLocalidad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getDirecc());
            ps.setString(2, a.getTelef());
            ps.setString(3, a.getNombre());
            ps.setString(4, a.getApe1());
            ps.setString(5, a.getApe2());
            ps.setString(6, a.getUrl());
            ps.setObject(7, a.getIdLocalidad());
            ps.setInt(8, a.getId());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Autor WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}

