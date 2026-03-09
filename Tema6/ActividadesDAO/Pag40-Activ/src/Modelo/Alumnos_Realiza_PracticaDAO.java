package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Alumnos_Realiza_PracticaDAO {

    // READ
    public List<Alumnos_Realiza_Practica> listarPracticasHechas() {
        List<Alumnos_Realiza_Practica> lista = new ArrayList<>();
        String sql = "SELECT id_alumno, id_practica, fecha, nota FROM Alumnos_Realiza_Practica";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Alumnos_Realiza_Practica(
                        rs.getInt("id_alumno"),
                        rs.getInt("id_practica"),
                        rs.getString("fecha"),
                        rs.getInt("nota")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertarPracticaHecha(Alumnos_Realiza_Practica a) {
        String sql = "INSERT INTO Alumnos_Realiza_Practica (id_alumno, id_practica, fecha, nota) VALUES (?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getId_alumno());
            ps.setInt(2, a.getId_practica());
            ps.setString(3, a.getFecha());
            ps.setInt(4, a.getNota());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
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
    public void eliminarPracticaHecha(int idAlumno, int idPractica) {
        String sql = "DELETE FROM Alumnos_Realiza_Practica WHERE id_alumno=? AND id_practica=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idPractica);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
