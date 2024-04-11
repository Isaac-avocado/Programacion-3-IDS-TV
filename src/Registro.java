import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Registro {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField pwfContrasena;
	private JTextField pwfConFContrasena;
	private JTextField textFieldCorreoE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
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
		toolBar.add(btnInicio);
		
		JButton btnLogin = new JButton("Login");
		toolBar.add(btnLogin);
		
		JButton btnRegistro = new JButton("Registro");
		toolBar.add(btnRegistro);
		
		//JButton btnRegistro = new JButton("Registro");
		//toolBar.add(btnRegistro);
		
		JButton btnCarga = new JButton("Carga");
		btnCarga.setEnabled(false);
		toolBar.add(btnCarga);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setEnabled(false);
		toolBar.add(btnAyuda);
		
		JPanel pnlRegistro = new JPanel();
		pnlRegistro.setLayout(null);
		frame.getContentPane().add(pnlRegistro);
		
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
                	JOptionPane.showMessageDialog(frame, "¡Registro exitoso!", "Éxito", JOptionPane.INFORMATION_MESSAGE);}
            }
        });
        btnRegistrarse.setBounds(346, 540, 300, 80);
        pnlRegistro.add(btnRegistrarse);        
        
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
