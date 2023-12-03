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
public class Plays_GUI extends javax.swing.JFrame {
    public boolean database;
    private void GetData(){
        try {
            Connection conn =(Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Plays");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    private ImagePanel background;
    public Plays_GUI() {
        initComponents();
        setTitle("Plays Relation");
        GetData();
        database=true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SSN_tf = new javax.swing.JTextField();
        INSTRID_tf = new javax.swing.JTextField();
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
        ssnsearch = new javax.swing.JButton();
        instridsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SSN");

        jLabel2.setText("INSTRID");

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
                        "SSN", "INSTRID"
                }
        ));
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
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

        ssnsearch.setText("Search by SSN");
        ssnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnsearchActionPerformed(evt);
            }
        });

        instridsearch.setText("Search by INSTRID");
        instridsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instridsearchActionPerformed(evt);
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
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SSN_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(INSTRID_tf)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(New)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(57, 57, 57)
                                                                .addComponent(Update)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Verify)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ssnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(instridsearch)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                                                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(261, 261, 261)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SSN_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(INSTRID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(72, 72, 72))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Verify))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(ssnsearch)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(instridsearch)
                                                                .addGap(63, 63, 63)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Delete)
                                        .addComponent(Update)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Insert)
                                                .addComponent(New)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(28, 28, 28))
        );

        pack();
    }

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {// NewActionPerformed
        database=true;
        DefaultTableModel model=(DefaultTableModel) Display_Table.getModel();
        while(model.getRowCount()>0){
            model.setRowCount(0);
            GetData();
            SSN_tf.setText("");
            INSTRID_tf.setText("");
        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Plays values('"+SSN_tf.getText()+"','"+INSTRID_tf.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Either add SSN:" + SSN_tf.getText() + " or INSTRID:" + INSTRID_tf.getText() + "  into Musicians and Instruments respectively");


            }
        }
        GetData();
    }// InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { // hapus data
            String sql ="delete from Plays where INSTRID='"+INSTRID_tf.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database=true;
            SSN_tf.setText("");
            INSTRID_tf.setText("");



        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetData();
    }// DeleteActionPerformed

    private void Display_TableMouseClicked(java.awt.event.MouseEvent evt) {// Display_TableMouseClicked
        database = false;
        try {
            int row =Display_Table.getSelectedRow();
            String table=(Display_Table.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Plays where SSN ='"+table+"'");
            if(sql.next()){
                String ssn = sql.getString("SSN");
                SSN_tf.setText(ssn);
                String instrid = sql.getString("INSTRID");
                INSTRID_tf.setText(instrid);


            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql1 = "update Plays SET SSN='"+SSN_tf.getText()+"',INSTRID='"+INSTRID_tf.getText()+"' where SSN='"+SSN_tf.getText()+"'";

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
            java.sql.ResultSet sql = stm.executeQuery("select * from Plays where SSN='" + SSN_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// ssnsearchActionPerformed

    private void instridsearchActionPerformed(java.awt.event.ActionEvent evt) {// instridsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Plays where INSTRID='" + INSTRID_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// instridsearchActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plays_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plays_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plays_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plays_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plays_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Delete;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField INSTRID_tf;
    private javax.swing.JButton Insert;
    private javax.swing.JButton New;
    private javax.swing.JTextField SSN_tf;
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JButton instridsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton ssnsearch;
    // End of variables declaration
}