package Controlador;

import Modelo.ExamenTeoricoDAO;
import Vista.ExamenTeoricoView;

public class ExamenTeoricoController {

    private ExamenTeoricoDAO dao;
    private ExamenTeoricoView view;

    public ExamenTeoricoController() {
        dao = new ExamenTeoricoDAO();
        view = new ExamenTeoricoView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarExamenes(dao.listarExamenesTeoricos());
                        break;

                    case 2:
                        dao.insertarExamenTeorico(view.pedirNuevoExamen());
                        view.mostrarMensaje("Examen insertado");
                        break;

                    case 3:
                        dao.actualizarExamenTeorico(view.pedirExamenActualizar());
                        view.mostrarMensaje("Examen actualizado");
                        break;

                    case 4:
                        dao.eliminarExamenTeorico(view.pedirIdEliminar());
                        view.mostrarMensaje("Examen eliminado");
                        break;

                    case 0:
                        view.mostrarMensaje("Saliendo...");
                        break;

                    default:
                        view.mostrarMensaje("Opción incorrecta");
                        break;
                }

            } while (opcion != 0);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
