import java.awt.*;

public class SetUp {
    private boolean visible;
    private Image image;
    private boolean dying;
    private int speed;
    private int direction;
    int x;
    int y;
    int dx;
    public int getDirection() {
        return direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }
    public int getDx() {
        return dx;
    }
    public void setDx(int dx) {
        this.dx = dx;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SetUp(int x, int y, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
        }
    public SetUp() {
        visible = true;
    }
    public void die() {
        visible = false;
    }
    public boolean isVisible() {
        return visible;
    }
    protected void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public Image getImage() {
        return image;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public void setDying(boolean dying) {
        this.dying = dying;
    }
    public boolean isDying() {
        return this.dying;
    }
}

