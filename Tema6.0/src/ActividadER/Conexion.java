package ActividadER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/daw";
    private static final String USUARIO = "root"; 
    private static final String PASSWORD = "root";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

    public static class Categoria {
        private int codigo;
        private String nombre;

        public Categoria(){

        }
        public Categoria(int codigo,String nombre){
            this.codigo=codigo;
            this.nombre=nombre;
        }
        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        @Override
        public String toString() {
            return "Categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
        }


    }
}