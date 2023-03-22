package nl.tudelft.jpacman.sprite;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.ui.ThemeConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Map;

public class ChangeSpriteTest {
    PacManSprites pacmans = new PacManSprites();
    ThemeConfig theme = new ThemeConfig();

    /* Test ground sprite */
    @Test
    void TesgetGroundSprite() throws IOException {
        theme.setConfig("0");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/floor.png");
        Sprite actualSprite = pacmans.getGroundSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    /* Test wall sprite */
    void TestgetbasketballWallSprite() throws IOException {
        theme.setConfig("0");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/wall-basketball.png");
        Sprite actualSprite = pacmans.getWallSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    void TestgetchristmasWallSprite() throws IOException {
        theme.setConfig("1");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/wall-christmas.jpg");
        Sprite actualSprite = pacmans.getWallSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    void TestgetspaceWallSprite() throws IOException {
        theme.setConfig("2");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/wall-space.jpg");
        Sprite actualSprite = pacmans.getWallSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    /* Test Pellet sprite */
    void TestgetPelletbasketball() throws IOException {
        theme.setConfig("0");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/point-basketball.png");
        Sprite actualSprite = pacmans.getPelletSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    void TestgetPelletchristmas() throws IOException {
        theme.setConfig("1");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/point-christmas.jpg");
        Sprite actualSprite = pacmans.getPelletSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    void TestgetPelletspace() throws IOException {
        theme.setConfig("2");

        Sprite expectedSprite = pacmans.loadSprite("/sprite/point_space.png");
        Sprite actualSprite = pacmans.getPelletSprite();

        assertEquals(expectedSprite, actualSprite);
    }

    /* test pacman sprite */
    void Testgetpacmanolympic() throws IOException {
        theme.setConfig("0");

        Map<Direction, Sprite> expectedSprite = pacmans.directionSprite("/sprite/pacman_olympic.png", 64);
        Map<Direction, Sprite> actualSprite = pacmans.getPacmanSprites();

        assertEquals(expectedSprite, actualSprite);
    }

    void Testgetpacmancrismas() throws IOException {
        theme.setConfig("1");

        Map<Direction, Sprite> expectedSprite = pacmans.directionSprite("/sprite/pacman_crismas.png", 64);
        Map<Direction, Sprite> actualSprite = pacmans.getPacmanSprites();

        assertEquals(expectedSprite, actualSprite);
    }

    void Testgetpacmanspace() throws IOException {
        theme.setConfig("2");

        Map<Direction, Sprite> expectedSprite = pacmans.directionSprite("/sprite/pacman_space.png", 64);
        Map<Direction, Sprite> actualSprite = pacmans.getPacmanSprites();

        assertEquals(expectedSprite, actualSprite);
    }
}
