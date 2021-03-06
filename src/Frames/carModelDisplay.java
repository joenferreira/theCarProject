/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import classes.Car;
import classes.User;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import run.Sqlite;

/**
 *
 * @author Joen
 */
public class carModelDisplay extends javax.swing.JFrame {

    String background = "";
    public static JFrame FRAME2;
    classes.User newUser = new User("", 0);
    classes.Car newCar = new Car("", "", "", "", 0, 0);
    Car mercedesAclass = new Car("Mercedes", "A class", "A180 CDI", "Diesel", 2017, 10000);
    Car mercedesCclass = new Car("Mercedes", "C class", "C 200D", "Diesel", 2017, 20000);
    Car mercedesEclass = new Car("Mercedes", "E class", "E 220D", "Diesel", 2017, 30000);
    Car mercedesSclass = new Car("Mercedes", "S class", "S 350D", "Diesel", 2017, 40000);
    Car BMWmodel1 = new Car("BMW", "Model 1", "TwinPower Turbo", "Diesel", 2017, 10000);
    Car BMWmodel3 = new Car("BMW", "Model 3", "TwinPower Turbo", "Diesel", 2017, 20000);
    Car BMWmodel5 = new Car("BMW", "Model 5", "TwinPower Turbo", "Diesel", 2017, 30000);
    Car BMWmodel7 = new Car("BMW", "Model 7", "TwinPower Turbo", "Diesel", 2017, 40000);
    Car volvoS60 = new Car("Volvo", "S60", "D2", "Diesel", 2017, 10000);
    Car volvoV40 = new Car("Volvo", "V40", "D2", "Diesel", 2017, 20000);
    Car volvoS90 = new Car("Volvo", "S90", "D4", "Diesel", 2017, 30000);
    Car volvoXC90 = new Car("Volvo", "XC90", "D5 PowerPulse", "Diesel", 2017, 40000);
    Car volkswagenGolf = new Car("Volkswagen", "Golf", "R 2.0 TSI", "Diesel", 2017, 10000);
    Car volkswagenPassat = new Car("Volkswagen", "Passat", "GT 2.0 BITDI", "Diesel", 2017, 20000);
    Car volkswagenTouareg = new Car("Volkswagen", "Touareg", "SE 3.0 TDI", "Diesel", 2017, 30000);
    Car volkswagenCC = new Car("Volkswagen", "CC", "GT 2.0 TDI", "Diesel", 2017, 40000);
    Car porschePanamera = new Car("Porsche", "Panamera", "3.0 L V6", "Diesel", 2017, 10000);
    Car porsche718 = new Car("Porsche", "718", "3.0 L V6", "Diesel", 2017, 20000);
    Car porscheMacan = new Car("Porsche", "Macan", "2.0 L 4-cylinder", "Diesel", 2017, 30000);
    Car porscheCayenne = new Car("Porsche", "Cayenne", "3.6-litre VR6", "Diesel", 2017, 40000);
    Car jaguarXE = new Car("Jaguar", "XE", "2.0 4 CYLINDER", "Diesel", 2017, 10000);
    Car jaguarXJ = new Car("Jaguar", "XJ", "3.0 V6 300", "Diesel", 2017, 20000);
    Car jaguarFPACE = new Car("Jaguar", "F-PACE", "2.0 L 4 CYLINDER", "Diesel", 2017, 30000);
    Car jaguarFTYPE = new Car("Jaguar", "F-TYPE", "2.0 Litre i4 300PS", "Diesel", 2017, 40000);

    /**
     * Creates new form Mercedes
     *
     * @param user1
     * @param car1
     */
    public carModelDisplay(User user1, Car car1) {
        newUser = user1;
        newCar = car1;
        initComponents();
        doThisAtStart();
    }

