package Actividades5.clases;

public abstract class Figura {
    protected String color;

    public Figura(){}

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double area();
    abstract double perímetro();


}
