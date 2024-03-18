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
        botonInicial.addActionListener(e -> agregarBotonAleatorio());

        panel.add(botonInicial);
        
        setSize(500, 400);
        setVisible(true);
    }

    private void agregarBotonAleatorio() {
        JButton nuevoBoton = new JButton("Nuevo Botón");
        nuevoBoton.setBounds((int)(Math.random() * 400) + 50, (int)(Math.random() * 300), 100, 30);
        nuevoBoton.setBackground(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
        panel.add(nuevoBoton);
        panel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaConBoton::new);
    }
}
