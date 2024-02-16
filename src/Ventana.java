import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
		private JPanel panel;
		private JTextField cajaTexto;
		private JPasswordField cajaContrasena;
		public Ventana() {
			setVisible(true);
			setTitle("Login window");
			setSize(600,600);
			setMinimumSize(new Dimension (600, 600));
			setMaximumSize(new Dimension (600, 600));
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.LIGHT_GRAY);
			activarComponentes();
		}
		private void activarComponentes() {
			panelComponentes();
			String dato;
			int x,y,h,w;
			etiquetaDeTexto(dato="SISTEMA P.A.C.S.",250,30,200,30);
			etiquetaDeTexto(dato="Token",280,100,200,30);
			etiquetaDeTexto(dato="Contraseña",265,200,200,30);
			botonAccion();
			cajaDeTexto();
			cajaDeContrasena();
			
		}
		private void panelComponentes() {
			panel = new JPanel();
			//panel.setBackground(Color.WHITE);
			panel.setLayout(null);
			this.getContentPane().add(panel);
			
			//JLabel etiqueta = new JLabel();
			//etiqueta.setText("SISTEMA P.A.C.S.");
			//panel.add(etiqueta);
		}
		private void etiquetaDeTexto(String dato,int x,int y, int h,int w) {
			JLabel etiqueta = new JLabel();
			etiqueta.setText(dato);
			etiqueta.setBounds(x,y,h,w);
			panel.add(etiqueta);
		}
		private void cajaDeTexto() {
			JTextField cajaTexto = new JTextField();
			cajaTexto.setBounds(200,130,200,30);
			//cajaTexto.setText("Hola.");
			panel.add(cajaTexto);
		}
		private void cajaDeContrasena() {
			JPasswordField cajaContrasena = new JPasswordField();
			cajaContrasena.setBounds(200,230,200,30);
			panel.add(cajaContrasena);
		}
		private void botonAccion() {
			JButton boton = new JButton("ENTRAR");
			boton.setBounds(250,300,100,30);
			//boton.addActionListener((ActionListener) this);
			panel.add(boton);
		}
		@SuppressWarnings("unused")
		private void actionPerformed(ActionEvent accion) {
			String token = cajaTexto.getText();		
			String contrasena = cajaContrasena.getText();
			String login = "Login" + token +" - "+contrasena+"...COMPLETO.";
		}
}
