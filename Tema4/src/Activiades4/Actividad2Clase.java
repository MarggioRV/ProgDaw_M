package Activiades4;

import Activiades4.actividadesClases.Ciudad;
import Activiades4.actividadesClases.Fecha;
import Activiades4.actividadesClases.Persona2;

public class Actividad2Clase {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad(150, "Medellín", 4);
        Fecha fecha1 = new Fecha(1,1,2001);
        
        //Crear persona
        Persona2 p1 = new Persona2("Carlos", "12345678A", "Gómez", 'M');
        p1.setFecha(fecha1);
        p1.CiudadNacimiento(ciudad1);

        //Usar Metdos e Imprimir
        p1.saludar();
        System.out.println("-----------------------------");
        p1.imprimeDatos();
        System.out.println("-----------------------------");
    }
}   
