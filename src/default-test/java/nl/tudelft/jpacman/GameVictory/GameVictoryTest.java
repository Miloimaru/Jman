package nl.tudelft.jpacman.GameVictory;

import nl.tudelft.jpacman.main.ui.GameVictory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameVictoryTest {
    GameVictory gamevic = new GameVictory();

    /* test GameVictory Ui */
    @Test
    void TestGameVictoryUIObj() {
        assertNotNull(gamevic);
    }

    @Test
    void TestGameVictorySize() {
        int height = gamevic.getHeight();
        int width = gamevic.getWidth();

        assertEquals(800, height);
        assertEquals(1000, width);
    }

    /* Test pacman */
    @Test
    void TestPacmanWalk() {
        assertNotNull(gamevic.getpacWalk());
    }

    /* Test Start Button */
    @Test
    void TestStartObj() {
        assertNotNull(gamevic.getstartButton());
    }

    @Test
    void TestStartSize() {
        int height = gamevic.getstartButton().getHeight();
        int width = gamevic.getstartButton().getWidth();

        assertEquals(200, height);
        assertEquals(210, width);
    }

    @Test
    void TestStartLocate() {
        int x = gamevic.getstartButton().getX();
        int y = gamevic.getstartButton().getY();

        assertEquals(270, x);
        assertEquals(550, y);

    }

    /* test exit Button */
    @Test
    void TestExitObj() {
        assertNotNull(gamevic.getexitButton());
    }

    @Test
    void TestExitSize() {
        int height = gamevic.getexitButton().getHeight();
        int width = gamevic.getexitButton().getWidth();

        assertEquals(200, height);
        assertEquals(200, width);
    }

    @Test
    void TestExitLocate() {
        int x = gamevic.getexitButton().getX();
        int y = gamevic.getexitButton().getY();

        assertEquals(520, x);
        assertEquals(550, y);

    }
}
