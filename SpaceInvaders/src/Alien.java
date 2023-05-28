import javax.swing.*;

public class Alien extends SetUp {



    public Alien(int x, int y) {

        initAlien(x, y);
    }

    private void initAlien(int x, int y) {

        this.x = x;
        this.y = y;



        var alienImg = "src/images/Alien.png";
        var ii = new ImageIcon(alienImg);

        setImage(ii.getImage());
    }

    public void act(int direction) {

        this.x += direction;
    }


    }


