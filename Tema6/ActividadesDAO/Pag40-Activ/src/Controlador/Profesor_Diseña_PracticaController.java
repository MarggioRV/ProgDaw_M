package Controlador;

import Modelo.Profesor_Diseña_PracticaDAO;
import Vista.Profesor_Diseña_PracticaView;

public class Profesor_Diseña_PracticaController {

    private Profesor_Diseña_PracticaDAO dao;
    private Profesor_Diseña_PracticaView view;

    public Profesor_Diseña_PracticaController() {
        dao = new Profesor_Diseña_PracticaDAO();
        view = new Profesor_Diseña_PracticaView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarDisenos(dao.listarDisenos());
                        break;

                    case 2:
                        dao.insertarDiseno(view.pedirNuevoDiseno());
                        view.mostrarMensaje("Diseño insertado");
                        break;

                    case 3:
                        dao.actualizarDiseno(view.pedirDisenoActualizar());
                        view.mostrarMensaje("Diseño actualizado");
                        break;

                    case 4:
                        int[] ids = view.pedirIdsEliminar();
                        dao.eliminarDiseno(ids[0], ids[1]);
                        view.mostrarMensaje("Diseño eliminado");
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
