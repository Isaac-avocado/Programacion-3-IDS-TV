import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PacMan extends Canvas {

    private JFrame frame;
    private int x = 240, y = 210, a = 100, l = 100;

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
    	setBounds(0, 0, 584, 520);
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(600, 600, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
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

        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progressBar.getValue() + 1);
            }
        });
        btnNewButton.setFont(new Font("Simplex_IV50", Font.BOLD, 30));
        toolBar.add(btnNewButton);

        toolBar.add(progressBar);
        
        JProgressBar progressBar_1 = new JProgressBar();
        progressBar_1.setForeground(Color.RED);
        progressBar_1.setBackground(Color.WHITE);
        toolBar.add(progressBar_1);
        

        frame.getContentPane().setBackground(Color.BLACK); 
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
                    moveLeft();
                    progressBar.setValue(progressBar.getValue() + 1);
                }
                if (key == KeyEvent.VK_D) { 
                    moveRight();
                    progressBar.setValue(progressBar.getValue() + 1);
                }
                if (key == KeyEvent.VK_W) { 
                    moveUp();
                    progressBar.setValue(progressBar.getValue() + 1);
                }
                if (key == KeyEvent.VK_S) { 
                    moveDown();
                    progressBar.setValue(progressBar.getValue() + 1);
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
        g.fillOval(x, y, 100, 100);
    }
    private void moveLeft() {
    	System.out.println("Izquierda");
    	paint(getGraphics(), x = x-10, y);
    	System.out.print(x);
    	System.out.print(y);
    }
    private void moveRight() {
    	System.out.println("Derecha");
    	paint(getGraphics(), x = x+10, y);
    	System.out.print(x);
    	System.out.print(y);
    }
    private void moveUp() {
    	System.out.println("Arriba");
    	paint(getGraphics(), x, y = y-10);
    	System.out.print(x);
    	System.out.print(y);
    	
    }
    private void moveDown() {
    	System.out.println("Abajo");
    	paint(getGraphics(), x, y = y+10);
    	System.out.print(x);
    	System.out.print(y);
    }
}
