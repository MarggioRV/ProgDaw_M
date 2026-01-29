package Activiades4;

import Activiades4.actividadesClases.Batalla;

public class ActividadJuegoMedieval {
    public static void main(String[] args) {
        //llamadas, de clase Batalla
        Batalla batalla = new Batalla();
        batalla.MostraMenu(null, null, null);
        batalla.iniciarBatalla();
    }
}
