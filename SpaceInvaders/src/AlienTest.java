import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    @org.junit.jupiter.api.Test
    void act() {

            Alien alien = new Alien(10, 20); // Vytvoření instance třídy Alien se startovními souřadnicemi (10, 20)

            // Testování pohybu aliena vpravo
            int direction = 2;
            alien.act(direction); // Volání metody act s parametrem direction

            // Očekáváme, že souřadnice x se zvýší o hodnotu direction (2)
            assertEquals(12, alien.getX());

            // Testování pohybu aliena vlevo
            direction = -3;
            alien.act(direction); // Volání metody act s parametrem direction

            // Očekáváme, že souřadnice x se sníží o hodnotu direction (-3)
            assertEquals(9, alien.getX());
        }
        void Alien() {

                int x = 10;
                int y = 20;

                Alien alien = new Alien(x, y);

                // Očekáváme, že hodnoty x a y vytvořeného aliena odpovídají zadaným hodnotám v konstruktoru
                assertEquals(x, alien.getX());
                assertEquals(y, alien.getY());
            }
        }



