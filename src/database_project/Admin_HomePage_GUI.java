package database_project;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yuxuan Wang
 */
public class Admin_HomePage_GUI extends javax.swing.JFrame {

    public boolean database;
    /**
     * Fetches customer data from the database and displays it in a table.
     * It creates a database connection, executes a SQL query to select all records from
     * the CUSTOMER table, and sets the retrieved data as the model for the Display_Table component.
     *
     * If an SQL or HeadlessException occurs during the process, the catch block is currently empty,
     * which means that exceptions are caught but not handled or logged, which is not a best practice.
     * Ideally, should at least log the exception for debugging purposes.
     */
    private void GetData(){
        try {
            // Attempt to create a connection to the database using a custom connection method.
            Connection conn =(Connection)database_project.Connection_DB.DBCon();

            // Create a Statement object for sending SQL statements to the database.
            java.sql.Statement stm = conn.createStatement();

            // Execute a SQL query to select all records from the CUSTOMER table.
            java.sql.ResultSet sql = stm.executeQuery("select * from CUSTOMER");

            // Utilize a utility class 'DbUtils' to convert the ResultSet into a TableModel
            // and set this model to the Display_Table to show the data in the GUI.
            Display_Table.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    // Declaring a custom JPanel to serve as a background.
    private ImagePanel background;

    // Constructor of the Admin_HomePage_GUI class.

    public Admin_HomePage_GUI() {
        initComponents();
        setTitle("Admin Homepage");
        GetData();
        database=true;
    }


    // This method contains the generated code for initializing components in the JFrame.
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Display_Table = new javax.swing.JTable();
        Musicians = new javax.swing.JButton();
        Album_Producer = new javax.swing.JButton();
        Instruments = new javax.swing.JButton();
        Lives = new javax.swing.JButton();
        Perform = new javax.swing.JButton();
        Places = new javax.swing.JButton();
        Plays = new javax.swing.JButton();
        Songs_Appears = new javax.swing.JButton();
        Telephone_Home = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        ChooseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Initialization of the Display_Table JTable.

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
        // Adding a mouse listener to the Display_Table for handling mouse click events.
        Display_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Display_Table);

        // Set the font and text

        Musicians.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Musicians.setText("Musicians");
        Musicians.setPreferredSize(new java.awt.Dimension(113, 23));
        Musicians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusiciansActionPerformed(evt);
            }
        });

        Album_Producer.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Album_Producer.setText("Album Producer");
        Album_Producer.setPreferredSize(new java.awt.Dimension(113, 23));
        Album_Producer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Album_ProducerActionPerformed(evt);
            }
        });

        Instruments.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Instruments.setText("Instruments");
        Instruments.setPreferredSize(new java.awt.Dimension(113, 23));
        Instruments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstrumentsActionPerformed(evt);
            }
        });

        Lives.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Lives.setText("Lives");
        Lives.setPreferredSize(new java.awt.Dimension(113, 23));
        Lives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivesActionPerformed(evt);
            }
        });

        Perform.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Perform.setText("Perform");
        Perform.setPreferredSize(new java.awt.Dimension(113, 23));
        Perform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformActionPerformed(evt);
            }
        });

        Places.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Places.setText("Places");
        Places.setPreferredSize(new java.awt.Dimension(113, 23));
        Places.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacesActionPerformed(evt);
            }
        });

        Plays.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Plays.setText("Plays");
        Plays.setPreferredSize(new java.awt.Dimension(113, 23));
        Plays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaysActionPerformed(evt);
            }
        });

        Songs_Appears.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Songs_Appears.setText("Songs Appears");
        Songs_Appears.setPreferredSize(new java.awt.Dimension(113, 23));
        Songs_Appears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Songs_AppearsActionPerformed(evt);
            }
        });

        Telephone_Home.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        Telephone_Home.setText("Telephone Home");
        Telephone_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telephone_HomeActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("TimesRoman", 1, 24)); // Font setting
        titleLabel.setText("                        Notown Music Records Administrative Page");

        Exit.setFont(new java.awt.Font("Agency FB", 1, 14)); // Font setting
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        ChooseLabel.setFont(new java.awt.Font("TimesRoman", 1, 14)); // Font setting
        ChooseLabel.setText("Click on the table that you would like to acces:");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(Musicians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(95, 95, 95)
                                                                .addComponent(Album_Producer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Instruments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Plays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Perform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Places, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Lives, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(97, 97, 97)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(Songs_Appears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Telephone_Home)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(ChooseLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(295, 295, 295)
                                                .addComponent(Exit)))
                                .addContainerGap(58, Short.MAX_VALUE))
        );

        // Vertical GroupLayout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChooseLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Musicians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Album_Producer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Instruments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Places, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Plays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Songs_Appears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Perform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Telephone_Home)
                                        .addComponent(Lives, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addContainerGap())
        );

        pack();
        setVisible(true);
    }

    private void Display_TableMouseClicked(java.awt.event.MouseEvent evt) {// Display_TableMouseClicked
        database = false;
        try {
            int row =Display_Table.getSelectedRow();
            String table=(Display_Table.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)database_project.Connection_DB.DBCon();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from CUSTOMER");

        } catch (Exception e) {
        }
    }// Display_TableMouseClicked

    private void MusiciansActionPerformed(java.awt.event.ActionEvent evt) {// MusiciansActionPerformed
        Musicians_GUI musicians=new Musicians_GUI();
        musicians.setVisible(true);
    }// MusiciansActionPerformed

    private void Album_ProducerActionPerformed(java.awt.event.ActionEvent evt) {// Album_ProducerActionPerformed
        Album_Producer_GUI albumproducer=new Album_Producer_GUI();
        albumproducer.setVisible(true);
    }// ProducerActionPerformed

    private void InstrumentsActionPerformed(java.awt.event.ActionEvent evt) {// InstrumentsActionPerformed
        Instruments_GUI instruments=new Instruments_GUI();
        instruments.setVisible(true);
    }// InstrumentsActionPerformed


    private void LivesActionPerformed(java.awt.event.ActionEvent evt) {// LivesActionPerformed
        Lives_GUI lives=new Lives_GUI();
        lives.setVisible(true);
    }// LivesActionPerformed

    private void PerformActionPerformed(java.awt.event.ActionEvent evt) {// PerformActionPerformed
        Perform_GUI perform=new Perform_GUI();
        perform.setVisible(true);
    }// PerformActionPerformed

    private void PlacesActionPerformed(java.awt.event.ActionEvent evt) {// PlacesActionPerformed
        Places_GUI perform=new Places_GUI();
        Places.setVisible(true);
    }// PlacesActionPerformed

    private void PlaysActionPerformed(java.awt.event.ActionEvent evt) {// PlaysActionPerformed
        Plays_GUI plays=new Plays_GUI();
        plays.setVisible(true);
    }// PlaysActionPerformed

    private void Songs_AppearsActionPerformed(java.awt.event.ActionEvent evt) {// Songs_AppearsActionPerformed
        Songs_Appears_GUI songsappears=new Songs_Appears_GUI();
        songsappears.setVisible(true);
    }// Songs_AppearsActionPerformed

    private void Telephone_HomeActionPerformed(java.awt.event.ActionEvent evt) {// Telephone_HomeActionPerformed
        TelePhone_Home_GUI telephonehome=new TelePhone_Home_GUI();
        telephonehome.setVisible(true);
    }// Telephone_HomeActionPerformed
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
            java.util.logging.Logger.getLogger(Admin_HomePage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_HomePage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_HomePage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_HomePage_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_HomePage_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Album_Producer;
    private javax.swing.JTable Display_Table;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Instruments;
    private javax.swing.JButton Lives;
    private javax.swing.JButton Musicians;
    private javax.swing.JButton Perform;
    private javax.swing.JButton Places;
    private javax.swing.JButton Plays;
    private javax.swing.JButton Songs_Appears;
    private javax.swing.JButton Telephone_Home;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel ChooseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}