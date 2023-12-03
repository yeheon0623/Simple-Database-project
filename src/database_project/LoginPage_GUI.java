package database_project;

import javax.swing.JOptionPane;
import java.awt.*;


/**
 *
 * @author Yuxuan Wang
 */
public class LoginPage_GUI extends javax.swing.JFrame {

    /**
     * Creates new form LOGINPAGE_GUI
     */

    // Declaring a custom JPanel to serve as a background.
    private ImagePanel background;

    // Constructor of the LoginPage_GUI class.
    public LoginPage_GUI() {
        initComponents();
        setTitle("Login Page");
    }


    // This method contains the generated code for initializing components in the JFrame.
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        password_pf = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        customerQuestionLabel = new javax.swing.JLabel();
        customerButton = new javax.swing.JButton();
        adminLoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 24));
        usernameLabel.setText("Username");
        passwordLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 24));
        passwordLabel.setText("Password");

        signInButton.setFont(new java.awt.Font("Arial", Font.BOLD, 18));
        signInButton.setText("Sign In");
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Arial", 1, 18));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Arial", 1, 24));
        titleLabel.setText(" Notown Music Records Database Management System");

        customerQuestionLabel.setFont(new java.awt.Font("Arial", 1, 18));
        customerQuestionLabel.setText("Are you a Customer ?");

        customerButton.setFont(new java.awt.Font("Arial", 1, 14));
        customerButton.setText("Click Here !");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        adminLoginLabel.setFont(new java.awt.Font("Arial", 1, 24));
        adminLoginLabel.setText("Administrator's Login");

        // Example of setting colors
        signInButton.setBackground(new Color(100, 149, 237)); // Cornflower Blue
        cancelButton.setBackground(new Color(100, 149, 237));    // Red-Orange
        customerButton.setBackground(new Color(100, 149, 237)); // Medium Sea Green

        background = new ImagePanel("D:\\CS430 Project\\src\\database_project\\background3.jpg");
        setContentPane(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);


        // Horizontal GroupLayout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(usernameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(passwordLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(signInButton)
                                                .addGap(51, 51, 51)
                                                .addComponent(cancelButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(customerQuestionLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(140, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(adminLoginLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // Vertical GroupLayout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(adminLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(signInButton)
                                        .addComponent(cancelButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerQuestionLabel)
                                        .addComponent(customerButton))
                                .addGap(69, 69, 69))
        );


        pack();
        setVisible(true);
    }


    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {// LoginActionPerformed

    }// LoginActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {// LoginMouseClicked
        String password= new String(password_pf.getPassword());
        if(username_tf.getText().equals("Yeheon0623") && password.equals("Lhl0209..") )
        {
            JOptionPane.showMessageDialog(null,"Sign In Successful");
            username_tf.setText("");
            password_pf.setText("");
            Admin_HomePage_GUI adminhomepage=new Admin_HomePage_GUI();
            adminhomepage.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null,"Sign In Failed");
    }// LoginMouseClicked

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {// CancelActionPerformed
        System.exit(0);
    }// CancelActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {// CustomerActionPerformed
        Customer_GUI customer=new Customer_GUI();
        customer.setVisible(true);
    }// CustomerActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel customerQuestionLabel;
    private javax.swing.JLabel adminLoginLabel;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration
}