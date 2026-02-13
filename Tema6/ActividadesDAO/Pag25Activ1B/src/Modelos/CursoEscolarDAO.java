package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoEscolarDAO {
    
    // READ 
    public List<CursoEscolar> listar() {
        List<CursoEscolar> cursoEscolar = new ArrayList<>();
        String sql = "SELECT id, anyo_inicio, anyo_fin FROM CursoEscolar";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cursoEscolar.add(new CursoEscolar(
                    rs.getInt("id"),
                    rs.getString("anyo_inicio"),
                    rs.getString("anyo_fin")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursoEscolar;
    }


    // CREATE
    public void insertar(CursoEscolar c) {
        String sql = "INSERT INTO CursoEscolar (id, anyo_inicio, anyo_fin) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getId());
            ps.setString(1, c.getAnyo_inicio());
            ps.setString(2, c.getAnyo_inicio());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(CursoEscolar c) {
        String sql = "UPDATE ps.setInt(1, c.getNumMatricula()); SET numMatricula=?, fecha_nac=?, nombre=?, ape1=?, ape2=?, telefono=? WHERE numMatricula=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(3, c.getId());
            ps.setString(1, c.getAnyo_inicio());;
            ps.setString(1, c.getAnyo_fin());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM CursoEscolar WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
