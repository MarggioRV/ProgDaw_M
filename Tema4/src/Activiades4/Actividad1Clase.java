package Activiades4;

import Activiades4.actividadesClases.Persona;
import Activiades4.actividadesClases.Cuenta;

public class Actividad1Clase {
    public static void main(String[] args) {
        Persona cliente=new Persona("Pedro","123456789A","31/1/2024","mi casa",true,true);
        Cuenta cuentaBancaria = new Cuenta("432552435245243545",2500,cliente);

        //Area_impresion
        cliente.imprimePersona();
        cuentaBancaria.imprimeCuenta();
    }
}
