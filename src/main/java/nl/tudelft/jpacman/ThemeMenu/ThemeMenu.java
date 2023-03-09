package nl.tudelft.jpacman.ThemeMenu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;

public class ThemeMenu extends JMenu {
    private final Game game;

    public ThemeMenu(Game game) {
        super("Theme");
        this.game = game;

        ButtonGroup themeGroup = new ButtonGroup();
        JMenuItem theme1Item = new JRadioButtonMenuItem("Theme 1");
        JMenuItem theme2Item = new JRadioButtonMenuItem("Theme 2");
        JMenuItem theme3Item = new JRadioButtonMenuItem("Theme 3");

        // Add action listeners to each menu item to change the game theme when selected
        theme1Item.addActionListener(e -> game.setTheme(1));
        theme2Item.addActionListener(e -> game.setTheme(2));
        theme3Item.addActionListener(e -> game.setTheme(3));

        // Add menu items to the button group
        themeGroup.add(theme1Item);
        themeGroup.add(theme2Item);
        themeGroup.add(theme3Item);

        // Add menu items to the theme menu
        add(theme1Item);
        add(theme2Item);
        add(theme3Item);
    }
}
