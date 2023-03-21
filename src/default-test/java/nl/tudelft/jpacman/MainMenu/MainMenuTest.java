package nl.tudelft.jpacman.MainMenu;

import nl.tudelft.jpacman.main.ui.MainMenu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainMenuTest {
    MainMenu menu = new MainMenu();

    /* test Menu Ui */
    @Test
    void TestMenuUIObj() {
        assertNotNull(menu);
    }

    @Test
    void TestMenuSize() {
        int height = menu.getHeight();
        int width = menu.getWidth();

        assertEquals(800, height);
        assertEquals(1000, width);
    }

    /* Test logo */
    @Test
    void TestLogoObj() {
        assertNotNull(menu.getimageButton1());

    }

    @Test
    void TestlogoSize() {
        int height = menu.getimageButton1().getHeight();
        int width = menu.getimageButton1().getWidth();

        assertEquals(229, height);
        assertEquals(600, width);

    }

    @Test
    void TestlogoLocation() {
        int x = menu.getimageButton1().getX();
        int y = menu.getimageButton1().getY();

        assertEquals(200, x);
        assertEquals(50, y);

    }

    /* Test pacman gif */
    @Test
    void TestPacmanWalk() {
        assertNotNull(menu.getimageButton2());
    }

    @Test
    void TestPacmanWalkSize() {
        int height = menu.getimageButton2().getHeight();
        int width = menu.getimageButton2().getWidth();

        assertEquals(240, height);
        assertEquals(492, width);

    }

    @Test
    void TestPacmanWalkLocate() {
        int x = menu.getimageButton2().getX();
        int y = menu.getimageButton2().getY();

        assertEquals(250, x);
        assertEquals(250, y);

    }

    /* Test Start Button */
    @Test
    void TestStartObj() {
        assertNotNull(menu.getstartButton());
    }

    @Test
    void TestStartSize() {
        int height = menu.getstartButton().getHeight();
        int width = menu.getstartButton().getWidth();

        assertEquals(350, height);
        assertEquals(350, width);
    }

    @Test
    void TestStartLocate() {
        int x = menu.getstartButton().getX();
        int y = menu.getstartButton().getY();

        assertEquals(180, x);
        assertEquals(400, y);

    }

    /* test exit Button */
    @Test
    void TestExitObj() {
        assertNotNull(menu.getexitButton());
    }

    @Test
    void TestExitSize() {
        int height = menu.getexitButton().getHeight();
        int width = menu.getexitButton().getWidth();

        assertEquals(350, height);
        assertEquals(350, width);
    }

    @Test
    void TestExitLocate() {
        int x = menu.getexitButton().getX();
        int y = menu.getexitButton().getY();

        assertEquals(460, x);
        assertEquals(400, y);

    }
}
