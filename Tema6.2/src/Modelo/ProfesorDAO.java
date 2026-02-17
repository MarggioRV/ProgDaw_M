package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {
    public List<Profesor> listarProfes() {
        List<Profesor> Profesores = new ArrayList<>();
        String sql = "SELECT id, nif, nombre, apellido1, apellido2 FROM profesor";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Profesores.add(new Profesor(
                        rs.getInt("id"),
                        rs.getString("nif"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Profesores;
    }

    // CREATE
    public void insertarProfe(Profesor p) {
        String sql = "INSERT INTO profesor (id, nif, nombre, apellido1, apellido2) VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNif());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApe1());
            ps.setString(5, p.getApe2());

            ps.executeUpdate();
            System.out.println("Registro insertado exitosamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());
        }
    }

    // UPDATE
    public void actualizarProfe(Profesor p) {
        String sql = "UPDATE profesor SET nif=?, nombre=?, apellido1=?, apellido2=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getNif());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApe1());
            ps.setString(4, p.getApe2());
            ps.setInt(5, p.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminarProfesor(int id) {
        String sql = "DELETE FROM profesor WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}