import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
		private GridBagConstraints gridBagConstraints = new GridBagConstraints();
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
			panelLogin();
			panelRegistro();
			String dato;
			int x,y,h,w;
			etiquetaDeTexto(dato="SISTEMA P.A.C.S.",125,30,200,30, login,1,0);
			etiquetaDeTexto(dato="Token",140,100,200,30, login,2,0);
			etiquetaDeTexto(dato="Contraseña",132,200,200,30, login,3,0);
			
			botonAccion(4);
			cajaDeTexto(2);
			cajaDeContrasena(3);
			
			this.revalidate();
			this.repaint();
			
		}
		private void panelComponentes() {
			panel = new JPanel();
			panel.setBackground(Color.BLACK);
			//panel.setBackground(Color.WHITE);
			panel.setLayout(new GridBagLayout());
			this.add(panel);
			
		}
		private void panelLogin() {
			login = new JPanel();
			//login.setSize(this.getWidth()/2, this.getHeight());
			//login.setLocation(0,0);
			login.setBackground(Color.GRAY);
			login.setLayout(new GridBagLayout());
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridx = 1;
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			//panel.add((login), gridBagConstraints);
			panel.add(login);
			//JLabel etiqueta = new JLabel();
			//etiqueta.setText("SISTEMA P.A.C.S.");
			//panel.add(etiqueta);
		}
		private void panelRegistro() {
			registro = new JPanel();
			//registro.setSize(this.getWidth()/2, this.getHeight());
			//registro.setLocation(this.getWidth()/2,0);
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridx = 1;
			registro.setBackground(Color.WHITE);
			registro.setLayout(null);
			panel.add((registro), gridBagConstraints);
			
			
			//JLabel etiqueta = new JLabel();
			//etiqueta.setText("SISTEMA P.A.C.S.");
			//panel.add(etiqueta);
		}
		private void etiquetaDeTexto(String dato,int x,int y, int h,int w, JPanel panel, int gridY, int gridX) {
			JLabel etiqueta = new JLabel();
			etiqueta.setText(dato);
			//etiqueta.setBounds(x,y,h,w);
			//panel.setLayout(new GridBagLayout());
			//panel.setLayout(null);
			gridBagConstraints.fill=gridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = gridY;
			gridBagConstraints.gridx = gridX;
			gridBagConstraints.weightx = 0.4;
			gridBagConstraints.weighty = 0;
			
			//gridBagConstraints.insets = new Insets(5, 5, 5, 5);
			panel.add((etiqueta), gridBagConstraints);
		}
		private void cajaDeTexto(int gridNumero) {
			JTextField cajaTexto = new JTextField();
			//cajaTexto.setBounds(100,130,200,30);
			//cajaTexto.setText("Hola.");
			//panel.setLayout(new GridBagLayout());
			//panel.setLayout(null);
			gridBagConstraints.fill=gridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = gridNumero;
			gridBagConstraints.weightx = 0.4;
			gridBagConstraints.weighty = 0.4;
			//gridBagConstraints.insets = new Insets(5, 5, 5, 5);
			login.add((cajaTexto), gridBagConstraints);
		}
		private void cajaDeContrasena(int gridNumero) {
			JPasswordField cajaContrasena = new JPasswordField();
			//cajaContrasena.setBounds(100,230,200,30);
			//panel.setLayout(new GridBagLayout());
			//panel.setLayout(null);
			gridBagConstraints.fill=gridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = gridNumero;
			gridBagConstraints.weightx = 0.4;
			gridBagConstraints.weighty = 0.4;
			//gridBagConstraints.insets = new Insets(5, 5, 5, 5);
			login.add((cajaContrasena), gridBagConstraints);
		}
		private void botonAccion(int gridNumero) {
			JButton boton = new JButton("ENTRAR");
			//boton.setBounds(125,300,100,30);
			//boton.addActionListener((ActionListener) this);
			panel.setLayout(new GridBagLayout());
			//panel.setLayout(null);
			gridBagConstraints.fill=gridBagConstraints.HORIZONTAL;
			gridBagConstraints.anchor = GridBagConstraints.PAGE_END;
			gridBagConstraints.gridy = gridNumero;
			gridBagConstraints.weightx = 0.4;
			gridBagConstraints.weighty = 0.4;
			//gridBagConstraints.insets = new Insets(5, 5, 5, 5);
			login.add((boton), gridBagConstraints);
		}
		@SuppressWarnings("unused")
		private void actionPerformed(ActionEvent accion) {
			String token = cajaTexto.getText();		
			String contrasena = cajaContrasena.getText();
			String login = "Login" + token +" - "+contrasena+"...COMPLETO.";
		}
}