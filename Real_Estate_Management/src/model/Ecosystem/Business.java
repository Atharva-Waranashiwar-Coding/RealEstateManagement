/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem;

import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseDirectory;
import model.Property.Property;
import model.Property.PropertyDirectory;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author payaljadhav
 */
public class Business {
    EnterpriseDirectory enterpriseDirectory;
    PropertyDirectory propertyDirectory;
    UserAccountDirectory businessUserDirectory;

    public Business() {
        this.enterpriseDirectory = new EnterpriseDirectory ();
        this.propertyDirectory = new PropertyDirectory();
        this.businessUserDirectory = new UserAccountDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public PropertyDirectory getPropertyDirectory() {
        return propertyDirectory;
    }

    public void setPropertyDirectory(PropertyDirectory propertyDirectory) {
        this.propertyDirectory = propertyDirectory;
    }

    public UserAccountDirectory getBusinessUserDirectory() {
        return businessUserDirectory;
    }

    public void setBusinessUserDirectory(UserAccountDirectory businessUserDirectory) {
        this.businessUserDirectory = businessUserDirectory;
    }
    
   
    private Property lastOfferedProperty;

    public void setLastOfferedProperty(Property property) {
        this.lastOfferedProperty = property;
    }

    public Property getLastOfferedProperty() {
        return lastOfferedProperty;
    }

}
