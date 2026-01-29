package Actividades5;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Practica6PlusUmbral {
    public static void main(String[] args) {

        String rutaEntrada = "src/images/Pred.jpg";
        String rutaSalida  = "src/images/PredC.png";

        try {
            BufferedImage imagenColor = ImageIO.read(new File(rutaEntrada));
            if (imagenColor == null) {
                System.out.println("No se pudo leer la imagen. Verifica la ruta y el archivo.");
                return;
            }

            BufferedImage imagenSalida = new BufferedImage(
                imagenColor.getWidth(),
                imagenColor.getHeight(),
                BufferedImage.TYPE_INT_RGB
            );

            int nuevoColor;

            for (int y = 0; y < imagenColor.getHeight(); y++) {
                for (int x = 0; x < imagenColor.getWidth(); x++) {

                    Color color = new Color(imagenColor.getRGB(x, y));

                    // ============================================================
                    /* OPCIÓN 1 — SOLO CANAL ROJO (R,0,0) */
                    // ============================================================
                    // int r = color.getRed();
                    // nuevoColor = new Color(r, 0, 0).getRGB();


                    // ============================================================
                    /* OPCIÓN 2 — SOLO CANAL VERDE (0,G,0) */
                    // ============================================================
                    // int g = color.getGreen();
                    // nuevoColor = new Color(0, g, 0).getRGB();


                    // ============================================================
                    /* OPCIÓN 3 — SOLO CANAL AZUL (0,0,B) */
                    // ============================================================
                    int b = color.getBlue();
                    nuevoColor = new Color(0, 0, b).getRGB();


                    // ============================================================
                    /* OPCIÓN 4 — EFECTO SIN CITY (rojo intacto + fondo gris) */
                    // ============================================================
                    // int gris = (int)(color.getRed() * 0.3 +
                    //                  color.getGreen() * 0.59 +
                    //                  color.getBlue() * 0.11);

                    // boolean esRojo = (color.getRed() > color.getGreen() * 1.5) &&
                    //                  (color.getRed() > color.getBlue() * 1.5) &&
                    //                  (color.getRed() > 60);

                    // if (esRojo) {
                    //     nuevoColor = color.getRGB();  // rojo intacto
                    // } else {
                    //     nuevoColor = new Color(gris, gris, gris).getRGB();
                    // }
                    // ============================================================


                    imagenSalida.setRGB(x, y, nuevoColor);
                }
            }

            boolean resultado = ImageIO.write(imagenSalida, "png", new File(rutaSalida));
            if (resultado) {
                System.out.println("Imagen generada correctamente en: " + rutaSalida);
            } else {
                System.out.println("No fue posible guardar la imagen.");
            }

        } catch (IOException e) {
            System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
        }
    }
}
