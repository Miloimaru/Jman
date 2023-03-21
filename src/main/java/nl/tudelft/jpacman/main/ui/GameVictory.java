package nl.tudelft.jpacman.main.ui;

import javax.swing.*;
import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameVictory extends JFrame {
    private JLabel pacLogo, pacWalk;
    private JButton startButton;
    private JButton exitButton;
    private JTextField textField1;

    public GameVictory() {
        super("Game victory");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        JPanel imagePanel = new JPanel();

        //set the theme class
        ThemeConfig config = new ThemeConfig();


        //Image Bg
        ImageIcon pacmanwalkIcon = new ImageIcon(getClass().getResource("/sprite/victory.png"));
        pacWalk = new JLabel(pacmanwalkIcon);
        buttonPanel.add(pacWalk);
        pacWalk.setBounds(0, 0, 10, 10);

        //Start Button
        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/sprite/Back_2.png"));
        startButton = new JButton(startbBtn);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenu();
            }
        });
        add(startButton);
        startButton.setBounds(270, 550, 210, 200);

        // Create the Exit button
        ImageIcon exitBtn = new ImageIcon(getClass().getResource("/sprite/Exit_1.png"));
        exitButton = new JButton(exitBtn);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
        exitButton.setBounds(520, 550, 200, 200);

        buttonPanel.setBackground(Color.BLACK);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size and center the frame on the screen
        setSize(1000, 800);

        // set the frame
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(false);


        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        buttonPanel.setLayout(new FlowLayout());

    }

}
