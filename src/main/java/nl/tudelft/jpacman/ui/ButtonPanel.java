package nl.tudelft.jpacman.ui;

import java.awt.*;
import java.util.Map;

import javax.swing.*;

/**
 * A panel containing a button for every registered action.
 *
 * @author Jeroen Roosen
 */
class ButtonPanel extends JPanel {

    /**
     * Default serialisation ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create a new button panel with a button for every action.
     * 
     * @param buttons The map of caption - action for each button.
     * @param parent  The parent frame, used to return window focus.
     */
    ButtonPanel(final Map<String, Action> buttons, final JFrame parent) {
        super();
        assert buttons != null;
        assert parent != null;

        if (ThemeConfig.getConfig() == "0") {
            setBackground(Color.WHITE);
            for (final String caption : buttons.keySet()) {
                ImageIcon icon = new ImageIcon(getClass().getResource("/sprite/" + caption.toLowerCase() + "_i1.png"));
                JButton button = new JButton(icon);
                button.addActionListener(e -> {
                    buttons.get(caption).doAction();
                    parent.requestFocusInWindow();
                });

                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                // button.setBackground(Color.YELLOW);
                add(button);
            }
        } else if (ThemeConfig.getConfig() == "1") {
            setBackground(Color.WHITE);
            for (final String caption : buttons.keySet()) {
                ImageIcon icon2 = new ImageIcon(getClass().getResource("/sprite/" + caption.toLowerCase() + "_i2.png"));
                JButton button2 = new JButton(icon2);
                button2.addActionListener(e -> {
                    buttons.get(caption).doAction();
                    parent.requestFocusInWindow();
                });

                button2.setBorderPainted(false);
                button2.setContentAreaFilled(false);
                // button.setBackground(Color.YELLOW);
                add(button2);
            }
        } else if (ThemeConfig.getConfig() == "2") {
            setBackground(Color.decode("#645CBB"));
            for (final String caption : buttons.keySet()) {
                ImageIcon icon3 = new ImageIcon(getClass().getResource("/sprite/" + caption.toLowerCase() + "_i3.png"));
                JButton button3 = new JButton(icon3);
                button3.addActionListener(e -> {
                    buttons.get(caption).doAction();
                    parent.requestFocusInWindow();
                });

                button3.setBorderPainted(false);
                button3.setContentAreaFilled(false);
                // button.setBackground(Color.YELLOW);
                add(button3);
            }
        }

    }
}
