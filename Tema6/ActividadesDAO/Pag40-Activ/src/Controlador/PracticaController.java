package Controlador;

import Modelo.PracticaDAO;
import Vista.PracticaView;

public class PracticaController {

    private PracticaDAO dao;
    private PracticaView view;

    public PracticaController() {
        dao = new PracticaDAO();
        view = new PracticaView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarPracticas(dao.listarPracticas());
                        break;

                    case 2:
                        dao.insertarPractica(view.pedirNuevaPractica());
                        view.mostrarMensaje("Práctica insertada");
                        break;

                    case 3:
                        dao.actualizarPractica(view.pedirPracticaActualizar());
                        view.mostrarMensaje("Práctica actualizada");
                        break;

                    case 4:
                        dao.eliminarPractica(view.pedirIdEliminar());
                        view.mostrarMensaje("Práctica eliminada");
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
