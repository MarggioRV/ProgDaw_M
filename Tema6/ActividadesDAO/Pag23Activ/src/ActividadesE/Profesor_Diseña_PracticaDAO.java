package ActividadesE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Conexion;

public class Profesor_Diseña_PracticaDAO {

    // READ
    public List<Profesor_Diseña_Practica> listarDisenos() {
        List<Profesor_Diseña_Practica> lista = new ArrayList<>();
        String sql = "SELECT id_practica, id_profesor, fecha FROM Profesor_Diseña_Practica";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Profesor_Diseña_Practica(
                        rs.getInt("id_practica"),
                        rs.getInt("id_profesor"),
                        rs.getString("fecha")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


    // CREATE
    public void insertarDiseno(Profesor_Diseña_Practica p) {
        String sql = "INSERT INTO Profesor_Diseña_Practica (id_practica, id_profesor, fecha) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId_practica());
            ps.setInt(2, p.getId_profesor());
            ps.setString(3, p.getFecha());

            ps.executeUpdate();
            System.out.println("Diseño insertado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar el diseño: " + e.getMessage());
        }
    }


    // UPDATE
    public void actualizarDiseno(Profesor_Diseña_Practica p) {
        //Nota: Revisar las claves compuestas
        String sql = "UPDATE Profesor_Diseña_Practica SET fecha=? WHERE id_practica=? AND id_profesor=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getFecha());
            ps.setInt(2, p.getId_practica());
            ps.setInt(3, p.getId_profesor());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void eliminarDiseno(int idPractica, int idProfesor) {
        String sql = "DELETE FROM Profesor_Diseña_Practica WHERE id_practica=? AND id_profesor=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idPractica);
            ps.setInt(2, idProfesor);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
