package lab_08;
import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p, sp, sp1, sp2;
    private JTextField tf;
    private JButton bn1, bn2, bn3, bn4;
    public CalculatorOneGUI(){
        fr = new JFrame("Calculator");
        p = new JPanel();
        sp = new JPanel();
        sp1 = new JPanel();
        sp2= new JPanel();
        tf = new JTextField();
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("*");
        bn4 = new JButton("/");
        fr.setLayout(new GridLayout(4, 1));
        sp.setLayout(new BorderLayout());
        sp.add(tf);
        fr.add(sp);
        sp1.setLayout(new BorderLayout());
        sp1.add(new JTextField());
        fr.add(sp1);
        p.add(bn1);
        p.add(bn2);
        p.add(bn3);
        p.add(bn4);
        fr.add(p);
        sp2.setLayout(new BorderLayout());
        sp2.add (new JTextField());
        fr.add(sp2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
}
