import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyList implements KeyListener {
    public boolean leftPressed,rightPressed;
    public boolean isFiring;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode(); // posouva hrace doleva
        if(code==KeyEvent.VK_A){
            leftPressed=true;
        }
        if(code==KeyEvent.VK_D){  // posouva hrace doprava
            rightPressed=true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            isFiring = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_A){
            leftPressed=false;
        }
        if(code==KeyEvent.VK_D){
            rightPressed=false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            isFiring = false;
        }
    }




}
