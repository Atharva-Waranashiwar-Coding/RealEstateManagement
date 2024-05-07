/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Viewer;

import java.util.ArrayList;
import model.Property.Offer;
import model.UserAccount.UserAccount;

/**
 *
 * @author sakshi
 */
public class Viewer extends UserAccount{
    ArrayList <Offer> myOffers ;
    
    public Viewer(String username, String userpassword) {
        super(username, userpassword);
        myOffers = new ArrayList <Offer>();
    }
 
    public ArrayList<Offer> getMyOffers() {
        return myOffers;
    }
 
    public void setMyOffers(ArrayList<Offer> myOffers) {
        this.myOffers = myOffers;
    }
    public void addNewOffer(Offer offer) {
        myOffers.add(offer);
    }
    
    @Override 
    public String toString(){
        return super.getUsername();
    }
    
}
