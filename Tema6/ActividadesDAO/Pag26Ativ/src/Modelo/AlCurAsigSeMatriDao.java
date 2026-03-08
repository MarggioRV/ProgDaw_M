package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlCurAsigSeMatriDao {

    // READ
    public List<AlCurAsigSeMatri> listarMatriculas() {
        List<AlCurAsigSeMatri> lista = new ArrayList<>();
        String sql = "SELECT numMatricula, id_cursoEs, cod_Asig FROM AlCurAsigSeMatri";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new AlCurAsigSeMatri(
                        rs.getString("numMatricula"),
                        rs.getInt("id_cursoEs"),
                        rs.getInt("cod_Asig")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


    // CREATE
    public void insertarMatricula(AlCurAsigSeMatri a) {
        String sql = "INSERT INTO AlCurAsigSeMatri (numMatricula, id_cursoEs, cod_Asig) VALUES (?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getNumMatricula());
            ps.setInt(2, a.getId_cursoEs());
            ps.setInt(3, a.getCod_Asig());

            ps.executeUpdate();
            System.out.println("Relación insertada correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar relación: " + e.getMessage());
        }
    }


    // UPDATE — No tiene sentido, pues no hay atibuto que no forme parte de la clave compuesta


    // DELETE
    public void eliminarMatricula(String numMatricula, int idCurso, int codAsig) {
        String sql = "DELETE FROM AlCurAsigSeMatri WHERE numMatricula=? AND id_cursoEs=? AND cod_Asig=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, numMatricula);
            ps.setInt(2, idCurso);
            ps.setInt(3, codAsig);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
