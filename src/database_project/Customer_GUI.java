package database_project;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yuxuan Wang
 */

/**
 * CUSTOMER_GUI class creates a user interface for interacting with customer data.
 * It extends the JFrame class from the Swing library to create a windowed application.
 */
public class Customer_GUI extends javax.swing.JFrame {

    public boolean database;

    /**
     * The GetData method is used to retrieve customer data from the database and display it in a JTable.
     * It establishes a database connection, executes a SQL query to retrieve all records from the
     * CUSTOMER table, and updates the JTable component named Customer_Table with the retrieved data.
     */
    private void GetData(){
        try {
            // Establishing a connection to the database using a method from the Connection_DB class.
            Connection conn =(Connection)database_project.Connection_DB.DBCon();

            // Creating a Statement object which allows the sending of SQL commands to the database.
            java.sql.Statement stm = conn.createStatement();

            // Executing a SQL query to retrieve all data from the CUSTOMER table.
            java.sql.ResultSet sql = stm.executeQuery("select * from CUSTOMER");

            // Using DbUtils (a utility class) to convert the ResultSet into a TableModel.
            // This TableModel is then set as the model for the Customer_Table to display data.
            Customer_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    // Declaring a custom JPanel to serve as a background.
    private ImagePanel background;

    // Constructor of the Customer_GUI class.
    public Customer_GUI() {
        initComponents();
        setTitle("Customers' Page");
        GetData();
        database=true;
    }

    // This method contains the generated code for initializing components in the JFrame.
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NAME = new javax.swing.JButton();
        ALBUM_TITLE = new javax.swing.JButton();
        SONG = new javax.swing.JButton();
        NAME_tf = new javax.swing.JTextField();
        ALBUM_TITLE_tf = new javax.swing.JTextField();
        SONG_tf = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Initialization of the Display_Table JTable.

        Customer_Table.setModel(new javax.swing.table.DefaultTableModel(
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
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "NAME", "ALBUM TITLE", "SONG"
                }
        ));
        // Adding a mouse listener to the Customer_Table for handling mouse click events.
        Customer_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer_Table);

        //Set the Font and Size

        NAME.setFont(new java.awt.Font("TimesRoman", 1, 12));
        NAME.setText("Search By Name");
        NAME.setPreferredSize(new java.awt.Dimension(95, 25));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });

        ALBUM_TITLE.setFont(new java.awt.Font("TimesRoman", 1, 12));
        ALBUM_TITLE.setText("Search By Album's Title");
        ALBUM_TITLE.setPreferredSize(new java.awt.Dimension(95, 25));
        ALBUM_TITLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALBUM_TITLEActionPerformed(evt);
            }
        });

        SONG.setFont(new java.awt.Font("TimesRoman", 1, 12));
        SONG.setText("Search By Song");
        SONG.setPreferredSize(new java.awt.Dimension(95, 25));
        SONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SONGActionPerformed(evt);
            }
        });

        NAME_tf.setPreferredSize(new java.awt.Dimension(95, 23));

        ALBUM_TITLE_tf.setPreferredSize(new java.awt.Dimension(95, 25));

        SONG_tf.setPreferredSize(new java.awt.Dimension(95, 25));

        Refresh.setFont(new java.awt.Font("TimesRoman", 1, 14));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 20));
        jLabel3.setText("                 Notown Music Records Users' Page");

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 14));
        jLabel2.setText(":");

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 14));
        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 14));
        jLabel5.setText(":");

        Exit.setFont(new java.awt.Font("TimesRoman", 1, 14));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        background = new ImagePanel("D:\\CS430 Project\\src\\database_project\\background5.jpg");
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(166, 166, 166)
                                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(SONG, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(ALBUM_TITLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 35, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(NAME_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGap(11, 11, 11)
                                                                        .addComponent(SONG_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(ALBUM_TITLE_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(187, 187, 187)))
                                .addGap(90, 90, 90))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(78, 78, 78))
        );
        // Vertical GroupLayout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(144, 144, 144)
                                                .addComponent(Refresh)
                                                .addGap(34, 34, 34)
                                                .addComponent(Exit)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NAME_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ALBUM_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(ALBUM_TITLE_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(SONG_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );

        pack();
        setVisible(true);
    }

    private void Customer_TableMouseClicked(java.awt.event.MouseEvent evt) {// Customer_TableMouseClicked
        database = false;
        try {
            int row =Customer_Table.getSelectedRow();
            String table=(Customer_Table.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from songs_appears");

        } catch (Exception e) {
        }
    }// Customer_TableMouseClicked


    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {// NAMEActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from songs_appears where author='" + NAME_tf.getText() + "'");
            Customer_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// NAMEActionPerformed

    private void ALBUM_TITLEActionPerformed(java.awt.event.ActionEvent evt) {// ALBUM_TITLEActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from album_producer where title='" + ALBUM_TITLE_tf.getText() + "'");
            Customer_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// ALBUM_TITLEActionPerformed

    private void SONGActionPerformed(java.awt.event.ActionEvent evt) {// SONGActionPerformed
        try {
            Connection conn = (Connection) database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from songs_appears where title='" + SONG_tf.getText() + "'");
            Customer_Table.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }// SONGActionPerformed


    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {// RefreshActionPerformed
        DefaultTableModel model=(DefaultTableModel) Customer_Table.getModel();
        while(model.getRowCount()>0){
            model.setRowCount(0);
            GetData();
            NAME_tf.setText("");
            ALBUM_TITLE_tf.setText("");
            SONG_tf.setText("");

        }// RefreshActionPerformed
    }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {// ExitActionPerformed
        if (evt.getSource() == Exit) {

            dispose();
        }
    }// ExitActionPerformed





    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton ALBUM_TITLE;
    private javax.swing.JTextField ALBUM_TITLE_tf;
    private javax.swing.JTable Customer_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton NAME;
    private javax.swing.JTextField NAME_tf;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SONG;
    private javax.swing.JTextField SONG_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}