package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JLabel pacLogo, pacWalk;
    private JButton startButton;
    private JButton exitButton;
    private JButton imageButton;

    public MainMenu() {
        super("Pacman Main Menu");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        JPanel imagePanel = new JPanel();

        //set the theme class
        ThemeConfig config = new ThemeConfig();
        ImageIcon imgBtn = new ImageIcon(getClass().getResource("/sprite/logo_pacman_1.png"));
        imageButton = new JButton(imgBtn);
        imageButton.setBorderPainted(false);
        imageButton.setContentAreaFilled(false);
        add(imageButton);
        imageButton.setBounds(200, 50, 600, 229);

       

        ImageIcon imgBtn2 = new ImageIcon(getClass().getResource("/sprite/pacmanwalk.gif"));
        imageButton = new JButton(imgBtn2);
        imageButton.setBorderPainted(false);
        imageButton.setContentAreaFilled(false);
        add(imageButton);
        imageButton.setBounds(250, 250, 492, 240);

        

        //Start Button
        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/sprite/Start_1.png"));
        startButton = new JButton(startbBtn);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ThemeUI();
            }
        });
        add(startButton);
        startButton.setBounds(180, 400, 350, 350);

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
        exitButton.setBounds(460, 400, 350, 350);

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

//        setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
//        buttonPanel.setPreferredSize(new Dimension(100,300));
//        buttonPanel.setBackground(Color.GRAY);

        buttonPanel.setLayout(new FlowLayout());

    }

}
