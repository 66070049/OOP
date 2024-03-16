package Lab_12_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView extends Student implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2;
    public StudentView(){
        //set
        fr = new JFrame();
        p1 = new JPanel(); p2 = new JPanel();
        lb1 = new JLabel("ID:"); lb2 = new JLabel("Name:"); lb3 = new JLabel("Money:");
        tf1 = new JTextField(); tf2 = new JTextField(); tf3 = new JTextField(String.valueOf(this.getMoney()));
        bn1 = new JButton("Deposit"); bn2 = new JButton("Withdraw");
        tf3.setEditable(false);
        //add
        fr.addWindowListener(this);
        bn1.addActionListener(this); bn2.addActionListener(this);
        //setting
        p1.setLayout(new GridLayout(3, 3));
        p1.add(lb1); p1.add(tf1);
        p1.add(lb2); p1.add(tf2);
        p1.add(lb3); p1.add(tf3);
        p2.add(bn1); p2.add(bn2);
        fr.add(p1); fr.add(p2, BorderLayout.SOUTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 150);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new StudentView();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(bn1)){
            this.setMoney(this.getMoney() + 100);
            tf3.setText(String.valueOf(this.getMoney()));
        }
        else if (ae.getSource().equals(bn2)){
            this.setMoney(this.getMoney() - 100);
            tf3.setText(String.valueOf(this.getMoney()));
        }
    }
    @Override
    public void windowOpened(WindowEvent we){
        File f = new File("StudentM.dat");
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream("StudentM.dat"); ObjectInputStream oin = new ObjectInputStream(fin);){
                tf1.setText("" + (String)oin.readObject());
                tf2.setText("" + (String)oin.readObject());
                tf3.setText("" + (String)oin.readObject());
                this.setMoney(Integer.parseInt(tf3.getText()));
            }
            catch(IOException ie){
                System.out.println(ie);
            }
            catch(ClassNotFoundException ce){
                System.out.println(ce);
        }
        }
    }
    @Override
    public void windowClosing(WindowEvent we){
        try(FileOutputStream fos = new FileOutputStream("StudentM.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(tf1.getText());
            oos.writeObject(tf2.getText());
            oos.writeObject(tf3.getText());
        }
        catch(IOException ie){
            System.out.println(ie);
        }
    }
    @Override
    public void windowClosed(WindowEvent we){
        
    }
    @Override
    public void windowIconified(WindowEvent we){
        
    }
    @Override
    public void windowDeiconified(WindowEvent we){
        
    }
    @Override
    public void windowActivated(WindowEvent we){
        
    }
    @Override
    public void windowDeactivated(WindowEvent we){
        
    }
}