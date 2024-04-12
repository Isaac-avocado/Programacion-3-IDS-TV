import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class LOGIN_REGISTRO {

	private static JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	//private JTextField pwfContrasena;
	private JTextField pwfConFContrasena;
	private JTextField textFieldCorreoE;
	private JTextField txtfNombre;
	private JPasswordField pwfContrasena;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_REGISTRO window = new LOGIN_REGISTRO();
					//frame = new JFrame();
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
	public LOGIN_REGISTRO() {
		frame = new JFrame();
		//login();
		registro();
		
		System.out.println("Hola");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void registro() {

		//frame = new JFrame();
		frame.setBounds(100, 100, 1039, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnInicio = new JButton("Inicio");
		toolBar.add(btnInicio);
		
		JPanel pnlRegistro = new JPanel();
		pnlRegistro.setLayout(null);
		frame.getContentPane().add(pnlRegistro);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.getContentPane().remove(pnlRegistro);
				System.out.println("Hola");
				login();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		toolBar.add(btnLogin);
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnRegistro);
		
		//JButton btnRegistro = new JButton("Registro");
		//toolBar.add(btnRegistro);
		
		JButton btnCarga = new JButton("Carga");
		btnCarga.setEnabled(false);
		toolBar.add(btnCarga);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setEnabled(false);
		toolBar.add(btnAyuda);
		
		
		
		JButton btnTerminosyCondiciones = new JButton("términos y condiciones");
		btnTerminosyCondiciones.setFont(new Font("Tw Cen MT", Font.BOLD, 11));
		btnTerminosyCondiciones.setBounds(395, 500, 147, 23);
		btnTerminosyCondiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				terminosycondiciones();
			}
		});
		pnlRegistro.add(btnTerminosyCondiciones);
		
		JLabel lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarse.setFont(new Font("Tw Cen MT", Font.BOLD, 60));
		lblRegistrarse.setBounds(210, 11, 569, 175);
		pnlRegistro.add(lblRegistrarse);
		
		JLabel lblNombre = new JLabel("Ingrese su nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNombre.setBounds(136, 197, 354, 33);
		pnlRegistro.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(136, 241, 354, 41);
		pnlRegistro.add(textFieldNombre);
		
		JLabel lblCorreoE = new JLabel("Correo electrónico");
		lblCorreoE.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoE.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblCorreoE.setBounds(271, 314, 450, 33);
		pnlRegistro.add(lblCorreoE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(136, 301, 718, 2);
		pnlRegistro.add(separator);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(500, 241, 354, 41);
		pnlRegistro.add(textFieldApellido);
		
		JLabel lblApellido = new JLabel("Ingrese su apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblApellido.setBounds(500, 197, 354, 33);
		pnlRegistro.add(lblApellido);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblContraseña.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblContraseña.setBounds(136, 410, 354, 33);
		pnlRegistro.add(lblContraseña);
		
		pwfContrasena = new JPasswordField();
		pwfContrasena.setColumns(10);
		pwfContrasena.setBounds(136, 454, 354, 41);
		pnlRegistro.add(pwfContrasena);
		
		pwfConFContrasena = new JPasswordField();
		pwfConFContrasena.setColumns(10);
		pwfConFContrasena.setBounds(500, 454, 354, 41);
		pnlRegistro.add(pwfConFContrasena);
		
		JLabel lblConFContraseña = new JLabel("Confirmar contraseña");
		lblConFContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblConFContraseña.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblConFContraseña.setBounds(500, 410, 354, 33);
		pnlRegistro.add(lblConFContraseña);
		
		textFieldCorreoE = new JTextField();
		textFieldCorreoE.setColumns(10);
		textFieldCorreoE.setBounds(320, 358, 354, 41);
		pnlRegistro.add(textFieldCorreoE);
		
		JCheckBox chckbxTerminosyCondiciones = new JCheckBox("Acepto los                                                 , vendo mi alma al diablo.");
        chckbxTerminosyCondiciones.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
        chckbxTerminosyCondiciones.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxTerminosyCondiciones.setBounds(209, 500, 570, 23);
        pnlRegistro.add(chckbxTerminosyCondiciones);
		
        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		btnRegistrarse.setBounds(346, 540, 300, 80);
        btnRegistrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String apellido = textFieldApellido.getText();
                String correo = textFieldCorreoE.getText();
                String contrasena = new String(((JPasswordField) pwfContrasena).getPassword());
                String confContrasena = new String(((JPasswordField) pwfConFContrasena).getPassword());
                boolean aceptaTerminos = chckbxTerminosyCondiciones.isSelected();

                if (contrasena.isEmpty() || confContrasena.isEmpty() & !contrasena.equals(confContrasena)) {
                    JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else if (!aceptaTerminos) {
                    JOptionPane.showMessageDialog(frame, "Debe aceptar los términos y condiciones", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else { 
                	JOptionPane.showMessageDialog(frame, "¡Registro exitoso!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                	frame.getContentPane().remove(pnlRegistro);
    				
    				login();
    				frame.getContentPane().repaint();
    				frame.getContentPane().revalidate();
    				}
            }
        });
        btnRegistrarse.setBounds(346, 540, 300, 80);
        pnlRegistro.add(btnRegistrarse);        
        
	}
	private void login() {
		//frame = new JFrame();
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
				System.out.println("Hola desde el panel login");
			}
		});
		toolBar.add(btnLogin);
		JPanel pnlLogin = new JPanel();
		frame.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		pnlLogin.setLayout(null);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(pnlLogin);
				
				registro();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		toolBar.add(btnRegistro);
		
		JButton btnCarga = new JButton("Carga");
		btnCarga.setEnabled(false);
		toolBar.add(btnCarga);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setEnabled(false);
		toolBar.add(btnAyuda);
		
		
		
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
		
		JButton btnNewButton = new JButton("Registrar nuevo usuario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//registro();
				frame.getContentPane().remove(pnlLogin);
				
				registro();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();

			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
		btnNewButton.setBounds(432, 540, 138, 21);
		pnlLogin.add(btnNewButton);
	}
	private void error() {
            JOptionPane.showMessageDialog(null, "ERROR1; error al querer acceder");

        } 
	private void terminosycondiciones() {
        JOptionPane.showMessageDialog(null, "Términos y Condiciones para la Venta del Alma al Diablo\r\n"
        		+ "\r\n"
        		+ "Por favor, lea atentamente los siguientes términos y condiciones antes de proceder a vender su alma al diablo. Al aceptar estos términos, usted acepta renunciar a su alma a cambio de beneficios terrenales. Tenga en cuenta que la venta del alma es un asunto serio y puede tener consecuencias permanentes.\r\n"
        		+ "\r\n"
        		+ "    Partes Involucradas:\r\n"
        		+ "        La \"Parte A\" se refiere a usted, el vendedor de su alma.\r\n"
        		+ "        La \"Parte B\" se refiere al Diablo, conocido también como Lucifer, Satán, Mefistófeles, entre otros alias.\r\n"
        		+ "\r\n"
        		+ "    Descripción del Servicio:\r\n"
        		+ "        La Parte B adquiere el alma de la Parte A a cambio de beneficios terrenales y/o poderes sobrenaturales, según lo acordado en el contrato.\r\n"
        		+ "\r\n"
        		+ "    Compensación:\r\n"
        		+ "        La Parte A recibirá los beneficios acordados por la venta de su alma, que pueden incluir riquezas, poder, fama, amor eterno, habilidades especiales, entre otros.\r\n"
        		+ "        La Parte B no se hace responsable de los efectos secundarios o consecuencias no deseadas de los beneficios otorgados.\r\n"
        		+ "\r\n"
        		+ "    Duración del Acuerdo:\r\n"
        		+ "        El acuerdo para la venta del alma es válido por toda la eternidad, sin opción a rescisión o revocación por parte de la Parte A.\r\n"
        		+ "\r\n"
        		+ "    Consecuencias:\r\n"
        		+ "        La Parte A renuncia a cualquier reclamación futura sobre su alma y acepta cualquier castigo o condenación asociada con la venta del alma al diablo.\r\n"
        		+ "        La Parte B se reserva el derecho de reclamar el alma de la Parte A en cualquier momento y lugar, de acuerdo con los términos de este contrato.\r\n"
        		+ "\r\n"
        		+ "    Jurisdicción y Ley Aplicable:\r\n"
        		+ "        Este contrato está sujeto a las leyes del Infierno y se regirá e interpretará de acuerdo con ellas.\r\n"
        		+ "\r\n"
        		+ "    Aceptación:\r\n"
        		+ "        Al aceptar estos términos y condiciones, la Parte A reconoce que ha leído y comprendido completamente el contenido de este contrato y está de acuerdo con todas sus disposiciones.");

    }
}


