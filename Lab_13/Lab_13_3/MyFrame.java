package Lab_13_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame implements MouseListener{
    private JFrame fr;
    private MyTimer clock;
    private Thread t;
    boolean check;
    public MyFrame(){
        fr = new JFrame("My Timer");
        clock = new MyTimer();
        t = new Thread(clock);
        t.start();
        fr.addMouseListener(this);
        fr.add(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(370, 200);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
    @Override
    public void mouseClicked(MouseEvent e){
        if(clock.paused == false){
            clock.pauseThread();
        }
        else{
            clock.resumeThread();
        }
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