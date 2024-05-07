/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import java.util.ArrayList;
import model.Property.Offer;
import model.Property.Property;

/**
 *
 * @author sakshi
 */
public class Broker extends Employee {
    
    ArrayList <Property> propertyList;
    
    
    public Broker(String username, String userpassword,String employeeId) {
        super(username, userpassword,employeeId,"Broker");
        
        this.propertyList=new ArrayList <Property>();
        
    }
    
    public void addNewProperty(Property property){
        this.propertyList.add(property);
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<Property> propertyList) {
        this.propertyList = propertyList;
    }
    
    @Override
    public String toString(){
        return super.getUsername();
    }
}


