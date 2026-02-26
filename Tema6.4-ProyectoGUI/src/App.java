import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        vista.setVisible(true);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
