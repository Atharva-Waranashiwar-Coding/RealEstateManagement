/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organisation.ViewerOrganisation;

/**
 *
 * @author payaljadhav
 */
public class ViewerEnterprise extends Enterprise{

    public ViewerEnterprise(String name) {
        super(name, "Viewer");
        ViewerOrganisation viewer = new ViewerOrganisation();
        this.organisationDirectory.addNewOrganisation(viewer);
    }
    
}
