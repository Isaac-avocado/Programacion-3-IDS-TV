import java.awt.Color;
import java.util.Random;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class VentanaDibujo extends JFrame {
    public VentanaDibujo() {
        setTitle("Dibujo en Ventana");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Lienzo lienzo = new Lienzo();
        add(lienzo);
    }

    public static void main(String[] args) {
        VentanaDibujo ventana = new VentanaDibujo();
        ventana.setVisible(true);
    }
}

class Lienzo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        
        
        
        // ACTIVIDAD SOBRE DIBUJAR N01 ---------------------------------------------------------------------------------------------------------------------------------------------------
        //g.drawLine(50, 50, 200, 200);
        //g.drawRect(100, 100, 100, 100);
        //g.drawOval(250, 250, 100, 100);
        // Fondo
        setBackground(Color.WHITE);

        // Techo1
        /*g.setColor(Color.RED);
        int[] xTecho = {100, 200, 300};
        int[] yTecho = {150, 50, 150};
        g.fillPolygon(xTecho, yTecho, 3);*/
/*
        // Pared
        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 200, 150);

        // Puerta
        g.setColor(Color.WHITE);
        g.fillRect(175, 250, 50, 50);

        // Ventanas
        g.setColor(Color.YELLOW);
        g.fillRect(125, 175, 50, 50);
        g.fillRect(225, 175, 50, 50);
        
        // Fondo
        setBackground(new Color(150, 255, 150)); // Verde claro

        // Pasto con degradado a color arena
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0, getHeight(), new Color(194, 178, 128), 0, getHeight() / 2, new Color(150, 255, 150));
        g2d.setPaint(gp);
        g2d.fillRect(0, getHeight() / 2, getWidth(), getHeight());

        // Techo
        g.setColor(Color.RED);
        int[] xTecho = {100, 200, 300};
        int[] yTecho = {150, 50, 150};
        g.fillPolygon(xTecho, yTecho, 3);

        // Pared
        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 200, 150);

        // Puerta
        g.setColor(Color.WHITE);
        g.fillRect(175, 250, 50, 50);

        // Ventanas
        g.setColor(Color.YELLOW);
        g.fillRect(125, 175, 50, 50);
        g.fillRect(225, 175, 50, 50);

        // Chimenea
        g.setColor(new Color(128, 0, 0)); // Café oscuro
        g.fillRect(250, 50, 30, 80);

        // Valla
        g.setColor(new Color(153, 102, 51)); // Café claro
        g.fillRect(50, 250, 300, 10);
        */
        
        
        
        
        
        
        
        
     // ACTIVIDAD SOBRE DIBUJAR N02 CASA -------------------------------------------------------------------------------------------------------------------------------------------------
     // Cielo
        /*g.setColor(new Color(135, 206, 250)); // Azul cielo claro
        g.fillRect(0, 0, getWidth(), getHeight());

        // Pasto
        g.setColor(new Color(173, 255, 47)); // Verde pasto
        g.fillRect(0, 300, getWidth(), getHeight() - 300);

        // Valla
        g.setColor(new Color(222, 184, 135)); // Café claro
        for (int i = 0; i < 30; i++) {
            g.fillRect(0 + i * 30, 250 , 20, 50); // Valla vertical
        }

        // Casa
        g.setColor(new Color(255, 255, 0)); // Amarillo
        g.fillRect(100, 150, 200, 150); // Cuerpo de la casa

        // Techo
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {150, 100, 150};
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);

        // Chimenea
        g.setColor(new Color(139, 69, 19)); // Café marrón
        g.fillRect(250, 100, 30, 50);

        // Puerta
        g.setColor(new Color(139, 69, 19)); // Café marrón
        g.fillRect(170, 220, 60, 80);

        // Ventana
        g.setColor(new Color(135, 206, 250)); // Azul cielo
        g.fillRect(120, 200, 50, 50);
        */
        
        
        
        
        
        
        
        
     // ACTIVIDAD SOBRE DIBUJAR N04 MARIO BROS Yoshi's Island 1 --------------------------------------------------------------------------------------------------------------------------
        // FONDO
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0, 0, getWidth(), getHeight());
        
     // Dibujar TUBERIA1
        g.setColor(Color.GRAY);
        //g.fillRect(250, getHeight() / 2 - 20, 80, 40);
        g.fillRect(255, 250, 70, 300);
        g.fillRect(250, getHeight() / 2 - 20, 80, 40);
        g.setColor(Color.BLACK);
        g.drawRect(250, getHeight() / 2 - 20, 80, 40);
        g.drawRect(255, 250, 70, 300);
        g.drawLine(300, 250, 330, 250);
        
     // Dibujar TUBERIA2
        g.setColor(Color.GRAY);
        g.fillRect(420, 280 , 80, 40);
        g.fillRect(425, 320, 70, 300);
        g.setColor(Color.BLACK);
        g.drawRect(420, 280 , 80, 40);
        g.drawRect(425, 320, 70, 300);
        
        for (int i = 0; i < 80;) {
        	// Arbustos con bayas rojas
        	Random random = new Random();
        	int randomNumber = random.nextInt(100);
            g.setColor(new Color(0, 128, 0)); // Verde oscuro
            g.fillOval(100+i, 330, 30, 30);
            g.setColor(Color.RED);
            g.fillOval(120+random.nextInt(60), 330+random.nextInt(10), 10, 10);
            i=i+20;
        }
        // TIERRA
        g.setColor(Color.decode("#CF9E5F")); // Cafe 
        g.fillRect(0, getHeight() - 100, getWidth(), 150);

        // PASTO
        for (int i = 0; i < 550;) {
        	int[] xPoints = {-50+i, 0+i, 50+i};
            int[] yPoints = {350, 400,350};
            g.setColor(Color.decode("#0FC714")); // Verde claro
            g.fillPolygon(xPoints, yPoints, 3);
            i=i+50;
        }

        // Bloques amarillos con ojos negros
        g.setColor(Color.YELLOW);
        g.fillRect(200, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.fillRect(210, 210, 8, 20);
        g.fillRect(230, 210, 8, 20);

        // Nubes blancas
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 60, 40);
        g.fillOval(300, 100, 80, 60);
    }
}