/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Property;

import model.Viewer.Viewer;

/**
 *
 * @author sakshi
 */
public class Offer {
    
    Property property;
    double offeredRate;
    String status;
    Viewer viewer;
 
    public Offer(Property property, double offeredRate, Viewer viewer) {
        this.property = property;
        this.offeredRate = offeredRate;
        this.status = "Pending";
        this.property.addNewPropertyOffer(this);
        this.viewer = viewer;
    }

    public Property getProperty() {
        return property;
    }
 
    public void setProperty(Property property) {
        this.property = property;
    }
 
    public double getOfferedRate() {
        return offeredRate;
    }
 
    public void setOfferedRate(double offeredRate) {
        this.offeredRate = offeredRate;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public String toString() {
        return this.property.toString();
    }
  
}
