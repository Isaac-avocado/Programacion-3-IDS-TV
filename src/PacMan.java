import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;

public class PacMan extends Canvas {

    private JFrame frame;
    private int x = 250, y = 210, a = 20, l = 20;
    private List<JButton> todosLosBotones;
    private HashMap<String, MovementLimits> limitsMap = new HashMap<>();
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
    	setBounds(0, 0, 600, 600);
    	todosLosBotones = new ArrayList<>();
        initialize();
    }

    private void initialize() {
     
        frame = new JFrame();
        frame.setBounds(600, 600, 616, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton button_18 = new JButton("");
        button_18.setForeground(Color.YELLOW);
        button_18.setEnabled(false);
        button_18.setBorderPainted(false);
        button_18.setBackground(Color.BLUE);
        button_18.setBounds(190, 160, 60, 30);
        frame.getContentPane().add(button_18);
        todosLosBotones.add(button_18);
        
        JButton button_52 = new JButton("");
        button_52.setEnabled(false);
        button_52.setForeground(Color.YELLOW);
        button_52.setBorderPainted(false);
        button_52.setBackground(Color.BLUE);
        button_52.setBounds(315, 460, 60, 30);
        frame.getContentPane().add(button_52);
        todosLosBotones.add(button_52);
        
        JButton button_38 = new JButton("");
        button_38.setForeground(Color.YELLOW);
        button_38.setEnabled(false);
        button_38.setBorderPainted(false);
        button_38.setBackground(Color.BLUE);
        button_38.setBounds(490, 350, 90, 20);
        frame.getContentPane().add(button_38);
        todosLosBotones.add(button_38);
        
        JButton button_15 = new JButton("");
        button_15.setForeground(Color.YELLOW);
        button_15.setEnabled(false);
        button_15.setBorderPainted(false);
        button_15.setBackground(Color.BLUE);
        button_15.setBounds(490, 100, 60, 30);
        frame.getContentPane().add(button_15);
        todosLosBotones.add(button_15);
        
        JButton button_26 = new JButton("");
        button_26.setForeground(Color.YELLOW);
        button_26.setEnabled(false);
        button_26.setBorderPainted(false);
        button_26.setBackground(Color.BLUE);
        button_26.setBounds(225, 220, 20, 90);
        frame.getContentPane().add(button_26);
        todosLosBotones.add(button_26);
        
        JButton button_36 = new JButton("");
        button_36.setForeground(Color.YELLOW);
        button_36.setEnabled(false);
        button_36.setBorderPainted(false);
        button_36.setBackground(Color.BLUE);
        button_36.setBounds(285, 340, 30, 90);
        frame.getContentPane().add(button_36);
        todosLosBotones.add(button_36);
        
        JButton button_47 = new JButton("");
        button_47.setEnabled(false);
        button_47.setForeground(Color.YELLOW);
        button_47.setBorderPainted(false);
        button_47.setBackground(Color.BLUE);
        button_47.setBounds(580, 350, 20, 250);
        frame.getContentPane().add(button_47);
        todosLosBotones.add(button_47);
        
        JButton button_7 = new JButton("");
        button_7.setForeground(Color.YELLOW);
        button_7.setEnabled(false);
        button_7.setBorderPainted(false);
        button_7.setBackground(Color.BLUE);
        button_7.setBounds(490, 50, 60, 20);
        frame.getContentPane().add(button_7);
        todosLosBotones.add(button_7);
        
        JButton button_58 = new JButton("");
        button_58.setForeground(Color.YELLOW);
        button_58.setEnabled(false);
        button_58.setBorderPainted(false);
        button_58.setBackground(Color.BLUE);
        button_58.setBounds(490, 300, 20, 50);
        frame.getContentPane().add(button_58);
        todosLosBotones.add(button_58);
        
        JButton button_23 = new JButton("");
        button_23.setForeground(Color.YELLOW);
        button_23.setEnabled(false);
        button_23.setBorderPainted(false);
        button_23.setBackground(Color.BLUE);
        button_23.setBounds(315, 220, 40, 20);
        frame.getContentPane().add(button_23);
        todosLosBotones.add(button_23);
        
        JButton button_49 = new JButton("");
        button_49.setForeground(Color.YELLOW);
        button_49.setEnabled(false);
        button_49.setBorderPainted(false);
        button_49.setBackground(Color.BLUE);
        button_49.setBounds(160, 460, 30, 60);
        frame.getContentPane().add(button_49);
        todosLosBotones.add(button_49);
        
        JButton button_12 = new JButton("");
        button_12.setForeground(Color.YELLOW);
        button_12.setEnabled(false);
        button_12.setBorderPainted(false);
        button_12.setBackground(Color.BLUE);
        button_12.setBounds(285, 100, 30, 90);
        frame.getContentPane().add(button_12);
        todosLosBotones.add(button_12);
        
        JButton button_24 = new JButton("");
        button_24.setForeground(Color.YELLOW);
        button_24.setEnabled(false);
        button_24.setBorderPainted(false);
        button_24.setBackground(Color.BLUE);
        button_24.setBounds(490, 180, 20, 50);
        frame.getContentPane().add(button_24);
        todosLosBotones.add(button_24);
        
        JButton button_34 = new JButton("");
        button_34.setForeground(Color.YELLOW);
        button_34.setEnabled(false);
        button_34.setBorderPainted(false);
        button_34.setBackground(Color.BLUE);
        button_34.setBounds(90, 300, 20, 50);
        frame.getContentPane().add(button_34);
        todosLosBotones.add(button_34);
        
        JButton button_56 = new JButton("");
        button_56.setEnabled(false);
        button_56.setForeground(Color.YELLOW);
        button_56.setBorderPainted(false);
        button_56.setBackground(Color.BLUE);
        button_56.setBounds(345, 520, 205, 30);
        frame.getContentPane().add(button_56);
        todosLosBotones.add(button_56);
        
        JButton button_31 = new JButton("");
        button_31.setForeground(Color.YELLOW);
        button_31.setEnabled(false);
        button_31.setBorderPainted(false);
        button_31.setBackground(Color.BLUE);
        button_31.setBounds(245, 290, 110, 20);
        frame.getContentPane().add(button_31);
        todosLosBotones.add(button_31);
        
        JButton button_21 = new JButton("");
        button_21.setForeground(Color.YELLOW);
        button_21.setEnabled(false);
        button_21.setBorderPainted(false);
        button_21.setBackground(Color.BLUE);
        button_21.setBounds(90, 180, 20, 50);
        frame.getContentPane().add(button_21);
        todosLosBotones.add(button_21);
        
        JButton button_14 = new JButton("");
        button_14.setForeground(Color.YELLOW);
        button_14.setEnabled(false);
        button_14.setBorderPainted(false);
        button_14.setBackground(Color.BLUE);
        button_14.setBounds(410, 100, 30, 150);
        frame.getContentPane().add(button_14);
        todosLosBotones.add(button_14);
        
        JButton button_55 = new JButton("");
        button_55.setEnabled(false);
        button_55.setForeground(Color.YELLOW);
        button_55.setBorderPainted(false);
        button_55.setBackground(Color.BLUE);
        button_55.setBounds(50, 520, 205, 30);
        frame.getContentPane().add(button_55);
        todosLosBotones.add(button_55);
        
        JButton button_54 = new JButton("");
        button_54.setForeground(Color.YELLOW);
        button_54.setEnabled(false);
        button_54.setBorderPainted(false);
        button_54.setBackground(Color.BLUE);
        button_54.setBounds(550, 460, 30, 30);
        frame.getContentPane().add(button_54);
        todosLosBotones.add(button_54);
        
        JButton button_43 = new JButton("");
        button_43.setForeground(Color.YELLOW);
        button_43.setEnabled(false);
        button_43.setBorderPainted(false);
        button_43.setBackground(Color.BLUE);
        button_43.setBounds(160, 400, 90, 30);
        frame.getContentPane().add(button_43);
        todosLosBotones.add(button_43);
        
        JButton button_32 = new JButton("");
        button_32.setForeground(Color.YELLOW);
        button_32.setEnabled(false);
        button_32.setBorderPainted(false);
        button_32.setBackground(Color.BLUE);
        button_32.setBounds(410, 280, 30, 90);
        frame.getContentPane().add(button_32);
        todosLosBotones.add(button_32);
        
        JButton button_17 = new JButton("");
        button_17.setForeground(Color.YELLOW);
        button_17.setEnabled(false);
        button_17.setBorderPainted(false);
        button_17.setBackground(Color.BLUE);
        button_17.setBounds(20, 160, 90, 20);
        frame.getContentPane().add(button_17);
        todosLosBotones.add(button_17);
        
        JButton button_30 = new JButton("");
        button_30.setForeground(Color.YELLOW);
        button_30.setEnabled(false);
        button_30.setBorderPainted(false);
        button_30.setBackground(Color.BLUE);
        button_30.setBounds(160, 280, 30, 90);
        frame.getContentPane().add(button_30);
        todosLosBotones.add(button_30);
        
        JButton button_22 = new JButton("");
        button_22.setForeground(Color.YELLOW);
        button_22.setEnabled(false);
        button_22.setBorderPainted(false);
        button_22.setBackground(Color.BLUE);
        button_22.setBounds(245, 220, 40, 20);
        frame.getContentPane().add(button_22);
        todosLosBotones.add(button_22);
        
        JButton button_20 = new JButton("");
        button_20.setForeground(Color.YELLOW);
        button_20.setEnabled(false);
        button_20.setBorderPainted(false);
        button_20.setBackground(Color.BLUE);
        button_20.setBounds(490, 160, 90, 20);
        frame.getContentPane().add(button_20);
        todosLosBotones.add(button_20);
        
        JButton button_11 = new JButton("");
        button_11.setForeground(Color.YELLOW);
        button_11.setEnabled(false);
        button_11.setBorderPainted(false);
        button_11.setBackground(Color.BLUE);
        button_11.setBounds(225, 100, 60, 30);
        frame.getContentPane().add(button_11);
        todosLosBotones.add(button_11);
        
        JButton button_41 = new JButton("");
        button_41.setForeground(Color.YELLOW);
        button_41.setEnabled(false);
        button_41.setBorderPainted(false);
        button_41.setBackground(Color.BLUE);
        button_41.setBounds(50, 400, 30, 30);
        frame.getContentPane().add(button_41);
        todosLosBotones.add(button_41);
        
        JButton button_39 = new JButton("");
        button_39.setForeground(Color.YELLOW);
        button_39.setEnabled(false);
        button_39.setBorderPainted(false);
        button_39.setBackground(Color.BLUE);
        button_39.setBounds(20, 350, 90, 20);
        frame.getContentPane().add(button_39);
        todosLosBotones.add(button_39);
        
        JButton button_53 = new JButton("");
        button_53.setForeground(Color.YELLOW);
        button_53.setEnabled(false);
        button_53.setBorderPainted(false);
        button_53.setBackground(Color.BLUE);
        button_53.setBounds(410, 460, 30, 60);
        frame.getContentPane().add(button_53);
        todosLosBotones.add(button_53);
        
        JButton button_9 = new JButton("");
        button_9.setForeground(Color.YELLOW);
        button_9.setEnabled(false);
        button_9.setBorderPainted(false);
        button_9.setBackground(Color.BLUE);
        button_9.setBounds(50, 100, 60, 30);
        frame.getContentPane().add(button_9);
        todosLosBotones.add(button_9);
        
        JButton button_42 = new JButton("");
        button_42.setForeground(Color.YELLOW);
        button_42.setEnabled(false);
        button_42.setBorderPainted(false);
        button_42.setBackground(Color.BLUE);
        button_42.setBounds(80, 400, 30, 90);
        frame.getContentPane().add(button_42);
        todosLosBotones.add(button_42);
        
        JButton button_13 = new JButton("");
        button_13.setForeground(Color.YELLOW);
        button_13.setEnabled(false);
        button_13.setBorderPainted(false);
        button_13.setBackground(Color.BLUE);
        button_13.setBounds(315, 100, 60, 30);
        frame.getContentPane().add(button_13);
        todosLosBotones.add(button_13);
        
        JButton button_35 = new JButton("");
        button_35.setForeground(Color.YELLOW);
        button_35.setEnabled(false);
        button_35.setBorderPainted(false);
        button_35.setBackground(Color.BLUE);
        button_35.setBounds(225, 340, 60, 30);
        frame.getContentPane().add(button_35);
        todosLosBotones.add(button_35);
        
        JButton button_3 = new JButton("");
        button_3.setForeground(Color.YELLOW);
        button_3.setEnabled(false);
        button_3.setBorderPainted(false);
        button_3.setBackground(Color.BLUE);
        button_3.setBounds(50, 50, 60, 20);
        frame.getContentPane().add(button_3);
        todosLosBotones.add(button_3);
        
        JButton button_37 = new JButton("");
        button_37.setForeground(Color.YELLOW);
        button_37.setEnabled(false);
        button_37.setBorderPainted(false);
        button_37.setBackground(Color.BLUE);
        button_37.setBounds(315, 340, 60, 30);
        frame.getContentPane().add(button_37);
        todosLosBotones.add(button_37);
        
        JButton button_40 = new JButton("");
        button_40.setEnabled(false);
        button_40.setForeground(Color.YELLOW);
        button_40.setBorderPainted(false);
        button_40.setBackground(Color.BLUE);
        button_40.setBounds(0, 350, 20, 250);
        frame.getContentPane().add(button_40);
        todosLosBotones.add(button_40);
        
        JButton button_10 = new JButton("");
        button_10.setForeground(Color.YELLOW);
        button_10.setEnabled(false);
        button_10.setBorderPainted(false);
        button_10.setBackground(Color.BLUE);
        button_10.setBounds(160, 100, 30, 150);
        frame.getContentPane().add(button_10);
        todosLosBotones.add(button_10);
        
        JButton button_48 = new JButton("");
        button_48.setForeground(Color.YELLOW);
        button_48.setEnabled(false);
        button_48.setBorderPainted(false);
        button_48.setBackground(Color.BLUE);
        button_48.setBounds(20, 460, 30, 30);
        frame.getContentPane().add(button_48);
        todosLosBotones.add(button_48);
        
        JButton button_44 = new JButton("");
        button_44.setForeground(Color.YELLOW);
        button_44.setEnabled(false);
        button_44.setBorderPainted(false);
        button_44.setBackground(Color.BLUE);
        button_44.setBounds(350, 400, 90, 30);
        frame.getContentPane().add(button_44);
        todosLosBotones.add(button_44);
        
        JButton button_4 = new JButton("");
        button_4.setForeground(Color.YELLOW);
        button_4.setEnabled(false);
        button_4.setBorderPainted(false);
        button_4.setBackground(Color.BLUE);
        button_4.setBounds(160, 50, 95, 20);
        frame.getContentPane().add(button_4);
        todosLosBotones.add(button_4);
        
        JButton button_50 = new JButton("");
        button_50.setEnabled(false);
        button_50.setForeground(Color.YELLOW);
        button_50.setBorderPainted(false);
        button_50.setBackground(Color.BLUE);
        button_50.setBounds(225, 460, 60, 30);
        frame.getContentPane().add(button_50);
        todosLosBotones.add(button_50);
        
        JButton button_19 = new JButton("");
        button_19.setForeground(Color.YELLOW);
        button_19.setEnabled(false);
        button_19.setBorderPainted(false);
        button_19.setBackground(Color.BLUE);
        button_19.setBounds(350, 160, 60, 30);
        frame.getContentPane().add(button_19);
        todosLosBotones.add(button_19);
        
        JButton button_51 = new JButton("");
        button_51.setEnabled(false);
        button_51.setForeground(Color.YELLOW);
        button_51.setBorderPainted(false);
        button_51.setBackground(Color.BLUE);
        button_51.setBounds(285, 460, 30, 90);
        frame.getContentPane().add(button_51);
        todosLosBotones.add(button_51);
        
        JButton button_6 = new JButton("");
        button_6.setForeground(Color.YELLOW);
        button_6.setEnabled(false);
        button_6.setBorderPainted(false);
        button_6.setBackground(Color.BLUE);
        button_6.setBounds(345, 50, 95, 20);
        frame.getContentPane().add(button_6);
        todosLosBotones.add(button_6);
        
        JButton button_5 = new JButton("");
        button_5.setForeground(Color.YELLOW);
        button_5.setEnabled(false);
        button_5.setBorderPainted(false);
        button_5.setBackground(Color.BLUE);
        button_5.setBounds(285, 20, 30, 50);
        frame.getContentPane().add(button_5);
        todosLosBotones.add(button_5);
        
        JButton button_27 = new JButton("");
        button_27.setForeground(Color.YELLOW);
        button_27.setEnabled(false);
        button_27.setBorderPainted(false);
        button_27.setBackground(Color.BLUE);
        button_27.setBounds(355, 220, 20, 90);
        frame.getContentPane().add(button_27);
        todosLosBotones.add(button_27);
        
        JButton button_25 = new JButton("");
        button_25.setForeground(Color.YELLOW);
        button_25.setEnabled(false);
        button_25.setBorderPainted(false);
        button_25.setBackground(Color.BLUE);
        button_25.setBounds(0, 230, 110, 20);
        frame.getContentPane().add(button_25);
        todosLosBotones.add(button_25);
        
        JButton button_45 = new JButton("");
        button_45.setForeground(Color.YELLOW);
        button_45.setEnabled(false);
        button_45.setBorderPainted(false);
        button_45.setBackground(Color.BLUE);
        button_45.setBounds(490, 400, 30, 90);
        frame.getContentPane().add(button_45);
        todosLosBotones.add(button_45);
        
        JButton button_46 = new JButton("");
        button_46.setForeground(Color.YELLOW);
        button_46.setEnabled(false);
        button_46.setBorderPainted(false);
        button_46.setBackground(Color.BLUE);
        button_46.setBounds(520, 400, 30, 30);
        frame.getContentPane().add(button_46);
        todosLosBotones.add(button_46);
        
        JButton button_29 = new JButton("");
        button_29.setForeground(Color.YELLOW);
        button_29.setEnabled(false);
        button_29.setBorderPainted(false);
        button_29.setBackground(Color.BLUE);
        button_29.setBounds(0, 280, 110, 20);
        frame.getContentPane().add(button_29);
        todosLosBotones.add(button_29);
        
        JButton button_28 = new JButton("");
        button_28.setForeground(Color.YELLOW);
        button_28.setEnabled(false);
        button_28.setBorderPainted(false);
        button_28.setBackground(Color.BLUE);
        button_28.setBounds(490, 230, 110, 20);
        frame.getContentPane().add(button_28);
        todosLosBotones.add(button_28);
        
        JButton button_33 = new JButton("");
        button_33.setForeground(Color.YELLOW);
        button_33.setEnabled(false);
        button_33.setBorderPainted(false);
        button_33.setBackground(Color.BLUE);
        button_33.setBounds(490, 280, 110, 20);
        frame.getContentPane().add(button_33);
        todosLosBotones.add(button_33);
        
        JButton button_8 = new JButton("");
        button_8.setEnabled(false);
        button_8.setForeground(Color.YELLOW);
        button_8.setBackground(Color.BLUE);
        button_8.setBounds(580, 0, 20, 180);
        button_8.setBorderPainted(false); 
        frame.getContentPane().add(button_8);
        todosLosBotones.add(button_8);

        JButton button_1 = new JButton("");
        button_1.setEnabled(false);
        button_1.setForeground(Color.YELLOW);
        button_1.setBackground(Color.BLUE);
        button_1.setBounds(0, 0, 600, 20);
        button_1.setBorderPainted(false); 
        frame.getContentPane().add(button_1);
        todosLosBotones.add(button_1);

        JButton button_2 = new JButton("");
        button_2.setEnabled(false);
        button_2.setForeground(Color.YELLOW);
        button_2.setBackground(Color.BLUE);
        button_2.setBounds(0, 0, 20, 180);
        button_2.setBorderPainted(false); 
        frame.getContentPane().add(button_2);
        todosLosBotones.add(button_2);

        JButton button_57 = new JButton("");
        button_57.setEnabled(false);
        button_57.setForeground(Color.YELLOW);
        button_57.setBackground(Color.BLUE);
        button_57.setBounds(0, 580, 600, 20);
        button_57.setBorderPainted(false); 
        frame.getContentPane().add(button_57);
        todosLosBotones.add(button_57);
        //FINAL PAREDES
      
     for (JButton button : todosLosBotones) {
         
         Rectangle bounds = button.getBounds();
         int x = bounds.x;
         int y = bounds.y;
         int width = bounds.width;
         int height = bounds.height;

         int circleLeft = x + 20;
         int circleRight = x + width - 20;
         int circleTop = y + 20;
         int circleBottom = y + height - 20;

         limitsMap.put(button.getName(), new MovementLimits(circleLeft, circleRight, circleTop, circleBottom));
     }
        

            
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0, 600, 600, 41);
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
        int newX = x - 20;
        if (isCircleInsideButton(newX, y)) {
        	System. out. println("HOLA 2");
            return;
        }
        paint(getGraphics(), newX, y);
        x = newX;
        System. out. println("HOLA");
    }
    private void moveRight() {
        int newX = x + 20;
        if (isCircleInsideButton(newX, y)) {
        	System. out. println("HOLA 2");
            return;
        }
        paint(getGraphics(), newX, y);
        x = newX;
        System. out. println("HOLA");
    }
    private void moveUp() {
        int newY = y - 20;
        if (isCircleInsideButton(x, newY)) {
        	System. out. println("HOLA 2");
            return;
        }
        paint(getGraphics(), x, newY);
        y = newY;
        System. out. println("HOLA");
    }
    private void moveDown() {
        int newY = y + 20;
        if (isCircleInsideButton(x, newY)) {
        	System. out. println("HOLA 2");
            return;
        }
        paint(getGraphics(), x, newY);
        y = newY;
        System. out. println("HOLA");
    }
    private boolean isCircleInsideButton(int circleX, int circleY) {
        for (MovementLimits limits : limitsMap.values()) {
            if (circleX >= limits.left && circleX <= limits.right &&
                circleY >= limits.top && circleY <= limits.bottom) {
                return true; // El círculo está dentro de los límites de un botón
            }
        }
        return false; // El círculo no está dentro de los límites de ningún botón
    }
    class MovementLimits {
        int left;
        int right;
        int top;
        int bottom;

        public MovementLimits(int left, int right, int top, int bottom) {
            this.left = left;
            this.right = right;
            this.top = top;
            this.bottom = bottom;
        }
    }
}