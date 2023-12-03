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
public class Places_GUI extends javax.swing.JFrame {
    public boolean database;
    private void GetData(){
        try {
            Connection conn =(Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from Places");
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    private ImagePanel background;

    public Places_GUI() {
        initComponents();
        setTitle("Places Relation");
        GetData();
        database=true;
        Insert.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
    }


    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display_Table = new javax.swing.JTable();
        ADDRESS_tf = new javax.swing.JTextField();
        New = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        Verify = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADDRESS");

        Display_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null},
                        {null},
                        {null},
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "ADDRESS"
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
        background = new ImagePanel("D:\\CS430 Project\\src\\database_project\\background4.jpg");
        setContentPane(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(28, 28, 28))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(New)
                                                .addGap(84, 84, 84)
                                                .addComponent(Insert)
                                                .addGap(56, 56, 56)
                                                .addComponent(Update)
                                                .addGap(52, 52, 52)
                                                .addComponent(Delete)
                                                .addGap(68, 68, 68))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ADDRESS_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Verify)
                                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(100, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(Verify))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ADDRESS_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(New)
                                        .addComponent(Insert)
                                        .addComponent(Delete)
                                        .addComponent(Update))
                                .addGap(71, 71, 71)
                                .addComponent(Exit)
                                .addGap(25, 25, 25))
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
            ADDRESS_tf.setText("");

        }// NewActionPerformed
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// InsertActionPerformed
        if (database == true) {
            try {
                String sql = "insert into Places values('"+ADDRESS_tf.getText()+"')";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New values have been added");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        GetData();
    }// InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {// DeleteActionPerformed
        try { // hapus data
            String sql ="delete from Places where ADDRESS='"+ADDRESS_tf.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            database=true;
            ADDRESS_tf.setText("");




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
            java.sql.ResultSet sql = stm.executeQuery("select * from Places where ADDRESS ='"+table+"'");
            if(sql.next()){

                String address = sql.getString("ADDRESS");
                ADDRESS_tf.setText(address);


            }
        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {// UpdateActionPerformed
        if(database==false) {
            try {
                String sql = "update Places SET ADDRESS='"+ADDRESS_tf.getText()+"' where ADDRESS='"+ADDRESS_tf.getText()+"'";
                java.sql.Connection conn = (java.sql.Connection)database_project.Connection_DB.DBCon();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
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
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Places_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Places_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Places_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Places_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Places_GUI().setVisible(true);
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
    private javax.swing.JButton Update;
    private javax.swing.JButton Verify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_pf;
    // End of variables declaration
}