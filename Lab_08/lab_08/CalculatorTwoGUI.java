package lab_08;
import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField tf;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        tf = new JTextField();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("*");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        fr.add(tf, BorderLayout.NORTH);
        p.setLayout(new GridLayout(4, 4));
        p.add(bn1);
        p.add(bn2);
        p.add(bn3);
        p.add(bn4);
        p.add(bn5);
        p.add(bn6);
        p.add(bn7);
        p.add(bn8);
        p.add(bn9);
        p.add(bn10);
        p.add(bn11);
        p.add(bn12);
        p.add(bn13);
        p.add(bn14);
        p.add(bn15);
        p.add(bn16);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

    }
}
