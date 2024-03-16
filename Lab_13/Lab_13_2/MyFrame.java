package Lab_13_2;
import java.awt.*;
import javax.swing.*;
public class MyFrame {
    private JFrame fr;
    private MyClock clock;
    private Thread t;
    public MyFrame(){
        fr = new JFrame("My Clock");
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        fr.add(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(370, 200);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
}
