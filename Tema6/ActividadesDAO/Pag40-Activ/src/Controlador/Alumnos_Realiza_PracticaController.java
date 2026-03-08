package Controlador;

import Modelo.Alumnos_Realiza_PracticaDAO;
import Vista.Alumnos_Realiza_PracticaView;

public class Alumnos_Realiza_PracticaController {

    private Alumnos_Realiza_PracticaDAO dao;
    private Alumnos_Realiza_PracticaView view;

    public Alumnos_Realiza_PracticaController() {
        dao = new Alumnos_Realiza_PracticaDAO();
        view = new Alumnos_Realiza_PracticaView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarPracticas(dao.listarPracticasHechas());
                        break;

                    case 2:
                        dao.insertarPracticaHecha(view.pedirNuevaPracticaHecha());
                        view.mostrarMensaje("Registro insertado");
                        break;

                    case 3:
                        dao.actualizarPracticaHecha(view.pedirPracticaActualizar());
                        view.mostrarMensaje("Registro actualizado");
                        break;

                    case 4:
                        int[] ids = view.pedirIdsEliminar();
                        dao.eliminarPracticaHecha(ids[0], ids[1]);
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
