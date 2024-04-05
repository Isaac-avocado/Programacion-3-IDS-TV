import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.event.ActionEvent;

public class teclado_contra_reloj2 {

	private JFrame frame;
	private JTextField txtRespuestaAqui;
	private JLabel lblNewLabel;

    private String[] palabras = { "hola", "mundo", "java", "programacion", "teclado", "rapido", "ventana", "boton",
            "etiqueta", "texto", "juego" };
    private String palabraActual;
    
 // Botones del teclado virtual
    private JButton[] botonesTeclado;


	/**
	 * Launch the application.
	 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    teclado_contra_reloj2 window = new teclado_contra_reloj2();
                    window.frame.setVisible(true);
                    // Mostrar las instrucciones
                    JOptionPane.showMessageDialog(null, "Presiona las letras del teclado para escribir la palabra mostrada.\n" +
                            "Una vez que hayas completado la palabra, presiona Enter.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

	/**
	 * Create the application.
	 */
	public teclado_contra_reloj2() {
		initialize();
		mostrarPalabraAleatoria();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlBase = new JPanel();
		pnlBase.setBackground(new Color(255, 153, 153));
		pnlBase.setBounds(0, 0, 986, 563);
		frame.getContentPane().add(pnlBase);
		pnlBase.setLayout(null);
		
		JPanel pnlMeta = new JPanel();
		pnlMeta.setBackground(new Color(204, 255, 102));
		pnlMeta.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlMeta.setBounds(10, 10, 966, 74);
		pnlBase.add(pnlMeta);
		pnlMeta.setLayout(null);
		
		lblNewLabel = new JLabel("Palabra aqui");
		lblNewLabel.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 946, 54);
		pnlMeta.add(lblNewLabel);
		
		JPanel pnlTeclado = new JPanel();
		pnlTeclado.setBackground(new Color(204, 255, 153));
		pnlTeclado.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlTeclado.setBounds(10, 178, 966, 375);
		pnlBase.add(pnlTeclado);
		pnlTeclado.setLayout(null);
		
