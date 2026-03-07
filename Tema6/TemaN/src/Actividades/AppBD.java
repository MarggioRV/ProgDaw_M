package Actividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppBD {
    
    public static void main(String[] args) {
        // String sql="Create table if not exists persona(id int auto_increment primary key, nombre varchar(100), email varchar(100))";
        // try (Connection conexion=Conexion.getConnection();
        //         Statement stat=conexion.createStatement()) {
        //     stat.executeUpdate(sql);
        // } catch (SQLException e) {
        //     System.err.println("Error al crear tabla: " + e.getMessage());
        // }
        listarPersonas("Spain","Lakers");
        NuevoRegistro(700, "Petro", "Rusia", "10-1", 30, "A", "Warriors");
        
        // System.out.println("...");
        // actulizarJugador();
    }
    
    public static void crearPersona(String nombre, String email) {
        String sql = "INSERT INTO persona (nombre, email) VALUES (?, ?)";
        try (Connection conn = ConexionPrub.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.executeUpdate();
            //Crear personas
            System.out.println("Persona creada.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }

    // public static void listarPersonas() {
    //     String sql = "SELECT * FROM persona";
    //     try (Connection conn = Conexion.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql);
    //             ResultSet rs = ps.executeQuery()) {
    //         while (rs.next()) {
    //             System.out.println(
    //                     rs.getInt("id") + ": " +
    //                             rs.getString("nombre") + " - " +
    //                             rs.getString("email"));
    //         }
    //     } catch (SQLException e) {
    //         System.err.println("Error al leer: " + e.getMessage());
    //         //+3
    //     }
    // }

        public static void listarPersonas(String Procedencia,String equipo) {
        String sql = "SELECT codigo, nombre, Procedencia, Nombre_equipo FROM jugadores where Procedencia=? and Nombre_Equipo=?";
        try  {
            Connection conn = ConexionPrub.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, Procedencia);
                ps.setString(2, equipo);
                ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo") + ": " +
                        rs.getString("nombre") + " - " +
                        rs.getString("Procedencia"));
                        rs.getString("Nombre_equipo");
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    /* Modifica el jugador 666 para que ponga bien su Procedencia */

    public static void actulizarJugador() {
        String sql = "UPDATE Jugadores SET Procedencia = ? WHERE codigo = ?";

        try (Connection conn = ConexionPrub.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Spain");
            ps.setInt(2, 666);
            ps.executeUpdate();
            System.out.println("Jugador actualizado.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar: " + e.getMessage());
        }
    }

    /* Inserta un registro en jugadores y bórralo */

    public static void NuevoRegistro(int codigo, String nombre, String Procedencia, String Altura, int Peso, String Posicion, String Nombre_Equipo) {
        String sql = "INSERT INTO jugadores (codigo, nombre, Procedencia, Altura, Peso, Posicion, Nombre_equipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionPrub.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, Procedencia);
            ps.setString(4, Altura);
            ps.setInt(5, Peso);
            ps.setString(6, Posicion);
            ps.setString(7, Nombre_Equipo);
            
            ps.executeUpdate();
            System.out.println("Jugador creado.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }

}


