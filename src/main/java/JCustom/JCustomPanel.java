package JCustom;

import javax.swing.*;
import java.awt.*;

public class JCustomPanel extends JPanel {
    
    private int round;

    public void setRound(int round) {
        this.round = round;
    }
    
    public JCustomPanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Ativar suavização
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor de fundo
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, round, round);

    }

    
    
}
