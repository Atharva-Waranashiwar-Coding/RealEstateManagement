/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organisation;

import model.SystemAdmin.SystemAdminDirectory;

/**
 *
 * @author payaljadhav
 */
public class SystemAdminOrganisation extends Organisation{
    
    SystemAdminDirectory sysAdDirectory;
    public SystemAdminOrganisation() {
        super("System Admin");
        this.sysAdDirectory = new SystemAdminDirectory();
    }

    public SystemAdminDirectory getSysAdDirectory() {
        return sysAdDirectory;
    }

    public void setSysAdDirectory(SystemAdminDirectory sysAdDirectory) {
        this.sysAdDirectory = sysAdDirectory;
    }
    
    
}
