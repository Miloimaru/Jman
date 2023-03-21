package nl.tudelft.jpacman.ThemeMenu;

import nl.tudelft.jpacman.main.ui.ThemeUI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ThemeUITest {
    ThemeUI theme = new ThemeUI();

    /* test theme Ui */
    @Test
    void TestMenuUIObj() {
        assertNotNull(theme);
    }

    @Test
    void TestMenuSize() {
        int height = theme.getHeight();
        int width = theme.getWidth();

        assertEquals(800, height);
        assertEquals(1000, width);
    }

    /* Test theme icon */
    @Test
    void TestSelectThemObj() {
        assertNotNull(theme.getimageButton1());
    }

    @Test
    void TestSelectThemSize() {
        int height = theme.getimageButton1().getHeight();
        int width = theme.getimageButton1().getWidth();

        assertEquals(190, height);
        assertEquals(400, width);
    }

    @Test
    void TestSelectThemLocation() {
        int x = theme.getimageButton1().getX();
        int y = theme.getimageButton1().getY();

        assertEquals(300, x);
        assertEquals(40, y);
    }

    /* Test Pacman icon */
    @Test
    void TestPacmanObj() {
        assertNotNull(theme.getimageButton2());
    }

    @Test
    void TestPacmanSize() {
        int height = theme.getimageButton2().getHeight();
        int width = theme.getimageButton2().getWidth();

        assertEquals(150, height);
        assertEquals(150, width);
    }

    @Test
    void TestPacmanLocation() {
        int x = theme.getimageButton2().getX();
        int y = theme.getimageButton2().getY();

        assertEquals(135, x);
        assertEquals(40, y);
    }

    /* Test Basketball text */
    @Test
    void TestBasketballTextObj() {
        assertNotNull(theme.getBasketballText());
    }

    @Test
    void TestBasketballTextSize() {
        int height = theme.getBasketballText().getHeight();
        int width = theme.getBasketballText().getWidth();

        assertEquals(18, height);
        assertEquals(200, width);
    }

    @Test
    void TestBasketballTextLocation() {
        int x = theme.getBasketballText().getX();
        int y = theme.getBasketballText().getY();

        assertEquals(105, x);
        assertEquals(520, y);
    }

    /* Test christmas text */
    @Test
    void TestchristmasTextObj() {
        assertNotNull(theme.getchristmasText());
    }

    @Test
    void TestchristmasTextSize() {
        int height = theme.getchristmasText().getHeight();
        int width = theme.getchristmasText().getWidth();

        assertEquals(20, height);
        assertEquals(200, width);
    }

    @Test
    void TestchristmasTextLocation() {
        int x = theme.getchristmasText().getX();
        int y = theme.getchristmasText().getY();

        assertEquals(395, x);
        assertEquals(520, y);
    }

    /* Test space text */
    @Test
    void TestspaceTextObj() {
        assertNotNull(theme.getspaceText());
    }

    @Test
    void TestspaceTextSize() {
        int height = theme.getspaceText().getHeight();
        int width = theme.getspaceText().getWidth();

        assertEquals(20, height);
        assertEquals(150, width);
    }

    @Test
    void TestspaceTextLocation() {
        int x = theme.getspaceText().getX();
        int y = theme.getspaceText().getY();

        assertEquals(710, x);
        assertEquals(520, y);
    }

    /* Test basketball icon */
    @Test
    void TestbasketballObj() {
        assertNotNull(theme.getbasketball());
    }

    @Test
    void TestbasketballSize() {
        int height = theme.getbasketball().getHeight();
        int width = theme.getbasketball().getWidth();

        assertEquals(260, height);
        assertEquals(260, width);
    }

    @Test
    void TestbasketballLocation() {
        int x = theme.getbasketball().getX();
        int y = theme.getbasketball().getY();

        assertEquals(75, x);
        assertEquals(250, y);
    }

    /* Test christmas icon */
    @Test
    void TestchristmasObj() {
        assertNotNull(theme.getchristmas());
    }

    @Test
    void TestchristmasSize() {
        int height = theme.getchristmas().getHeight();
        int width = theme.getchristmas().getWidth();

        assertEquals(260, height);
        assertEquals(260, width);
    }

    @Test
    void TestchristmasLocation() {
        int x = theme.getchristmas().getX();
        int y = theme.getchristmas().getY();

        assertEquals(365, x);
        assertEquals(250, y);
    }

    /* Test space icon */
    @Test
    void TestspaceObj() {
        assertNotNull(theme.getspace());
    }

    @Test
    void TestspaceSize() {
        int height = theme.getspace().getHeight();
        int width = theme.getspace().getWidth();

        assertEquals(260, height);
        assertEquals(260, width);
    }

    @Test
    void TestspaceLocation() {
        int x = theme.getspace().getX();
        int y = theme.getspace().getY();

        assertEquals(655, x);
        assertEquals(250, y);
    }

    /* Test Start button */
    @Test
    void TestStartObj() {
        assertNotNull(theme.getstartButton());
    }

    @Test
    void TestStartSize() {
        int height = theme.getstartButton().getHeight();
        int width = theme.getstartButton().getWidth();

        assertEquals(170, height);
        assertEquals(170, width);
    }

    @Test
    void TestStartLocation() {
        int x = theme.getstartButton().getX();
        int y = theme.getstartButton().getY();

        assertEquals(420, x);
        assertEquals(555, y);
    }
}
