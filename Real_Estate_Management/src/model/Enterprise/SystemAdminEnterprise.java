/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organisation.SystemAdminOrganisation;

/**
 *
 * @author payaljadhav
 */
public class SystemAdminEnterprise extends Enterprise{

    public SystemAdminEnterprise(String name) {
        super(name, "System Admin");
        SystemAdminOrganisation sysAd = new SystemAdminOrganisation();
        this.organisationDirectory.addNewOrganisation(sysAd);
    }
    
}
