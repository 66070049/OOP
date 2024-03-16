package lab_08;
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2;
    private JTextArea ta1, ta2;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;
    public TellerGUI(){
        fr = new JFrame("Terller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        ta1 = new JTextArea("Balance");
        ta2 = new JTextArea("Amount");
        tf1 = new JTextField("6000");
        tf2 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        p1.setLayout(new GridLayout(2, 2));
        tf1.setEnabled(false);
        p1.add(ta1);
        p1.add(tf1);
        p1.add(ta2);
        p1.add(tf2);
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }    
}
