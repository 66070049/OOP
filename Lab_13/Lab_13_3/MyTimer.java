package Lab_13_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
public class MyTimer extends JLabel implements Runnable{
    int hour = 0, min = 0, sec = 0;
    String th, tm, ts;
    boolean paused;
    public void pauseThread(){
        paused = true;
    }
    private synchronized void checkPaused(){
        while (paused){
            try{
                this.wait();
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    }
    @Override
    public void run(){
        while(true){
            this.checkPaused();
            if(hour <= 24){
                if(min < 59){
                    if(sec < 59){
                        sec++;
                    }
                    else{
                        sec = 0;
                        min++;
                    }
                }
                else{
                    min = 0;
                    hour++;
                }
            }
            else{
                hour = 0;
            }
            th = String.format("%02d", hour); tm = String.format("%02d", min); ts = String.format("%02d", sec);
            this.setFont(new Font("Roboto", Font.BOLD, 85));
            this.setText(th + ":" + tm + ":" + ts);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}