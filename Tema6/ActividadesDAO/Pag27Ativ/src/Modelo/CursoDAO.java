package Modelo;

import java.sql.*;
import java.util.*;

import Modelos.Conexion;

public class CursoDAO {

    // Read
    public List<Curso> listar() {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT * FROM Curso";

        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("duracion"),
                        rs.getDouble("coste")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Create
    public void insertar(Curso c) {
        String sql = "INSERT INTO Curso VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDescripcion());
            ps.setInt(4, c.getDuracion());
            ps.setDouble(5, c.getCoste());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update
    public void actualizar(Curso c) {
        String sql = "UPDATE Curso SET nombre=?, descripcion=?, duracion=?, coste=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDescripcion());
            ps.setInt(3, c.getDuracion());
            ps.setDouble(4, c.getCoste());
            ps.setInt(5, c.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete
    public void eliminar(int id) {
        String sql = "DELETE FROM Curso WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
