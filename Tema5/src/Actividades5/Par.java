package Actividades5;

public class Par<K,V> {
    private K clave;
    private V valor;

    public Par(){}
    public Par(K clave, V valor){
        this.clave=clave;
        this.valor=valor;
    }

    public K getClave() {
        return clave;
    }
    public V getValor() {
        return valor;
    }
    public void setClave(K clave) {
        this.clave = clave;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }
    public void mostrarPar(){
        System.out.println("Clave: "+clave+ " Valor: "+valor);
    }

    public static void main(String[] args) {
        Par<String,Integer> par1=new Par<>("Almería",1);
        par1.mostrarPar();

        Par<Integer,Integer> par2=new Par<>(3,1);
        par2.mostrarPar();
    }
}
