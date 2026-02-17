package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {
    
    // READ 
    public List<Profesor> listar() {
        List<Profesor> profesor = new ArrayList<>();
        String sql = "SELECT numMatricula, fecha_nac, nombre, ape1, ape2, telefono FROM Alumnos";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                profesor.add(new Profesor(
                    rs.getInt("numMatricula"),
                    rs.getString("fecha_nac"),
                    rs.getString("nombre"),
                    rs.getString("ape1"),
                    rs.getString("ape2"),
                    rs.getString("telefono")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesor;
    }


    // CREATE
    public void insertar(Profesor p) {
        String sql = "INSERT INTO Alumnos (numMatricula, fecha_nac, nombre, ape1, ape2, telefono) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(3, p.getId());
            ps.setString(1, p.getNombre());
            ps.setString(1, p.getApe1());
            ps.setString(1, p.getApe2());
            ps.setString(1, p.getEspecialidad());
            ps.setString(1, p.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Profesor p) {
        String sql = "UPDATE Alumnos SET numMatricula=?, fecha_nac=?, nombre=?, ape1=?, ape2=?, telefono=? WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(3, p.getId());
            ps.setString(1, p.getNombre());
            ps.setString(1, p.getApe1());
            ps.setString(1, p.getApe2());
            ps.setString(1, p.getEspecialidad());
            ps.setString(1, p.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Alumnos WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}