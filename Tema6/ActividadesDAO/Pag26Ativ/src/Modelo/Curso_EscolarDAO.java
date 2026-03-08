package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Curso_EscolarDAO {
 
    // READ 
    public List<Curso_Escolar> listar() {
        List<Curso_Escolar> cursos = new ArrayList<>();
        String sql = "SELECT id, anio_inicio, anio_fin FROM Curso_Escolar";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cursos.add(new Curso_Escolar(
                    rs.getInt("id"),
                    rs.getInt("anio_inicio"),
                    rs.getInt("anio_fin")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
    }


    // CREATE
    public void insertar(Curso_Escolar a) {
        String sql = "INSERT INTO Curso_Escolar (id, anio_inicio, anio_fin) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());
            ps.setInt(2, a.getAnio_inicio());
            ps.setInt(3, a.getAnio_fin());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void Curso_Escolar(Curso_Escolar a) {
        String sql = "UPDATE Curso_Escolar SET anio_inicio=?, anio_fin=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getAnio_inicio());
            ps.setInt(2, a.getAnio_fin());
            //WHERE
            ps.setInt(3, a.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Curso_Escolar WHERE id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
