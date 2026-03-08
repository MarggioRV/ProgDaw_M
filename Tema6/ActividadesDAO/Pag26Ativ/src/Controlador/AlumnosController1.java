package Controlador;

import Modelo.*;
import Vista.*;

public class AlumnosController1 {
    
    private AlumnoDAO dao;
    private AlumnosView view;

    public AlumnosController1() {
        dao = new AlumnoDAO();
        view = new AlumnosView();
    }

    public void iniciar() {
        int opcion;

        try {

            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarAlumnos(dao.listar());
                        break;
                    case 2: {
                        dao.insertar(view.pedirNuevoAlumno());
                        view.mostrarMensaje("Cat insertada");
                        break;
                    }
                    case 3: {
                        dao.actualizar(view.pedirAlumnoActualizar());
                        view.mostrarMensaje("Cat actualizada");
                        break;
                    }
                    case 4: {
                        dao.eliminar(view.pedirNumMatriculaEliminar());
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

