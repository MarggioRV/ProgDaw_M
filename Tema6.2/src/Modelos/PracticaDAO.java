package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PracticaDAO {
    
    
    // READ
    public List<Practica> listarPracticas() {
        List<Practica> practicas = new ArrayList<>();
        String sql = "SELECT id, titulo, dificultad FROM practica";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                practicas.add(new Practica(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("dificultad")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return practicas;
    }


    // CREATE
    public void insertarPractica(Practica p) {
        String sql = "INSERT INTO practica (id, titulo, dificultad) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getTitulo());
            ps.setString(3, p.getDificultad());

            ps.executeUpdate();
            System.out.println("Práctica insertada correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar la práctica: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarPractica(Practica p) {
        String sql = "UPDATE practica SET titulo=?, dificultad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getDificultad());
            ps.setInt(3, p.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void eliminarPractica(int id) {
        String sql = "DELETE FROM practica WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
