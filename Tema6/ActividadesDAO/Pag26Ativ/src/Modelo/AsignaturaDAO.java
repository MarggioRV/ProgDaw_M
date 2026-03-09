package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelos.Conexion;

public class AsignaturaDAO {
    
    // READ 
    public List<Asignatura> listar() {
        List<Asignatura> asignaturas = new ArrayList<>();
        String sql = "SELECT cod, nombre, numHoras FROM Asignatura";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                asignaturas.add(new Asignatura(
                    rs.getInt("cod"),
                    rs.getString("nombre"),
                    rs.getInt("numHoras")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asignaturas;
    }


    // CREATE
    public void insertar(Asignatura a) {
        String sql = "INSERT INTO Asignatura (cod, nombre, numHoras) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getCod());
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getNumHoras());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void Asignatura(Asignatura a) {
        String sql = "UPDATE Asignatura SET nombre=?, numHoras=? WHERE cod=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getNumHoras());
            //WHERE
            ps.setInt(3, a.getCod());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM Asignatura WHERE cod=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
