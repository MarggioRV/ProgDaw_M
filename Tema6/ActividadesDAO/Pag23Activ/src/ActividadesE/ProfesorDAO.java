package ActividadesE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelos.Conexion;

public class ProfesorDAO {

    // READ
    public List<Profesor> listarProfesor() {
        List<Profesor> profesores = new ArrayList<>();
        String sql = "SELECT id, nif, nombre, ape1, ape2 FROM Profesor";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                profesores.add(new Profesor(
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
        return profesores;
    }


    // CREATE
    public void insertarP(Profesor p) {
        String sql = "INSERT INTO Profesor (id, nif, nombre, ape1, ape2) VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNif());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApe1());
            ps.setString(4, p.getApe2());

            ps.executeUpdate();
            System.out.println("Examen teórico insertado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar el examen: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarProfesor(Profesor p) {
        String sql = "UPDATE Profesor SET id=?, nif=?, nombre=?, ap1=?, ap2=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNif());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApe1());
            ps.setString(4, p.getApe2());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Profesor WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
