package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Alumnos_Realiza_PracticaDAO {

    
    // READ (lista de Persona)
    public List<Alumnos_Realiza_Practica> ListarPracticaHechos() {
        List<Alumnos_Realiza_Practica> ahe = new ArrayList<>();
        String sql = "SELECT id_alumno, id_practica, fecha, nota FROM Alumnos_Realiza_Practica";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ahe.add(new Alumnos_Realiza_Practica(
                    rs.getInt("id_alumno"),
                    rs.getInt("nota"),
                    rs.getString("fecha"),
                    rs.getInt("id_practica")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return ahe;
    }


    // CREATE
    public void insertarPracticaHecha(Alumnos_Realiza_Practica t) {
        String sql = "INSERT INTO Alumnos_Realiza_Practica (id_alumno, id_practica, fecha, nota) VALUES (?,?,?,?)";

        System.out.println(t);
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, t.getId_alumno());
            ps.setString(2, t.getFecha());
            ps.setInt(3, t.getId_practica());
            ps.setInt(4, t.getNota());
            ps.executeUpdate();
            System.out.println("Registro insertado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarPracticaHecha(Alumnos_Realiza_Practica a) {
        String sql = "UPDATE Alumnos_Realiza_Practica SET fecha=?, nota=? WHERE id_alumno=? AND id_practica=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getFecha()); 
            ps.setInt(2, a.getNota()); 
            ps.setInt(3, a.getId_alumno());
            ps.setInt(4, a.getId_practica()); 
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }


    // DELETE
    public void eliminarPracticaHecho(int id_alumno, int id_practica) {
        String sql = "DELETE FROM Alumnos_Realiza_Practica WHERE id_alumno=? AND id_practica=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_practica);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}