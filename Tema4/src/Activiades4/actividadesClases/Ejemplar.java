package Activiades4.actividadesClases;

public class Ejemplar {

    //Atributos
    String fecha;
    int num_pagina,num_ejemplares;
    Revista revista=null;

    //Constructores
    public Ejemplar(){
    }

    public Ejemplar(String fecha, int num_pagina, int num_ejemplares) {
        this.fecha = fecha;
        this.num_pagina = num_pagina;
        this.num_ejemplares = num_ejemplares;
    }

    //Getters y Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNum_pagina() {
        return num_pagina;
    }

    public void setNum_pagina(int num_pagina) {
        this.num_pagina = num_pagina;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        if(revista!=null)
            return "Ejemplar [fecha=" + fecha + ", num_pagina=" + num_pagina + ", num_ejemplares=" + num_ejemplares + "]"+revista.toString();
        else return "Ejemplar [fecha=" + fecha + ", num_pagina=" + num_pagina + ", num_ejemplares=" + num_ejemplares + "]";
    }
}
