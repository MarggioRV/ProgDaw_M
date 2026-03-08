package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorEscribeLibroDAO {

    // READ
    public List<AutorEscribeLibro> listar() {
        List<AutorEscribeLibro> lista = new ArrayList<>();
        String sql = "SELECT idLibro, idAutor FROM LibroAutor";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new AutorEscribeLibro(
                        rs.getInt("idLibro"),
                        rs.getInt("idAutor")
                ));
            }

        } catch (SQLException e) { e.printStackTrace(); }

        return lista;
    }

    // CREATE
    public void insertar(AutorEscribeLibro la) {
        String sql = "INSERT INTO LibroAutor (idLibro, idAutor) VALUES (?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, la.getIdLibro());
            ps.setInt(2, la.getIdAutor());

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }

    // DELETE
    public void eliminar(int idLibro, int idAutor) {
        String sql = "DELETE FROM LibroAutor WHERE idLibro=? AND idAutor=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.setInt(2, idAutor);

            ps.executeUpdate();

        } catch (SQLException e) { e.printStackTrace(); }
    }
}
