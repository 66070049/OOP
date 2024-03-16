package Lab_13_2;
import java.awt.*;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyClock extends JLabel implements Runnable{
    @Override
    public void run(){
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            this.setFont(new Font("Roboto", Font.BOLD, 85));
            this.setText(hour + ":" + min + ":" + sec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
