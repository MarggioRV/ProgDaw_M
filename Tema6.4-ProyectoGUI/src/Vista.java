import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Vista extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Vista.class.getName());

    public Vista() {
        initComponents();
        configurarEventos();
    }

    // COMPONENTES + LISTERNERS NECESARIOS
    private void initComponents() {

        // Base
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();

        // Textos e Imputs
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        textField11 = new java.awt.TextField();

        // Demás Componentes
        jRadioButton1 = new javax.swing.JRadioButton();
        // Listener para exclusividad_Eleccion (M)
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        jRadioButton2 = new javax.swing.JRadioButton();
        // Listener para exclusividad_Eleccion (F)
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        textArea1 = new java.awt.TextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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

        // Contenido_Texto_Label
        label1.setText("· Nombre:");
        label2.setText("· #Telefono:");
        label3.setText("· Genero:");
        label4.setText("· Fecha_Nac:");
        label5.setText("· Direccion:");
        label6.setText("· URL:");

        // Contenido_Texto_Textfield

        textField1.setText("");
        textField1.addActionListener(this::textField1ActionPerformed);

        textField7.setText("");

        textField11.setText("textField11");
        textField11.addActionListener(this::textField11ActionPerformed);

        // Contenido_Texto_JRadioButtons
        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);
        // Y
        jRadioButton2.setText("Femenino");

        // Días del 1 al 31
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31"
        }));

        // Meses del año
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        }));

        // Años, por ejemplo desde 1900 hasta 2026
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935",
                "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945",
                "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955",
                "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965",
                "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975",
                "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
                "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
                "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025",
                "2026"
        }));

        jCheckBox1.setText("Acepta Terminos y Condiciones");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);

        jButton1.setText("Enviar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Reiniciar");

        jButton3.setText("E");

        // LAYOUT

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(textField1,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 194,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(textField7,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jRadioButton2))
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(textField11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                168,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                0, Short.MAX_VALUE))
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
                                                                                        .addGap(24, 24, 24))))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCheckBox1)
                                                .addGap(48, 48, 48)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(72, 72, 72)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton1)
                                                .addComponent(jRadioButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField11, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45,
                                        Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(16, 16, 16)));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText(""); //Imagen

        jLabel3.setText(""); //Imagen

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 227,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)));

        jLabel1.setText("Formulario de Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)));

        pack();
    }

    // LÓGICA COMPLETA

    // Radio buttons exclusivos (M)
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
        }
    }

    // Radio buttons exclusivos (F)
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
        }
    }

    // TRATAMIENTO_IMAGEN

    // Mostrar imagen en jLabel2
    private void mostrarImagen(ImageIcon icono) {
        jLabel2.setIcon(icono);
    }

    // Escalado proporcional
    private ImageIcon escalarProporcional(Image img) {

        int maxW = jLabel2.getWidth() > 0 ? jLabel2.getWidth() : 550;
        int maxH = jLabel2.getHeight() > 0 ? jLabel2.getHeight() : 350;

        int w = img.getWidth(null);
        int h = img.getHeight(null);

        // Radio minimo para que no se deforme
        double ratio = Math.min((double) maxW / w, (double) maxH / h);

        // Varibles procesadas
        int newW = (int) (w * ratio);
        int newH = (int) (h * ratio);

        // Imagen escalada
        Image scaled = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

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

    // Botón E:EXAMINAR
    private void seleccionarImagen() {

        if (!jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debes aceptar los términos y condiciones.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        ImageIcon icono = cargarDesdeArchivo();

        if (icono == null)
            return;

        mostrarImagen(icono);
    }

    // Imagen final desde URL (en textField11)
    private void cargarImagen(String url) {
        try {

            // 1. Comprobar si es URL remota
            if (url.startsWith("http://") || url.startsWith("https://")) {

                try {
                    Image img = ImageIO.read(new URL(url)); 
                    if (img == null)
                        throw new Exception("Formato no válido");

                    Image dimg = img.getScaledInstance(
                            jLabel2.getWidth() > 0 ? jLabel2.getWidth() : 550,
                            jLabel2.getHeight() > 0 ? jLabel2.getHeight() : 350,
                            Image.SCALE_SMOOTH);

                    jLabel2.setIcon(new ImageIcon(dimg));
                    return;

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "No se encontró la URL o no es accesible:\n" + url,
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // 2. Si NO es URL → tratar como archivo local
            File archivo = new File(url);

            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(this,
                        "No se encontró el archivo en la ruta:\n" + url,
                        "Ruta no encontrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Image img = ImageIO.read(archivo);
            if (img == null)
                throw new Exception("Formato no válido");

            Image dimg = img.getScaledInstance(
                    jLabel2.getWidth() > 0 ? jLabel2.getWidth() : 550,
                    jLabel2.getHeight() > 0 ? jLabel2.getHeight() : 350,
                    Image.SCALE_SMOOTH);

            jLabel2.setIcon(new ImageIcon(dimg));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "No se pudo cargar la imagen:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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

    // Registrar Usuario (Enlazando variables a los imputs)
    private void registrarUsuario() {
        String nombre = textField1.getText().trim();
        String telefono = textField7.getText().trim(); // Por si esta en mayus
        String imagenFinal = textField11.getText().trim();
        String direccion = textArea1.getText().trim();

        if (nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Todos los campos son obligatorios");
        }

        String genero = jRadioButton1.isSelected() ? "Masculino" : "Femenino";

        String dia = (String) jComboBox1.getSelectedItem();
        String mes = (String) jComboBox2.getSelectedItem();
        String año = (String) jComboBox3.getSelectedItem();

        if (dia.equals("Día") || mes.equals("Mes") || año.equals("Año")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fecha válida.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debes aceptar los términos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (imagenFinal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una imagen antes de registrar.", "Error",
                    JOptionPane.ERROR_MESSAGE);
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

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textField11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // CONEXION ENTRE GRUPO_EVENTOS
    private void configurarEventos() {
        jButton1.addActionListener(e -> registrarUsuario());
        jButton2.addActionListener(e -> limpiarFormulario());
        jButton3.addActionListener(e -> seleccionarImagen());
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
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
