package Controlador;

import Modelo.*;
import Vista.*;

public class Personas_Escuela_controller {
    
    private AlumnosDAO aldao;
    private ProfesorDAO profdao;
    private ExamenTeoricoDAO examdao;
    private PracticaDAO practicaDAO;

    private Alumno_Hace_ExamenTDAO examenHechoDAO;
    private Alumnos_Realiza_PracticaDAO practicaHechaDAO;
    private Profesor_Diseña_PracticaDAO practicaDiseniadaDAO;

    private Personas_Escuela_view view;

    public Personas_Escuela_controller(
            AlumnosDAO aldao,
            ProfesorDAO profdao,
            ExamenTeoricoDAO examdao,
            PracticaDAO practicaDAO,
            Alumno_Hace_ExamenTDAO examenHechoDAO,
            Alumnos_Realiza_PracticaDAO practicaHechaDAO,
            Profesor_Diseña_PracticaDAO practicaDiseniadaDAO,
            Personas_Escuela_view view) {

        this.aldao = aldao;
        this.profdao = profdao;
        this.examdao = examdao;
        this.practicaDAO = practicaDAO;

        this.examenHechoDAO = examenHechoDAO;
        this.practicaHechaDAO = practicaHechaDAO;
        this.practicaDiseniadaDAO = practicaDiseniadaDAO;

        this.view = view;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = view.mostrarMenu();

            switch (opcion) {

                case 1:
                    view.mostrarAlumnos(aldao.listarAlumnos());
                    break;

                case 2:
                    view.mostrarProfesores(profdao.listarProfes());
                    break;

                case 3:
                    view.mostrarExamenes(examdao.listarExamenesTeoricos());
                    break;

                case 4:
                    view.mostrarPracticas(practicaDAO.listarPracticas());
                    break;

                case 5: {
                    int id = view.pedirIdAlumno();
                    Alumnos encontrado = null;

                    for (Alumnos a : aldao.listarAlumnos()) {
                        if (a.getId() == id) {
                            encontrado = a;
                            break;
                        }
                    }

                    view.mostrarAlumno(encontrado);
                    break;
                }

                case 6: {
                    int id = view.pedirIdProfesor();
                    Profesor encontrado = null;

                    for (Profesor p : profdao.listarProfes()) {
                        if (p.getId() == id) {
                            encontrado = p;
                            break;
                        }
                    }

                    view.mostrarProfesor(encontrado);
                    break;
                }

                case 7: {
                    int id = view.pedirIdExamen();
                    ExamenTeorico encontrado = null;

                    for (ExamenTeorico e : examdao.listarExamenesTeoricos()) {
                        if (e.getId() == id) {
                            encontrado = e;
                            break;
                        }
                    }

                    view.mostrarExamen(encontrado);
                    break;
                }

                case 8: {
                    int id = view.pedirIdPractica();
                    Practica encontrado = null;

                    for (Practica p : practicaDAO.listarPracticas()) {
                        if (p.getId() == id) {
                            encontrado = p;
                            break;
                        }
                    }

                    view.mostrarPractica(encontrado);
                    break;
                }

                case 9:
                    aldao.insertarAlumno(view.pedirNuevoAlumno());
                    break;

                case 10:
                    profdao.insertarProfe(view.pedirNuevoProfesor());
                    break;

                case 11:
                    examdao.insertarExamenTeorico(view.pedirExamenTeorico());
                    break;

                case 12:
                    practicaDAO.insertarPractica(view.pedirNuevaPractica());
                    break;

                case 13:
                    aldao.eliminarAlumno(view.pedirIdAlumno());
                    break;

                case 14:
                    profdao.eliminarProfesor(view.pedirIdProfesor());
                    break;

                case 15:
                    examdao.eliminarExamenTeorico(view.pedirIdExamen());
                    break;

                case 16:
                    practicaDAO.eliminarPractica(view.pedirIdPractica());
                    break;

                case 17:
                    view.mostrarPracticasHechas(practicaHechaDAO.ListarPracticaHechos());
                    break;

                case 18:
                    view.mostrarExamenesHechos(examenHechoDAO.ListarExamenesHechos());
                    break;

                case 19:
                    view.mostrarPracticasDiseNiadas(practicaDiseniadaDAO.listarDisenos());
                    break;

                case 20: {
                    int idA = view.pedirIdAlumno();
                    int idP = view.pedirIdPractica();
                    Alumnos_Realiza_Practica encontrado = null;

                    for (Alumnos_Realiza_Practica ar : practicaHechaDAO.ListarPracticaHechos()) {
                        if (ar.getId_alumno() == idA && ar.getId_practica() == idP) {
                            encontrado = ar;
                            break;
                        }
                    }

                    view.mostrarPracticaHecha(encontrado);
                    break;
                }

                case 21: {
                    int idA = view.pedirIdAlumno();
                    int idE = view.pedirIdExamen();
                    Alumno_Hace_ExamenT encontrado = null;

                    for (Alumno_Hace_ExamenT ae : examenHechoDAO.ListarExamenesHechos()) {
                        if (ae.getId_alumno() == idA && ae.getId_examen_teorico() == idE) {
                            encontrado = ae;
                            break;
                        }
                    }

                    view.mostrarExamenHecho(encontrado);
                    break;
                }

                case 22: {
                    int idP = view.pedirIdPractica();
                    int idProf = view.pedirIdProfesor();
                    Profesor_Diseña_Practica encontrado = null;

                    for (Profesor_Diseña_Practica pd : practicaDiseniadaDAO.listarDisenos()) {
                        if (pd.getId_practica() == idP && pd.getId_profesor() == idProf) {
                            encontrado = pd;
                            break;
                        }
                    }

                    view.mostrarPracticaDiseNiada(encontrado);
                    break;
                }

                case 23:
                    practicaHechaDAO.insertarPracticaHecha(view.pedirPracticaHecha());
                    break;

                case 24:
                    examenHechoDAO.insertarExamenHecho(view.pedirExamenHecho());
                    break;

                case 25:
                    practicaDiseniadaDAO.insertarDiseno(view.pedirPracticaDiseNiada());
                    break;

                case 26:
                    practicaHechaDAO.eliminarPracticaHecho(
                        view.pedirIdAlumno(),
                        view.pedirIdPractica()
                    );
                    break;

                case 27:
                    examenHechoDAO.eliminarExamenHecho(
                        view.pedirIdAlumno(),
                        view.pedirIdExamen()
                    );
                    break;

                case 28:
                    practicaDiseniadaDAO.eliminarDiseno(
                        view.pedirIdPractica(),
                        view.pedirIdProfesor()
                    );
                    break;

                case 0:
                    view.mostrarMensaje("Saliendo...");
                    break;

                default:
                    view.mostrarMensaje("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }
}
