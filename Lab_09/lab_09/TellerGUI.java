package lab_09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel lb1, lb2;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;
    private Account ac;
    public TellerGUI(){
        //set container
        ac = new Account(6000.0, "");
        fr = new JFrame("Teller GUI");
        p1 = new JPanel(); p2 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        tf1 = new JTextField(String.valueOf(ac.getBalance()));
        tf1.setEnabled(false);
        tf2 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        //add EventSource
        bn1.addActionListener(this); bn2.addActionListener(this); bn3.addActionListener(this);
        p1.setLayout(new GridLayout(2, 2));
        //add container
        p1.add(lb1); p1.add(tf1);
        p1.add(lb2); p1.add(tf2);
        p2.add(bn1); p2.add(bn2); p2.add(bn3);
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2);
        //finish setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        fr.setVisible(true);
    }
    //main
    public static void main(String[] args) {
        new TellerGUI();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        //getSource = what button pressed
        if(ae.getSource().equals(bn1)){
            ac.setBalance(ac.getBalance() + Double.parseDouble(tf2.getText()));
            tf1.setText(String.valueOf(ac.getBalance()));
        }
        else if(ae.getSource().equals(bn2)){
            if(Double.parseDouble(tf2.getText()) <= ac.getBalance()){
                ac.setBalance(ac.getBalance() - Double.parseDouble(tf2.getText()));
                tf1.setText(String.valueOf(ac.getBalance()));
            }
        }
    }
}
