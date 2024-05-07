/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Employee.Broker;
import model.Employee.Employee;
import model.Employee.Supervisor;
import model.Organisation.Organisation;
import model.Organisation.PropertyManagementOrganisation;
import model.Organisation.SupervisorOrganisation;

/**
 *
 * @author payaljadhav
 */
public class RealEstateAgencyEnterprise extends Enterprise {
    
    public RealEstateAgencyEnterprise(String name) {
        super(name,"Real gEstate Agency");
        PropertyManagementOrganisation pmo = new PropertyManagementOrganisation();
        this.organisationDirectory.addNewOrganisation(pmo);
        SupervisorOrganisation supervisor = new SupervisorOrganisation();
        this.organisationDirectory.addNewOrganisation(supervisor);
        
    }
    
    public ArrayList<Broker> getAllBrokers(){
        ArrayList<Broker> brokers = new ArrayList<Broker>();
        for(Organisation org:this.organisationDirectory.getOrganisationList()){
            if(org instanceof PropertyManagementOrganisation pmo){
                for(Employee employee: pmo.getEmployeeDirectory().getEmployeeList()){
                    Broker broker = (Broker) employee;
                    brokers.add(broker);
                }
            }
        }
        return brokers;
    }
    
}
