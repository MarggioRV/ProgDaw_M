package Activiades4;

import Activiades4.actividadesClases.*;

public class Actividad4Clase{
    public static void main(String[] args) {
        Periodista periodista1 = new Periodista(1,"Domingo","López Oller","666778899","Investigacion");
        Periodista periodista2 = new Periodista(2,"José Miguel","López López","666778899","Deportes");

        Revista revista1=new Revista(1,"AS","Deporte","Diario");
        Revista revista2=new Revista(2,"ABC","Periódico","Diario");
        Seccion seccion= new Seccion("deporte","123");
        Ejemplar ejemplar = new Ejemplar("18/11/2025",10,3);
        seccion.setRevista(revista1); ejemplar.setRevista(revista2);


        Sucursal sucursal = new Sucursal(1,"DIRECCIÓN","950112233","Huércal Overa","Almería");
        Sucursal sucursal2 = new Sucursal(2,"DIRECCIÓN","950112233","Huércal Overa","Almería");
        Empleado[] emp=new Empleado[5];
        Empleado emp1=new Empleado(1,"111111111","Álvaro","asdfasd","123456789");
        Empleado emp2=new Empleado(2,"222222222","Ántonio","asdfasd","123456789");
        Empleado emp3=new Empleado(3,"333333333","Pedro","asdfasd","123456789");
        emp1.setTrabajo(sucursal); emp2.setTrabajo(sucursal); emp3.setTrabajo(sucursal2);
        emp[0]=emp1;emp[1]=emp2;emp[2]=emp3;


        Publica[] publicaciones = new Publica[5];
        Publica p1=new Publica(sucursal,revista1);
        Publica p2=new Publica(sucursal,revista2);
        publicaciones[0]=p1;
        publicaciones[1]=p2;

        Escribe[] escribir = new Escribe[3];
        Escribe e1=new Escribe(periodista1,revista1);
        Escribe e2=new Escribe(periodista2,revista2);
        escribir[0]=e1;
        escribir[1]=e2;

        System.out.println(periodista1);

        //System.out.println(emp1);
        //En caso de ser solo 1 un arreglo:
        //Empleado[] emp = {emp1, emp2, emp3};

        //Obtener los empleados que trabajan en la sucursal 1
        for(int i=0;i<emp.length;i++){
             if(emp[i].getTrabajo()
               .getCodigo()==1)
            System.out.println(emp1);
        }
    }
}