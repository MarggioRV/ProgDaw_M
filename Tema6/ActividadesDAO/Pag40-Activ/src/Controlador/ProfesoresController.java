package Controlador;

import Modelo.ProfesoresDAO;
import Vista.ProfesoresView;

public class ProfesoresController {

    private ProfesoresDAO dao;
    private ProfesoresView view;

    public ProfesoresController() {
        dao = new ProfesoresDAO();
        view = new ProfesoresView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarProfesores(dao.listarProfes());
                        break;

                    case 2:
                        dao.insertarProfe(view.pedirNuevoProfesor());
                        view.mostrarMensaje("Profesor insertado");
                        break;

                    case 3:
                        dao.actualizarProfe(view.pedirProfesorActualizar());
                        view.mostrarMensaje("Profesor actualizado");
                        break;

                    case 4:
                        dao.eliminarProfesor(view.pedirIdEliminar());
                        view.mostrarMensaje("Profesor eliminado");
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
