/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;
import model.UserAccount.UserAccount;
/**
 *
 * @author sakshi
 */
public class Employee extends UserAccount {
    
    String employeeId;
    String employeeType;
    public Employee(String username, String userpassword,String employeeId,String employeeType) {
        super(username, userpassword);
        this.employeeId = employeeId;
        this.employeeType=employeeType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    
}
