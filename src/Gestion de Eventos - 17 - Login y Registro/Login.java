import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSeparator;

public class Login {

	private JFrame frame;
	private JTextField txtfNombre;
	private JPasswordField pwfContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1039, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnInicio);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnLogin);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnRegistro);
		
		JButton btnCarga = new JButton("Carga");
		btnCarga.setEnabled(false);
		toolBar.add(btnCarga);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setEnabled(false);
		toolBar.add(btnAyuda);
		
		JPanel pnlLogin = new JPanel();
		frame.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		pnlLogin.setLayout(null);
		
		JLabel lblIniciarSesion = new JLabel("Iniciar sesion");
		lblIniciarSesion.setBounds(210, 11, 569, 175);
		pnlLogin.add(lblIniciarSesion);
		lblIniciarSesion.setFont(new Font("Tw Cen MT", Font.BOLD, 60));
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre de usuario");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNombre.setBounds(271, 197, 450, 33);
		pnlLogin.add(lblNombre);
		
		txtfNombre = new JTextField();
		txtfNombre.setBounds(320, 241, 354, 41);
		pnlLogin.add(txtfNombre);
		txtfNombre.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Ingrese su contraseña");
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblContrasena.setBounds(271, 314, 450, 33);
		pnlLogin.add(lblContrasena);
		
		pwfContrasena = new JPasswordField();
		pwfContrasena.setBounds(320, 358, 354, 41);
		pnlLogin.add(pwfContrasena);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(320, 301, 354, 2);
		pnlLogin.add(separator);
		
		JButton btnLoginMenu = new JButton("Login");
		btnLoginMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error();
			}
		});
		btnLoginMenu.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		btnLoginMenu.setBounds(399, 450, 203, 80);
		pnlLogin.add(btnLoginMenu);
	}
	private void error() {
            JOptionPane.showMessageDialog(null, "ERROR1; error al querer acceder");

        }   
	
}

