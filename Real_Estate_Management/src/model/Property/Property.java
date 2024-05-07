/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Property;

import java.util.ArrayList;

/**
 *
 * @author sakshi
 */
public class Property {
    String addressLine;
    String city;
    String zipcode;
    String id;
    String listingType;
    double rate;

    ArrayList<Offer> propertyOffers;
    
    public Property(String addressLine, String city, String zipcode, String id, String listingType, double rate) {
        this.addressLine = addressLine;
        this.city = city;
        this.zipcode = zipcode;
        this.id = id;
        this.listingType = listingType;
        this.rate = rate;
        this.propertyOffers = new ArrayList<Offer>();
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListingType() {
        return listingType;
    }

    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public String getPropertyDetails(){
        return this.id+" "+this.addressLine+" "+this.city+" "+this.zipcode+" "+this.listingType+" "+String.valueOf(this.rate);
    }
    public ArrayList<Offer> getPropertyOffers() {
        return propertyOffers;
    }
 
    public void setPropertyOffers(ArrayList<Offer> propertyOffers) {
        this.propertyOffers = propertyOffers;
    }
    public void addNewPropertyOffer(Offer offer){
        this.propertyOffers.add(offer);
    }
    public void removeOffer(Offer offer){
        this.propertyOffers.remove(offer);
    }
    
    @Override
    public String toString(){
        return this.addressLine+this.city+this.zipcode;
    }
    
    
}
