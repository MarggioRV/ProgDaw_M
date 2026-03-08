package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    // READ
    public List<Empleado> listar() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido1, apellido2, telefono, direccion, tipo FROM Empleado";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                //De String a eum
                TipoEmpleado tipo = TipoEmpleado.valueOf(
                        rs.getString("tipo").toUpperCase()
                );

                lista.add(new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        tipo
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


    // CREATE
    public void insertar(Empleado e) {
        String sql = "INSERT INTO Empleado (id, nombre, apellido1, apellido2, telefono, direccion, tipo) VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, e.getId());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApe1());
            ps.setString(4, e.getApe2());
            ps.setString(5, e.getTelefono());
            ps.setString(6, e.getDireccion());
            ps.setString(7, e.getTipo().name()); // Enum → String

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    // UPDATE
    public void actualizar(Empleado e) {
        String sql = "UPDATE Empleado SET nombre=?, apellido1=?, apellido2=?, telefono=?, direccion=?, tipo=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApe1());
            ps.setString(3, e.getApe2());
            ps.setString(4, e.getTelefono());
            ps.setString(5, e.getDireccion());
            ps.setString(6, e.getTipo().name()); // Enum → String
            ps.setInt(7, e.getId());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM Empleado WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
