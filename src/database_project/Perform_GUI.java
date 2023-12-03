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
public class Perform_GUI extends javax.swing.JFrame {
    public boolean database;
    private void GetData(){
        try {
            Connection conn =(Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Perform");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    private ImagePanel background;
    public Perform_GUI() {
        initComponents();
        setTitle("Perform Relation");
        GetData();
        database=true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
    }



    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SONGID_tf = new javax.swing.JTextField();
        SSN_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display_Table = new javax.swing.JTable();
        New = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        Verify = new javax.swing.JButton();
        ssnsearch2 = new javax.swing.JButton();
        songidsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SONGID");

        jLabel2.setText("SSN");

        Display_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "SONGID", "SSN"
                }
        ));
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Display_TableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Display_Table);

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

        jLabel4.setText("Enter Password :");

        Verify.setText("Verify");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        ssnsearch2.setText("Search by SSN");
        ssnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnsearch2ActionPerformed(evt);
            }
        });

        songidsearch.setText("Search by SONGID");
        songidsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songidsearchActionPerformed(evt);
            }
        });
        background = new ImagePanel("D:\\CS430 Project\\src\\database_project\\background4.jpg");
        setContentPane(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(New)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Insert)
                                .addGap(64, 64, 64)
                                .addComponent(Update)
                                .addGap(65, 65, 65)
                                .addComponent(Delete)
                                .addGap(50, 50, 50))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SONGID_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(SSN_tf))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Verify)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(Exit)
                                                                .addGap(26, 26, 26))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(songidsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ssnsearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Verify))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 54, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(SONGID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(SSN_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(103, 103, 103))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(songidsearch)
                                                                .addGap(60, 60, 60)
                                                                .addComponent(ssnsearch2)
                                                                .addGap(97, 97, 97)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(New)
                                                        .addComponent(Insert)
                                                        .addComponent(Update)
                                                        .addComponent(Delete))
                                                .addGap(45, 45, 45)
                                                .addComponent(Exit)
                                                .addGap(21, 21, 21))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            SONGID_tf.setText("");
            SSN_tf.setText("");

        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Perform values('"+SONGID_tf.getText()+"','"+SSN_tf.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Either add SSN:" + SSN_tf.getText() + " or SONGID:" + SONGID_tf.getText() + "  into Musicians and Songs_Appears respectively");
            }
        }
        GetData();
    }// InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { // hapus data
            String sql ="delete from Perform where SONGID='"+SONGID_tf.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database=true;
            SONGID_tf.setText("");
            SSN_tf.setText("");



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
            java.sql.ResultSet sql = stm.executeQuery("select * from Perform where SONGID ='"+table+"'");
            if(sql.next()){
                String songid = sql.getString("SONGID");
                SONGID_tf.setText(songid);
                String ssn = sql.getString("SSN");
                SSN_tf.setText(ssn);



            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql1 = "update Perform SET SONGID='"+SONGID_tf.getText()+"',SSN='"+SSN_tf.getText()+"' where SONGID='"+SONGID_tf.getText()+"'";

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
    private void ssnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {// ssnsearch2ActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Perform where SSN='" + SSN_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// ssnsearch2ActionPerformed

    private void songidsearchActionPerformed(java.awt.event.ActionEvent evt) {// songidsearchActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Perform where SONGID='" + SONGID_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// songidsearchActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Perform_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perform_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perform_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perform_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perform_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Delete;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JButton New;
    private javax.swing.JTextField SONGID_tf;
    private javax.swing.JTextField SSN_tf;
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton songidsearch;
    private javax.swing.JButton ssnsearch;
    private javax.swing.JButton ssnsearch1;
    private javax.swing.JButton ssnsearch2;
    // End of variables declaration
}
