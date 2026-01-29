package Activiades4;

import Activiades4.actividadesClases.Categoria;
import Activiades4.actividadesClases.Pieza;
import Activiades4.actividadesClases.Proveedor;
import Activiades4.actividadesClases.ProveedorSuministraPieza;

public class Actividad3Proveedores {
    public static void main(String[] args) {
        
        //Crear CATEGORIA
        Categoria cat=new Categoria(1,"engranajes");
        System.out.println(cat.toString());
        
        //Crear proveedor
        Proveedor prove=new Proveedor(1,"Almeria","12_olivares","Vera");
        System.out.println(prove.toString());
        
        //Crear la pieza
        Pieza pieza = new Pieza(1,"tuerca","naranja",15.00);
        pieza.setCat(cat);
        System.out.println(pieza.toString());

        //Relación de suministra
        ProveedorSuministraPieza suministro = new ProveedorSuministraPieza(pieza,prove,45,"15/10/2025");
        System.out.println(suministro.toString());
    }
}

