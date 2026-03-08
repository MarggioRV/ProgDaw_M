package Controlador;

import Modelo.Alumno_Hace_ExamenTDAO;
import Vista.Alumno_Hace_ExamenTView;

public class Alumno_Hace_ExamenTController {

    private Alumno_Hace_ExamenTDAO dao;
    private Alumno_Hace_ExamenTView view;

    public Alumno_Hace_ExamenTController() {
        dao = new Alumno_Hace_ExamenTDAO();
        view = new Alumno_Hace_ExamenTView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarExamenes(dao.listarExamenesHechos());
                        break;

                    case 2:
                        dao.insertarExamenHecho(view.pedirNuevoExamenHecho());
                        view.mostrarMensaje("Registro insertado");
                        break;

                    case 3:
                        dao.actualizarExamenHecho(view.pedirExamenActualizar());
                        view.mostrarMensaje("Registro actualizado");
                        break;

                    case 4:
                        int[] ids = view.pedirIdsEliminar();
                        dao.eliminarExamenHecho(ids[0], ids[1]);
                        view.mostrarMensaje("Registro eliminado");
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
