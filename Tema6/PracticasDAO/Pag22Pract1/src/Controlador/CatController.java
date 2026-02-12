package Controlador;

import Modelos.CategoriaDAO;
import Vista.CatView;

public class CatController {
    private CategoriaDAO dao;
    private CatView view;

    public CatController() {
        dao = new CategoriaDAO();
        view = new CatView();
    }

    public void iniciar() {
        int opcion;

        try {

            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarCategorias(dao.listar());
                        break;
                    case 2: {
                        dao.insertar(view.pedirNuevaCategoria());
                        view.mostrarMensaje("Cat insertada");
                        break;
                    }
                    case 3: {
                        dao.actualizar(view.pedirCatActualizar());
                        view.mostrarMensaje("Cat actualizada");
                        break;
                    }
                    case 4: {
                        dao.eliminar(view.pedirCodEliminar());
                        view.mostrarMensaje("Cat eliminada");
                    }
                    case 0:
                        view.mostrarMensaje("Saliendo...");
                        break;
                    default:
                        view.mostrarMensaje("Opción incorrecta");
                        break;
                }
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
