package Actividades5.clases;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {

    private ArrayList<Personaje> heroes = new ArrayList<>();
    private ArrayList<Personaje> orcos = new ArrayList<>();

    public Batalla() {
        
        //Personajes_Base
        heroes.add(new Caballero("Arthur", 100));
        heroes.add(new Mago("Merlín", 80));

        orcos.add(new Orco("Grom", 120));
        orcos.add(new Orco("Thrall", 110));
    }

    public void iniciar() {
        Random r = new Random();

        while (!heroes.isEmpty() && !orcos.isEmpty()) {

            //Tomar al azar, ramdon, un personaje de cada Bando
            Personaje h = heroes.get(r.nextInt(heroes.size()));
            Personaje o = orcos.get(r.nextInt(orcos.size()));

            //Vs_Designado
            System.out.println("\n" + h + " VS " + o);

            //Gestion_Daño
            int dañoHeroe = h.atacar();
            int dañoOrco = o.atacar();
            o.recibirDaño(dañoHeroe);
            h.recibirDaño(dañoOrco);
            //Comprobacion_Daño
            System.out.println(h.nombre + " hace " + dañoHeroe + " de daño.");
            System.out.println(o.nombre + " hace " + dañoOrco + " de daño.");

            //Comprobacion_estaVivo
            if (!h.estaVivo()) {
                System.out.println(h.nombre + " ha muerto.");
                heroes.remove(h);
            }

            if (!o.estaVivo()) {
                System.out.println(o.nombre + " ha muerto.");
                orcos.remove(o);
            }
        }

        //Imprimir RPTA
        System.out.println("\n--- RESULTADO FINAL ---");
        if (heroes.isEmpty() && orcos.isEmpty()) {
            System.out.println("Empate total.");
        } else if (heroes.isEmpty()) {
            System.out.println("Los orcos ganan.");
        } else {
            System.out.println("Los héroes ganan.");
        }
    }
}
