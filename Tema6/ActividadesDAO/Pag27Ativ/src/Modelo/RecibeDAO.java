package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecibeDAO {

    // READ
    public List<Recibe> listar() {
        List<Recibe> lista = new ArrayList<>();
        String sql = "SELECT id_empleado, id_edicion FROM Recibe";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Recibe(
                        rs.getInt("id_empleado"),
                        rs.getInt("id_edicion")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


    // CREATE
    public void insertar(Recibe r) {
        String sql = "INSERT INTO Recibe (id_empleado, id_edicion) VALUES (?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, r.getIdEmpleado());
            ps.setInt(2, r.getIdEdicion());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void eliminar(int idEmpleado, int idEdicion) {
        String sql = "DELETE FROM Recibe WHERE id_empleado=? AND id_edicion=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEmpleado);
            ps.setInt(2, idEdicion);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
