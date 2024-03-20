import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaConBoton extends JFrame {
    private JPanel panel;

    public VentanaConBoton() {
        setTitle("Ventana con Botón");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel(null);
        getContentPane().add(panel);

        JButton botonInicial = new JButton("Presioname");
        botonInicial.setBounds(100, 100, 100, 30);
        botonInicial.setBorder(BorderFactory.createRaisedSoftBevelBorder()); 
        botonInicial.setBorderPainted(true);
        botonInicial.addActionListener(e -> {
            agregarNuevoBoton((int)(Math.random() * 400) + 50, (int)(Math.random() * 300));
        });

        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                agregarNuevoBoton(e.getX(), e.getY());
            }
        });

        panel.add(botonInicial);
        setSize(500, 400);
        setVisible(true);
    }

    private void agregarNuevoBoton(int x, int y) {
        JButton nuevoBoton = new JButton(Integer.toHexString((int)(Math.random() * 16777215)));
        nuevoBoton.setBounds(x, y, 100, 30);
        nuevoBoton.setBackground(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
        nuevoBoton.setBorder(BorderFactory.createRaisedSoftBevelBorder()); 
        nuevoBoton.setBorderPainted(true);
        nuevoBoton.addActionListener(evt -> {
            if (evt.getSource() != null && evt.getSource() instanceof JButton) {
                JButton boton = (JButton) evt.getSource();
                panel.remove(boton);
                panel.repaint();
            }
        });
        panel.add(nuevoBoton);
        panel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaConBoton::new);
    }
}
