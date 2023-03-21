package nl.tudelft.jpacman.GameOver;

import nl.tudelft.jpacman.main.ui.GameOver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameOverTest {
    GameOver gameover = new GameOver();

    /* test Game over Ui */
    @Test
    void TestGameOverUIObj() {
        assertNotNull(gameover);
    }

    @Test
    void TestGameOverSize() {
        int height = gameover.getHeight();
        int width = gameover.getWidth();

        assertEquals(800, height);
        assertEquals(1000, width);
    }

    /* Test pacman */
    @Test
    void TestPacmanWalk() {
        assertNotNull(gameover.getpacWalk());
    }

    /* Test Start Button */
    @Test
    void TestStartObj() {
        assertNotNull(gameover.getstartButton());
    }

    @Test
    void TestStartSize() {
        int height = gameover.getstartButton().getHeight();
        int width = gameover.getstartButton().getWidth();

        assertEquals(200, height);
        assertEquals(210, width);
    }

    @Test
    void TestStartLocate() {
        int x = gameover.getstartButton().getX();
        int y = gameover.getstartButton().getY();

        assertEquals(270, x);
        assertEquals(540, y);

    }

    /* test exit Button */
    @Test
    void TestExitObj() {
        assertNotNull(gameover.getexitButton());
    }

    @Test
    void TestExitSize() {
        int height = gameover.getexitButton().getHeight();
        int width = gameover.getexitButton().getWidth();

        assertEquals(200, height);
        assertEquals(200, width);
    }

    @Test
    void TestExitLocate() {
        int x = gameover.getexitButton().getX();
        int y = gameover.getexitButton().getY();

        assertEquals(530, x);
        assertEquals(540, y);

    }
}
