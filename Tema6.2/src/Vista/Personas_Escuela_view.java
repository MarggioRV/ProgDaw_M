package Vista;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import Modelos.*;

//Clase para toda la personas de las escuelas
public class Personas_Escuela_view {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n---Menu Cosas_Escuela---");
        System.out.println("1. Listar Alumnos");
        System.out.println("2. Listar Profesores");
        System.out.println("3. Listar Exámenes");
        System.out.println("4. Listar Prácticas");
        System.out.println();
        System.out.println("5. Mostrar 1 Alumno");
        System.out.println("6. Mostrar 1 Profesor");
        System.out.println("7. Mostrar 1 Examen");
        System.out.println("8. Mostrar 1 Práctica");
        System.out.println();
        System.out.println("9. Insertar Alumno");
        System.out.println("10. Insertar Profesor");
        System.out.println("11. Insertar Examen");
        System.out.println("12. Insertar Práctica");
        System.out.println();
        System.out.println("13. Eliminar Alumno");
        System.out.println("14. Eliminar Profesor");
        System.out.println("15. Eliminar Examen");
        System.out.println("16. Eliminar Práctica");
        System.out.println();
        System.out.println("17. Listar Practicas hechas");
        System.out.println("18. Listar Examenes realizados");
        System.out.println("19. Listar Prácticas diseñadas");
        System.out.println();
        System.out.println("20. Mostrar 1 Practica hecha");
        System.out.println("21. Mostrar 1 Examen realizado");
        System.out.println("22. Mostrar 1 Práctica diseñada");
        System.out.println();
        System.out.println("23. Insertar Práctica hecha"); 
        System.out.println("24. Insertar Examen realizado"); 
        System.out.println("25. Insertar Práctica diseñada"); 
        System.out.println(); 
        System.out.println("26. Eliminar Práctica hecha"); 
        System.out.println("27. Eliminar Examen realizado"); 
        System.out.println("28. Eliminar Práctica diseñada"); 
        System.out.println();   
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    //MOSTRAR LISTAS

    public void mostrarAlumnos(List<Alumnos> alumnos) {
        alumnos.forEach(System.out::println);
    }

    public void mostrarProfesores(List<Profesores> profesores) {
        profesores.forEach(System.out::println);
    }

    public void mostrarExamenes(List<ExamenTeorico> examenes) {
        examenes.forEach(System.out::println);
    }

    public void mostrarPracticas(List<Practica> practicas) {
        practicas.forEach(System.out::println);
    }

    //MOSTRAR 1 OBJETO

    public void mostrarAlumno(Alumnos a) {
        System.out.println(a);
    }

    public void mostrarProfesor(Profesores p) {
        System.out.println(p);
    }

    public void mostrarExamen(ExamenTeorico e) {
        System.out.println(e);
    }

    public void mostrarPractica(Practica p) {
        System.out.println(p);
    }

    //MOSTRAR DE RELACIONES N:M

    public void mostrarExamenesHechos(List<Alumno_Hace_ExamenT> lista) {
        for (Alumno_Hace_ExamenT a : lista) {
            System.out.println(a);
        }
    }

    public void mostrarExamenHecho(Alumno_Hace_ExamenT a) {
        System.out.println(a);
    }

    public void mostrarPracticasHechas(List<Alumnos_Realiza_Practica> lista) {
        for (Alumnos_Realiza_Practica p : lista) {
            System.out.println(p);
        }
    }

    public void mostrarPracticaHecha(Alumnos_Realiza_Practica p) {
        System.out.println(p);
    }

    public void mostrarPracticasDiseNiadas(List<Profesor_Diseña_Practica> lista) {
        for (Profesor_Diseña_Practica p : lista) {
            System.out.println(p);
        }
    }

    public void mostrarPracticaDiseNiada(Profesor_Diseña_Practica p) {
        System.out.println(p);
    }

    //REFERENTES AL ID

    public int pedirIdAlumno() {
        System.out.print("ID del alumno: ");
        return sc.nextInt();
    }

    public int pedirIdProfesor() {
        System.out.print("ID del profesor: ");
        return sc.nextInt();
    }

    public int pedirIdExamen() {
        System.out.print("ID del examen: ");
        return sc.nextInt();
    }

    public int pedirIdPractica() {
        System.out.print("ID de la práctica: ");
        return sc.nextInt();
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    //MENSAJE

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    //INSERTAR DATOS

    public Alumnos pedirNuevoAlumno() {
        System.out.print("ID del alumno: ");
        int id = sc.nextInt();
        sc.nextLine(); //Consumir
        System.out.print("NIF del alumno: ");
        String nif = sc.nextLine();
        System.out.print("Grupo del alumno: ");
        String grupo = sc.nextLine();
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1 del alumno: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido2 del alumno: ");
        String apellido2 = sc.nextLine();
        return new Alumnos(id, nif, grupo, nombre, apellido1, apellido2);
    }

    public Profesores pedirNuevoProfesor() {

        System.out.println("ID de Profesor: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("NIF del Profesor: ");
        String nif = sc.nextLine();

        System.out.println("Nombre del Profesor: ");
        String nomb = sc.nextLine();

        System.out.println("1er Apellido: ");
        String ape1 = sc.nextLine();

        System.out.println("2do Apellido: ");
        String ape2 = sc.nextLine();
        
        return new Profesores(id, nif, nomb, ape1, ape2);
    }

    public ExamenTeorico pedirExamenTeorico() {

        System.out.println("ID_ExamenT: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Titulo del Examen: ");
        String tit = sc.nextLine();

        System.out.println("#Preguntas: ");
        int numPreg = sc.nextInt();
        sc.nextLine();

        System.out.print("Fecha (yyyy-mm-dd): ");
        Date fecha = Date.valueOf(sc.nextLine());

        // System.out.println("Fecha (yyyy-mm-dd): ");
        // String fech = sc.nextLine();

        // Date fecha = null;
        // try {
        // fecha = Date.valueOf(fech);
        // } catch (IllegalArgumentException ex) {
        // System.out.println("Formato incorrecto. Usa yyyy-mm-dd");
        // }

        System.out.println("ID_Profesor: ");
        int id_prof = sc.nextInt();

        return new ExamenTeorico(id, tit, numPreg, fecha, id_prof);
    }

    public Practica pedirNuevaPractica() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();

        return new Practica(id, titulo, dificultad);
    }

    //INSERTAR DE N:M

    public Alumno_Hace_ExamenT pedirExamenHecho() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Examen: ");
        int idExamen = sc.nextInt();

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        return new Alumno_Hace_ExamenT(idAlumno, idExamen, nota);
    }

    public Alumnos_Realiza_Practica pedirPracticaHecha() {
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();

        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        sc.nextLine();
        System.out.print("Fecha (yyyy-mm-dd): ");
        String fecha = sc.nextLine();

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        return new Alumnos_Realiza_Practica(idAlumno, idPractica, fecha, nota);
    }

    public Profesor_Diseña_Practica pedirPracticaDiseNiada() {
        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();

        sc.nextLine();
        System.out.print("Fecha (anio-mes-dia): ");
        String fecha = sc.nextLine();

        return new Profesor_Diseña_Practica(idPractica, idProfesor, fecha);
    }

}
