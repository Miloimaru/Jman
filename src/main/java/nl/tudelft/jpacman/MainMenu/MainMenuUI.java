package nl.tudelft.jpacman.MainMenu;

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

public class MainMenuUI extends JFrame implements ActionListener {

    private JButton startButton, themeButton, exitButton;
    private JLabel title;

    public MainMenuUI() {
        initUI();
    }

    private void initUI() {
        setTitle("JPacman Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel(new FlowLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());

        title = new JLabel("JPacman", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        titlePanel.add(title);

        startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        themeButton = new JButton("Change Theme");
        themeButton.addActionListener(this);
        buttonPanel.add(themeButton);

        exitButton = new JButton("Exit Game");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            System.out.println("Starting game...");
            Launcher.mainmenu.setVisible(false);
            new Launcher().launch();
            System.out.println(Launcher.themetype);
        } else if (e.getSource() == themeButton) {
            System.out.println("Changing theme...");
            Launcher.themeMenuOpen();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

}