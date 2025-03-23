package JCustom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


    public class JLabelClock extends JLabel {
    
        private Timer timer;
        
        public JLabelClock() {
            ActionListener action = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Date date = new Date();
                    DateFormat clockFormat = new SimpleDateFormat("HH:mm:ss");
                    String time = clockFormat.format(date);
                    
                    setText(time);
                }
            };
            
            
            timer = new Timer(1000, action);
            timer.setInitialDelay(0);
            timer.start();
        }
        
        
}
