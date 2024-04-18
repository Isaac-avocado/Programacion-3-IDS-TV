import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PacMan extends Canvas {

    private JFrame frame;
    private int x = 250, y = 210, a = 20, l = 20;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PacMan window = new PacMan();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PacMan() {
    	setBackground(Color.BLACK);
    	setBounds(0, 0, 584, 520);
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(600, 600, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton button_1_1_1 = new JButton("");
        button_1_1_1.setForeground(Color.YELLOW);
        button_1_1_1.setBackground(Color.BLUE);
        button_1_1_1.setBounds(10, 485, 564, 24);
        frame.getContentPane().add(button_1_1_1);
        
        JButton button_1_1 = new JButton("");
        button_1_1.setForeground(Color.YELLOW);
        button_1_1.setBackground(Color.BLUE);
        button_1_1.setBounds(10, 11, 564, 24);
        frame.getContentPane().add(button_1_1);
        
        JButton button_1 = new JButton("");
        button_1.setForeground(Color.YELLOW);
        button_1.setBackground(Color.BLUE);
        button_1.setBounds(10, 11, 23, 498);
        frame.getContentPane().add(button_1);
        
        JButton button = new JButton("");
        button.setForeground(Color.YELLOW);
        button.setBackground(Color.BLUE);
        button.setBounds(551, 11, 23, 498);
        frame.getContentPane().add(button);
        
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0, 520, 584, 41);
        toolBar.setFont(new Font("Simplex_IV25", Font.BOLD, 40));
        toolBar.setToolTipText("CONTROLES");
        toolBar.setFloatable(false);
        frame.getContentPane().add(toolBar);
        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setForeground(Color.GREEN);
        progressBar.setBackground(Color.WHITE);
        progressBar.setValue(0);
        
        JProgressBar progressBar_1 = new JProgressBar();
        progressBar_1.setForeground(Color.RED);
        progressBar_1.setBackground(Color.WHITE);
        toolBar.add(progressBar_1);
        
        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(0);
                progressBar_1.setValue(0);
                x = 250; y = 210;
                PacMan.this.revalidate();
                PacMan.this.repaint();
                PacMan.this.update(getGraphics());
                JOptionPane.showMessageDialog(null,"                 JUEGO REINICIADO\r\n"
                		                         + "Acepte y pulse la ventana para seguir jugando\r\n");
            }
        });
        btnNewButton.setFont(new Font("Simplex_IV50", Font.BOLD, 30));
        toolBar.add(btnNewButton);
        toolBar.add(progressBar);
        
        
        

        frame.getContentPane().setBackground(Color.DARK_GRAY); 
        frame.getContentPane().add(this); 

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if(progressBar.getValue()==100){
                	progressBar.setValue(progressBar.getValue() - 100);
                	progressBar_1.setValue(progressBar_1.getValue() + 20);
                }
                if (key == KeyEvent.VK_A) {
                	if(x != 50 ) {
                		moveLeft();
                		progressBar.setValue(progressBar.getValue() + 1);
                	}
                }
                if (key == KeyEvent.VK_D) { 
                	if(x != 510 ) {
                		moveRight();
                        progressBar.setValue(progressBar.getValue() + 1);
                	}    
                }
                if (key == KeyEvent.VK_W) { 
                	if(y != 50 ) {
                		moveUp();
                        progressBar.setValue(progressBar.getValue() + 1);
                	}
                }
                if (key == KeyEvent.VK_S) { 
                	if(y != 450 ) {
                		moveDown();
                        progressBar.setValue(progressBar.getValue() + 1);
                	}
                }
            }
        });
        setFocusable(true);
        
        frame.setVisible(true);
        this.revalidate();
        this.repaint();
        this.update(getGraphics());
        
    }

    public void paint(Graphics g,int x,int y) {
        super.paint(g);
        //g.setColor(Color.YELLOW);
        //g.drawOval(x, y, 300, 300);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 20, 20);
    }
    private void moveLeft() {
    	paint(getGraphics(), x = x-20, y);
    	System.out.println("\nX = ");
    	System.out.print(x);
    	System.out.println("\nY = ");
    	System.out.print(y);
    }
    private void moveRight() {
    	paint(getGraphics(), x = x+20, y);
    	System.out.println("\nX = ");
    	System.out.print(x);
    	System.out.println("\nY = ");
    	System.out.print(y);
    }
    private void moveUp() {
    	paint(getGraphics(), x, y = y-20);
    	System.out.println("\nX = ");
    	System.out.print(x);
    	System.out.println("\nY = ");
    	System.out.print(y);
    	
    }
    private void moveDown() {
    	paint(getGraphics(), x, y = y+20);
    	System.out.println("\nX = ");
    	System.out.print(x);
    	System.out.println("\nY = ");
    	System.out.print(y);
    }
}
