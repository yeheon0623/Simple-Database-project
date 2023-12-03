package database_project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.*;

/**
 *
 * @author Yuxuan Wang
 */

public class Album_Producer_GUI extends javax.swing.JFrame {

    public boolean database;
    /**
     * Retrieves album producer data from the database and sets it to the display table in the GUI.
     * The method establishes a database connection, executes a SQL query to retrieve all records
     * from the Album_Producer table, and then sets these records as the model for the Display_Table
     * component using a utility class DbUtils for conversion.
     */
    private void GetData() {
        try {
            // Attempting to establish a connection to the database using a custom method.
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            // Attempting to establish a connection to the database using a custom method.
            java.sql.Statement stm = conn.createStatement();
            // Executing a SQL query to retrieve all records from the Album_Producer table.
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer");
            // Using a utility class DbUtils to convert the ResultSet into a TableModel
            // and setting this model to the Display_Table component to update the GUI.
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }
    // Declaring a custom JPanel to serve as a background.
    private ImagePanel background;

    // Constructor of the Album_Producer_GUI class.

    public Album_Producer_GUI() {

        initComponents();
        setTitle("Album Producer relation");
        GetData();
        database = true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);


    }

    // This method contains the generated code for initializing components in the JFrame.
    private void initComponents() {

        AlbumIdLabel = new javax.swing.JLabel();
        SSNLabel = new javax.swing.JLabel();
        CopyRightLabel = new javax.swing.JLabel();
       SpeedLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ALBUMID_tf = new javax.swing.JTextField();
        SSN_tf = new javax.swing.JTextField();
        COPYRIGHT_tf = new javax.swing.JTextField();
        SPEED_tf = new javax.swing.JTextField();
        TITLE_tf = new javax.swing.JTextField();
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
        albumsearch = new javax.swing.JButton();
        ssnsearch = new javax.swing.JButton();
        copyrightsearch = new javax.swing.JButton();
        speedsearch = new javax.swing.JButton();
        titlesearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AlbumIdLabel.setText("Album ID");

        SSNLabel.setText("SSN");

        CopyRightLabel.setText("CopyRight");

        SpeedLabel.setText("Speed");

        TitleLabel.setText("Title");

        // Initialization of the Display_Table JTable.

        Display_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Album ID", "SSN", "CopyRight", "Speed", "Title"
                }
        ));
        // Adding a mouse listener to the Display_Table for handling mouse click events.
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Display_Table);
        //Set the text
        New.setText("Refresh ");
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

        PasswordLabel.setText("Enter the Password");

        Verify.setText("Verify");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        albumsearch.setText("Search by ALBUMID");
        albumsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumsearchActionPerformed(evt);
            }
        });

        ssnsearch.setText("Search by SSN");
        ssnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnsearchActionPerformed(evt);
            }
        });

        copyrightsearch.setText("Search By COPYRIGHT");
        copyrightsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyrightsearchActionPerformed(evt);
            }
        });

        speedsearch.setText("Search by SPEED");
        speedsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedsearchActionPerformed(evt);
            }
        });

        titlesearch.setText("Search by TITLE");
        titlesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titlesearchActionPerformed(evt);
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
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(CopyRightLabel)
                                                                .addComponent(SSNLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(SSN_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                                                .addComponent(COPYRIGHT_tf)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(26, 26, 26)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(TitleLabel)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(TITLE_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(SpeedLabel)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(SPEED_tf)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(AlbumIdLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ALBUMID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(New)
                                                                .addGap(93, 93, 93)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(albumsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ssnsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(copyrightsearch, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(speedsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(titlesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(Insert)
                                                                                .addGap(92, 92, 92)
                                                                                .addComponent(Update)
                                                                                .addGap(94, 94, 94)
                                                                                .addComponent(Delete))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(PasswordLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Verify)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(147, 147, 147))
        );

        // Vertical GroupLayout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Verify)
                                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PasswordLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addComponent(albumsearch)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(ssnsearch)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(copyrightsearch)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(speedsearch)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(titlesearch))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AlbumIdLabel)
                                                        .addComponent(ALBUMID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SSNLabel)
                                                        .addComponent(SSN_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CopyRightLabel)
                                                        .addComponent(COPYRIGHT_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SpeedLabel)
                                                        .addComponent(SPEED_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TitleLabel)
                                                        .addComponent(TITLE_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(New)
                                        .addComponent(Insert)
                                        .addComponent(Update)
                                        .addComponent(Delete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(34, 34, 34))
        );

        pack();
        setVisible(true);
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { //
            String sql = "delete from Album_Producer where ALBUMIDENTIFIER='" + ALBUMID_tf.getText() + "'";
            java.sql.Connection conn = (java.sql.Connection) database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database = true;
            ALBUMID_tf.setText("");
            SSN_tf.setText("");
            COPYRIGHT_tf.setText("");
            SPEED_tf.setText("");
            TITLE_tf.setText("");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetData();
    }// DeleteActionPerformed

    private void Display_TableMouseClicked(java.awt.event.MouseEvent evt) {// Display_TableMouseClicked
        database = false;
        try {
            int row = Display_Table.getSelectedRow();
            String table = (Display_Table.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn = (java.sql.Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where ALBUMIDENTIFIER ='" + table + "'");
            if (sql.next()) {
                String albumid = sql.getString("ALBUMIDENTIFIER");
                ALBUMID_tf.setText(albumid);
                String ssn = sql.getString("SSN");
                SSN_tf.setText(ssn);
                String copyright = sql.getString("COPYRIGHTDATE");
                COPYRIGHT_tf.setText(copyright);
                String speed = sql.getString("SPEED");
                SPEED_tf.setText(speed);
                String title = sql.getString("TITLE");
                TITLE_tf.setText(title);

            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {// NewActionPerformed
        database = true;
        DefaultTableModel model=(DefaultTableModel) Display_Table.getModel();
        while(model.getRowCount()>0){
            model.setRowCount(0);
            GetData();
            ALBUMID_tf.setText("");
            SSN_tf.setText("");
            COPYRIGHT_tf.setText("");
            SPEED_tf.setText("");
            TITLE_tf.setText("");


        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Album_Producer values('" + ALBUMID_tf.getText() + "','" + SSN_tf.getText() + "','" + COPYRIGHT_tf.getText() + "','" + SPEED_tf.getText() + "','" + TITLE_tf.getText() + "')";
                java.sql.Connection conn = (java.sql.Connection) database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "First add SSN:" + SSN_tf.getText() + " into Musicians");


            }
        }
        GetData();
    }// InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql1 = "update Album_Producer SET ALBUMIDENTIFIER='" + ALBUMID_tf.getText() + "',SSN='" + SSN_tf.getText() + "',COPYRIGHTDATE='" + COPYRIGHT_tf.getText() + "',SPEED='" + SPEED_tf.getText() + "',TITLE='" + TITLE_tf.getText() + "' where ALBUMIDENTIFIER='" + ALBUMID_tf.getText() + "'";

                java.sql.Connection conn = (java.sql.Connection) database_project.Connection_DB.DBCon();
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

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) { // VerifyActionPerformed
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
    private void albumsearchActionPerformed(java.awt.event.ActionEvent evt) {// albumsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where ALBUMIDENTIFIER='" + ALBUMID_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// albumsearchActionPerformed

    private void ssnsearchActionPerformed(java.awt.event.ActionEvent evt) {// ssnsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where SSN='" + SSN_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// ssnsearchActionPerformed

    private void copyrightsearchActionPerformed(java.awt.event.ActionEvent evt) {// copyrightsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where COPYRIGHTDATE='" + COPYRIGHT_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// copyrightsearchActionPerformed

    private void speedsearchActionPerformed(java.awt.event.ActionEvent evt) {// speedsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where SPEED='" + SPEED_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// speedsearchActionPerformed

    private void titlesearchActionPerformed(java.awt.event.ActionEvent evt) {// titlesearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Album_Producer where TITLE='" + TITLE_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// titlesearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Album_Producer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Album_Producer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Album_Producer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Album_Producer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Album_Producer_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JTextField ALBUMID_tf;
    private javax.swing.JTextField COPYRIGHT_tf;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JButton New;
    private javax.swing.JTextField SPEED_tf;
    private javax.swing.JTextField SSN_tf;
    private javax.swing.JTextField TITLE_tf;
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JButton albumsearch;
    private javax.swing.JButton copyrightsearch;
    private javax.swing.JLabel AlbumIdLabel;
    private javax.swing.JLabel SSNLabel;
    private javax.swing.JLabel CopyRightLabel;
    private javax.swing.JLabel SpeedLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton speedsearch;
    private javax.swing.JButton ssnsearch;
    private javax.swing.JButton titlesearch;
    // End of variables declaration
}