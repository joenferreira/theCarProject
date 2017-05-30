/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import classes.Car;
import classes.User;
import java.awt.Color;
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
public final class FirstPage extends javax.swing.JFrame {

    public static JFrame FRAME2;
    classes.User newUser = new User("", 0);

    /**
     * Creates new form firstPage
     *
     * @param user1
     */
    public FirstPage(User user1) {
        newUser = user1;
        initComponents();
        doThisAtStart();
    }

    private void doThisAtStart() {
        helloLable.setText("Hello, " + newUser.getName());
        checkBackgroundColor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        helloLable = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Search");
        setBackground(new java.awt.Color(143, 196, 222));
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(720, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 166, 190));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_car_transport_traffic_auto_transportation_vehicle_automobile_v3-512.png"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.setActionCommand("searchButton");
        jButton1.setPreferredSize(new java.awt.Dimension(70, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Input on the box the make of the car to start the search process...");

        helloLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        helloLable.setText("Hello");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(helloLable, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(helloLable)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("System");

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setText("Options");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3logout.setText("Logout");
        jMenuItem3logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3logoutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Saved Cars");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        findCarMake();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Options Menu
        dispose();
        FRAME2 = new OptionsMenu(newUser);
        FRAME2.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3logoutActionPerformed
        //Logout Menu
        dispose();
        FRAME2 = new loginPage();
        FRAME2.setVisible(true);
    }//GEN-LAST:event_jMenuItem3logoutActionPerformed

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FirstPage(new User("", 0)).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel helloLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3logout;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

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
                break;
            case "Grey":
                jPanel1.setBackground(Color.gray);
                break;
            case "Red":
                jPanel1.setBackground(Color.red);
                break;
            default:
                jPanel1.setBackground(new Color(90, 166, 190));
                break;
        }
    }

    private void findCarMake() {
        String getNameOnText;
        getNameOnText = jTextField1.getText().trim();
        if (getNameOnText.trim().toLowerCase().contains("mercedes")) {
            dispose();
            Car newCar = new Car("Mercedes", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
        if (getNameOnText.trim().toLowerCase().contains("bmw")) {
            dispose();
            Car newCar = new Car("BMW", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
        if (getNameOnText.trim().toLowerCase().contains("volvo")) {
            dispose();
            Car newCar = new Car("Volvo", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
        if (getNameOnText.trim().toLowerCase().contains("volkswagen")) {
            dispose();
            Car newCar = new Car("Volkswagen", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
        if (getNameOnText.trim().toLowerCase().contains("porsche")) {
            dispose();
            Car newCar = new Car("Porsche", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
        if (getNameOnText.trim().toLowerCase().contains("jaguar")) {
            dispose();
            Car newCar = new Car("Jaguar", "", "", "", 0, 0);
            FRAME2 = new carModelDisplay(newUser, newCar);
            FRAME2.setVisible(true);
        }
    }

}
