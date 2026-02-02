package Actividades5;

public class Caja<T> {
    private T contenido;

    public Caja(){}
    public Caja(T dato){
        this.contenido=dato;
    }
    public void guardar(T valor){
        this.contenido=valor;
    }
    public T obtener(){
        return contenido;
    }

    public static void main(String[] args) {
        Caja<Integer> caja1 = new Caja<Integer>();
        caja1.guardar(3);

        Caja<String> caja2=new Caja<>();
        caja2.guardar("Domingo");
        
    }
}
