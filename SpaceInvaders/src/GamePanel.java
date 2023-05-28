import sun.print.PathGraphics;

import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class GamePanel extends JPanel implements Runnable {

    private boolean isFiring;

    int shotSpeed = 10;
    private Shot shot;
    int alienSpeed = 2;
    int playerX = 500;
    int playerY = 500;
    int playerSpeed = 4;
    KeyList list = new KeyList();
    final int originalTitleSize = 16;
    final int scale = 3;
    final int tileSize = originalTitleSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int ScreenWidth = tileSize * maxScreenCol;
    final int ScreenHight = tileSize * maxScreenRow;

    int AlienHeight;
    ArrayList<Alien> aliens = new ArrayList();
    ArrayList<Shot> shots = new ArrayList();
    ArrayList<Alien>seznamAlienů = new ArrayList();
    Thread gameThread;

    public GamePanel() {
        this.addKeyListener(list);
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHight));
        this.setBackground(Color.BLUE);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

    }
    //
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    // metoda run ktera rozbehne hru
    @Override
    public void run() {
        int FPS = 60;
        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;
        while (gameThread != null) {
            update();
            repaint();
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    public void killAlien(int x, int y) {
        Alien alien = findAlien(x, y);

        if (alien != null) {
            seznamAlienů.remove(alien);

        }
    }

    private Alien findAlien(int x, int y) {
        for (Alien alien : seznamAlienů) {
            if (alien.getX() == x && alien.getY() == y) {
                return alien;
            }
        }
        return null;
    }

    public void shooting() {
        if (list.isFiring) {
            if (!isFiring) {
                shot = new Shot();
                isFiring = true;
                shot.setX(playerX);
                shot.setY(playerY);
            }
        }
        if (isFiring) {
            shot.setY(shot.getY() - shotSpeed);
            if (shot.getY() < 0) {
                isFiring = false;
            }
        }
    }



    int alienX = 0;
    int alienY = 0;
    public void alienMoving(){
        if(alienX*1.8>=ScreenWidth||alienX<0){
            alienSpeed = alienSpeed *- 1;
            alienY=alienY+10;
        }
        alienX=alienX+alienSpeed;
    }

    // pohyb hrace pomoci updatu
    public void update() {
        if (list.leftPressed) {
            playerX = playerX - playerSpeed;
        } else if (list.rightPressed) {
            playerX = playerX + playerSpeed;
        }

        shooting();
        alienMoving();

    }
    // grafika hry
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        g2d.fillRect(0,0, getWidth(), getHeight());
        ImageIcon icon = new ImageIcon("raketa (1).png");
        g2d.drawImage(icon.getImage(), playerX, playerY, tileSize, tileSize, Color.white, null);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                ImageIcon imageIcon = new ImageIcon("Alien.png");
                g2d.drawImage(imageIcon.getImage(), alienX + 60 * j, alienY + 60 * i , tileSize, tileSize, Color.WHITE, null);
            }
        }

        if (isFiring) {
            ImageIcon icon1 = new ImageIcon("Bomb.png");
            g2d.drawImage(icon1.getImage(), shot.getX(), shot.getY(),tileSize/2, tileSize/2, Color.BLACK, null);
        }


        for (Alien alien : aliens) {
            if (alien.isVisible()) {
                g.drawImage(alien.getImage(), alien.getX(), alien.getY(), this);
            }
            if (alien.isDying()) {
                alien.die();
            }
        }
        g2d.dispose();
    }
}









