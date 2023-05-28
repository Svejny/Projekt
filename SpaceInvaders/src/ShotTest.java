import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShotTest {
    @Test
    void setX() {
            Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)
            // Nastavení hodnoty x na 15
            int x = 15;
            alien.setX(x);
            // Očekáváme, že hodnota x se změnila na 15
            assertEquals(15, alien.getX());
            // Nastavení hodnoty x na 25
            x = 25;
            alien.setX(x);
            // Očekáváme, že hodnota x se změnila na 25
            assertEquals(25, alien.getX());
        }
        void setY() {
                Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)
                // Nastavení hodnoty y na 25
                int y = 25;
                alien.setY(y);
                // Očekáváme, že hodnota y se změnila na 25
                assertEquals(25, alien.getY());
                // Nastavení hodnoty y na 35
                y = 35;
                alien.setY(y);
                // Očekáváme, že hodnota y se změnila na 35
                assertEquals(35, alien.getY());
            }

        }



