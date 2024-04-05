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

public class teclado_contra_reloj {

	static JFrame frame;
	private JTextField txtRespuestaAqui;
	private JLabel lblNewLabel;
	
	private JPanel pnlFilaTeclas = new JPanel();

    private String[] palabras = { "hola", "mundo", "java", "programacion", "teclado", "rapido", "ventana", "boton",
            "etiqueta", "texto", "juego" };
    private String palabraActual;
    
    private JButton[] botonesTeclado;


	/**
	 * Launch the application.
	 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            	try {
                    teclado_contra_reloj window = new teclado_contra_reloj();
                    frame.setVisible(true);
                    frame.requestFocusInWindow();
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
	public teclado_contra_reloj() {
		initialize();
		mostrarPalabraAleatoria();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
        botonesTeclado = new JButton[26];
        char letra = 'A';
        for (int i = 0; i < 26; i++) {
            botonesTeclado[i] = new JButton(String.valueOf(letra));
            botonesTeclado[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    procesarLetra(source);
                }
            });
            pnlFilaTeclas.add(botonesTeclado[i]);
            letra++;
        }
		
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
		
		JPanel pnlPalabra = new JPanel();
		pnlPalabra.setBackground(new Color(204, 255, 102));
		pnlPalabra.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlPalabra.setBounds(10, 10, 966, 74);
		pnlBase.add(pnlPalabra);
		pnlPalabra.setLayout(null);
		
		lblNewLabel = new JLabel("Palabra aqui");
		lblNewLabel.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 946, 54);
		pnlPalabra.add(lblNewLabel);
		
		JPanel pnlTeclado = new JPanel();
		pnlTeclado.setBackground(new Color(204, 255, 153));
		pnlTeclado.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlTeclado.setBounds(10, 178, 966, 375);
		pnlBase.add(pnlTeclado);
		pnlTeclado.setLayout(null);
		
		JPanel pnlFilaEspacioBorrar = new JPanel();
		pnlFilaEspacioBorrar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlFilaEspacioBorrar.setBackground(new Color(204, 255, 102));
		pnlFilaEspacioBorrar.setBounds(10, 274, 946, 74);
		pnlTeclado.add(pnlFilaEspacioBorrar);
		pnlFilaEspacioBorrar.setLayout(null);
		
		JButton btnEspacio = new JButton("ESPACIO");
		btnEspacio.setBackground(new Color(204, 255, 102));
		btnEspacio.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		btnEspacio.setBounds(10, 10, 456, 54);
		pnlFilaEspacioBorrar.add(btnEspacio);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBackground(new Color(204, 255, 102));
		btnBorrar.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		btnBorrar.setBounds(480, 10, 456, 54);
		pnlFilaEspacioBorrar.add(btnBorrar);
		
		pnlFilaTeclas = new JPanel();
		pnlFilaTeclas.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlFilaTeclas.setBackground(new Color(204, 255, 102));
		pnlFilaTeclas.setBounds(10, 10, 946, 242);
		pnlTeclado.add(pnlFilaTeclas);
		pnlFilaTeclas.setLayout(null);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnT.setBounds(390, 8, 85, 56);
		pnlFilaTeclas.add(btnT);
		btnT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnT);
            }
        });
		btnT.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'T') {
		            procesarLetra(btnT);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "T");
		        }
		    }
		});
		
		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnQ.setBounds(10, 8, 85, 56);
		pnlFilaTeclas.add(btnQ);
		btnQ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnQ);
                comprobarPalabra();
            }
        });
		btnQ.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'Q') {
		            procesarLetra(btnQ);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "Q");
		        }
		    }
		});
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnW.setBounds(105, 8, 85, 56);
		pnlFilaTeclas.add(btnW);
		btnW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnW);
                comprobarPalabra();
            }
        });
		btnW.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'W') {
		            procesarLetra(btnW);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "W");
		        }
		    }
		});
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnE.setBounds(200, 8, 85, 56);
		pnlFilaTeclas.add(btnE);
		btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnE);
                comprobarPalabra();
            }
        });
		btnE.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'E') {
		            procesarLetra(btnE);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "E");
		        }
		    }
		});
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnR.setBounds(295, 8, 85, 56);
		pnlFilaTeclas.add(btnR);
		btnR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnR);
                comprobarPalabra();
            }
        });
		btnR.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'R') {
		            procesarLetra(btnR);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "R");
		        }
		    }
		});
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnY.setBounds(485, 8, 85, 56);
		pnlFilaTeclas.add(btnY);
		btnY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnY);
                comprobarPalabra();
            }
        });
		btnY.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'Y') {
		            procesarLetra(btnY);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "Y");
		        }
		    }
		});
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnU.setBounds(580, 8, 85, 56);
		pnlFilaTeclas.add(btnU);
		btnU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnU);
                comprobarPalabra();
            }
        });
		btnU.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'U') {
		            procesarLetra(btnU);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "U");
		        }
		    }
		});
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnI.setBounds(675, 8, 85, 56);
		pnlFilaTeclas.add(btnI);
		btnI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnI);
                comprobarPalabra();
            }
        });
		btnI.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'I') {
		            procesarLetra(btnI);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "I");
		        }
		    }
		});
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnO.setBounds(770, 8, 85, 56);
		pnlFilaTeclas.add(btnO);
		btnO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnO);
                comprobarPalabra();
            }
        });
		btnO.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'O') {
		            procesarLetra(btnO);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "O");
		        }
		    }
		});
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnP.setBounds(861, 8, 85, 56);
		pnlFilaTeclas.add(btnP);
		btnP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnP);
                comprobarPalabra();
            }
        });
		btnP.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'P') {
		            procesarLetra(btnP);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "P");
		        }
		    }
		});
		
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnZ.setBounds(150, 175, 85, 56);
		pnlFilaTeclas.add(btnZ);
		btnZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnZ);
                comprobarPalabra();
            }
        });
		btnZ.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'Z') {
		            procesarLetra(btnZ);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "Z");
		        }
		    }
		});
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnX.setBounds(245, 175, 85, 56);
		pnlFilaTeclas.add(btnX);
		btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnX);
                comprobarPalabra();
            }
        });
		btnX.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'X') {
		            procesarLetra(btnX);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "X");
		        }
		    }
		});
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnC.setBounds(340, 175, 85, 56);
		pnlFilaTeclas.add(btnC);
		btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnC);
                comprobarPalabra();
            }
        });
		btnC.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'C') {
		            procesarLetra(btnC);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "C");
		        }
		    }
		});
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnV.setBounds(435, 175, 85, 56);
		pnlFilaTeclas.add(btnV);
		btnV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnV);
                comprobarPalabra();
            }
        });
		btnV.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'V') {
		            procesarLetra(btnV);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "V");
		        }
		    }
		});
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnB.setBounds(530, 175, 85, 56);
		pnlFilaTeclas.add(btnB);
		btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnB);
                comprobarPalabra();
            }
        });
		btnB.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'B') {
		            procesarLetra(btnB);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "B");
		        }
		    }
		});
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnN.setBounds(625, 175, 85, 56);
		pnlFilaTeclas.add(btnN);
		btnN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnN);
                comprobarPalabra();
            }
        });
		btnN.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'N') {
		            procesarLetra(btnN);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "N");
		        }
		    }
		});
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnM.setBounds(720, 175, 85, 56);
		pnlFilaTeclas.add(btnM);
		btnM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnM);
                comprobarPalabra();
            }
        });
		btnM.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'M') {
		            procesarLetra(btnM);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "M");
		        }
		    }
		});
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnA.setBounds(0, 92, 85, 56);
		pnlFilaTeclas.add(btnA);
		btnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnA);
                comprobarPalabra();
            }
        });
		btnA.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'A') {
		            procesarLetra(btnA);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "A");
		        }
		    }
		});
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnS.setBounds(95, 92, 85, 56);
		pnlFilaTeclas.add(btnS);
		btnS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnS);
                comprobarPalabra();
            }
        });
		btnS.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'S') {
		            procesarLetra(btnS);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "S");
		        }
		    }
		});
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnD.setBounds(190, 92, 85, 56);
		pnlFilaTeclas.add(btnD);
		btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnD);
                comprobarPalabra();
            }
        });
		btnD.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'D') {
		            procesarLetra(btnD);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "D");
		        }
		    }
		});
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnF.setBounds(285, 92, 85, 56);
		pnlFilaTeclas.add(btnF);
		btnF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnF);
                comprobarPalabra();
            }
        });
		btnF.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'G') {
		            procesarLetra(btnF);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "G");
		        }
		    }
		});
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnG.setBounds(380, 92, 85, 56);
		pnlFilaTeclas.add(btnG);
		btnG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnG);
                comprobarPalabra();
            }
        });
		btnG.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'G') {
		            procesarLetra(btnG);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "G");
		        }
		    }
		});
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnH.setBounds(475, 92, 85, 56);
		pnlFilaTeclas.add(btnH);
		btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnH);
                comprobarPalabra();
            }
        });
		btnH.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'H') {
		            procesarLetra(btnH);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "H");
		        }
		    }
		});
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnJ.setBounds(570, 92, 85, 56);
		pnlFilaTeclas.add(btnJ);
		btnJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnJ);
                comprobarPalabra();
            }
        });
		btnJ.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'J') {
		            procesarLetra(btnJ);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "J");
		        }
		    }
		});
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnK.setBounds(665, 92, 85, 56);
		pnlFilaTeclas.add(btnK);
		btnK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnK);
                comprobarPalabra();
            }
        });
		btnK.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'K') {
		            procesarLetra(btnK);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "K");
		        }
		    }
		});
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnL.setBounds(760, 92, 85, 56);
		pnlFilaTeclas.add(btnL);
		btnL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnL);
                comprobarPalabra();
            }
        });
		btnL.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'L') {
		            procesarLetra(btnL);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "L");
		        }
		    }
		});
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 40));
		btnÑ.setBounds(851, 92, 85, 56);
		pnlFilaTeclas.add(btnÑ);
		btnÑ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                procesarLetra(btnÑ);
                comprobarPalabra();
            }
        });
		btnÑ.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = e.getKeyChar();
		        if (Character.toUpperCase(keyChar) == 'Ñ') {
		            procesarLetra(btnÑ);
		            txtRespuestaAqui.setText(txtRespuestaAqui.getText() + "Ñ");
		        }
		    }
		});
		
		JPanel pnlRespuesta = new JPanel();
		pnlRespuesta.setBackground(new Color(0, 51, 51));
		pnlRespuesta.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlRespuesta.setBounds(10, 94, 966, 74);
		pnlBase.add(pnlRespuesta);
		pnlRespuesta.setLayout(null);
		
		txtRespuestaAqui = new JTextField();
		txtRespuestaAqui.setFont(new Font("TypoSlab Irregular Demo", Font.PLAIN, 50));
		txtRespuestaAqui.setForeground(new Color(255, 255, 255));
		txtRespuestaAqui.setBackground(new Color(0, 51, 51));
		txtRespuestaAqui.setHorizontalAlignment(SwingConstants.CENTER);
		txtRespuestaAqui.setBounds(10, 10, 946, 54);
		pnlRespuesta.add(txtRespuestaAqui);
		txtRespuestaAqui.setColumns(10);
		
        txtRespuestaAqui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprobarPalabra();
            }
        });
        frame.setFocusable(true);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLetter(keyChar)) {
                    char upperCaseKeyChar = Character.toUpperCase(keyChar);
                    int index = upperCaseKeyChar - 'A';
                    if (index >= 0 && index < 26) {
                        JButton button = botonesTeclado[index];
                        button.setBackground(Color.RED);
                        button.setOpaque(true);
                    }
                } else if (keyChar == KeyEvent.VK_SPACE) {
                    txtRespuestaAqui.setText(txtRespuestaAqui.getText() + " ");
                } else if (keyChar == KeyEvent.VK_BACK_SPACE) {
                    // Manejar retroceso (borrar)
                    // Aquí puedes agregar el código para procesar el retroceso
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLetter(keyChar)) {
                    char upperCaseKeyChar = Character.toUpperCase(keyChar);
                    int index = upperCaseKeyChar - 'A';
                    if (index >= 0 && index < 26) {
                        JButton button = botonesTeclado[index];
                        button.setBackground(UIManager.getColor("control"));
                    }
                } else if (keyChar == KeyEvent.VK_SPACE) {
                    // Cambiar color del botón de espacio al soltar
                    // Aquí puedes agregar el código para procesar el espacio
                } else if (keyChar == KeyEvent.VK_BACK_SPACE) {
                    // Cambiar color del botón de borrar al soltar
                    // Aquí puedes agregar el código para procesar el retroceso
                }
            }
        });
        
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = txtRespuestaAqui.getText();
                if (textoActual.length() > 0) {
                    txtRespuestaAqui.setText(textoActual.substring(0, textoActual.length() - 1));
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
	    button.setBackground(Color.RED);
	    button.setOpaque(true);
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
            JOptionPane.showMessageDialog(null, "¡Palabra correcta!");
            mostrarPalabraAleatoria();
            txtRespuestaAqui.setText("");
        }
    }
}