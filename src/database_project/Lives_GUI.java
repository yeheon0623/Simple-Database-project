package database_project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yuxuan Wang
 */

/**
 * The LIVES_GUI class extends the JFrame class, allowing it to create a window for a Swing-based GUI application.
 * This class is specifically used to interact with and display data from the 'Lives' table in the database.
 */
public class Lives_GUI extends javax.swing.JFrame {

    public boolean database;

    /**
     * The GetData method is tasked with fetching data from the 'Lives' table in the database.
     * It establishes a connection to the database, executes a SQL query to retrieve all entries
     * from the 'Lives' table, and then displays this data in the Display_Table JTable component
     * within the GUI.
     */
    private void GetData(){
        try {
            // Establish a connection to the database using the DBCon method from the Connection_DB class.
            Connection conn =(Connection)database_project.Connection_DB.DBCon();

            // Create an SQL statement object that can be used to send SQL commands to the database.
            java.sql.Statement stm = conn.createStatement();

            // Execute an SQL query to fetch all data from the 'Lives' table.
            java.sql.ResultSet sql = stm.executeQuery("select * from Lives");

            // Use the DbUtils library to convert the SQL ResultSet into a TableModel,
            // which is then set as the model for the Display_Table component to render the data.
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    // Declaring a custom JPanel to serve as a background.
    private ImagePanel background;

    // Constructor of the Lives_GUI class.
    public Lives_GUI() {
        initComponents();
        setTitle("Lives Relation");
        GetData();
        database=true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
    }

    // This method contains the generated code for initializing components in the JFrame.
    private void initComponents() {

        SSNLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        SSN_tf = new javax.swing.JTextField();
        PHONE_tf = new javax.swing.JTextField();
        ADDRESS_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display_Table = new javax.swing.JTable();
        New = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        PasswordLabel = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        Verify = new javax.swing.JButton();
        ssnsearch = new javax.swing.JButton();
        phonesearch = new javax.swing.JButton();
        addressearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Initialization of the Display_Table JTable.

        SSNLabel.setText("SSN");

        PhoneLabel.setText("PHONE");

        AddressLabel.setText("ADDRESS");

        Display_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "SSN", "PHONE", "ADDRESS"
                }
        ));
        // Adding a mouse listener to the Display_Table for handling mouse click events.
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Display_TableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Display_Table);

        //Set the text

        New.setText("Refresh");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Exit.setText("Back");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        PasswordLabel.setText("Enter Password :");

        Verify.setText("Verify");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        ssnsearch.setText("Search by SSN");
        ssnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnsearchActionPerformed(evt);
            }
        });

        phonesearch.setText("Search by PHONE");
        phonesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonesearchActionPerformed(evt);
            }
        });

        addressearch.setText("Search by ADDRESS");
        addressearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressearchActionPerformed(evt);
            }
        });
        background = new ImagePanel("D:\\CS430 Project\\src\\database_project\\background4.jpg");
        setContentPane(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal GroupLayout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(AddressLabel)
                                                        .addComponent(SSNLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PhoneLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SSN_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(ADDRESS_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                .addComponent(PHONE_tf))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(New)
                                                .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(Insert)
                                                                .addGap(78, 78, 78)
                                                                .addComponent(Update)
                                                                .addGap(91, 91, 91)
                                                                .addComponent(Delete))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(addressearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(ssnsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(phonesearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Exit)
                                                .addGap(43, 43, 43)))
                                .addGap(25, 25, 25))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(PasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Verify)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // Vertical GroupLayout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(PasswordLabel)
                                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Verify))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(73, 73, 73)
                                                                .addComponent(ssnsearch)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(phonesearch)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(addressearch)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 177, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SSN_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SSNLabel))
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(PHONE_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PhoneLabel))
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ADDRESS_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AddressLabel))
                                                .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Insert)
                                                .addComponent(New))
                                        .addComponent(Update)
                                        .addComponent(Delete))
                                .addGap(30, 30, 30)
                                .addComponent(Exit)
                                .addGap(30, 30, 30))
        );

        pack();
        setVisible(true);
    }

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {// NewActionPerformed
        database=true;
        DefaultTableModel model=(DefaultTableModel) Display_Table.getModel();
        while(model.getRowCount()>0){
            model.setRowCount(0);
            GetData();
            SSN_tf.setText("");
            PHONE_tf.setText("");
            ADDRESS_tf.setText("");
        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Lives values('"+SSN_tf.getText()+"','"+PHONE_tf.getText()+"','"+ADDRESS_tf.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Either add SSN:" + SSN_tf.getText() + " or PHONE:" + PHONE_tf.getText() + " or ADDRESS:" + ADDRESS_tf.getText() + "  into Telephone_Home,Musicians and Places respectively");
            }
        }
        GetData();
    }// InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { // hapus data
            String sql ="delete from Lives where SSN='"+SSN_tf.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database=true;
            SSN_tf.setText("");
            PHONE_tf.setText("");
            ADDRESS_tf.setText("");


        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetData();
    }// DeleteActionPerformed

    private void Display_TableMouseEntered(java.awt.event.MouseEvent evt) {// Display_TableMouseEntered

    }// Display_TableMouseEntered

    private void Display_TableMouseClicked(java.awt.event.MouseEvent evt) {// Display_TableMouseClicked
        database = false;
        try {
            int row =Display_Table.getSelectedRow();
            String table=(Display_Table.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Lives where SSN ='"+table+"'");
            if(sql.next()){
                String ssn = sql.getString("SSN");
                SSN_tf.setText(ssn);
                String phone = sql.getString("PHONE");
                PHONE_tf.setText(phone);
                String address = sql.getString("ADDRESS");
                ADDRESS_tf.setText(address);


            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql1 = "update Lives SET SSN='"+SSN_tf.getText()+"',PHONE='"+PHONE_tf.getText()+"',ADDRESS='"+ADDRESS_tf.getText()+"' where SSN='"+SSN_tf.getText()+"'";

                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);

                pst1.execute();

                JOptionPane.showMessageDialog(null, "Values have been updated");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        GetData();
    }// UpdateActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {// ExitActionPerformed
        if (evt.getSource() == Exit) {

            dispose();
        }
    }// ExitActionPerformed

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {// VerifyActionPerformed
        String password= new String(password_pf.getPassword());
        if(password.equals("cs430@SIUC") )
        {
            JOptionPane.showMessageDialog(null,"Authentication Successful ! Now you can insert, delete or update values in the database");
            password_pf.setText("");

            Insert.setEnabled(true);
            Update.setEnabled(true);
            Delete.setEnabled(true);
        }// VerifyActionPerformed
        else{
            JOptionPane.showMessageDialog(null,"Authentication Failed ! Enter the correct password");
            password_pf.setText("");

        }
    }
    private void ssnsearchActionPerformed(java.awt.event.ActionEvent evt) {// ssnsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Lives where SSN='" + SSN_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// ssnsearchActionPerformed

    private void phonesearchActionPerformed(java.awt.event.ActionEvent evt) {// phonesearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Lives where PHONE='" + PHONE_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// phonesearchActionPerformed

    private void addressearchActionPerformed(java.awt.event.ActionEvent evt) {// addressearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Lives where ADDRESS='" + ADDRESS_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// addressearchActionPerformed



    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lives_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lives_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lives_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lives_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lives_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JTextField ADDRESS_tf;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JButton New;
    private javax.swing.JTextField PHONE_tf;
    private javax.swing.JTextField SSN_tf;
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JButton addressearch;
    private javax.swing.JLabel SSNLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton phonesearch;
    private javax.swing.JButton ssnsearch;
    // End of variables declaration
}