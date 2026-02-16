package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDAO {
    
    // READ 
    public List<Asignatura> listar() {
        List<Asignatura> asignatura = new ArrayList<>();
        String sql = "SELECT codAsignatura, nombre, numHoras FROM Asignatura";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                asignatura.add(new Asignatura(
                    rs.getInt("codAsignatura"),
                    rs.getString("nombre"),
                    rs.getInt("numHoras")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asignatura;
    }


    // CREATE
    public void insertar(Asignatura a) {
        String sql = "INSERT INTO Asignatura (codAsignatura, nombre, numHoras) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getCodAsignatura());
            ps.setString(2, a.getNombre());
            ps.setInt(1, a.getNumHoras());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Asignatura a) {
        String sql = "UPDATE Asignatura SET codAsignatura=?, Nombre=?, numHoras=? WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(3, a.getCodAsignatura());
            ps.setString(1, a.getNombre());
            ps.setInt(3, a.getNumHoras());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM Asignatura WHERE codAsignatura=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}