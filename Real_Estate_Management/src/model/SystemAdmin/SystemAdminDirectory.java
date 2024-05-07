/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SystemAdmin;

import java.util.ArrayList;

/**
 *
 * @author sakshi
 */
public class SystemAdminDirectory {
    ArrayList<SystemAdmin>systemadminList;
    

    public SystemAdminDirectory() {
        this.systemadminList =  new ArrayList<SystemAdmin>();
    }

    public ArrayList<SystemAdmin> getSystemAdminList() {
       return systemadminList;
        
    }

    public void setSystemAdminList(ArrayList<SystemAdmin> systemadminList) {
        this.systemadminList = systemadminList;
    }
    
    public void addNewSystemAdmin(SystemAdmin systemadmin){
        this.systemadminList.add(systemadmin);
    }
    
}
