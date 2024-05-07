/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author payaljadhav
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise>enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList =  new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public void addNewEnterprise(Enterprise enterprise){
        this.enterpriseList.add(enterprise);
    }
}
