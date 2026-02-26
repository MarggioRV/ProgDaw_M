import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.net.URI;
import java.net.URL;
import javax.imageio.ImageIO;

public class MostrarImagenURL3 extends JFrame {
    
    //Inicio
    public void inicio() {

        ImageIcon imagenFinal = pedirImagen();

        //si no hay imagen, volvemos a mostrar el diálogo
        if (imagenFinal == null) {
            inicio();
            return;
        }
        mostrarImagen(imagenFinal);
    }

    //Pedir imagen
    private ImageIcon pedirImagen() {

        JTextField campoURL = new JTextField();
        Object[] botones = {"OK", "Cancelar", "Examinar"};

        int opcion = JOptionPane.showOptionDialog(
                null,
                campoURL,
                "Introduce la URL de la imagen:",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botones,
                botones[0]
        );

        //X par cerrar 
        if (opcion == JOptionPane.CLOSED_OPTION) {
            System.exit(0);
        }

        //CANCELAR 1 
        if (opcion == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Programa Abortado...",
                    "Abortado",
                    JOptionPane.WARNING_MESSAGE
            );
            System.exit(0);
        }

        //EXAMINAR, para abrir JFileChooser
        if (opcion == 2) {
            return cargarDesdeArchivo();
        }

        //OK, para  validar URL
        String urlTexto = campoURL.getText().trim();

        if (urlTexto.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "No se proporcionó URL.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return null;
        }

        try {
            URL url = URI.create(urlTexto).toURL();
            ImageIcon icono = new ImageIcon(url);

            if (icono.getIconWidth() <= 0) {
                throw new Exception("Imagen inválida.");
            }

            return icono;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "URL inválida o imagen no cargada.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return null;
        }
    }

    //CARGAR, desde el archivador
    private ImageIcon cargarDesdeArchivo() {

        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter(
                "Imágenes (jpg, jpeg, png, gif)", "jpg", "jpeg", "png", "gif"
        ));

        int r = fc.showOpenDialog(null);

        //CANCELAR 2 (En JFileChooser, para retroceder)
        if (r != JFileChooser.APPROVE_OPTION) {
            return null;
        }

        File archivo = fc.getSelectedFile();

        try {
            Image img = ImageIO.read(archivo);

            if (img == null) {
                throw new Exception("Archivo no es una imagen válida.");
            }

            // gif animado → no escalar
            if (archivo.getName().toLowerCase().endsWith(".gif")) {
                return new ImageIcon(archivo.getAbsolutePath());
            }

            return escalarProporcional(img);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Archivo inválido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return null;
        }
    }

    //Tratamiento_Imagen (Con escalado)
    private ImageIcon escalarProporcional(Image img) {

        int maxW = 550;
        int maxH = 350;

        int w = img.getWidth(null);
        int h = img.getHeight(null);

        //Ratio mínimo para que quepa en el rectángulo sin deformarse
        double ratio = Math.min((double) maxW / w, (double) maxH / h);

        int newW = (int) (w * ratio);
        int newH = (int) (h * ratio);

        Image scaled = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

    //Mostrar Imagen
    private void mostrarImagen(ImageIcon icono) {

        setTitle("Imagen cargada");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel(icono);
        add(label);

        setVisible(true);
    }

    //Main
        public static void main(String[] args) {
        new MostrarImagenURL3().inicio();
    }
}
