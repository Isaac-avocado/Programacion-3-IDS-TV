import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

public class BotonCarta extends JButton {
    private char simbolo;
    private boolean volteado = false;
    private static final Color COLOR_FONDO = new Color(0, 0, 0, 0);
    
    public BotonCarta(char simbolo) {
        this.simbolo = simbolo;
        try {
            Font fontPersonalizada = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\eliud\\git\\repository\\Galaxy_dingbats-Regular.ttf"));
            Font sizedFont = fontPersonalizada.deriveFont(200f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fontPersonalizada);
            setFont(sizedFont); 
            
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
        setBackground(COLOR_FONDO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(50, 50));
        setFocusPainted(false); 
        setContentAreaFilled(false);
        setMargin(new Insets(0, 0, 0, 0));
    }

    public void voltear() {
        if (!volteado) {
            setText(Character.toString(simbolo));
        } else {
            setText("");
        }
        volteado = !volteado; 
    }
    
    public void setVolteado(boolean volteado) {
        this.volteado = volteado;
    }
    
    public boolean isVolteado() {
        return volteado;
    }

    public char getSimbolo() {
        return simbolo;
    }
    
}
