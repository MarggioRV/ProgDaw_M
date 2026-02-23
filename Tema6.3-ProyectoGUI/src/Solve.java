// java Program to create a simple JSlider
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;

class Solve3 extends JFrame {

    // frame
    static JFrame f;

    // slider
    static JSlider b;

    // main class
    public static void main(String[] args)
    {
        // create a new frame
        f = new JFrame("frame");

        // create a object
        Solve3 s = new Solve3();

        // create a panel
        JPanel p = new JPanel();

        // create a slider
        b = new JSlider();

        // add slider to panel
        p.add(b);

        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }
}
