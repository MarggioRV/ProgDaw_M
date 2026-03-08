package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDao {
    // READ 
    public List<Profesor> listar() {
        List<Profesor> profesors = new ArrayList<>();
        String sql = "SELECT id, nombre, ape1, ape2, especialidad, telefono FROM Profesor";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                profesors.add(new Profesor(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("ape1"),
                    rs.getString("ape2"),
                    rs.getString("especilidad"),
                    rs.getString("telefono")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesors;
    }


    // CREATE
    public void insertar(Profesor a) {
        String sql = "INSERT INTO Profesor (id, nombre, ape1, ape2, especialidad, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApe1());
            ps.setString(4, a.getApe2());
            ps.setString(5, a.getEspecialidad());
            ps.setString(5, a.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void Profesor(Profesor a) {
        String sql = "UPDATE Profesor SET id=?, nombre=?, ape1=?, ape2=?, especialidad=?, telefono=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApe1());
            ps.setString(4, a.getApe2());
            ps.setString(5, a.getEspecialidad());
            ps.setString(6, a.getTelefono());
            ps.setInt(7, a.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM Profesor WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
