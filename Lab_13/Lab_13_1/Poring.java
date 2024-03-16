package Lab_13_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring implements Runnable, MouseListener{
    private JFrame fr;
    private JPanel p;
    private JLabel lb1, lb2;
    private int count;
    public Poring(int count){
        this.count = count;
        fr = new JFrame();
        p = new JPanel();
        lb1 = new JLabel(); lb2 = new JLabel(String.valueOf(count));
        lb1.setIcon(new ImageIcon("p.png"));
        fr.addMouseListener(this);
        p.add(lb1); p.add(lb2);
        fr.add(p);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setSize(150, 130);
        fr.setVisible(true);
    }
    @Override
    public void run(){
        
    }
    @Override
    public void mouseClicked(MouseEvent e){
        fr.dispose();
    }
    @Override
    public void mouseEntered(MouseEvent e){
        
    }
    @Override
    public void mouseExited(MouseEvent e){
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        
    }
    @Override
    public void mouseReleased(MouseEvent e){
        
    }
}
