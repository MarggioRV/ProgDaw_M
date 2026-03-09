package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelos.Alumnos;
import Modelos.Conexion;

public class AlumnosDAO {

    
    // READ (lista de Persona)
    public List<Alumnos> listarAlumnos() {
        List<Alumnos> alumnos = new ArrayList<>();
        String sql = "SELECT id, nif, grupo, nombre, apellido1, apellido2 FROM alumno";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                alumnos.add(new Alumnos(rs.getInt("id"),rs.getString("nif"), rs.getString("grupo"), rs.getString("nombre"), rs.getString("apellido1"),rs.getString("apellido2")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return alumnos;
    }


    // CREATE
    public void insertarAlumno(Alumnos a) {
        String sql = "INSERT INTO alumno (id,nif, grupo, nombre,apellido1, apellido2) VALUES (?,?,?,?,?,?)";

        System.out.println(a);
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());ps.setString(2,a.getNif());ps.setString(3,a.getGrupo());ps.setString(4,a.getNombre()); ps.setString(5, a.getApellido1());
            ps.setString(6, a.getApellido2());
            ps.executeUpdate();
            System.out.println("Registro insertado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarAlumno(Alumnos a) {
        String sql = "UPDATE alumno SET nif=?, grupo=?, nombre=?, apellido1=?, apellido2=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1,a.getNif());
            ps.setString(2,a.getGrupo());
            ps.setString(3,a.getNombre()); 
            ps.setString(4, a.getApellido1());
            ps.setString(5, a.getApellido2());
            ps.setInt(6, a.getId()); 
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }


    // DELETE
    public void eliminarAlumno(int id) {
        String sql = "DELETE FROM alumno WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id); ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}