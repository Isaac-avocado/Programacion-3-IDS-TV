import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    private JPanel panel, registro, login, calculadora;
    private JTextField cajaTexto,resultado;
    private JPasswordField cajaContrasena;
    private JTextArea areaTexto;
    private JComboBox<String> menuDesplegable;

    public Ventana() {
        setVisible(true);
        setTitle("Login window");
        setSize(800, 800);
        setMinimumSize(new Dimension(800, 800));
        setMaximumSize(new Dimension(800, 800));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        activarComponentes();
    }

    private void activarComponentes() {
        panelComponentes();
        panelRegistro();
        panelCalculadora();
        String dato;
        etiquetaDeTexto(dato = "SISTEMA P.A.C.S.", 110, 30, 200, 30, login);
        etiquetaDeTexto(dato = "Token", 140, 100, 200, 30, login);
        etiquetaDeTexto(dato = "Contraseña", 130, 200, 200, 30, login);
        etiquetaDeTexto(dato = "SISTEMA P.A.C.S.", 110, 30, 200, 30, registro);
        etiquetaDeTexto(dato = "Nombre", 140, 100, 200, 30, registro);

        cajaDeTexto(dato = "Ingrese su nombre...", 60, 150, 200, 30, registro);
        checkBoxes(60, 200, 20, 100, registro);
        areaDeTexto(dato = "Ingrese su párrafo...", 60, 442, 200, 100, registro);
        menuDesplegable(60, 600, 200, 30, registro);
        botonGuardar(110, 700, 100, 30, registro);

        cajaDeTexto(dato = "Ingrese su token...", 60, 150, 200, 30, login);
        cajaDeContrasena(60, 250, 200, 30, login);

        this.revalidate();
        this.repaint();

    }

    private void panelComponentes() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        login = new JPanel();
        login.setSize(this.getWidth() / 2, this.getHeight());
        login.setLocation(0, 0);
        login.setBackground(Color.GRAY);
        login.setLayout(null);
        panel.add(login);
    }

    private void panelRegistro() {
        registro = new JPanel();
        registro.setSize(this.getWidth() / 2, this.getHeight());
        registro.setLocation(this.getWidth() / 2, 0);
        registro.setBackground(Color.LIGHT_GRAY);
        registro.setLayout(null);
        panel.add(registro);
    }

    private void panelCalculadora() {
        calculadora = new JPanel();
        calculadora.setSize(this.getWidth(), 200);
        calculadora.setLocation(0, this.getHeight() - 200);
        calculadora.setBackground(Color.WHITE);
        calculadora.setLayout(null);
        panel.add(calculadora);

        resultado = new JTextField();
        resultado.setBounds(10, 10, calculadora.getWidth() - 20, 40);
        calculadora.add(resultado);

        String[] labels = { "CE", "", "", "",
                            "7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+" };
        int rows = 5;
        int cols = 4;
        int buttonWidth = (calculadora.getWidth() - 50) / cols;
        int buttonHeight = (calculadora.getHeight() - 100) / rows;
        int startX = 10;
        int startY = 60;
        for (int i = 0; i < labels.length; i++) {
            int row = i / cols;
            int col = i % cols;
            JButton button = new JButton(labels[i]);
            button.setBounds(startX + col * (buttonWidth + 10), startY + row * (buttonHeight + 10), buttonWidth, buttonHeight);
            calculadora.add(button);
        }
    }

    private void etiquetaDeTexto(String dato, int x, int y, int h, int w, JPanel panel) {
        JLabel etiqueta = new JLabel();
        etiqueta.setText(dato);
        etiqueta.setBounds(x, y, h, w);
        panel.add(etiqueta);
    }

    private void cajaDeTexto(String dato, int x, int y, int h, int w, JPanel panel) {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(x, y, h, w);
        cajaTexto.setText(dato);
        panel.add(cajaTexto);
    }

    private void cajaDeContrasena(int x, int y, int h, int w, JPanel panel) {
        cajaContrasena = new JPasswordField();
        cajaContrasena.setBounds(x, y, h, w);
        panel.add(cajaContrasena);
    }

    private void areaDeTexto(String dato, int x, int y, int h, int w, JPanel panel) {
        areaTexto = new JTextArea();
        areaTexto.setBounds(x, y, h, w);
        areaTexto.setText(dato);
        panel.add(areaTexto);
    }

    private void checkBoxes(int x, int y, int h, int w, JPanel panel) {
        for (int i = 1; i <= 4; i++) {
            JCheckBox checkBox = new JCheckBox("Opcion " + i);
            checkBox.setBounds(x, y + (i - 1) * 30, h, w);
            panel.add(checkBox);
        }
    }

    private void menuDesplegable(int x, int y, int h, int w, JPanel panel) {
        String[] opciones = { "Opción 1", "Opción 2", "Opción 3", "Opción 4" };
        menuDesplegable = new JComboBox<>(opciones);
        menuDesplegable.setBounds(x, y, h, w);
        panel.add(menuDesplegable);
    }

    private void botonGuardar(int x, int y, int h, int w, JPanel panel) {
        JButton boton = new JButton("Guardar");
        boton.setBounds(x, y, h, w);
        panel.add(boton);
    }
}
