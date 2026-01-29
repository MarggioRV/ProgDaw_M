package Clases4.clases;
public class CuentaCorriente {
    String numeroCuenta;
    double saldo;
    Persona cliente;
    

    public CuentaCorriente(){
    }

    public CuentaCorriente(String numeroCuenta,double saldo,Persona p){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.cliente=p;
    }
}
