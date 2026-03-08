package Modelo;

public class Sucursal {
    int codigo;
    String direccion, telefono, ciudad, provincia;

    public Sucursal(){}

    public Sucursal(int codigo, String direccion, String telefono, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

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
    
}
