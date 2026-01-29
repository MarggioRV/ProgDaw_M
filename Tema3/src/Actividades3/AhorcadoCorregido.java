package Actividades3;

import java.util.Scanner;

public class AhorcadoCorregido {
        public static void main(String[] args){
       
        Scanner teclado=new Scanner(System.in);
        
        //Lsta_palabras
        String palabras[]={"Graciela","domingo","Luis","Leonardo","Goku","Nando","Po","Marggio"};
        
        //Hay que elegir 1
        int aleatorio=(int)(Math.random()*(palabras.length-1+1));
        String elegida=palabras[aleatorio];
        System.out.println(elegida);
        
        //Conversion a char y a *
        char palabraOculta[]=new char[elegida.length()];
        for(int i=0;i<palabraOculta.length;i++){
            palabraOculta[i]='*';
        }

        //Control de fallos, y solucion
        boolean encontrada=false;
        int fallos=0;
        final int FALLOS=7;

        //Inicio del juego
        System.out.println("Bienvenido al juego del ahorcado!!");
        do{
            System.out.println("Introduce una letra para adivinar la palabra");
            System.out.println("Ahora mismo tienes "+fallos+" fallos");
            for(int i=0;i<palabraOculta.length;i++){
                System.out.print(palabraOculta[i]);
            }
            System.out.println();
            System.out.print("Introduce la letra: ");
            String letra=teclado.nextLine();

            //Busco si letra está en la palabra elegida
            if(elegida.contains(letra)){
                System.out.println("La letra está en la palabra");
                for(int i=0;i<elegida.length();i++){
                    if(elegida.charAt(i)==letra.charAt(0))
                        palabraOculta[i]=letra.charAt(0);
             
                } 
            //Fallo de no estar  
            } 
            else{
                System.out.println("La letra no está en la palabra");
                fallos++;
                Correspondencia(fallos);
            }

            //Compruebacion_PuntoPositivo
            int contador=0;
            for(int i=0;i<palabraOculta.length;i++){
                if(palabraOculta[i]=='*') contador++;
            }
            if(contador==0){
                encontrada=true;
            }

        } while(!encontrada && fallos!=FALLOS);
        
        //Game Over
        if(encontrada){
            System.out.println("ENHORABUENA!! HAS GANADO!!");
        }
        else{
            System.out.println("QUÉ PENA!! HAS PERDIDO!!");
        }
        teclado.close();
    }
    
    //Dibujo del ahorcado según fallos
    public static void Correspondencia(int fallos) {

        if (fallos == 7) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |           O");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 6) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |          /|\\");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }

        else if (fallos == 5) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |           |");
            System.out.println("  |           |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 4) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |          / \\");
            System.out.println("_____________________");
        }
        
        else if (fallos == 3) {
            System.out.println("_____________________");
            System.out.println("  |           |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }

        else if (fallos == 2) {
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("_____________________");
        }
        
        else if (fallos == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("_____________________");
        }
    }
}
