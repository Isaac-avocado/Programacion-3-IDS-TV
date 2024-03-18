import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class Ventana extends JFrame {
	private JMenuBar menuBar;
    private JMenu menuArchivo, menuAyuda;
    private JMenuItem menuItemSalir, menuItemAcercaDe;
    private JPanel panel, registro, login, calculadora;
    private JTextField cajaTexto,resultado;
    private JPasswordField cajaContrasena;
    private JTextArea areaTexto;
    private JComboBox<String> menuDesplegable;
    private JLabel imagen;
    private         String dato;

    public Ventana() {
        setVisible(true);
        setTitle("Login window");
        setSize(800, 800);
        setMinimumSize(new Dimension(800, 800));
        setMaximumSize(new Dimension(800, 800));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
     // Crear la barra de menú
        menuBar = new JMenuBar();
        
        // Crear los menús
        menuArchivo = new JMenu("Archivo");
        menuAyuda = new JMenu("Ayuda");

        // Crear los elementos de menú para el menú "Archivo"
        menuItemSalir = new JMenuItem("Salir");
        menuArchivo.add(menuItemSalir);

        // Crear los elementos de menú para el menú "Ayuda"
        menuItemAcercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(menuItemAcercaDe);

        // Agregar los menús a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);

        // Asignar la barra de menú a la ventana
        setJMenuBar(menuBar);
        
        activarComponentes();
    }

    private void activarComponentes() {
        panelComponentes();
        panelRegistro();
        panelCalculadora();      
        
        etiquetaDeTexto(dato = "SISTEMA P.A.C.S.", 90, 30, 200, 30, login);
        //etiquetaDeTexto(dato = "Token", 140, 100, 200, 30, login);
        //etiquetaDeTexto(dato = "Contraseña", 110, 200, 200, 30, login);
        etiquetaDeTexto(dato = "SISTEMA P.A.C.S.", 110, 30, 200, 30, registro);
        etiquetaDeTexto(dato = "Nombre", 140, 100, 200, 30, registro);

        cajaDeTexto(dato = "Ingrese su nombre...", 60, 150, 200, 30, registro);
        checkBoxes(60, 200, 200, 30, registro);
        areaDeTexto(dato = "Ingrese su párrafo...", 60, 442, 200, 100, registro);
        menuDesplegable(60, 600, 200, 30, registro);
        botonGuardar(110, 700, 100, 30, registro);

        //cajaDeTexto(dato = "Ingrese su token...", 80, 150, 200, 30, login);
        //cajaDeContrasena(80, 250, 200, 30, login);
        
        this.imagen(login, registro);

        this.revalidate();
        this.repaint();
        
        registro.repaint();

    }

    private void panelComponentes() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        login = new JPanel();
        login.setSize(this.getWidth() / 2, this.getHeight());
        login.setLocation(0, 0);
        login.setBackground(Color.decode("#090983"));
        login.setLayout(null);
		
		JLabel askAcount = new JLabel("¿Cuenta sin asignar?",0);
		askAcount.setBounds(110, 350,140, 30);
		askAcount.setForeground(Color.WHITE);
		askAcount.setFont(new Font("Agency FB", Font.BOLD,20));
		login.add(askAcount);
		
		JButton singIn = new JButton("ENTRAR");
				singIn.setForeground(Color.black);
		singIn.setFont(new Font("Agency FB", Font.BOLD,30));
		singIn.setBackground(Color.decode("#FFDF6D"));
		singIn.setBounds(120, 300, 120, 45);
		
		singIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] test =  login.getComponents();
				Component[] test2 = registro.getComponents();
				
				for (int i = 0; i < test.length; i++) {
					
					if(test[i].getClass().toString().equals("class javax.swing.JTextField")) {
						JTextField t = (JTextField) test[i];
						if(t.getText().length()<=0) {
							t.setBorder(new LineBorder(Color.red,4));
							
						}else {
							t.setBorder(new LineBorder(Color.GREEN,4));
						}
						
						//JTextField t = (JTextField) test[i];
						//t.setBorder(new LineBorder(Color.red,4));
					}
					if(test[i].getClass().toString().equals("class javax.swing.JPasswordField")) {
						JPasswordField t = (JPasswordField) test[i];
						String contra = new String(t.getPassword());
						
						if(contra.length()<=0) {
							t.setBorder(new LineBorder(Color.red,4));
							
						}else {
							t.setBorder(new LineBorder(Color.GREEN,4));
						}
					}
					System.out.println(test[i].getClass().toString());
					
					
				}
				for (int i = 0; i < test2.length; i++) {
					if(test2[i].getClass().toString().equals("class javax.swing.JCheckBox")) {
						JCheckBox t = (JCheckBox) test2[i];
						//String check = new String(check.getPassword());
						
						if(t.isSelected()==false) {
							t.setBorderPainted(true);
							t.setBorder(new LineBorder(Color.red,4));
							
						}else {
							t.setBorderPainted(true);
							t.setBorder(new LineBorder(Color.GREEN,4));
						}
					}
					
					if(test2[i].getClass().toString().equals("class javax.swing.JTextField")) {
						JTextField t = (JTextField) test2[i];
						if(t.getText().length()<=0) {
							t.setBorder(new LineBorder(Color.red,4));
							
						}else {
							t.setBorder(new LineBorder(Color.GREEN,4));
						}
					}
					if(test2[i].getClass().toString().equals("class javax.swing.JTextArea")) {
						JTextArea t = (JTextArea) test2[i];
						if(t.getText().length()<=0) {
							t.setBorder(new LineBorder(Color.red,4));
							
						}else {
							t.setBorder(new LineBorder(Color.GREEN,4));
						}
					}
					
					System.out.println(test2[i].getClass().toString());
					System.out.println("helado");
					
				}
				
				
			}});
		
		
		singIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola");
			}
		});
			
		
		
		
		login.add(singIn);
		
		JButton singUp = new JButton("ASIGNAR");
		singUp.setForeground(Color.black);
		singUp.setFont(new Font("Agency FB", Font.BOLD,30));
		singUp.setBackground(Color.decode("#FFDF6D"));
		singUp.setBounds(120, 380, 120, 45);
		login.add(singUp);
		
		JLabel imag = new JLabel ("");
		imag.setIcon(new ImageIcon(getClass().getResource("hombre.png")));
		imag.setBounds(30, 148, 35, 35 );
		imag.setOpaque(true);
		imag.setBackground(Color.WHITE);
		login.add(imag);
		
		JLabel img2 = new JLabel ("");
		img2.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		img2.setBounds(30, 248, 35, 35 );
		img2.setOpaque(true);
		img2.setBackground(Color.WHITE);
		login.add(img2);
		
		etiquetaDeTexto(dato = "SISTEMA P.A.C.S.", 90, 30, 200, 30, login);
        etiquetaDeTexto(dato = "Token", 140, 100, 200, 30, login);
        etiquetaDeTexto(dato = "Contraseña", 110, 200, 200, 30, login);
        
        
        
        cajaDeTexto(dato = "Ingrese su token...", 80, 150, 200, 30, login);
        cajaDeContrasena(80, 250, 200, 30, login);
        
        //System.out.println(cajaDeTexto.getText());
        
		
		JLabel etiqueta = new JLabel(" ");
		etiqueta.setBounds(230, 10, this.getWidth(), 30);
		etiqueta.setBackground(Color.decode("#000066"));
		etiqueta.setBounds(10, 80, 375, 275);
		etiqueta.setOpaque(true);
		login.add(etiqueta);
		
        this.revalidate();
        this.repaint();
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
        calculadora.setSize(400, 215);
        calculadora.setLocation(0, this.getHeight() - 255);
        calculadora.setBackground(Color.WHITE);
        calculadora.setLayout(new BorderLayout());
        panel.add(calculadora);

        JLabel input = new JLabel("20.00");
		input.setFont(new Font("Agency FB", Font.BOLD, 40));
		input.setBackground(Color.white);
		input.setOpaque(true);
		calculadora.add(input, BorderLayout.NORTH);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,4));
		botones.setBackground(Color.decode("#000066"));
		calculadora.add(botones, BorderLayout.CENTER);
		
		String btn_text[]= {"9","8","7","6","5","4","3","2","1","0",".","+"};
		
		for(int i=0;i<btn_text.length;i++) {
			botones.add(new JButton(btn_text[i]));
		}
		
		JPanel action = new JPanel();
		
		action.setLayout(new GridLayout(6,1));
		action.setBackground(Color.decode("#000066"));
		calculadora.add(action, BorderLayout.EAST);
		
		String action_text[]= {"CE","*","/","-","="};
		
		for(int i=0;i<action_text.length;i++) {
			action.add(new JButton(action_text[i]));
			
			repaint();
		login.add(calculadora);
		}
    }

    private void etiquetaDeTexto(String dato, int x, int y, int h, int w, JPanel panel) {
        JLabel etiqueta = new JLabel();
        etiqueta.setFont(new Font("Agency FB", Font.BOLD,35));
        etiqueta.setForeground(Color.white);
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
    private void imagen(JPanel panel, JPanel panel2) {
    	
    	JLabel img = new JLabel("");
    	img.setIcon(new ImageIcon(getClass().getResource("cia_3.png")));
    	img.setBounds(10,10,50,50);
    	img.setOpaque(true);
    	img.setBackground(Color.white);
    	
    	panel.add(img); 
    	
    	panel.repaint();
    	
    	System.out.println("hola");
    }
    
}