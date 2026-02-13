package Controlador;

import Modelos.*;
import Vista.*;

public class CursoEscolarController {
    
    private CursoEscolarDAO dao;
    private CursoEscolarView view;

    public CursoEscolarController() {
        dao = new CursoEscolarDAO();
        view = new CursoEscolarView();
    }

    public void iniciar() {
        int opcion;

        try {

            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarCursos(dao.listar());
                        break;
                    case 2: {
                        dao.insertar(view.pedirNuevoCurso());
                        view.mostrarMensaje("Cat insertada");
                        break;
                    }
                    case 3: {
                        dao.actualizar(view.pedirCursoActualizar());
                        view.mostrarMensaje("Cat actualizada");
                        break;
                    }
                    case 4: {
                        dao.eliminar(view.pedirCursoEliminar());
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

