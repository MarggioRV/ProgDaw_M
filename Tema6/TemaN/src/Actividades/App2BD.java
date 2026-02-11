// package Actividades6;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class App2BD {
    
//     public static void main(String[] args) {
//         String sql="Create table if not exists persona(id int auto_increment primary key, nombre varchar(100), email varchar(100))";
//         try (Connection conexion=Conexion.getConnection();
//                 Statement stat=conexion.createStatement()) {
//             stat.executeUpdate(sql);
//         } catch (SQLException e) {
//             System.err.println("Error al crear tabla: " + e.getMessage());
//         }
//         listarPersonas();
//     }
    
//     public static void listarPersonas() {
//         String sql = "SELECT codigo, nombre, Procedencia, Nombre_equipo FROM jugadores where Procedencia=? and Nombre_Equipo=?";
//         try (Connection conn = Conexion.getConnection();
//                 PreparedStatement ps = conn.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//             while (rs.next()) {
//                 System.out.println(
//                         rs.getInt("codigo") + ": " +
//                         rs.getString("nombre") + " - " +
//                         rs.getString("Procedencia"));
//                         rs.getString("Nombre_equipo");
//             }
//         } catch (SQLException e) {
//             System.err.println("Error al leer: " + e.getMessage());
//         }
//     }
// }
