import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
    MainFrame() {
        ArrayList<String> studentsDetails = new ArrayList<String>();

        // Font
        Font font = new Font("Ink free", Font.BOLD, 30);
        Font newfont = new Font("Ink free", Font.BOLD, 25);
        Font regularfont = new Font("Ink free", Font.BOLD, 20);
        Font newregularfont = new Font("Ink free", Font.BOLD, 16);

        // NavBar================
        JLabel navText = new JLabel();
        navText.setText("Main Panel");
        navText.setLayout(null);
        navText.setForeground(Color.WHITE);
        navText.setBounds(500, 5, 200, 40);
        navText.setFont(font);

        JPanel navBarPanel = new JPanel();
        navBarPanel.setLayout(null);
        navBarPanel.setBackground(Color.RED);
        navBarPanel.setBounds(0, 2, 1400, 60);
        navBarPanel.add(navText);
        // NavBar================

        // Student Details===============
        JLabel fillSDetails = new JLabel();
        fillSDetails.setLayout(null);
        fillSDetails.setText("Enter Students Details Here..");
        fillSDetails.setForeground(Color.BLACK);
        fillSDetails.setFont(newfont);
        fillSDetails.setBounds(80, 20, 400, 50);

        JLabel sName = new JLabel();
        sName.setLayout(null);
        sName.setText("Student Name");
        sName.setForeground(Color.WHITE);
        sName.setFont(regularfont);
        sName.setBounds(30, 100, 400, 50);

        JTextArea s_Name_TextArea = new JTextArea();
        s_Name_TextArea.setLayout(null);
        s_Name_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        s_Name_TextArea.setFont(regularfont);
        s_Name_TextArea.setBounds(200, 100, 250, 40);

        JLabel sClass = new JLabel();
        sClass.setLayout(null);
        sClass.setText("Student Class");
        sClass.setForeground(Color.WHITE);
        sClass.setFont(regularfont);
        sClass.setBounds(30, 160, 400, 50);

        JTextArea s_Class_TextArea = new JTextArea();
        s_Class_TextArea.setLayout(null);
        s_Class_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        s_Class_TextArea.setFont(regularfont);
        s_Class_TextArea.setBounds(200, 160, 250, 40);

        JLabel sD_O_B = new JLabel();
        sD_O_B.setLayout(null);
        sD_O_B.setText("Student D.O.B");
        sD_O_B.setForeground(Color.WHITE);
        sD_O_B.setFont(regularfont);
        sD_O_B.setBounds(30, 220, 400, 50);

        JTextArea s_Dob_TextArea = new JTextArea();
        s_Dob_TextArea.setLayout(null);
        s_Dob_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        s_Dob_TextArea.setFont(regularfont);
        s_Dob_TextArea.setBounds(200, 220, 250, 40);

        JLabel s_ID = new JLabel();
        s_ID.setLayout(null);
        s_ID.setText("Student I.D");
        s_ID.setForeground(Color.WHITE);
        s_ID.setFont(regularfont);
        s_ID.setBounds(30, 280, 400, 50);

        JTextArea s_ID_TextArea = new JTextArea();
        s_ID_TextArea.setLayout(null);
        s_ID_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        s_ID_TextArea.setFont(regularfont);
        s_ID_TextArea.setBounds(200, 280, 250, 40);

        JLabel s_Add = new JLabel();
        s_Add.setLayout(null);
        s_Add.setText("Student Address");
        s_Add.setForeground(Color.WHITE);
        s_Add.setFont(regularfont);
        s_Add.setBounds(30, 340, 400, 50);

        JTextArea s_Add_TextArea = new JTextArea();
        s_Add_TextArea.setLayout(null);
        s_Add_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        s_Add_TextArea.setFont(regularfont);
        s_Add_TextArea.setBounds(200, 340, 250, 40);
        // Student Details===============

        // Entry Field==========
        JTextArea eEntry_TextArea = new JTextArea();
        eEntry_TextArea.setLayout(null);
        eEntry_TextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        eEntry_TextArea.setFont(newregularfont);
        eEntry_TextArea.setBounds(10, 5, 580, 520);

        JPanel sEntryField = new JPanel();
        sEntryField.setLayout(null);
        sEntryField.setBackground(Color.BLUE);
        sEntryField.setBounds(650, 70, 600, 530);
        sEntryField.add(eEntry_TextArea);
        // Entry Field==========

        // Submit Button============
        JButton submitButton = new JButton();
        submitButton.setLayout(null);
        submitButton.setText("Submit");
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(newfont);
        submitButton.setBounds(80, 420, 250, 50);

        submitButton.addActionListener((e) -> {
            String name, claas, dob, iD, addres;
            name = s_Name_TextArea.getText();
            claas = s_Class_TextArea.getText();
            dob = s_Dob_TextArea.getText();
            iD = s_ID_TextArea.getText();
            addres = s_Add_TextArea.getText();
            studentsDetails.add(name + " " + claas + " " + dob + " " + iD + "" + addres);
            System.out.println("S_Details are: " + studentsDetails);
            eEntry_TextArea.selectAll();
            eEntry_TextArea.replaceSelection("content");
            for (String str : studentsDetails) {
                eEntry_TextArea.append(str + "\n");
            }

        });
        // Submit Button============
        // Clear Button===============
        JButton clearButton = new JButton();
        clearButton.setLayout(null);
        clearButton.setText("Clear");
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(newfont);
        clearButton.setBounds(320, 420, 250, 50);
        clearButton.addActionListener((e)->{
            eEntry_TextArea.setText("");
        });
        // Clear Button===============
        // Main Panel=========
        JPanel sEntryPanel = new JPanel();
        sEntryPanel.setLayout(null);
        sEntryPanel.setBackground(Color.GRAY);
        sEntryPanel.setBounds(20, 70, 600, 530);

        sEntryPanel.add(sName);
        sEntryPanel.add(sClass);
        sEntryPanel.add(fillSDetails);
        sEntryPanel.add(sD_O_B);
        sEntryPanel.add(s_ID);
        sEntryPanel.add(s_Add);
        sEntryPanel.add(s_Name_TextArea);
        sEntryPanel.add(s_Class_TextArea);
        sEntryPanel.add(s_Dob_TextArea);
        sEntryPanel.add(s_ID_TextArea);
        sEntryPanel.add(s_Add_TextArea);
        sEntryPanel.add(submitButton);
        sEntryPanel.add(clearButton);
        // Main Panel=============

        this.setLayout(null);
        this.setSize(1300, 750);
        this.setTitle("Main Frame");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(navBarPanel);
        this.add(sEntryPanel);
        this.add(sEntryField);
        this.setVisible(true);
    };
};