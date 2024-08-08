package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class passwordFrame extends JFrame{
    //Panels
    private JPanel titlePnl;
    private JPanel userPnl;
    private JPanel passwordPnl;
    private JPanel userPassPnl;
    private JPanel buttonPnl;
    private JPanel mainPnl;
    
    //Labels
    private JLabel titleLbl;
    private JLabel userLbl;
    private JLabel passLbl;
    
    //Buttons
    private JButton submitBtn;
    
    //Text Fields
    private JTextField userTxtField;
    private JTextField passTxtField;
    
    public void create() {
        //Creating the frame
        setTitle("User Login Page"); //Sets the frame heading
        setLayout(new BorderLayout()); //Sorts the components
        setSize(350, 165); //Frame size
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Closing Operation
        setLocationRelativeTo(null);
        
        //Creating panels
        titlePnl = new JPanel();
        
        userPnl = new JPanel(new FlowLayout());
        passwordPnl = new JPanel(new FlowLayout());
        
        userPassPnl = new JPanel(new GridLayout(2,1));
        
        buttonPnl = new JPanel(new FlowLayout());
        
        mainPnl = new JPanel(new BorderLayout());
        
        //Creating labels
        titleLbl = new JLabel("Login Details");
        
        userLbl = new JLabel("Username: ");
        passLbl = new JLabel("Password: ");
        
        //Creating buttons
        submitBtn = new JButton("Submit");
        
        //Creating the text fields
        userTxtField = new JTextField(20);
        passTxtField = new JTextField(20);
        
        //Adding the panels
        titlePnl.add(titleLbl);
        
        userPnl.add(userLbl);
        userPnl.add(userTxtField);
        
        passwordPnl.add(passLbl);
        passwordPnl.add(passTxtField);
        
        userPassPnl.add(userPnl);
        userPassPnl.add(passwordPnl);
        
        buttonPnl.add(submitBtn);
        
        mainPnl.add(titlePnl, BorderLayout.NORTH);
        mainPnl.add(userPassPnl, BorderLayout.CENTER);
        mainPnl.add(buttonPnl, BorderLayout.SOUTH);
        
        //Adding the main panel to the frame
        add(titlePnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.SOUTH);
        
        setVisible(true);
        
    }
}
