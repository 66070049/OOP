package Lab_13_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JButton bn;
    private Thread t;
    private Poring pr;
    int count= 1;
    public PoringConstructor(){
        fr = new JFrame();
        p = new JPanel();
        bn = new JButton("Add");
        //add
        bn.addActionListener(this);
        p.add(bn);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(100, 100);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new PoringConstructor();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(bn)){
            t = new Thread(new Poring(count));
            t.start();
            count++;
        }
    }
}
