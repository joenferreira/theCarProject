/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Frames.FirstPage;
import javax.swing.JFrame;

/**
 *
 * @author Joen
 */
public class User {

    String name;
    int user_id;

    public User(String nameIn, int user_idIn) {
        this.name = nameIn;
        this.user_id = user_idIn;
    }

    void setName(String nameIn) {
        this.name = nameIn;
    }

    void setId(String idIn) {
        this.name = idIn;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.user_id;
    }
}
