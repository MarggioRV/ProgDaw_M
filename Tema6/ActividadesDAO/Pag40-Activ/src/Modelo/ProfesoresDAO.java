package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProfesoresDAO {

// READ
public List<Profesores> listarProfes() {
    List<Profesores> Profesores = new ArrayList<>();
    String sql = "SELECT id, nif, nombre, ape1, ape2 FROM Profesor";  

    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Profesores.add(new Profesores(
                    rs.getInt("id"),
                    rs.getString("nif"),
                    rs.getString("nombre"),
                    rs.getString("ape1"),   
                    rs.getString("ape2")    
            ));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return Profesores;
}
    // CREATE
    public void insertarProfe(Profesores p) {
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
    public void actualizarProfe(Profesores p) {
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