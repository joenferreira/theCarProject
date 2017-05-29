/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.loginPage.frame;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import run.Sqlite;

/**
 *
 * @author Joen
 */
public class newUserFrame extends javax.swing.JFrame {

    static JFrame frame = new newUserFrame();

    /**
     * Creates new form newUserFrame
     */
    public newUserFrame() {
        initComponents();
        doOnStart();
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
        newName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        userNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setMinimumSize(new java.awt.Dimension(360, 320));
        setPreferredSize(new java.awt.Dimension(460, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(460, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 166, 190));
        jPanel1.setMaximumSize(new java.awt.Dimension(460, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 320));

        newName.setText("Name...");
        newName.setToolTipText("Name");

        jPasswordField1.setText("........");
        jPasswordField1.setToolTipText("Password");

        userNameText.setText("Username...");
        userNameText.setToolTipText("Username");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_user-new-480.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Create User");
        jButton1.setPreferredSize(new java.awt.Dimension(92, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        getAccessibleContext().setAccessibleName("New User Registration");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (checkIfExists()) {
            usernameExistsError();
            return;
        }

        if (!checkIfComplete()) {
            usernameDetailsError();
            return;
        }

        Connection conn = null;

        try {
            conn = (new Sqlite().connect());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(newUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "insert into user(username, password, name) values(?,?,?)";
        PreparedStatement state = null;
        try {
            System.out.println("Doing this.");
            state = conn.prepareStatement(sql);
            state.setString(1, userNameText.getText());
            state.setString(2, jPasswordField1.getText());
            state.setString(3, newName.getText());

            usernameCreated();
            frame.dispose();
            state.execute();

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(newUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void run() {
        frame.setVisible(true);
    }

    private boolean checkIfComplete() {
        String usernameDefault = "Username...";
        String newNameDefault = "Name...";
        String passwordDefault = "........";

        return !(userNameText.getText().equals("") || userNameText.getText().equals(usernameDefault)
                || newName.getText().equals("") || newName.getText().equals(newNameDefault)
                || jPasswordField1.getText().equals("") || jPasswordField1.getText().equals(passwordDefault));
    }

    private boolean checkIfExists() {

        String checkName = userNameText.getText();

        Connection conn = null;

        try {
            conn = (new Sqlite().connect());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        String SQL = "Select * from user";
        try {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
            while (rs.next()) {
                if (checkName.equals(rs.getString(2))) {
                    conn.close();
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField newName;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables

    private void doOnStart() {
        jPanel1.requestFocus(); //Deletes focus on the textfield
        jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Cursor when hover create user

        newName.addFocusListener(new FocusAdapter() { //add's listener when mouse clicked and clears textfield
            @Override
            public void focusGained(FocusEvent e) {
                JTextField source = (JTextField) e.getComponent();
                source.setText("");
                source.removeFocusListener(this);
            }
        });

        userNameText.addFocusListener(new FocusAdapter() { //add's listener when mouse clicked and clears textfield
            @Override
            public void focusGained(FocusEvent e) {
                JTextField source = (JTextField) e.getComponent();
                source.setText("");
                source.removeFocusListener(this);
            }
        });

        jPasswordField1.addFocusListener(new FocusAdapter() { //add's listener when mouse clicked and clears textfield
            @Override
            public void focusGained(FocusEvent e) {
                JTextField source = (JTextField) e.getComponent();
                source.setText("");
                source.removeFocusListener(this);
            }
        });
    }

    private void usernameExistsError() {
        JOptionPane.showMessageDialog(jPanel1,
                "Username already exists.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private void usernameDetailsError() {
        JOptionPane.showMessageDialog(jPanel1,
                "Please complete all inputs.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private void usernameCreated() {
        JOptionPane.showMessageDialog(jPanel1,
                "Username created!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
