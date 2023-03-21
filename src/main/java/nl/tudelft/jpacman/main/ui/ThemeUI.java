package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeUI extends JFrame {
    // private JLabel pacLogo, pacWalk;
    private JButton christmasButton, spaceButton, basketballButton;
    private JButton nameIconbutton, nameIconbutton2, nameIconbutton3;
    // private JTextField textField1;
    private JButton startButton;

    private JButton imageButton, imageButton2;

    public ThemeUI() {
        super("Pacman Theme Menu");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();

        // set the theme class
        ThemeConfig config = new ThemeConfig();

        ImageIcon imgBtn = new ImageIcon(getClass().getResource("/sprite/select_them_1.png"));
        imageButton = new JButton(imgBtn);
        imageButton.setBorderPainted(false);
        imageButton.setContentAreaFilled(false);
        add(imageButton);
        imageButton.setBounds(300, 40, 400, 190);
        ImageIcon imgBtn2 = new ImageIcon(getClass().getResource("/sprite/MM.png"));
        imageButton2 = new JButton(imgBtn2);
        imageButton2.setBorderPainted(false);
        imageButton2.setContentAreaFilled(false);
        add(imageButton2);
        imageButton2.setBounds(135, 40, 150, 150);

        // Create the text
        ImageIcon nameIcon = new ImageIcon(getClass().getResource("/sprite/text-basketball.png"));
        nameIconbutton = new JButton(nameIcon);
        nameIconbutton.setBorderPainted(false);
        nameIconbutton.setContentAreaFilled(false);
        add(nameIconbutton);
        nameIconbutton.setBounds(105, 520, 200, 18);

        // Create the text
        ImageIcon nameIcon2 = new ImageIcon(getClass().getResource("/sprite/text-christmas.png"));
        nameIconbutton2 = new JButton(nameIcon2);
        nameIconbutton2.setBorderPainted(false);
        nameIconbutton2.setContentAreaFilled(false);
        add(nameIconbutton2);
        nameIconbutton2.setBounds(395, 520, 200, 20);

        // Create the text
        ImageIcon nameIcon3 = new ImageIcon(getClass().getResource("/sprite/text-space.png"));
        nameIconbutton3 = new JButton(nameIcon3);
        nameIconbutton3.setBorderPainted(false);
        nameIconbutton3.setContentAreaFilled(false);
        add(nameIconbutton3);
        nameIconbutton3.setBounds(710, 520, 150, 20);

        // ********************************************************** */

        // Create the button
        ImageIcon basketballIcon = new ImageIcon(getClass().getResource("/sprite/basketball.png"));
        basketballButton = new JButton(basketballIcon);
        basketballButton.setBorderPainted(false);
        basketballButton.setContentAreaFilled(true);
        basketballButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("0");
                new Launcher().launch();
            }
        });
        add(basketballButton);
        basketballButton.setBounds(75, 250, 260, 260);

        // Create the button
        ImageIcon christmasIcon = new ImageIcon(getClass().getResource("/sprite/christmas.png"));
        christmasButton = new JButton(christmasIcon);
        christmasButton.setBorderPainted(false);
        christmasButton.setContentAreaFilled(true);
        christmasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("1");
                new Launcher().launch();
            }
        });
        add(christmasButton);
        christmasButton.setBounds(365, 250, 260, 260);

        // Create the button
        ImageIcon spaceIcon = new ImageIcon(getClass().getResource("/sprite/space.png"));
        spaceButton = new JButton(spaceIcon);
        spaceButton.setBorderPainted(false);
        spaceButton.setContentAreaFilled(true);
        spaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("2");
                new Launcher().launch();
            }
        });
        add(spaceButton);
        spaceButton.setBounds(655, 250, 260, 260);

        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/sprite/back_1.png"));
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
        startButton.setBounds(420, 555, 170, 170);
        // Set the panel background to black
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

        // setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        // buttonPanel.setPreferredSize(new Dimension(100,300));
        // buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());
    }

    public JButton getimageButton1() {
        return imageButton;
    }

    public JButton getimageButton2() {
        return imageButton2;
    }

    public JButton getBasketballText() {
        return nameIconbutton;
    };

    public JButton getchristmasText() {
        return nameIconbutton2;
    };

    public JButton getspaceText() {
        return nameIconbutton3;
    };

    public JButton getbasketball() {
        return basketballButton;
    };

    public JButton getchristmas() {
        return christmasButton;
    };

    public JButton getspace() {
        return spaceButton;
    };

    public JButton getstartButton() {
        return startButton;
    };
}
