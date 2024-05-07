/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Employee.Broker;
import model.Employee.Employee;
import model.Organisation.Organisation;
import model.Organisation.OrganisationDirectory;
import model.Organisation.PropertyManagementOrganisation;
import model.Property.Property;

/**
 *
 * @author payaljadhav
 */
public class Enterprise {
    OrganisationDirectory organisationDirectory;
    String name;
    String type;
    
    public Enterprise(String name, String type) {
        this.organisationDirectory=new OrganisationDirectory();
        this.name = name;
        this.type = type;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    public ArrayList <Property> getAllProperties(){
        ArrayList <Property> propertyList = new ArrayList <Property>();
        for(Organisation org : this.organisationDirectory.getOrganisationList()){
            if(org instanceof PropertyManagementOrganisation pmo){
                for(Employee employee: pmo.getEmployeeDirectory().getEmployeeList()){
                    if(employee instanceof Broker broker){
                        propertyList.addAll(broker.getPropertyList());
                    }
                }
            }
        }
        return propertyList;
    }
    
}