    private void doThisAtStart() {
        checkBackgroundColor();
        findModels();
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
        jTextArea4.setEditable(false);
        carModelLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        carModelLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        carModelLabel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        carModelLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        carModelLabel1 = new javax.swing.JLabel();
        carModelLabel2 = new javax.swing.JLabel();
        carModelLabel3 = new javax.swing.JLabel();
        carModelLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        descriptionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 166, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 24, 150, 130));

        carModelLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carModelLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(carModelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 125, 108));

        carModelLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carModelLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(carModelLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 191, 125, 108));

        carModelLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carModelLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(carModelLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 125, 106));

        carModelLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carModelLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(carModelLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 314, 125, 106));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, 95));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setFocusable(false);
        jPanel1.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 325, 150, 95));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);
        jPanel1.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 150, 95));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jPanel1.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 196, 150, 95));

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionLabel.setText("Click on a vehicle to proceed...");
        jPanel1.add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 444, 268, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_back_icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("System");

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setText("Main Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Logout");
        jMenuItem2.setActionCommand("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        FRAME2 = new FirstPage(newUser);
        FRAME2.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void carModelLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carModelLabel1MouseClicked
        dispose();
        if (newCar.getMake().equals("Mercedes")) {
            FRAME2 = new buyFrame(newUser, mercedesAclass);
        } else if (newCar.getMake().equals("BMW")) {
            FRAME2 = new buyFrame(newUser, BMWmodel1);
        } else if (newCar.getMake().equals("Jaguar")) {
            FRAME2 = new buyFrame(newUser, jaguarXE);
        } else if (newCar.getMake().equals("Porsche")) {
            FRAME2 = new buyFrame(newUser, porsche718);
        } else if (newCar.getMake().equals("Volkswagen")) {
            FRAME2 = new buyFrame(newUser, volkswagenGolf);
        } else if (newCar.getMake().equals("Volvo")) {
            FRAME2 = new buyFrame(newUser, volvoV40);
        }
        FRAME2.setVisible(true);
    }//GEN-LAST:event_carModelLabel1MouseClicked

    private void carModelLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carModelLabel2MouseClicked
        dispose();
        if (newCar.getMake().equals("Mercedes")) {
            FRAME2 = new buyFrame(newUser, mercedesCclass);
        } else if (newCar.getMake().equals("BMW")) {
            FRAME2 = new buyFrame(newUser, BMWmodel3);
        } else if (newCar.getMake().equals("Jaguar")) {
            FRAME2 = new buyFrame(newUser, jaguarXJ);
        } else if (newCar.getMake().equals("Porsche")) {
            FRAME2 = new buyFrame(newUser, porschePanamera);
        } else if (newCar.getMake().equals("Volkswagen")) {
            FRAME2 = new buyFrame(newUser, volkswagenPassat);
        } else if (newCar.getMake().equals("Volvo")) {
            FRAME2 = new buyFrame(newUser, volvoS60);
        }
        FRAME2.setVisible(true);
    }//GEN-LAST:event_carModelLabel2MouseClicked

    private void carModelLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carModelLabel3MouseClicked
        dispose();
        if (newCar.getMake().equals("Mercedes")) {
            FRAME2 = new buyFrame(newUser, mercedesEclass);
        } else if (newCar.getMake().equals("BMW")) {
            FRAME2 = new buyFrame(newUser, BMWmodel5);
        } else if (newCar.getMake().equals("Jaguar")) {
            FRAME2 = new buyFrame(newUser, jaguarFPACE);
        } else if (newCar.getMake().equals("Porsche")) {
            FRAME2 = new buyFrame(newUser, porscheMacan);
        } else if (newCar.getMake().equals("Volkswagen")) {
            FRAME2 = new buyFrame(newUser, volkswagenTouareg);
        } else if (newCar.getMake().equals("Volvo")) {
            FRAME2 = new buyFrame(newUser, volvoS90);
        }
        FRAME2.setVisible(true);
    }//GEN-LAST:event_carModelLabel3MouseClicked

    private void carModelLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carModelLabel4MouseClicked
        dispose();
        if (newCar.getMake().equals("Mercedes")) {
            FRAME2 = new buyFrame(newUser, mercedesSclass);
        } else if (newCar.getMake().equals("BMW")) {
            FRAME2 = new buyFrame(newUser, BMWmodel7);
        } else if (newCar.getMake().equals("Jaguar")) {
            FRAME2 = new buyFrame(newUser, jaguarFTYPE);
        } else if (newCar.getMake().equals("Porsche")) {
            FRAME2 = new buyFrame(newUser, porscheCayenne);
        } else if (newCar.getMake().equals("Volkswagen")) {
            FRAME2 = new buyFrame(newUser, volkswagenCC);
        } else if (newCar.getMake().equals("Volvo")) {
            FRAME2 = new buyFrame(newUser, volvoXC90);
        }
        FRAME2.setVisible(true);
    }//GEN-LAST:event_carModelLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        FRAME2 = new FirstPage(newUser);
        FRAME2.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        FRAME2 = new loginPage();
        FRAME2.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(carModelDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carModelDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carModelDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carModelDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new carModelDisplay(new User("", 0), new Car("", "", "", "", 0, 0)).setVisible(true);
        });
    }

    private void checkBackgroundColor() {

        String color = "";
        Connection conn = null;
        try {
            conn = (new Sqlite().connect());

            String SQL = "Select * from options WHERE user_id =" + newUser.getId();
            try (ResultSet rs = conn.createStatement().executeQuery(SQL)) {
                while (rs.next()) {
                    color = rs.getString(3);
                }
                conn.close();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (color) {
            case "Blue":
                jPanel1.setBackground(new Color(90, 166, 190));
                jTextArea1.setBackground(new Color(90, 166, 190));
                jTextArea2.setBackground(new Color(90, 166, 190));
                jTextArea3.setBackground(new Color(90, 166, 190));
                jTextArea4.setBackground(new Color(90, 166, 190));
                break;
            case "Grey":
                jPanel1.setBackground(Color.gray);
                jTextArea1.setBackground(Color.gray);
                jTextArea2.setBackground(Color.gray);
                jTextArea3.setBackground(Color.gray);
                jTextArea4.setBackground(Color.gray);
                break;
            case "Red":
                jPanel1.setBackground(Color.red);
                jTextArea1.setBackground(Color.red);
                jTextArea2.setBackground(Color.red);
                jTextArea3.setBackground(Color.red);
                jTextArea4.setBackground(Color.red);
                break;
            default:
                jPanel1.setBackground(new Color(90, 166, 190));
                break;
        }

        background = color;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carModelLabel1;
    private javax.swing.JLabel carModelLabel2;
    private javax.swing.JLabel carModelLabel3;
    private javax.swing.JLabel carModelLabel4;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables

    private void findModels() {
        //MERCEDES MODELS SECTION
        if (newCar.getMake().equals("Mercedes")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_aclass_image.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_cclass_image.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_eclass_image.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_sclass_image.png")));
            jTextArea1.setText("Make: " + volvoV40.getMake() + "\nModel: "
                    + mercedesAclass.getModel() + "\nEngine: " + mercedesAclass.getEngine() + "\nFuel: "
                    + mercedesAclass.getFuel() + "\nYear: " + mercedesAclass.getYear() + "\nCost: " + mercedesAclass.getCost());
            jTextArea2.setText("Make: " + mercedesAclass.getMake() + "\nModel: "
                    + mercedesCclass.getModel() + "\nEngine: " + mercedesCclass.getEngine() + "\nFuel: "
                    + mercedesCclass.getFuel() + "\nYear: " + mercedesCclass.getYear() + "\nCost: " + mercedesCclass.getCost());
            jTextArea3.setText("Make: " + mercedesAclass.getMake() + "\nModel: "
                    + mercedesEclass.getModel() + "\nEngine: " + mercedesEclass.getEngine() + "\nFuel: "
                    + mercedesEclass.getFuel() + "\nYear: " + mercedesEclass.getYear() + "\nCost: " + mercedesEclass.getCost());
            jTextArea4.setText("Make: " + mercedesAclass.getMake() + "\nModel: "
                    + mercedesSclass.getModel() + "\nEngine: " + mercedesSclass.getEngine() + "\nFuel: "
                    + mercedesSclass.getFuel() + "\nYear: " + mercedesSclass.getYear() + "\nCost: " + mercedesSclass.getCost());
        } //END OF MERCEDES MODELS SECTION
        //BMW MODELS SECTION
        else if (newCar.getMake().equals("BMW")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model1.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model3.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model5.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model7.png")));
            jTextArea1.setText("Make: " + BMWmodel1.getMake() + "\nModel: "
                    + BMWmodel1.getModel() + "\nEngine: " + BMWmodel1.getEngine() + "\nFuel: "
                    + BMWmodel1.getFuel() + "\nYear: " + BMWmodel1.getYear() + "\nCost: " + BMWmodel1.getCost());
            jTextArea2.setText("Make: " + BMWmodel1.getMake() + "\nModel: "
                    + BMWmodel3.getModel() + "\nEngine: " + BMWmodel3.getEngine() + "\nFuel: "
                    + BMWmodel3.getFuel() + "\nYear: " + BMWmodel3.getYear() + "\nCost: " + BMWmodel3.getCost());
            jTextArea3.setText("Make: " + BMWmodel5.getMake() + "\nModel: "
                    + BMWmodel5.getModel() + "\nEngine: " + BMWmodel5.getEngine() + "\nFuel: "
                    + BMWmodel5.getFuel() + "\nYear: " + BMWmodel5.getYear() + "\nCost: " + BMWmodel5.getCost());
            jTextArea4.setText("Make: " + BMWmodel7.getMake() + "\nModel: "
                    + BMWmodel7.getModel() + "\nEngine: " + BMWmodel7.getEngine() + "\nFuel: "
                    + BMWmodel7.getFuel() + "\nYear: " + BMWmodel7.getYear() + "\nCost: " + BMWmodel7.getCost());
        }//END OF BMW MODELS SECTION
        //VOLVO MODELS SECTION
        else if (newCar.getMake().equals("Volvo")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_v40.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_s60.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_s90.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_xc90.png")));
            jTextArea1.setText("Make: " + volvoV40.getMake() + "\nModel: "
                    + volvoV40.getModel() + "\nEngine: " + volvoV40.getEngine() + "\nFuel: "
                    + volvoV40.getFuel() + "\nYear: " + volvoV40.getYear() + "\nCost: " + volvoV40.getCost());
            jTextArea2.setText("Make: " + volvoS60.getMake() + "\nModel: "
                    + volvoS60.getModel() + "\nEngine: " + volvoS60.getEngine() + "\nFuel: "
                    + volvoS60.getFuel() + "\nYear: " + volvoS60.getYear() + "\nCost: " + volvoS60.getCost());
            jTextArea3.setText("Make: " + volvoS90.getMake() + "\nModel: "
                    + volvoS90.getModel() + "\nEngine: " + volvoS90.getEngine() + "\nFuel: "
                    + volvoS90.getFuel() + "\nYear: " + volvoS90.getYear() + "\nCost: " + volvoS90.getCost());
            jTextArea4.setText("Make: " + volvoXC90.getMake() + "\nModel: "
                    + volvoXC90.getModel() + "\nEngine: " + volvoXC90.getEngine() + "\nFuel: "
                    + volvoXC90.getFuel() + "\nYear: " + volvoXC90.getYear() + "\nCost: " + volvoXC90.getCost());
        } //END OF VOLVO MODELS SECTION
        //VOLKSWAGEN MODELS SECTION
        else if (newCar.getMake().equals("Volkswagen")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_golf.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_passat.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_touareg.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_cc.png")));
            jTextArea1.setText("Make: " + volkswagenGolf.getMake() + "\nModel: "
                    + volkswagenGolf.getModel() + "\nEngine: " + volkswagenGolf.getEngine() + "\nFuel: "
                    + volkswagenGolf.getFuel() + "\nYear: " + volkswagenGolf.getYear() + "\nCost: " + volkswagenGolf.getCost());
            jTextArea2.setText("Make: " + volkswagenPassat.getMake() + "\nModel: "
                    + volkswagenPassat.getModel() + "\nEngine: " + volkswagenPassat.getEngine() + "\nFuel: "
                    + volkswagenPassat.getFuel() + "\nYear: " + volkswagenPassat.getYear() + "\nCost: " + volkswagenPassat.getCost());
            jTextArea3.setText("Make: " + volkswagenTouareg.getMake() + "\nModel: "
                    + volkswagenTouareg.getModel() + "\nEngine: " + volkswagenTouareg.getEngine() + "\nFuel: "
                    + volkswagenTouareg.getFuel() + "\nYear: " + volkswagenTouareg.getYear() + "\nCost: " + volkswagenTouareg.getCost());
            jTextArea4.setText("Make: " + volkswagenCC.getMake() + "\nModel: "
                    + volkswagenCC.getModel() + "\nEngine: " + volkswagenCC.getEngine() + "\nFuel: "
                    + volkswagenCC.getFuel() + "\nYear: " + volkswagenCC.getYear() + "\nCost: " + volkswagenCC.getCost());
        } //END OF VOLKSWAGEN MODEL SECTION
        else if (newCar.getMake().equals("Porsche")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_718.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_panamera.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_macan.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_cayenne.png")));
            jTextArea1.setText("Make: " + porsche718.getMake() + "\nModel: "
                    + porsche718.getModel() + "\nEngine: " + porsche718.getEngine() + "\nFuel: "
                    + porsche718.getFuel() + "\nYear: " + porsche718.getYear() + "\nCost: " + porsche718.getCost());
            jTextArea2.setText("Make: " + porschePanamera.getMake() + "\nModel: "
                    + porschePanamera.getModel() + "\nEngine: " + porschePanamera.getEngine() + "\nFuel: "
                    + porschePanamera.getFuel() + "\nYear: " + porschePanamera.getYear() + "\nCost: " + porschePanamera.getCost());
            jTextArea3.setText("Make: " + porscheMacan.getMake() + "\nModel: "
                    + porscheMacan.getModel() + "\nEngine: " + porscheMacan.getEngine() + "\nFuel: "
                    + porscheMacan.getFuel() + "\nYear: " + porscheMacan.getYear() + "\nCost: " + porscheMacan.getCost());
            jTextArea4.setText("Make: " + porscheCayenne.getMake() + "\nModel: "
                    + porscheCayenne.getModel() + "\nEngine: " + porscheCayenne.getEngine() + "\nFuel: "
                    + porscheCayenne.getFuel() + "\nYear: " + porscheCayenne.getYear() + "\nCost: " + porscheCayenne.getCost());
        } else if (newCar.getMake().equals("Jaguar")) {
            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_icon.png")));
            carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_xe.png")));
            carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_xf.png")));
            carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_fpace.png")));
            carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_ftype.png")));
            jTextArea1.setText("Make: " + jaguarXE.getMake() + "\nModel: "
                    + jaguarXE.getModel() + "\nEngine: " + jaguarXE.getEngine() + "\nFuel: "
                    + jaguarXE.getFuel() + "\nYear: " + jaguarXE.getYear() + "\nCost: " + jaguarXE.getCost());
            jTextArea2.setText("Make: " + jaguarXJ.getMake() + "\nModel: "
                    + jaguarXJ.getModel() + "\nEngine: " + jaguarXJ.getEngine() + "\nFuel: "
                    + jaguarXJ.getFuel() + "\nYear: " + jaguarXJ.getYear() + "\nCost: " + jaguarXJ.getCost());
            jTextArea3.setText("Make: " + jaguarFPACE.getMake() + "\nModel: "
                    + jaguarFPACE.getModel() + "\nEngine: " + jaguarFPACE.getEngine() + "\nFuel: "
                    + jaguarFPACE.getFuel() + "\nYear: " + jaguarFPACE.getYear() + "\nCost: " + jaguarFPACE.getCost());
            jTextArea4.setText("Make: " + jaguarFTYPE.getMake() + "\nModel: "
                    + jaguarFTYPE.getModel() + "\nEngine: " + jaguarFTYPE.getEngine() + "\nFuel: "
                    + jaguarFTYPE.getFuel() + "\nYear: " + jaguarFTYPE.getYear() + "\nCost: " + jaguarFTYPE.getCost());
        }
    }

}
