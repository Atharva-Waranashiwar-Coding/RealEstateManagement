/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Property;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PropertyDirectory {
    private ArrayList <Property> propertyList;

    public PropertyDirectory() {
        this.propertyList = new ArrayList <Property>();
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<Property> propertyList) {
        this.propertyList = propertyList;
    }
    public void addNewProperty(Property property){
        this.propertyList.add(property);
    }
    
    public void removeProperty(Property property){
        this.propertyList.remove(property);
    }
    
}
