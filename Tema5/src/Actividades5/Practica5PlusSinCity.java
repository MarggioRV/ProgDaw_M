package Actividades5;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Practica5PlusSinCity {
        public static void main(String[] args) {
        // Rutas de entrada y salida
        String rutaEntrada = "src/images/IT2.jpg";
        String rutaSalida = "src/images/IT2_B.jpg";

        try {
            //Leer imagen JPEG
            BufferedImage imagenColor = ImageIO.read(new File(rutaEntrada));
            if (imagenColor == null) {
                System.out.println("No se pudo leer la imagen. Verifica la ruta y el archivo.");
                return;
            }
            //Crear una imagen en escala de grises
            BufferedImage imagenGris = new BufferedImage(
                imagenColor.getWidth(),
                imagenColor.getHeight(),
                BufferedImage.TYPE_INT_RGB
            );

            /* ===Convertir pixel por pixel a escala de grises=== */

            //Vb para el color final que se aplicará al pixel
            int nuevoColor;

             //For compuesto para recorer toda la imagen, fila x fila y colum x colum
            for (int y = 0; y < imagenColor.getHeight(); y++) {
                for (int x = 0; x < imagenColor.getWidth(); x++) {
                    
                    //Se obtiene el color del píxel actual en la posición (x, y)
                    Color color = new Color(imagenColor.getRGB(x, y));
                    
                    //Se evalúa si el píxel es dominantemente rojo (Comparando)
                    boolean esRojo =    (color.getRed() > color.getGreen() * 1.5) && 
                                        (color.getRed() > color.getBlue() * 1.5) && 
                                        (color.getRed() > 60);

                    //Se calcula el valor de gris usando la fórmula ponderada de luminancia perceptual (+Valor verde)
                    int gris = (int)(color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);
                    
                    /* Alternativa, usando el prodemio aritmetico de los 3 canales, -preciso */
                    //int gris = (int)(color.getRed() + color.getGreen() + color.getBlue())/3;

                    //Si el píxel es rojo dominante → se conserva el rojo y se aplica gris en verde y azul
                    // if(esRojo){nuevoColor = new Color(color.getRed(), gris,gris).getRGB();}

                    //AlternativaB: No se modifica el píxel rojo dominante
                    if(esRojo){nuevoColor = color.getRGB();}
                    
                    //Si no → se convierte completamente a gris
                    else nuevoColor = new Color(gris, gris,gris).getRGB();

                    //Se asigna el color final al píxel correspondiente en la imagen de salida.
                    imagenGris.setRGB(x, y, nuevoColor);
                }
            }
            //Guardar como PNG
            boolean resultado = ImageIO.write(imagenGris, "png", new File(rutaSalida));
            if (resultado) {
                System.out.println("Conversión completada: imagen en escala de grises guardada como " + rutaSalida);
            } else {
                System.out.println("No fue posible guardar la imagen.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
        }
    }
}
