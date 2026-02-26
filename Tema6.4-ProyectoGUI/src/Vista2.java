import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URL;
import javax.imageio.ImageIO;

public class Vista2 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Vista.class.getName());

    public Vista2() {
        initComponents();
        configurarEventos();
    }

    // ==========================
    // initComponents COMPLETO
    // ==========================
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();

        // LISTENERS AÑADIDOS
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(e -> seleccionarImagen());

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        textField11 = new java.awt.TextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        textArea1 = new java.awt.TextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 858, Short.MAX_VALUE));
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        label1.setText("label1");
        label2.setText("label2");
        label3.setText("label3");
        label4.setText("label4");
        label5.setText("label5");
        label6.setText("label6");

        textField1.setText("textField1");
        textField1.addActionListener(this::textField1ActionPerformed);

        textField7.setText("textField7");

        textField11.setText("textField11");
        textField11.addActionListener(this::textField11ActionPerformed);

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        jRadioButton2.setText("jRadioButton2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        jCheckBox1.setText("Acepta Terminos y Condiciones");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);

        jButton1.setText("jButton1");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("jButton2");

        jButton3.setText("E");

        // ==========================
        // LAYOUT COMPLETO DE jPanel2
        // (TAL COMO LO ENVIASTE)
        // ==========================
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                .createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label4,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label6,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout
                                                .createSequentialGroup()
                                                .addContainerGap(
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(jCheckBox1)
                                                .addGap(48, 48, 48)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textField1,
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        194,
                                                        Short.MAX_VALUE)
                                                .addComponent(textField7,
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout
                                                .createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2))
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel2Layout
                                                        .createSequentialGroup()
                                                        .addComponent(textField11,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                168,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                0,
                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                        jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(textArea1,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        228,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jComboBox3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(24, 24, 24)))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                .createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(72, 72, 72)));

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField7,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton1)
                                                .addComponent(jRadioButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label5,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label6,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(textField11,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jButton3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(16, 16, 16)));

        // ==========================
        // jPanel3 COMPLETO
        // ==========================
        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("jLabel2");
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        227,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(textArea2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                245,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jProgressBar1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        154,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                .createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textArea2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        152,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        101,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addComponent(jProgressBar1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        12,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)));

        jLabel1.setText("Formulario de Usuarios");

        // ==========================
        // LAYOUT PRINCIPAL
        // ==========================
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING,
                                        false)
                                        .addComponent(jPanel3,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jPanel2,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(8, 8, 8)));

        pack();
    }

    // ==========================
// LÓGICA COMPLETA
// ==========================

