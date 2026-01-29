
public class PracticaDias {
    public static void main(String[] args) {
        // Practica: Solo ejecuta el switch si el número es entero
        
        int dias = 1; /*Por definición, Int solo acepta N*Enteros*/

        // Condicional x
        if (dias < 1 || dias > 7) 
        {
            System.out.println("No es un día válido");
            return; 
        }

        /*Condicional para N* Pares
        else if (dias % 2 == 0)*/
        
        /*Condicional para N*Enteros
        if (dias % 1 == 0)*/
    
        /*El switch ejecuta hacia abajo desde el primero que coincida. 
        El error, referido, es fall-through (SinBreak) pero con el switch moderno (Con ->), se puede evitar */

        {
            switch (dias) 
            { 
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            }
        } 
    }
}