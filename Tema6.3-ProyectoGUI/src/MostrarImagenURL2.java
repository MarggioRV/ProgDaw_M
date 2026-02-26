import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MostrarImagenURL2 extends JFrame {

    private ImageIcon icono;

    public MostrarImagenURL2() {
        initComponents();
    }

    public void initComponents() {

        // Pedir la ruta completa al usuario con un diálogo
        String rutaArchivo = JOptionPane.showInputDialog(
                null,
                "Introduce la ruta completa del archivo de imagen:",
                "Cargar Imagen",
                JOptionPane.QUESTION_MESSAGE);

        setTitle("Imagen cargada");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            if (rutaArchivo == null || rutaArchivo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "No se proporcionó ninguna ruta.",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            File archivo = new File(rutaArchivo);

            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(
                        this,
                        "El archivo no existe:\n" + rutaArchivo,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            //GIF sin escalar para mantener animación
            if (rutaArchivo.toLowerCase().endsWith(".gif")) {
                icono = new ImageIcon(rutaArchivo);
            } else {
                BufferedImage img = ImageIO.read(archivo);
                if (img != null) {
                    icono = new ImageIcon(img);
                }
            }

            if (icono == null || icono.getIconWidth() <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "No se pudo cargar la imagen.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            JLabel label = new JLabel(icono);
            label.setHorizontalAlignment(JLabel.CENTER);
            add(label);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar la imagen:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        MostrarImagenURL2 m2 = new MostrarImagenURL2();
    }
}