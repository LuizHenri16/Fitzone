package JCustom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class JLabelData extends JLabel {
            private Timer timer;
        
            public JLabelData() {
            ActionListener action = (ActionEvent e) -> {
                Date date = new Date();
                DateFormat clockFormat = new SimpleDateFormat("dd/MM/yyyy");
                String time = clockFormat.format(date);
                
                setText(time);
            };
            
            timer = new Timer(1000, action);
            timer.setInitialDelay(0);
            timer.start();
    
            }
    }
