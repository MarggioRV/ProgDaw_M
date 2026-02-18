import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// public class App {
    // public static void main(String[] args) {
    //     MyGUI gui = new MyGUI();
    // }

    // static class MyGUI extends JFrame {
    //     public MyGUI() {
    //         setSize(400, 200);
    //         setTitle("Ventana de tipo JFrame");
    //         setVisible(true);
    //     }
    // }

    // 1) Creamos la clase ventana
    public class EjemploGUI extends JFrame {
        
        private JPanel panelDeContenido;
        private JLabel etiqueta1;
        private JLabel etiqueta2;
        private JTextField campoDeTexto;
        private JButton boton;
        private JButton boton_restar;

        public EjemploGUI(String title) {
            initComponents(title);
        }   

        private void initComponents(String title) {
            // Configuramos los parámetros de la ventana
            setTitle(title);
            setLocation(200, 500); // setLocationRelativeTo(null);
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            // 2) Crear los componentes
            // JLabel 
            etiqueta1 = new JLabel("Mensaje");
            etiqueta2 = new JLabel("Mensaje");
            // JTextField 
            campoDeTexto = new JTextField("0", 20); //Inicializa con 0
            campoDeTexto.setEditable(false); 
            // JButton 
            boton = new JButton("Aceptar");
            boton.addMouseListener(new MyclickListener());
            //B'Restar
            boton_restar =new JButton("-");
            boton_restar.addMouseListener(new MyclickListener());

            // 3) Crear un contenedor
            // JPanel 
            panelDeContenido = new JPanel();
            // 4) Asociar los componentes al contenedor
            panelDeContenido.add(etiqueta1);
            panelDeContenido.add(campoDeTexto);
            panelDeContenido.add(boton);

            panelDeContenido.add(etiqueta2);

            // 5) Asociar el contenedor a la ventana
            setContentPane(panelDeContenido);
            // 6) Hacer visible la ventana
            setVisible(true);
        }

        private class MyclickListener extends MouseInputAdapter{
            private int numClicks;
            public void mouseClicked(MouseEvent event){ //Cada vez que se hace click en el evento
                numClicks++; 
                campoDeTexto.setText(String.valueOf(numClicks));
            }
        }

        public static void main(String[] args) {
            EjemploGUI ejemplo = new EjemploGUI("Ventana Principal");
        }
}
   

