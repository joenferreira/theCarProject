package run;

import Frames.loginPage;
import java.sql.Connection;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joen
 */
public class Run extends JFrame {

    public static JFrame FRAME2;

    public static void main(String[] args) throws ClassNotFoundException {

        loginPage page = new loginPage();
        page.setVisible(true);

        //initialize database, creates new if it does not exist
        Connection conn = null;
        conn = (new Sqlite().connect());

    }

}
