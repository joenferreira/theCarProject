/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.loginPage.FRAME2;
import static Frames.newUserFrame.frame;
import classes.Car;
import classes.User;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import run.Sqlite;

/**
 *
 * @author Joen
 */
public class buyFrame extends javax.swing.JFrame {

    String background = "";
    User newUser = new User("", 0);
    Car newCar = new Car("", "", "", "", 0, 0);

    /**
     * Creates new form buyFrame
     *
     * @param user1
     * @param car1
     */
    public buyFrame(User user1, Car car1) {
        newUser = user1;
        newCar = car1;
        initComponents();
        doItOnStart();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        carModelLabel1 = new javax.swing.JLabel();
        carModelLabel2 = new javax.swing.JLabel();
        carModelLabel3 = new javax.swing.JLabel();
        carModelLabel4 = new javax.swing.JLabel();
        descriptionLabel1 = new javax.swing.JLabel();
        descriptionLabel2 = new javax.swing.JLabel();
        descriptionLabel3 = new javax.swing.JLabel();
        descriptionLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(724, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 166, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 240));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Buy");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 115, 60));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Save");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 115, 60));
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 20, 150, 130));
        jPanel1.add(carModelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 190, 73, 66));
        jPanel1.add(carModelLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 190, 73, 66));
        jPanel1.add(carModelLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 276, 73, 66));
        jPanel1.add(carModelLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 276, 73, 66));

        descriptionLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        descriptionLabel1.setText("descriptionLabel1");
        jPanel1.add(descriptionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 217, -1, -1));

        descriptionLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        descriptionLabel2.setText("descriptionLabel1");
        jPanel1.add(descriptionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 215, -1, -1));

        descriptionLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        descriptionLabel3.setText("descriptionLabel1");
        jPanel1.add(descriptionLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 302, -1, -1));

        descriptionLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        descriptionLabel4.setText("descriptionLabel1");
        jPanel1.add(descriptionLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 301, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_back_icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

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
        JFrame frame = new FirstPage(newUser);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        JFrame frame = new carModelDisplay(newUser, newCar);
        frame.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        JFrame frame = new loginPage();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openWebpage(URI.create(checkModelForWebPage(newCar)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            saveThisCar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(buyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void doItOnStart() {
        checkBackgroundColor();
        findMake();
        setDescriptions();
        jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        carModelLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_model_icon.png")));
        carModelLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_year_icon.png")));
        carModelLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_engine_icon.png")));
        carModelLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_cost_icon.png")));
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
            java.util.logging.Logger.getLogger(buyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new buyFrame(new User("", 0), new Car("", "", "", "", 0, 0)).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carModelLabel1;
    private javax.swing.JLabel carModelLabel2;
    private javax.swing.JLabel carModelLabel3;
    private javax.swing.JLabel carModelLabel4;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JLabel descriptionLabel2;
    private javax.swing.JLabel descriptionLabel3;
    private javax.swing.JLabel descriptionLabel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables

    private void findMake() {
        //MERCEDES MODELS SECTION
        switch (newCar.getMake()) {
            //END OF MERCEDES MODELS SECTION
            case "Mercedes":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_icon.png")));
                switch (newCar.getModel()) {
                    case "A class":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_aclass_image_big.png")));
                        break;
                    case "C class":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_cclass_image_big.png")));
                        break;
                    case "E class":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_eclass_image_big.png")));
                        break;
                    case "S class":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_sclass_image_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            //END OF BMW MODELS SECTION
            case "BMW":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_icon.png")));
                switch (newCar.getModel()) {
                    case "Model 1":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model1_big.png")));
                        break;
                    case "Model 3":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model3_big.png")));
                        break;
                    case "Model 5":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model5_big.png")));
                        break;
                    case "Model 7":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_model7_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            //END OF VOLVO MODELS SECTION
            case "Volvo":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_icon.png")));
                switch (newCar.getModel()) {
                    case "V40":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_v40_big.png")));
                        break;
                    case "S60":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_s60_big.png")));
                        break;
                    case "S90":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_s90_big.png")));
                        break;
                    case "XC90":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_xc90_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            //END OF VOLKSWAGEN MODEL SECTION
            case "Volkswagen":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_icon.png")));
                switch (newCar.getModel()) {
                    case "Golf":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_golf_big.png")));
                        break;
                    case "Passat":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_passat_big.png")));
                        break;
                    case "Touareg":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_touareg_big.png")));
                        break;
                    case "CC":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_cc_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            case "Porsche":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_icon.png")));
                switch (newCar.getModel()) {
                    case "718":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_718_big.png")));
                        break;
                    case "Panamera":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_panamera_big.png")));
                        break;
                    case "Macan":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_macan_big.png")));
                        break;
                    case "Cayenne":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_cayenne_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            case "Jaguar":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_icon.png")));
                switch (newCar.getModel()) {
                    case "XE":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_xe_big.png")));
                        break;
                    case "XJ":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_xf_big.png")));
                        break;
                    case "F-PACE":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_fpace_big.png")));
                        break;
                    case "F-TYPE":
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_ftype_big.png")));
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    private void setDescriptions() {
        descriptionLabel1.setText(newCar.getModel());
        descriptionLabel2.setText(Integer.toString(newCar.getYear()));
        descriptionLabel3.setText(newCar.getEngine());
        descriptionLabel4.setText("£" + Integer.toString(newCar.getCost()));
    }

    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (IOException e) {
            }
        }
    }

    String checkModelForWebPage(Car car) {
        switch (car.getMake()) {
            //END OF MERCEDES MODELS SECTION
            case "Mercedes":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_mercedes_icon.png")));
                switch (car.getModel()) {
                    case "A class":
                        return "http://www.mercedes-benz.co.uk/content/unitedkingdom/mpc/mpc_unitedkingdom_website/en/home_mpc/passengercars/home/new_cars/models/a-class/a-class.html";
                    case "C class":
                        return "https://www.mercedes-benz.co.uk/passengercars/mercedes-benz-cars/models/c-class/c-class-saloon/overview.html";
                    case "E class":
                        return "http://www.mercedes-benz.co.uk/content/unitedkingdom/mpc/mpc_unitedkingdom_website/en/home_mpc/passengercars/home/new_cars/models/e-class/e-class-saloon.html";
                    case "S class":
                        return "http://www.mercedes-benz.co.uk/content/unitedkingdom/mpc/mpc_unitedkingdom_website/en/home_mpc/passengercars/home/new_cars/models/s-class/_w222.html";
                    default:
                        break;
                }
                break;
            //END OF BMW MODELS SECTION
            case "BMW":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_bmw_icon.png")));
                switch (car.getModel()) {
                    case "Model 1":
                        return "https://www.bmw.co.uk/en_GB/new-vehicles/1.html";
                    case "Model 3":
                        return "https://www.bmw.co.uk/en_GB/new-vehicles/3.html";
                    case "Model 5":
                        return "https://www.bmw.co.uk/en_GB/new-vehicles/5.html";
                    case "Model 7":
                        return "https://www.bmw.co.uk/en_GB/new-vehicles/7.html";
                    default:
                        break;
                }
                break;
            //END OF VOLVO MODELS SECTION
            case "Volvo":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volvo_icon.png")));
                switch (car.getModel()) {
                    case "V40":
                        return "http://www.volvocars.com/uk/cars/new-models/v40";
                    case "S60":
                        return "http://www.volvocars.com/uk/cars/new-models/s60";
                    case "S90":
                        return "http://www.volvocars.com/uk/cars/new-models/s90";
                    case "XC90":
                        return "http://www.volvocars.com/uk/cars/new-models/xc90";
                    default:
                        break;
                }
                break;
            //END OF VOLKSWAGEN MODEL SECTION
            case "Volkswagen":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_volkswagen_icon.png")));
                switch (car.getModel()) {
                    case "Golf":
                        return "http://www.volkswagen.co.uk/new/golf-vii-pa/home";
                    case "Passat":
                        return "http://www.volkswagen.co.uk/new/passat-viii/home";
                    case "Touareg":
                        return "http://www.volkswagen.co.uk/new/touareg-fl/home";
                    case "CC":
                        return "http://www.volkswagen.co.uk/new/volkswagen-cc-fl/home";
                    default:
                        break;
                }
                break;
            case "Porsche":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_porsche_icon.png")));
                switch (car.getModel()) {
                    case "718":
                        return "http://www.porsche.com/uk/models/718/";
                    case "Panamera":
                        return "http://www.porsche.com/uk/models/panamera/";
                    case "Macan":
                        return "http://www.porsche.com/uk/models/macan/";
                    case "Cayenne":
                        return "http://www.porsche.com/uk/models/cayenne/";
                    default:
                        break;
                }
                break;
            case "Jaguar":
                logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_jaguar_icon.png")));
                switch (car.getModel()) {
                    case "XE":
                        return "https://www.jaguar.co.uk/jaguar-range/xe/index.html";
                    case "XJ":
                        return "https://www.jaguar.co.uk/jaguar-range/xj/index.html";
                    case "F-PACE":
                        return "https://www.jaguar.co.uk/jaguar-range/f-pace/index.html";
                    case "F-TYPE":
                        return "https://www.jaguar.co.uk/jaguar-range/f-type/index.html";
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return null;
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

        background = color;
    }

    private void saveThisCar() throws ClassNotFoundException {

        if (checkIfExists()) {
            return;
        }

        Connection conn = null;

        try {
            conn = (new Sqlite().connect());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(newUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "insert into car(user_id, make, model, engine, fuel, year, cost) values(?,?,?,?,?,?,?)";
        PreparedStatement state = null;
        try {
            state = conn.prepareStatement(sql);
            state.setInt(1, newUser.getId());
            state.setString(2, newCar.getMake());
            state.setString(3, newCar.getModel());
            state.setString(4, newCar.getEngine());
            state.setString(5, newCar.getFuel());
            state.setInt(6, newCar.getYear());
            state.setInt(7, newCar.getCost());

            carCreated();
            state.execute();

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(newUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carCreated() {
        JOptionPane.showMessageDialog(jPanel1,
                "Car Saved!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean checkIfExists() throws ClassNotFoundException {

        Connection conn = null;

        try {
            conn = (new Sqlite().connect());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        String SQL = "Select * from car";
        try {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
            while (rs.next()) {
                if (rs.getInt(2) == newUser.getId()) {
                    conn.close();
                    if (okcancel("You already have a car saved do you wish to replace it?") == 0) {
                        deleteCar();
                        return false;
                    }
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int okcancel(String theMessage) {
        int result = JOptionPane.showConfirmDialog((Component) null, theMessage,
                "alert", JOptionPane.OK_CANCEL_OPTION);
        return result;
    }

    private void deleteCar() throws ClassNotFoundException {

        Connection conn = null;

        try {
            conn = (new Sqlite().connect());

            String sql = "DELETE FROM car WHERE user_id= ?";
            try (PreparedStatement state = conn.prepareStatement(sql)) {
                state.setInt(1, newUser.getId());
                state.executeUpdate();
            }
            conn.close();

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }

    }
}
