package Activiades4;

import Activiades4.actividadesClases.Especialidad;
import Activiades4.actividadesClases.Locomotora;
import Activiades4.actividadesClases.Maquinista;
import Activiades4.actividadesClases.Mecanico;
import Activiades4.actividadesClases.Tren;
import Activiades4.actividadesClases.Vagon;

public class Actividad7Tren {
    public static void main(String[] args) throws Exception {
        Mecanico mec1=new Mecanico("Antonio", "2222222B", "950418596", Especialidad.ELECTRIDAD);
        Maquinista maq1=new Maquinista("Adrián", "111111111Q","coronel", 1500);
        Locomotora loc1=new Locomotora("11111aaaa", 2000, "22/02/1983");
        
        loc1.setMecanico(mec1);
        Vagon[] vagon1=new Vagon[3];
        
        //Asignacion_Vagones
        for (int i=0;i<vagon1.length;i++){
            vagon1[i]=new Vagon(i, 10*150*i, 1500+i*20,"madera");//Completado con lo que haya BD
        }
        Tren tren1= new Tren();

        tren1.setLocomotora(loc1);
        tren1.setVagones(vagon1);
        tren1.setMaquinista(maq1);

        System.out.println(tren1);
    }
}
