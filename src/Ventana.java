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
		private JPanel panel, registro, login;
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
			panelRegistro();
			String dato;
			int x,y,h,w;
			etiquetaDeTexto(dato="SISTEMA P.A.C.S.",125,30,200,30, login);
			etiquetaDeTexto(dato="Token",140,100,200,30, login);
			etiquetaDeTexto(dato="Contraseña",132,200,200,30, login);
			botonAccion();
			cajaDeTexto();
			cajaDeContrasena();
			
			this.revalidate();
			this.repaint();
			
		}
		private void panelComponentes() {
			panel = new JPanel();
			//panel.setBackground(Color.WHITE);
			panel.setLayout(null);
			this.add(panel);
			
			login = new JPanel();
			login.setSize(this.getWidth()/2, this.getHeight());
			login.setLocation(0,0);
			login.setBackground(Color.GRAY);
			login.setLayout(null);
			panel.add(login);
			
			//JLabel etiqueta = new JLabel();
			//etiqueta.setText("SISTEMA P.A.C.S.");
			//panel.add(etiqueta);
		}
		private void panelRegistro() {
			registro = new JPanel();
			registro.setSize(this.getWidth()/2, this.getHeight());
			registro.setLocation(this.getWidth()/2,0);
			registro.setBackground(Color.WHITE);
			registro.setLayout(null);
			panel.add(registro);
			
			
			//JLabel etiqueta = new JLabel();
			//etiqueta.setText("SISTEMA P.A.C.S.");
			//panel.add(etiqueta);
		}
		private void etiquetaDeTexto(String dato,int x,int y, int h,int w, JPanel panel) {
			JLabel etiqueta = new JLabel();
			etiqueta.setText(dato);
			etiqueta.setBounds(x,y,h,w);
			panel.add(etiqueta);
		}
		private void cajaDeTexto() {
			JTextField cajaTexto = new JTextField();
			cajaTexto.setBounds(100,130,200,30);
			//cajaTexto.setText("Hola.");
			login.add(cajaTexto);
		}
		private void cajaDeContrasena() {
			JPasswordField cajaContrasena = new JPasswordField();
			cajaContrasena.setBounds(100,230,200,30);
			login.add(cajaContrasena);
		}
		private void botonAccion() {
			JButton boton = new JButton("ENTRAR");
			boton.setBounds(125,300,100,30);
			//boton.addActionListener((ActionListener) this);
			login.add(boton);
		}
		@SuppressWarnings("unused")
		private void actionPerformed(ActionEvent accion) {
			String token = cajaTexto.getText();		
			String contrasena = cajaContrasena.getText();
			String login = "Login" + token +" - "+contrasena+"...COMPLETO.";
		}
}
