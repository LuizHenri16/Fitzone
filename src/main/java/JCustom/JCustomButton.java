package JCustom;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class JCustomButton extends JButton implements MouseListener{
    public enum ButtonStyle {
        //Estilos dos botões

        DEFAULT(new Color(243, 243, 243), new Color(233, 233, 233), new Color(244, 255, 255)),
        EXIT(new Color(196, 80, 92), new Color(191, 50, 64), new Color(244, 59, 91)),
        SECONDARY(new Color(241, 221, 183), new Color(246, 227, 191), new Color(246, 200, 112)),
        RETURN(new Color(188, 140, 74), new Color(199, 158, 101), new Color(164, 130, 83)),
        UPDATE(new Color(6, 61, 56), new Color(12, 111, 102), new Color(7, 46, 42));

        private final Color defaultColor;
        private final Color hoverColor;
        private final Color pressedColor;

        private ButtonStyle(Color defaultColor, Color hoverColor, Color pressedColor) {
            this.defaultColor = defaultColor;
            this.hoverColor = hoverColor;
            this.pressedColor = pressedColor;
        }

        public Color getDefaultColor() {
            return defaultColor;
        }

        public Color getHoverColor() {
            return hoverColor;
        }

        public Color getPressedColor() {
            return pressedColor;
        }

    }

    private ButtonStyle style;
    private int round;
    private Color backgroundColor;

    public JCustomButton() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setRolloverEnabled(false);
        setBorder(new EmptyBorder(8, 8, 8, 8));
        addMouseListener(this);

        this.backgroundColor = style.DEFAULT.defaultColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(backgroundColor);
        g2.fill(area);

        super.paintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        repaint();
        backgroundColor = style.getHoverColor();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        backgroundColor = style.getDefaultColor();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        repaint();
    }

    public void setStyle(ButtonStyle style) {
        this.style = style;
        this.backgroundColor = style.getDefaultColor();

    }

    public ButtonStyle getStyle() {
        return style;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
