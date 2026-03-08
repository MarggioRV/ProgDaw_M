package Controlador;

import Modelo.AlumnosDAO;
import Vista.AlumnosView;

public class AlumnosController {

    private AlumnosDAO dao;
    private AlumnosView view;

    public AlumnosController() {
        dao = new AlumnosDAO();
        view = new AlumnosView();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {
                    case 1:
                        view.mostrarAlumnos(dao.listarAlumnos());
                        break;

                    case 2:
                        dao.insertarAlumno(view.pedirNuevoAlumno());
                        view.mostrarMensaje("Alumno insertado");
                        break;

                    case 3:
                        dao.actualizarAlumno(view.pedirAlumnoActualizar());
                        view.mostrarMensaje("Alumno actualizado");
                        break;

                    case 4:
                        dao.eliminarAlumno(view.pedirIdEliminar());
                        view.mostrarMensaje("Alumno eliminado");
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

