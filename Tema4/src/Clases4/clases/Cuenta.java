package Clases4.clases;
// Clases.src.clases;
public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(){

    }
    public Cuenta(String numeroCuenta,double saldo,Persona p){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.cliente=p;
    }

    //Getters y Setters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void imprimeCuenta(){
        System.out.println("Número de cuenta bancaria: "+this.numeroCuenta);
        System.out.println("Saldo de la cuenta: "+this.saldo);
        this.cliente.imprimePersona();
    }
    
}
