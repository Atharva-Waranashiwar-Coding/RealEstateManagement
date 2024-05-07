/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author sakshi
 */
public class UserAccountDirectory {
    ArrayList<UserAccount>useraccountList;
    

    public UserAccountDirectory() {
        this.useraccountList =  new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
       return useraccountList;
        
    }

    public void setEmployeeList(ArrayList<UserAccount> useraccountList) {
        this.useraccountList = useraccountList;
    }
    
    public void addNewUserAccount(UserAccount useraccount){
        this.useraccountList.add(useraccount);
    }
    
     public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountList) {

            if (ua.getUsername().equals(un) && ua.validatePassword(pw)) {
                return ua;
            }
        }
        return null;
     }

    }

