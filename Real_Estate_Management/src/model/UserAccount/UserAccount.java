/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

/**
 *
 * @author sakshi
 */
public class UserAccount {

    String username;
    String password;
    
    public UserAccount(String name, String password) {
        this.username = name;
        this.password = password;
    }
    
    
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    
    public boolean validatePassword(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserAccount{" + "username=" + username + '}';
    }
}
