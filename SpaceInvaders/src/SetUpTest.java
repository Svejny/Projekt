import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetUpTest {

    @Test
    void setDirection() {

            Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)

            // Nastavení směru na hodnotu 1
            int direction = 1;
            alien.setDirection(direction);

            // Očekáváme, že hodnota směru se změnila na 1
            assertEquals(1, alien.getDirection());

            // Nastavení směru na hodnotu -1
            direction = -1;
            alien.setDirection(direction);

            // Očekáváme, že hodnota směru se změnila na -1
            assertEquals(-1, alien.getDirection());
        }
        void die () {

                Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)

                // Otestování původní hodnoty viditelnosti aliena (mělo by být true)
                assertTrue(alien.isVisible());

                // Zavolání metody die
                alien.die();

                // Očekáváme, že hodnota viditelnosti aliena se změnila na false
                assertFalse(alien.isVisible());
            }
            void setVisible () {

                    Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)

                    // Nastavení viditelnosti na false
                    alien.setVisible(false);

                    // Očekáváme, že hodnota viditelnosti se změnila na false
                    assertFalse(alien.isVisible());

                    // Nastavení viditelnosti na true
                    alien.setVisible(true);

                    // Očekáváme, že hodnota viditelnosti se změnila na true
                    assertTrue(alien.isVisible());
                }
                void setSpeed () {

                        Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)

                        // Nastavení rychlosti na 2
                        alien.setSpeed(2);

                        // Očekáváme, že hodnota rychlosti se změnila na 2
                        assertEquals(2, alien.getSpeed());

                        // Nastavení rychlosti na 5
                        alien.setSpeed(5);

                        // Očekáváme, že hodnota rychlosti se změnila na 5
                        assertEquals(5, alien.getSpeed());
                    }
                }







