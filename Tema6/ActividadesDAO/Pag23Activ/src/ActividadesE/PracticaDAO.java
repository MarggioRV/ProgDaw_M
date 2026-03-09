package ActividadesE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelos.Conexion;

public class PracticaDAO {

    
    // READ (lista de Persona)
    public List<Practica> listarPractica() {
        List<Practica> practicas = new ArrayList<>();
        String sql = "SELECT id, titulo, dificultad FROM Practica";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                practicas.add(new Practica(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("dificultad")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return practicas;
    }


    // CREATE
    public void insertarPractica(Practica a) {
        String sql = "INSERT INTO Practica (id,titulo,dificultas) VALUES (?,?,?)";

        System.out.println(a);
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());
            ps.setString(2,a.getTitulo());
            ps.setString(3,a.getDificultad());
            ps.executeUpdate();
            System.out.println("Registro insertado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarPractica(Practica a) {
        String sql = "UPDATE Practica SET id=?, titulo=?, dificultad=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1,a.getId());
            ps.setString(2,a.getTitulo());
            ps.setString(3,a.getDificultad()); 
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }


    // DELETE
    public void eliminarPractica(int id) {
        String sql = "DELETE FROM Practica WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id); 
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
