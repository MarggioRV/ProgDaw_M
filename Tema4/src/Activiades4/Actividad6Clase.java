package Activiades4;

import Activiades4.actividadesClases.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Actividad6Clase {
    public static void main(String[] args) {
        
        //Crear Objetos
        //V1
        Hotel h1 = new Hotel(123, "Lucario", "555-482-9173", 14, "Madrid", "MiguelGrau");
        Turista t1 = new Turista(1, "SanMercedes12", "Ana", "Fernandez", "Zeballos", "66-482-9173");
        Vuelo v1 = new Vuelo(1, LocalDate.of(2025,12,20), LocalTime.of(10,30), "Madrid", "Almería", 150);
        Sucursal s1 = new Sucursal(101, "Av. Pacifico", "667-482-9321", "Almería", "Almería");
        
        //V2
        Hotel h2 = new Hotel(124, "Pikachu", "661-482-8873", 14, "Madrid", "MiguelGrau");
        Turista t2 = new Turista(2, "SanMarcos", "Marco", "Lenteja", "Zeballos", "66-482-9173");
        Vuelo v2 = new Vuelo(2, LocalDate.of(2025,12,20), LocalTime.of(10,30), "Madrid", "Almería", 150);
        Sucursal s2 = new Sucursal(111, "Av. Mediterráneo", "950-654-321", "Almería", "Almería");

        //V3
        Hotel h3 = new Hotel(125, "Snorlax", "911-223-344", 10, "Barcelona", "Paseo de Gracia");
        Turista t3 = new Turista(3, "ViajeroFeliz", "Carlos", "Ruiz", "Pérez", "655-443-322");
        Vuelo v3 = new Vuelo(3, LocalDate.of(2026, 1, 15), LocalTime.of(15, 0), "Barcelona", "Sevilla", 120);
        Sucursal s3 = new Sucursal(121, "Calle Larios", "952-112-233", "Málaga", "Málaga"); 

        //LLamadas

        //Como estan denclarados en el main, falla al integrarlos en su clase
        ArrayList<Toma> tomado = new ArrayList<>();
        tomado.add(new Toma(t1, s1, v1, Toma.ClaseVuelo.TURISTA));
        tomado.add(new Toma(t3, s1, v3, Toma.ClaseVuelo.PREMIUM));

        //Ifual, pero con Reservas
        ArrayList<Reserva> reservas = new ArrayList<>();
        reservas.add(new Reserva(h1, t1, s1, LocalDate.of(2025,12,20), LocalDate.of(2025,12,25), "Media"));
        reservas.add(new Reserva(h2, t2, s2, LocalDate.of(2025,12,21), LocalDate.of(2025,12,26), "Todo"));
        reservas.add(new Reserva(h3, t3, s3, LocalDate.of(2026,1,15), LocalDate.of(2026,1,20), "Spuer"));

        //Demás 

        //1ero, turista a bordo
        System.out.println("Turistas a bordo de " + v1.getID_vuelo() + ": " + v1.turistasAbordo(tomado));
        System.out.println("Turistas a bordo de " + v2.getID_vuelo() + ": " + v2.turistasAbordo(tomado));
        System.out.println("Turistas a bordo de " + v3.getID_vuelo() + ": " + v3.turistasAbordo(tomado));

        //2do, Hospedados en cada hotel
        s1.VuelosClase(tomado);
        System.out.println(h1.turistasHospedados(reservas)); 
        System.out.println(h2.turistasHospedados(reservas)); 
        System.out.println(h3.turistasHospedados(reservas)); 
        System.out.println(v1.turistasAbordo(tomado));        
        System.out.println(v2.turistasAbordo(tomado));        
        System.out.println(v3.turistasAbordo(tomado));
    }

}
