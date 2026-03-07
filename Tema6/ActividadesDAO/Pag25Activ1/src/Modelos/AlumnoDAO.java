package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    
    // READ 
    public List<Alumno> listar() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT numMatricula, fecha_nac, nombre, ape1, ape2, telefono FROM Alumnos";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                alumnos.add(new Alumno(
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
        return alumnos;
    }


    // CREATE
    public void insertar(Alumno a) {
        String sql = "INSERT INTO Alumnos (numMatricula, fecha_nac, nombre, ape1, ape2, telefono) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getNumMatricula());
            ps.setString(2, a.getApe1());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Alumno a) {
        String sql = "UPDATE Alumnos SET numMatricula=?, fecha_nac=?, nombre=?, ape1=?, ape2=?, telefono=? WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(3, a.getNumMatricula());
            ps.setString(1, a.getApe1());
            ps.setString(1, a.getApe2());
            ps.setString(1, a.getFecha_nacimiento());
            ps.setString(1, a.getNombre());
            ps.setString(1, a.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM Alumnos WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}