// Cargar imagen desde archivo (botón E)
private ImageIcon cargarDesdeArchivo() {

    JFileChooser fc = new JFileChooser();
    fc.setFileFilter(new FileNameExtensionFilter(
            "Imágenes (jpg, jpeg, png, gif)", "jpg", "jpeg", "png", "gif"));

    int r = fc.showOpenDialog(this);

    if (r != JFileChooser.APPROVE_OPTION) {
        return null; // Cancelado
    }

    File archivo = fc.getSelectedFile();

    try {
        Image img = ImageIO.read(archivo);

        if (img == null) {
            throw new Exception("Archivo no es una imagen válida.");
        }

        // GIF → no escalar
        if (archivo.getName().toLowerCase().endsWith(".gif")) {
            ImageIcon iconoGif = new ImageIcon(archivo.getAbsolutePath());
            mostrarImagen(iconoGif);
            textField11.setText(archivo.getAbsolutePath());
            return iconoGif;
        }

        ImageIcon iconoEscalado = escalarProporcional(img);
        mostrarImagen(iconoEscalado);
        textField11.setText(archivo.getAbsolutePath());
        return iconoEscalado;

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Archivo inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}

// Pedir imagen (solo botón E)
private ImageIcon pedirImagen() {

    JTextField campoURL = new JTextField();
    Object[] botones = { "E" };

    int opcion = JOptionPane.showOptionDialog(
            this,
            campoURL,
            "Introduce la URL de la imagen (o pulsa E para examinar):",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            botones,
            botones[0]);

    if (opcion == JOptionPane.CLOSED_OPTION) {
        return null;
    }

    if (opcion == 0) {
        return cargarDesdeArchivo();
    }

    String urlTexto = campoURL.getText().trim();

    if (urlTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se proporcionó URL.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    try {
        URL url = URI.create(urlTexto).toURL();
        ImageIcon icono = new ImageIcon(url);

        if (icono.getIconWidth() <= 0) {
            throw new Exception("Imagen inválida.");
        }

        mostrarImagen(icono);
        textField11.setText(urlTexto);
        return icono;

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "URL inválida o imagen no cargada.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}

// Escalado proporcional
private ImageIcon escalarProporcional(Image img) {

    int maxW = jLabel2.getWidth() > 0 ? jLabel2.getWidth() : 550;
    int maxH = jLabel2.getHeight() > 0 ? jLabel2.getHeight() : 350;

    int w = img.getWidth(null);
    int h = img.getHeight(null);

    double ratio = Math.min((double) maxW / w, (double) maxH / h);

    int newW = (int) (w * ratio);
    int newH = (int) (h * ratio);

    Image scaled = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
    return new ImageIcon(scaled);
}

// Mostrar imagen en jLabel2
private void mostrarImagen(ImageIcon icono) {
    jLabel2.setIcon(icono);
}

// Registrar usuario
private void registrarUsuario() {

    String nombre = textField1.getText().trim();
    String telefono = textField7.getText().trim();
    String imagenFinal = textField11.getText().trim();
    String direccion = textArea1.getText().trim();

    if (nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos de texto son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar un género.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (jRadioButton1.isSelected() && jRadioButton2.isSelected()) {
        JOptionPane.showMessageDialog(this, "Solo se puede elegir un género, no ambos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String genero = jRadioButton1.isSelected() ? "Masculino" : "Femenino";

    String dia = (String) jComboBox1.getSelectedItem();
    String mes = (String) jComboBox2.getSelectedItem();
    String año = (String) jComboBox3.getSelectedItem();

    if (dia.equals("Día") || mes.equals("Mes") || año.equals("Año")) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!jCheckBox1.isSelected()) {
        JOptionPane.showMessageDialog(this, "Debes aceptar los términos");
        return;
    }

    if (imagenFinal.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar una imagen antes de registrar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    textArea2.setText(
            "Nombre: " + nombre + "\n" +
            "Teléfono: " + telefono + "\n" +
            "Género: " + genero + "\n" +
            "Fecha: " + dia + "/" + mes + "/" + año + "\n" +
            "Dirección:\n" + direccion);

    cargarImagen(imagenFinal);
}

// Radio buttons exclusivos
private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (jRadioButton1.isSelected()) {
        jRadioButton2.setSelected(false);
    }
}

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    if (jRadioButton2.isSelected()) {
        jRadioButton1.setSelected(false);
    }
}

private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {}
private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {}
private void textField11ActionPerformed(java.awt.event.ActionEvent evt) {}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    registrarUsuario();
}

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    limpiarFormulario();
}

// Cargar imagen final
private void cargarImagen(String url) {
    try {
        BufferedImage img = ImageIO.read(new File(url));
        if (img == null) throw new Exception("No es una imagen válida.");

        Image dimg = img.getScaledInstance(
                jLabel2.getWidth(),
                jLabel2.getHeight(),
                Image.SCALE_SMOOTH);

        jLabel2.setIcon(new ImageIcon(dimg));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
    }
}

// Limpiar formulario
private void limpiarFormulario() {
    textField1.setText("");
    textField7.setText("");
    textField11.setText("");
    textArea1.setText("");
    textArea2.setText("");
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jComboBox1.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    jComboBox3.setSelectedIndex(0);
    jCheckBox1.setSelected(false);
    jLabel2.setIcon(null);
}

// Botón E
private void seleccionarImagen() {

    if (!jCheckBox1.isSelected()) {
        JOptionPane.showMessageDialog(this, "Debes aceptar los términos y condiciones.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    ImageIcon icono = cargarDesdeArchivo();

    if (icono == null) return;

    mostrarImagen(icono);
}

// Conexión de eventos
private void configurarEventos() {
    jButton1.addActionListener(e -> registrarUsuario());
    jButton2.addActionListener(e -> limpiarFormulario());
    jButton3.addActionListener(e -> seleccionarImagen()); // ← CLAVE
}

// MAIN
public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        logger.log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() -> new Vista().setVisible(true));
}


// Variables declaration - do not modify
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JCheckBox jCheckBox1;
private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
private javax.swing.JComboBox<String> jComboBox1;
private javax.swing.JComboBox<String> jComboBox2;
private javax.swing.JComboBox<String> jComboBox3;
private javax.swing.JDesktopPane jDesktopPane1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JPanel jPanel3;
private javax.swing.JProgressBar jProgressBar1;
private javax.swing.JRadioButton jRadioButton1;
private javax.swing.JRadioButton jRadioButton2;
private java.awt.Label label1;
private java.awt.Label label2;
private java.awt.Label label3;
private java.awt.Label label4;
private java.awt.Label label5;
private java.awt.Label label6;
private java.awt.TextArea textArea1;
private java.awt.TextArea textArea2;
private java.awt.TextField textField1;
private java.awt.TextField textField11;
private java.awt.TextField textField7;
// End of variables declaration

}