		JPanel pnlFilaTeclas = new JPanel();
		pnlFilaTeclas.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlFilaTeclas.setBackground(new Color(204, 255, 102));
		pnlFilaTeclas.setBounds(10, 10, 946, 74);
		pnlTeclado.add(pnlFilaTeclas);
		pnlFilaTeclas.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("T");
		btnNewButton_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1.setBounds(390, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1);
            }
        });
		
		JButton btnNewButton_1_1 = new JButton("Q");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_1.setBounds(10, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_1);
            }
        });
		
		JButton btnNewButton_1_2 = new JButton("W");
		btnNewButton_1_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_2.setBounds(105, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_2);
            }
        });
		
		JButton btnNewButton_1_3 = new JButton("E");
		btnNewButton_1_3.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_3.setBounds(200, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_3);
            }
        });
		
		JButton btnNewButton_1_4 = new JButton("R");
		btnNewButton_1_4.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_4.setBounds(295, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_4);
		btnNewButton_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_4);
            }
        });
		
		JButton btnNewButton_1_5 = new JButton("Y");
		btnNewButton_1_5.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_5.setBounds(485, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_5);
		btnNewButton_1_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_5);
            }
        });
		
		JButton btnNewButton_1_6 = new JButton("U");
		btnNewButton_1_6.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_6.setBounds(580, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_6);
		btnNewButton_1_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_6);
            }
        });
		
		JButton btnNewButton_1_7 = new JButton("I");
		btnNewButton_1_7.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_7.setBounds(675, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_7);
		btnNewButton_1_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_7);
            }
        });
		
		JButton btnNewButton_1_8 = new JButton("O");
		btnNewButton_1_8.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_8.setBounds(770, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_8);
		btnNewButton_1_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_8);
            }
        });
		
		JButton btnNewButton_1_9 = new JButton("P");
		btnNewButton_1_9.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_9.setBounds(861, 8, 85, 56);
		pnlFilaTeclas.add(btnNewButton_1_9);
		btnNewButton_1_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_9);
            }
        });
		
		JPanel pnlFilaTeclas_1 = new JPanel();
		pnlFilaTeclas_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlFilaTeclas_1.setBackground(new Color(204, 255, 102));
		pnlFilaTeclas_1.setBounds(10, 94, 946, 74);
		pnlTeclado.add(pnlFilaTeclas_1);
		pnlFilaTeclas_1.setLayout(null);
		
		JButton btnNewButton_1_9_1 = new JButton("Ñ");
		btnNewButton_1_9_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_9_1.setBounds(851, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_9_1);
		btnNewButton_1_9_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_9_1);
            }
        });
		
		JButton btnNewButton_1_8_1 = new JButton("L");
		btnNewButton_1_8_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_8_1.setBounds(760, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_8_1);
		btnNewButton_1_8_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_8_1);
            }
        });
		
		JButton btnNewButton_1_7_1 = new JButton("K");
		btnNewButton_1_7_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_7_1.setBounds(665, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_7_1);
		btnNewButton_1_7_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_7_1);
            }
        });
		
		JButton btnNewButton_1_6_1 = new JButton("J");
		btnNewButton_1_6_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_6_1.setBounds(570, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_6_1);
		btnNewButton_1_6_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_6_1);
            }
        });
		
		JButton btnNewButton_1_5_1 = new JButton("H");
		btnNewButton_1_5_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_5_1.setBounds(475, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_5_1);
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_5_1);
            }
        });
		
		JButton btnNewButton_1_10 = new JButton("G");
		btnNewButton_1_10.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_10.setBounds(380, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_10);
		btnNewButton_1_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_10);
            }
        });
		
		JButton btnNewButton_1_4_1 = new JButton("F");
		btnNewButton_1_4_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_4_1.setBounds(285, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_4_1);
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_4_1);
            }
        });
		
		JButton btnNewButton_1_3_1 = new JButton("D");
		btnNewButton_1_3_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_3_1.setBounds(190, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_3_1);
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_3_1);
            }
        });
		
		JButton btnNewButton_1_2_1 = new JButton("S");
		btnNewButton_1_2_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_2_1.setBounds(95, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_2_1);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_2_1);
            }
        });
		
		JButton btnNewButton_1_1_1 = new JButton("A");
		btnNewButton_1_1_1.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_1_1.setBounds(0, 10, 85, 56);
		pnlFilaTeclas_1.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_1_1);
            }
        });
		
		JPanel pnlFilaTeclas_2 = new JPanel();
		pnlFilaTeclas_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlFilaTeclas_2.setBackground(new Color(204, 255, 102));
		pnlFilaTeclas_2.setBounds(10, 178, 946, 74);
		pnlTeclado.add(pnlFilaTeclas_2);
		pnlFilaTeclas_2.setLayout(null);
		
		JButton btnNewButton_1_7_2 = new JButton("M");
		btnNewButton_1_7_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_7_2.setBounds(675, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_7_2);
		btnNewButton_1_7_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_7_2);
            }
        });
		
		JButton btnNewButton_1_6_2 = new JButton("N");
		btnNewButton_1_6_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_6_2.setBounds(580, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_6_2);
		btnNewButton_1_6_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_6_2);
            }
        });
		
		JButton btnNewButton_1_5_2 = new JButton("B");
		btnNewButton_1_5_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_5_2.setBounds(485, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_5_2);
		btnNewButton_1_5_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_5_2);
            }
        });
		
		JButton btnNewButton_1_11 = new JButton("V");
		btnNewButton_1_11.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_11.setBounds(390, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_11);
		btnNewButton_1_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_11);
            }
        });
		
		JButton btnNewButton_1_4_2 = new JButton("C");
		btnNewButton_1_4_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_4_2.setBounds(295, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_4_2);
		btnNewButton_1_4_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_4_2);
            }
        });
		
		JButton btnNewButton_1_3_2 = new JButton("X");
		btnNewButton_1_3_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_3_2.setBounds(200, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_3_2);
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_3_2);
            }
        });
		
		JButton btnNewButton_1_2_2 = new JButton("Z");
		btnNewButton_1_2_2.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnNewButton_1_2_2.setBounds(105, 10, 85, 56);
		pnlFilaTeclas_2.add(btnNewButton_1_2_2);
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnNewButton_1_2_2);
            }
        });
		
		JPanel pnlFilaTeclas_3 = new JPanel();
		pnlFilaTeclas_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlFilaTeclas_3.setBackground(new Color(204, 255, 102));
		pnlFilaTeclas_3.setBounds(10, 274, 946, 74);
		pnlTeclado.add(pnlFilaTeclas_3);
		pnlFilaTeclas_3.setLayout(null);
		
		JButton btnNewButton = new JButton("ESPACIO");
		btnNewButton.setBackground(new Color(204, 255, 102));
		btnNewButton.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		btnNewButton.setBounds(10, 10, 456, 54);
		pnlFilaTeclas_3.add(btnNewButton);
		
		JButton btnEnter = new JButton("BORRAR");
		btnEnter.setBackground(new Color(204, 255, 102));
		btnEnter.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		btnEnter.setBounds(480, 10, 456, 54);
		pnlFilaTeclas_3.add(btnEnter);
		
		JPanel pnlEscritura = new JPanel();
		pnlEscritura.setBackground(new Color(0, 51, 51));
		pnlEscritura.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlEscritura.setBounds(10, 94, 966, 74);
		pnlBase.add(pnlEscritura);
		pnlEscritura.setLayout(null);
		
		txtRespuestaAqui = new JTextField();
		txtRespuestaAqui.setText("Respuesta aqui");
		txtRespuestaAqui.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		txtRespuestaAqui.setForeground(new Color(255, 255, 255));
		txtRespuestaAqui.setBackground(new Color(0, 51, 51));
		txtRespuestaAqui.setHorizontalAlignment(SwingConstants.CENTER);
		txtRespuestaAqui.setBounds(10, 10, 946, 54);
		pnlEscritura.add(txtRespuestaAqui);
		txtRespuestaAqui.setColumns(10);
		
		// Agregar ActionListener al campo de texto para procesar la palabra ingresada
        txtRespuestaAqui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprobarPalabra();
            }
        });
     // Agregar KeyListener al JFrame para manejar eventos de teclado
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLetter(keyChar)) {
                    // Convertir la letra a mayúscula
                    char upperCaseKeyChar = Character.toUpperCase(keyChar);
                    // Encontrar el índice de la letra en el teclado virtual
                    int index = upperCaseKeyChar - 'A';
                    if (index >= 0 && index < 26) {
                        JButton button = botonesTeclado[index];
                        button.doClick(); // Simular clic en el botón
                    }
                } else if (keyChar == KeyEvent.VK_SPACE) {
                    // Manejar espacio
                    // Aquí puedes agregar el código para procesar el espacio
                } else if (keyChar == KeyEvent.VK_BACK_SPACE) {
                    // Manejar retroceso (borrar)
                    // Aquí puedes agregar el código para procesar el retroceso
                }
            }
        });
    }
	private void mostrarPalabraAleatoria() {
        Random rand = new Random();
        int index = rand.nextInt(palabras.length);
        palabraActual = palabras[index];
        lblNewLabel.setText(palabraActual);
    }
	
	private void procesarLetra(JButton button) {
        // Cambiar el color del botón cuando se presione
        button.setBackground(Color.RED);
        button.setOpaque(true);

        // Cambiar el color del botón a gris cuando se suelte
        button.getModel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(UIManager.getColor("control"));
            }
        });
    }
	
	private void comprobarPalabra() {
        String respuestaUsuario = txtRespuestaAqui.getText().trim();
        if (respuestaUsuario.equalsIgnoreCase(palabraActual)) {
            // Mostrar un mensaje de "Palabra correcta"
            JOptionPane.showMessageDialog(null, "¡Palabra correcta!");

            // Mostrar una nueva palabra
            mostrarPalabraAleatoria();
            // Limpiar el campo de texto
            txtRespuestaAqui.setText("");
        }
    }

}