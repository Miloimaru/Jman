package nl.tudelft.jpacman.sprite;

import nl.tudelft.jpacman.sprite.*;
import nl.tudelft.jpacman.ui.ThemeConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

public class ChangeSpriteTest {
    PacManSprites pacmans = new PacManSprites();
    ThemeConfig theme = new ThemeConfig();
    SpriteStore store = new SpriteStore();

    @Test
    void TesgetGroundSprite() throws IOException {
        theme.setConfig("0");
        Sprite floor = store.loadSprite("resources/sprite/floor.png");
        assertEquals(floor, pacmans.getGroundSprite());
    }

}