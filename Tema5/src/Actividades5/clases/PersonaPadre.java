package Actividades5.clases;

public class PersonaPadre {
    
    class Persona {
        public String nombre;
        public int edad;
        public double altura;

        Persona(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        public void imprimeDatos() {
            System.out.println(this.nombre);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        
    }
    
}
