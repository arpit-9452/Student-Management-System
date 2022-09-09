import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {
    LoginFrame() {

        String usernameStr = "arpit9452";
        String passWordStr = "5256";

        // Font
        Font font = new Font("Ink free", Font.BOLD, 30);
        Font newfont = new Font("Ink free", Font.BOLD, 25);
        Font regularfont = new Font("Ink free", Font.BOLD, 20);

        // NavBar================
        JLabel navText = new JLabel();
        navText.setText("Login Panel");
        navText.setLayout(null);
        navText.setForeground(Color.WHITE);
        navText.setBounds(200, 4, 200, 40);
        navText.setFont(font);

        JPanel navBarPanel = new JPanel();
        navBarPanel.setLayout(null);
        navBarPanel.setBackground(Color.RED);
        navBarPanel.setBounds(0, 2, 640, 60);
        navBarPanel.add(navText);
        // NavBar================

        // User Name And Password..=============
        JLabel userName = new JLabel();
        userName.setLayout(null);
        userName.setText("UserName");
        userName.setForeground(Color.WHITE);
        userName.setFont(regularfont);
        userName.setBounds(50, 100, 400, 50);

        JTextArea userNameTextArea = new JTextArea();
        userNameTextArea.setLayout(null);
        userNameTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        userNameTextArea.setBounds(180, 105, 250, 40);
        userNameTextArea.setFont(regularfont);

        JLabel password = new JLabel();
        password.setLayout(null);
        password.setText("Password");
        password.setForeground(Color.WHITE);
        password.setFont(regularfont);
        password.setBounds(50, 180, 400, 50);

        JTextArea passwordTextArea = new JTextArea();
        passwordTextArea.setLayout(null);
        passwordTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        passwordTextArea.setBounds(180, 185, 250, 40);
        passwordTextArea.setFont(regularfont);
        // User Name And Password..=============

        // Error Message
        JLabel errormsg = new JLabel();
        errormsg.setLayout(null);
        errormsg.setText("Details Did not Matched..!");
        errormsg.setForeground(Color.RED);
        errormsg.setFont(newfont);
        errormsg.setBounds(80, 320, 400, 50);
        errormsg.setVisible(false);
        // Error Message

        // Login Button
        JButton loginButton = new JButton();
        loginButton.setLayout(null);
        loginButton.setText("Login");
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBounds(200, 250, 200, 50);
        loginButton.setFont(newfont);

        loginButton.addActionListener((e) -> {
            System.out.println("Login");

            String usernameGetStr = userNameTextArea.getText();
            String passWordGetStr = passwordTextArea.getText();

            if (usernameGetStr.equals(usernameStr) && (passWordGetStr.equals(passWordStr))) {
                new MainFrame();
                this.setVisible(false);
            } else {
                errormsg.setVisible(true);
            }
        });
        // Login Button

        // Main Panel============
        JLabel loginDetails = new JLabel();
        loginDetails.setLayout(null);
        loginDetails.setText("Please Enter your Login Details");
        loginDetails.setForeground(Color.WHITE);
        loginDetails.setFont(newfont);
        loginDetails.setBounds(50, 20, 400, 50);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.BLUE);
        mainPanel.setBounds(70, 100, 500, 400);

        mainPanel.add(loginDetails);
        mainPanel.add(userName);
        mainPanel.add(userNameTextArea);
        mainPanel.add(password);
        mainPanel.add(passwordTextArea);
        mainPanel.add(loginButton);
        mainPanel.add(errormsg);
        // Main Panel============

        this.setLayout(null);
        this.setSize(650, 600);
        this.setTitle("Login Frame");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(navBarPanel);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
