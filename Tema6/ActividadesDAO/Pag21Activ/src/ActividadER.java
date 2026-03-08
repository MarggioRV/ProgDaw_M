import ActividadER.CategoriaDAO;

public class ActividadER {
    public static void main(String[] args) {
        //Insertar categorías
        // CategoriaDAO.insertar(1,"Herramientas");
        // CategoriaDAO.insertar(2,"adfasdfasdfasdffds");
        // CategoriaDAO.insertar(3,"para borrar");

        //Actualizar catetoría
        CategoriaDAO.actualizar(2,"Hardware PC");

        //Borrar categoría
        CategoriaDAO.borrar(3);

        //Imprimir el contenido de la tabla
        CategoriaDAO.listar();
    }
}
