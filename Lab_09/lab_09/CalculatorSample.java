package lab_09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JTextField tf;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15;
    int num1, num2, total;
    char op;
    public CalculatorSample(){
        //set container
        fr = new JFrame("My Calculator");
        p = new JPanel();
        tf = new JTextField();
        bn0 = new JButton("0"); bn1 = new JButton("1");
        bn2 = new JButton("2"); bn3 = new JButton("3");
        bn4 = new JButton("4"); bn5 = new JButton("5");
        bn6 = new JButton("6"); bn7 = new JButton("7");
        bn8 = new JButton("8"); bn9 = new JButton("9");
        bn10 = new JButton("+"); bn11 = new JButton("-");
        bn12 = new JButton("x"); bn13 = new JButton("/");
        bn14 = new JButton("c"); bn15 = new JButton("=");
        //add EventSource
        bn0.addActionListener(this); bn1.addActionListener(this);
        bn2.addActionListener(this); bn3.addActionListener(this);
        bn4.addActionListener(this); bn5.addActionListener(this);
        bn6.addActionListener(this); bn7.addActionListener(this);
        bn8.addActionListener(this); bn9.addActionListener(this);
        bn10.addActionListener(this); bn11.addActionListener(this);
        bn12.addActionListener(this); bn13.addActionListener(this);
        bn14.addActionListener(this); bn15.addActionListener(this);
        //add container
        p.setLayout(new GridLayout(4, 4));
        p.add(bn7); p.add(bn8); p.add(bn9); p.add(bn10);
        p.add(bn4); p.add(bn5); p.add(bn6); p.add(bn11); 
        p.add(bn1); p.add(bn2); p.add(bn3); p.add(bn12);
        p.add(bn0); p.add(bn14); p.add(bn15); p.add(bn13);
        fr.add(tf, BorderLayout.NORTH);
        fr.add(p);
        //finish setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setVisible(true);
    }
    //main
    public static void main(String[] args) {
        new CalculatorSample();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        //getActionCommand return comman String of button
        //check num
        if(ae.getActionCommand().matches("[0-9]")){
            tf.setText(tf.getText() + ae.getActionCommand());
        }
        else{
            //check op
            if(ae.getActionCommand().equals("c")){
                tf.setText("");
                num1 = num2 = total = 0;
            }
            else if(ae.getActionCommand().equals("+")){
                op = '+';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            else if(ae.getActionCommand().equals("-")){
                op = '-';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            else if(ae.getActionCommand().equals("x")){
                op = 'x';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            else if(ae.getActionCommand().equals("/")){
                op = '/';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            if(ae.getActionCommand().equals("=")){
                num2 = Integer.parseInt(tf.getText());
                if(op == '+'){
                    total = num1 + num2;
                }
                else if(op == '-'){
                    total = num1 - num2;
                }
                else if(op == 'x'){
                    total = num1 * num2;
                }
                else if(op == '/'){
                    total = num1 / num2;
                }
            tf.setText(String.valueOf(total));
            }
        }
    }
}
