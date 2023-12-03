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
public class Songs_Appears_GUI extends javax.swing.JFrame {
    public boolean database;
    private void GetData(){
        try {
            Connection conn =(Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    private ImagePanel background;
    public Songs_Appears_GUI() {
        initComponents();
        setTitle("Songs_Appears Relation");
        GetData();
        database=true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SONGID_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AUTHOR_tf = new javax.swing.JTextField();
        TITLE_tf = new javax.swing.JTextField();
        New = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ALBUMID_tf = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        Verify = new javax.swing.JButton();
        songidsearch = new javax.swing.JButton();
        authorsearch = new javax.swing.JButton();
        titlesearch = new javax.swing.JButton();
        albumidsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SONGID");

        Display_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "SONGID", "AUTHOR", "TITLE", "ALBUM_IDENTIFIER"
                }
        ));
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Display_Table);

        jLabel2.setText("AUTHOR");

        jLabel3.setText("TITLE");

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

        jLabel4.setText("ALBUMID");

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Password :");

        Verify.setText("Verify");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        songidsearch.setText("Search by SONGID");
        songidsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songidsearchActionPerformed(evt);
            }
        });

        authorsearch.setText("Search by AUTHOR");
        authorsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsearchActionPerformed(evt);
            }
        });

        titlesearch.setText("Search by TITLE");
        titlesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titlesearchActionPerformed(evt);
            }
        });

        albumidsearch.setText("Search by ALBUMID");
        albumidsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumidsearchActionPerformed(evt);
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(64, 64, 64))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(TITLE_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                                        .addComponent(AUTHOR_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SONGID_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ALBUMID_tf))
                                                .addGap(49, 49, 49))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(New)
                                                .addGap(134, 134, 134)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Insert)
                                                .addGap(73, 73, 73)
                                                .addComponent(Update)
                                                .addGap(72, 72, 72)
                                                .addComponent(Delete)
                                                .addGap(11, 11, 11))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Verify))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titlesearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(authorsearch)
                                                .addComponent(songidsearch))
                                        .addComponent(albumidsearch, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SONGID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AUTHOR_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TITLE_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ALBUMID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(168, 168, 168))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Verify))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(songidsearch)
                                                .addGap(33, 33, 33)
                                                .addComponent(authorsearch)
                                                .addGap(38, 38, 38)
                                                .addComponent(titlesearch)
                                                .addGap(40, 40, 40)
                                                .addComponent(albumidsearch)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Insert)
                                        .addComponent(Update)
                                        .addComponent(Delete)
                                        .addComponent(New))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(26, 26, 26))
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
            AUTHOR_tf.setText("");
            TITLE_tf.setText("");
            ALBUMID_tf.setText("");

        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Songs_Appears values('"+SONGID_tf.getText()+"','"+AUTHOR_tf.getText()+"','"+TITLE_tf.getText()+"','"+ALBUMID_tf.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (Exception  e) {
                JOptionPane.showMessageDialog(null, "First add ALBUMID:" + ALBUMID_tf.getText() + " into Album_Producer");
            }
        }
        GetData();
    }// InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { // hapus data
            String sql ="delete from Songs_Appears where ALBUMIDENTIFIER='"+ALBUMID_tf.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database=true;
            SONGID_tf.setText("");
            AUTHOR_tf.setText("");
            TITLE_tf.setText("");
            ALBUMID_tf.setText("");


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
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears where SONGID ='"+table+"'");
            if(sql.next()){
                String songid = sql.getString("SONGID");
                SONGID_tf.setText(songid);
                String author = sql.getString("AUTHOR");
                AUTHOR_tf.setText(author);
                String title = sql.getString("TITLE");
                TITLE_tf.setText(title);
                String albumid = sql.getString("ALBUMIDENTIFIER");
                ALBUMID_tf.setText(albumid);

            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql1 = "update Songs_Appears SET SONGID='"+SONGID_tf.getText()+"',AUTHOR='"+AUTHOR_tf.getText()+"',TITLE='"+TITLE_tf.getText()+"',ALBUMIDENTIFIER='"+ALBUMID_tf.getText()+"' where SONGID='"+SONGID_tf.getText()+"'";

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
        }
        //VerifyActionPerformed
        else{
            JOptionPane.showMessageDialog(null,"Authentication Failed ! Enter the correct password");
            password_pf.setText("");

        }
    }
    private void songidsearchActionPerformed(java.awt.event.ActionEvent evt) {// songidsearchActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears where SONGID='" + SONGID_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// songidsearchActionPerformed

    private void authorsearchActionPerformed(java.awt.event.ActionEvent evt) {// authorsearchActionPerformed

        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears where AUTHOR='" + AUTHOR_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// authorsearchActionPerformed

    private void titlesearchActionPerformed(java.awt.event.ActionEvent evt) {// titlesearchActionPerformed

        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears where TITLE ='" + TITLE_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// titlesearchActionPerformed

    private void albumidsearchActionPerformed(java.awt.event.ActionEvent evt) {// albumidsearchActionPerformed

        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Songs_Appears where ALBUMIDENTIFIER='" + ALBUMID_tf.getText() + "'");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// albumidsearchActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Songs_Appears_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Songs_Appears_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Songs_Appears_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Songs_Appears_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Songs_Appears_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JTextField ALBUMID_tf;
    private javax.swing.JTextField AUTHOR_tf;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JButton New;
    private javax.swing.JTextField SONGID_tf;
    private javax.swing.JTextField TITLE_tf;
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JButton albumidsearch;
    private javax.swing.JButton authorsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JButton songidsearch;
    private javax.swing.JButton titlesearch;
    // End of variables declaration
}