package Controlador;

// import java.util.List;

// import Modelos.Persona;
import Modelos.PersonaDAO;
import Vista.PersonaView;

// public class PersonaController {
//     private PersonaDAO personaDAO;
//     private PersonaView personaView;

//     public PersonaController() {
//         personaDAO = new PersonaDAO();
//         personaView = new PersonaView();
//     }

//     public void listarPersonas() {
//         List<Persona> personas = personaDAO.listarPersonas();
//         personaView.mostrarPersonas(personas);
//     }
// }

public class PersonaController {
    private PersonaDAO dao;
    private PersonaView view;

    public PersonaController() {
        dao = new PersonaDAO();
        view = new PersonaView();
    }

    public void iniciar() {
        int opcion;

        try {

            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarPersonas(dao.listar());
                        break;
                    case 2: {
                        dao.insertar(view.pedirNuevaPersona());
                        view.mostrarMensaje("Persona insertada");
                        break;
                    }
                    case 3: {
                        dao.actualizar(view.pedirPersonaActualizar());
                        view.mostrarMensaje("Persona actualizada");
                        break;
                    }
                    case 4: {
                        dao.eliminar(view.pedirIdEliminar());
                        view.mostrarMensaje("Persona eliminada");
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
