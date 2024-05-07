/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organisation;

import model.Employee.EmployeeDirectory;

/**
 *
 * @author payaljadhav
 */
public class SupervisorOrganisation extends Organisation{
    
    EmployeeDirectory employeeDirectory ;
    public SupervisorOrganisation() {
        super("Supervisor");
        this.employeeDirectory = new EmployeeDirectory();
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
}
