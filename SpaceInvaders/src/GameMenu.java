import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class GameMenu extends JPanel {
        private static final long serialVersionUID = 1L;
        private JFrame frameA;

        public GameMenu() {
            frameA = new JFrame("Space Invaders");
            frameA.setSize(300, 300);
            frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameA.setLocationRelativeTo(null);
            frameA.setResizable(false);

            JButton startButton = new JButton("Start Game");
            startButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // startne hru po stisknuti buttonu start
                    frameA.dispose();
                    JFrame window = new JFrame();
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.setResizable(false);

                    GamePanel gamePanel = new GamePanel();
                    window.add(gamePanel);
                    window.pack();

                    window.setTitle("Space Invaders");
                    window.setLocationRelativeTo(null);
                    window.setVisible(true);

                    gamePanel.startGameThread();

                }
            });
            // exit button
            JButton exitButton = new JButton("Exit");
            exitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            setLayout(null);
            startButton.setBounds(100, 100, 100, 40);
            exitButton.setBounds(100, 150, 100, 40);
            add(startButton);
            add(exitButton);

            frameA.add(this);
            frameA.setVisible(true);
        }

        private void start() {

        }
        // grafika game menu
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Space Invaders", 80, 50);

        }


        }



