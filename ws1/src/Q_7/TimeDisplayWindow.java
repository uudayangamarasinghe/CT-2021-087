import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeDisplayWindow {
    public static void main(String[] args) {
        
        JFrame timeWindow = new JFrame();
        timeWindow.setSize(400, 200);
        timeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeWindow.setVisible(true);

       
        Timer timeUpdater = new Timer(true);
        timeUpdater.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
               
                String formattedTime = new SimpleDateFormat("hh:mm:ss a").format(new Date());
                timeWindow.setTitle(formattedTime);
            }
        }, 0, 1000); // Update every second
    }
}
