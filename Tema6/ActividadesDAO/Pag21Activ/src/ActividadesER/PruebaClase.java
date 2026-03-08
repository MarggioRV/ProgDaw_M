package ActividadER;

public class PruebaClase {
    public static void main(String[] args) {
        CategoriaDAO.listar();
        //Filtrar por un id
        Conexion.Categoria nuevo=CategoriaDAO.listar(1);
        System.out.println(nuevo);
        nuevo.setNombre("OTRA COSA");
        CategoriaDAO.actualizar(1,nuevo.getNombre());
        CategoriaDAO.actualizar(nuevo);
    }
}
