package Controlador;

import Modelos.*;
import Vista.*;

public class AsignaturaController {
    
    private AsignaturaDAO dao;
    private AsignaturaView view;

    public AsignaturaController() {
        dao = new AsignaturaDAO();
        view = new AsignaturaView();
    }

    public void iniciar() {
        int opcion;

        try {

            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarAsig(dao.listar());
                        break;
                    case 2: {
                        dao.insertar(view.pedirNuevaAsignatura());
                        view.mostrarMensaje("Asg insertada");
                        break;
                    }
                    case 3: {
                        dao.actualizar(view.pedirAsignaturaActualizar());
                        view.mostrarMensaje("Asg actualizada");
                        break;
                    }
                    case 4: {
                        dao.eliminar(view.pedirAsignaturaEliminar());
                        view.mostrarMensaje("Asg eliminada");
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

