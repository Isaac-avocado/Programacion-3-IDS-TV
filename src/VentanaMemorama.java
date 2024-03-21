import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;

public class VentanaMemorama extends JFrame {
    private JPanel panel;
    private JLabel contadorJugadas;
    private int jugadas = 0;
    private BotonCarta carta1;
    private BotonCarta carta2;
    private Timer timer;
    private Set<BotonCarta> cartasResueltas;

    public VentanaMemorama() {
        setTitle("Memorama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel(new GridLayout(2, 4));
        getContentPane().add(panel);

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.addActionListener(e -> reiniciarJuego());
        getContentPane().add(reiniciar, BorderLayout.SOUTH);
        
        contadorJugadas = new JLabel("Jugadas: " + jugadas);
        getContentPane().add(contadorJugadas, BorderLayout.NORTH);
        
        setSize(800, 600);
        setVisible(true);
        
        cartasResueltas = new HashSet<>();
        inicializarCartas();
    }
    
    private void inicializarCartas() {
        char[] simbolos = {'A', 'B', 'C', 'D'}; 
        ArrayList<BotonCarta> cartas = new ArrayList<>();
        
        for (char simbolo : simbolos) {
            
            BotonCarta carta1 = new BotonCarta(simbolo);
            BotonCarta carta2 = new BotonCarta(simbolo);
            
            carta1.addActionListener(e -> voltearCarta(carta1));
            carta2.addActionListener(e -> voltearCarta(carta2));
            
            cartas.add(carta1);
            cartas.add(carta2);
        }
        
        
        Collections.shuffle(cartas);
        
        for (BotonCarta carta : cartas) {
            panel.add(carta);
        }
    }
    
    private void reiniciarJuego() {
        panel.removeAll();
        inicializarCartas();
        jugadas = 0;
        actualizarContador();
        carta1 = null;
        carta2 = null;
        timer = null;
        cartasResueltas.clear();
        repaint();
    }
    
    private void voltearCarta(BotonCarta carta) {
        if (carta.isVolteado() || cartasResueltas.contains(carta)) {
            return; 
        }

        carta.voltear(); 
        jugadas++; 
        actualizarContador();
        
        if (carta1 == null) {
            carta1 = carta;
        } else {
            carta2 = carta;
            
            if (carta1.getSimbolo() == carta2.getSimbolo()) {
                cartasResueltas.add(carta1);
                cartasResueltas.add(carta2);
                if (todasVolteadas()) {
                    JOptionPane.showMessageDialog(this, "¡Felicidades! Has ganado en " + jugadas + " jugadas.");
                }
            } else {
                timer = new Timer(3000, e -> {
                    carta1.voltear();
                    carta2.voltear();
                    carta1 = null;
                    carta2 = null;
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }
    
    private boolean todasVolteadas() {
        return cartasResueltas.size() == panel.getComponentCount() / 2;
    }
    
    private void actualizarContador() {
        contadorJugadas.setText("Jugadas: " + jugadas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaMemorama::new);
    }
}
