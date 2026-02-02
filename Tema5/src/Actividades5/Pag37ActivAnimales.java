package Actividades5;

import Actividades5.clases.Caballo;
import Actividades5.clases.Perro;
import Actividades5.clases.Gato;

//Gato, Perro y Caballo se encuentran en la caperta aledaña Clases
//Main

public class Pag37ActivAnimales {
    public static void main(String[] args) {
        
        //Crear Obj1
        Perro p1 = new Perro("Firulais", "piendo", 3, 63, "Labrador");

        //Crear Obj2
        Caballo c1 = new Caballo("Spirit", "Heno", 5, 11, "Hierba", 2);
        
        //Crear Obj3
        Gato g1 = new Gato("Garfield", "pienso", 3, 65, "Pelirojo");

        System.out.println(p1); 
        System.out.println(g1);   
        System.out.println(c1);  
    }
}

