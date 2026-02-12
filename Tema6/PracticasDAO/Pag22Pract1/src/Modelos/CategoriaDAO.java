package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// public class PersonaDAO {
//     public List<Persona> listarPersonas() {
//         List<Persona> personas = new ArrayList<>();
//         String sql = "SELECT id, nombre, email FROM persona";
//         try (Connection conn = Conexion.getConnection();
//                 PreparedStatement ps = conn.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//             while (rs.next()) {
//                 personas.add(
//                         new Persona(
//                                 rs.getInt("id"),
//                                 rs.getString("nombre"),
//                                 rs.getString("email")));
//             }
//         } catch (SQLException e) {
//             System.err.println("Error DAO: " + e.getMessage());
//         }
//         return personas;
//     }
// }

public class CategoriaDAO {
    // READ (lista de Persona)
    public List<Categoria> listar() {
        List<Categoria> categoria = new ArrayList<>();
        String sql = "SELECT id, nombre, email FROM persona";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                categoria.add(new Categoria(rs.getInt("codigo"),
                        rs.getString("nombre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }

    // CREATE
    public void insertar(Categoria c) {
        String sql = "INSERT INTO Categoria (codigo, nombre) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getCod_cat());
            ps.setString(2, c.getNombreCat());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Categoria c) {
        String sql = "UPDATE Categoria SET codigo=?, nombre=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getNombreCat());
            ps.setInt(3, c.getCod_cat());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM Categoria WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}