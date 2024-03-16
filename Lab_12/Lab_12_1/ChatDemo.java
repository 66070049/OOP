package Lab_12_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JTextArea ta;
    private JTextField tf;
    private JButton bn1, bn2;
    public ChatDemo(){
        //set
        fr = new JFrame();
        p1 = new JPanel(); p2 = new JPanel();
        ta = new JTextArea();
        tf = new JTextField();
        bn1 = new JButton("Submit"); bn2 = new JButton("Reset");
        //add
        fr.addWindowListener(this);
        bn1.addActionListener(this); bn2.addActionListener(this);
        //setting
        ta.setSize(45,20);
        tf.setSize(45, 5);
        ta.setEditable(false);
        p1.setLayout(new BorderLayout());
        p1.add(ta);
        p1.add(tf, BorderLayout.SOUTH);
        p2.add(bn1); p2.add(bn2);
        fr.add(p1); fr.add(p2, BorderLayout.SOUTH);
        //finish
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,300);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new ChatDemo();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(bn1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + "\n" + dtf.format(LocalDateTime.now()) + ": " + tf.getText());
            tf.setText("");
        }
        else{
            ta.setText("");
        }
    }
    @Override
    public void windowOpened(WindowEvent we){
        File f = new File("ChatDemo.dat");
        if (f.exists()){
            try(FileInputStream fin = new FileInputStream("ChatDemo.dat"); ObjectInputStream oin = new ObjectInputStream(fin);){
                ta.setText("" + (String)oin.readObject());
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
        try (FileOutputStream fos = new FileOutputStream("ChatDemo.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(ta.getText());
        }
        catch(IOException ie){
            System.out.println(ie);
        }
    }
    @Override
    public void windowActivated(WindowEvent we){
        
    }
    @Override
    public void windowDeactivated(WindowEvent we){
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }
}
