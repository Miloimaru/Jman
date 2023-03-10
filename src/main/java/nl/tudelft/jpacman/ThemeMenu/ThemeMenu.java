package nl.tudelft.jpacman.ThemeMenu;

import nl.tudelft.jpacman.Launcher;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ThemeMenu extends JFrame implements ActionListener {

    private JButton themeOneButton, BackMenu, themeTwoButton, themeThreeButton, themeButton;
    private JLabel title;
    private int themeType = 0;

    public ThemeMenu() {
        initUI();
    }

    private void initUI() {
        setTitle("JPacman theme select");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel(new FlowLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel ExitPanel = new JPanel(new FlowLayout());

        title = new JLabel("Theme", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        titlePanel.add(title);

        themeOneButton = new JButton("Go!!Basketball");
        themeOneButton.addActionListener(this);
        buttonPanel.add(themeOneButton);

        themeTwoButton = new JButton("StarCosmic");
        themeTwoButton.addActionListener(this);
        buttonPanel.add(themeTwoButton);

        themeThreeButton = new JButton("ChristmasHoliday");
        themeThreeButton.addActionListener(this);
        buttonPanel.add(themeThreeButton);

        themeButton = new JButton("Classic");
        themeButton.addActionListener(this);
        buttonPanel.add(themeButton);

        BackMenu = new JButton("Main menu");
        BackMenu.addActionListener(this);
        ExitPanel.add(BackMenu);

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(ExitPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
        setVisible(true);
    }

    public int getThemeType() {
        return themeType;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == themeOneButton) {
            System.out.println("Changing theme 1...");
            themeType = 1;
        } else if (e.getSource() == themeTwoButton) {
            System.out.println("Changing theme 2...");
            themeType = 2;
        } else if (e.getSource() == themeThreeButton) {
            System.out.println("Changing theme 3...");
            themeType = 3;
        } else if (e.getSource() == themeButton) {
            System.out.println("Changing theme 3...");
            themeType = 0;
        } else if (e.getSource() == BackMenu) {
            Launcher.MenuOpen();
        }
    }

}
