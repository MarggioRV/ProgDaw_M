package Modelo;

import java.sql.Date;

public class Cesta {
    //Atributos
    protected int id;
    protected Date fecha_compra;
    //FK
    protected Integer id_cliente;
    
    public Cesta(int id, Date fecha_compra, Integer id_cliente) {
        this.id = id;
        this.fecha_compra = fecha_compra;
        this.id_cliente = id_cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Cesta [id=" + id + ", fecha_compra=" + fecha_compra + ", id_cliente=" + id_cliente + "]";
    }

    
}
