package Controlador;

import Modelo.Profesor_Diseña_ExamDAO;
import Vista.Profesor_Diseña_ExamView;

public class Profesor_Diseña_ExamController {

    private Profesor_Diseña_ExamDAO dao;
    private Profesor_Diseña_ExamView view;

    public Profesor_Diseña_ExamController() {
        dao = new Profesor_Diseña_ExamDAO();
        view = new Profesor_Diseña_ExamView();
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
