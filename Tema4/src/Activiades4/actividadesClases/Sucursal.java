package Activiades4.actividadesClases;

import java.util.ArrayList;

public class Sucursal {

    //Atributos

    private int codigo;
    private String direccion, telefono, ciudad, provincia;

    //Constructores

    public Sucursal(){}

    public Sucursal(int codigo, String direccion, String telefono, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    //Getters y Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Sucursal [codigo=" + codigo + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad="
                + ciudad + ", provincia=" + provincia + "]";
    }
    
    //Metodos

    //Func para filtrar vueelos de la surcusal por su clase
    public void VuelosClase(ArrayList<Toma> tomas) {
        for (int i = 0; i < tomas.size(); i++) {
            Toma t = tomas.get(i);

            if (t.getSucursal().equals(this)) {
                Toma.ClaseVuelo claseActual = t.getClase();

                System.out.print("Los vuelos ofrecidos por la sucursal " + this.getCodigo() + ", de clase " + claseActual + ", son: ");

                for (int j = 0; j < tomas.size(); j++) {
                    Toma otra = tomas.get(j);
                    if (otra.getSucursal().equals(this) && otra.getClase() == claseActual) {
                        System.out.print(otra.getVuelo() + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
