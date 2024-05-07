/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organisation;

import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author payaljadhav
 */
public class Organisation {
    UserAccountDirectory userAccountDirectory;
    String type;

    public Organisation(String type) {
        this.type = type;
        this.userAccountDirectory = new UserAccountDirectory();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    } 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
