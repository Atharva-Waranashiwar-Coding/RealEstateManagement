/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import java.util.ArrayList;


/**
 *
 * @author sakshi
 */
public class EmployeeDirectory {
    ArrayList<Employee>employeeList;
    

    public EmployeeDirectory() {
        this.employeeList =  new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
       return employeeList;
        
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public void addNewEmployee(Employee employee){
        this.employeeList.add(employee);
    }
    
}
