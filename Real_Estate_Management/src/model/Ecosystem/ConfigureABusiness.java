/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem;

import java.util.ArrayList;
import java.util.Random;
import model.Employee.Broker;
import model.Employee.Employee;
import model.Employee.EmployeeDirectory;
import model.Employee.Supervisor;
import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseDirectory;
import model.Enterprise.RealEstateAgencyEnterprise;
import model.Enterprise.SystemAdminEnterprise;
import model.Enterprise.ViewerEnterprise;
import model.Organisation.Organisation;
import model.Organisation.OrganisationDirectory;
import model.Organisation.PropertyManagementOrganisation;
import model.Organisation.SupervisorOrganisation;
import model.Organisation.SystemAdminOrganisation;
import model.Organisation.ViewerOrganisation;
import model.Property.Offer;
import model.Property.Property;
import model.Property.PropertyDirectory;
import model.SystemAdmin.SystemAdmin;
import model.SystemAdmin.SystemAdminDirectory;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;
import model.Viewer.Viewer;
import model.Viewer.ViewerDirectory;


/**
 *
 * @author Admin
 */
public class ConfigureABusiness {
    static String[] names = {
            "Alice", "Bob", "Charlie", "David", "Eva", 
            "Frank", "Grace", "Henry", "Ivy", "Jack", 
            "Katherine", "Leo", "Mia", "Nathan", "Olivia", 
            "Peter", "Quinn", "Rachel", "Sam", "Tina", 
            "Uma", "Victor", "Wendy", "Xander", "Yvonne"
        };
    static String[] lastNames= {
            "Smith", "Johnson", "Williams", "Brown", "Jones", 
            "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", 
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", 
            "Thomas", "Taylor", "Moore", "Jackson", "Martin", 
            "Lee", "Perez", "Thompson", "White", "Harris"
        };
    
    // Array declarations
    private static String[] addressLines = {"123 Main St", "456 Oak Ave", "789 Elm Blvd", "321 Pine Ln", "987 Maple Dr", "654 Cedar Rd", "876 Birch St", "543 Walnut Ave", "210 Cherry Blvd", "879 Spruce Ln"};
    private static String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
    private static String[] zipcodes = {"10001", "90001", "60601", "77001", "85001", "19101", "78201", "92101", "75201", "95101"};
    private static String [] listingTypes = {"Rent","Sell"};
    public static Business populateData (){
        Business business= new Business();
        EnterpriseDirectory enterpriseDirectory = business.enterpriseDirectory;
        
        RealEstateAgencyEnterprise realEstateAgencyEnterprise1 = populateRealEstateAgency(business,enterpriseDirectory,"Boston Props");
        RealEstateAgencyEnterprise realEstateAgencyEnterprise2 = populateRealEstateAgency(business,enterpriseDirectory,"New Property Store");
        RealEstateAgencyEnterprise realEstateAgencyEnterprise3 = populateRealEstateAgency(business,enterpriseDirectory,"Executive Real Estate");
        RealEstateAgencyEnterprise realEstateAgencyEnterprise4 = populateRealEstateAgency(business, enterpriseDirectory,"Niicee Properties");
        RealEstateAgencyEnterprise realEstateAgencyEnterprise5 = populateRealEstateAgency(business, enterpriseDirectory,"Wonderful Props");
        
        ViewerEnterprise viewerEnterprise = populateViewerEnterprise(business,enterpriseDirectory, "ViewerEnterprise");
        
        SystemAdminEnterprise sysAdminEnterprise = populateSystemAdminEnterprise(business,enterpriseDirectory, "SystemAdminEnterprise");
        
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
            System.out.println(enterprise.getName()+", "+enterprise.getType());
            for(Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()){
                System.out.println(org.getType());
                switch (org.getType()) {
                    case "Property Management":
                        PropertyManagementOrganisation pmo = (PropertyManagementOrganisation)org;
                        EmployeeDirectory employeeDriectory = pmo.getEmployeeDirectory();
                        for(Employee employee:employeeDriectory.getEmployeeList()){
                            if(employee.getEmployeeType().equals("Broker")){
                                Broker broker = (Broker) employee;
                                System.out.println("Broker Name - "+broker.getUsername());
                                for (Property property : broker.getPropertyList()){
                                    System.out.println("Property -"+property.getPropertyDetails());
                                    System.out.println("Offers made on property - " + property.getPropertyOffers().size());
                                }
                            }
                        }   break;
                    case "Supervisor":
                        SupervisorOrganisation supervisorOrg = (SupervisorOrganisation) org;
                        EmployeeDirectory employeeDirectory = supervisorOrg.getEmployeeDirectory();
                        for(Employee employee: employeeDirectory.getEmployeeList()){
                            System.out.println("Supervisor username - "+employee.getUsername());
                        }
                        break;
                    case "System Admin":
                        SystemAdminOrganisation sysAd = (SystemAdminOrganisation) org;
                        SystemAdminDirectory sysAdDirectory = sysAd.getSysAdDirectory();
                        for(SystemAdmin sysAdmin: sysAdDirectory.getSystemAdminList()){
                            System.out.println("SystemAdmin username - "+sysAdmin.getUsername());
                        }
                        break;
                    case "Viewer Organisation":
                        ViewerOrganisation viewerOrg = (ViewerOrganisation) org;
                        ViewerDirectory viewerDirectory = viewerOrg.getViewerDirectory();
                        for(Viewer viewer: viewerDirectory.getViewerList()){
                            System.out.println("Viewer username - "+viewer.getUsername());
                            for(Offer offer:viewer.getMyOffers()){
                                System.out.println("Offer made on Property- "+offer.getProperty().getPropertyDetails()+ offer.getViewer().getUsername());
                                System.out.println("Offer rate- "+offer.getOfferedRate());
                            }
                            
                        }
                        break;
                    default:
                        break;
                }
                System.out.println();
            }
            System.out.println("\n\n");
        }
        return business;
    }
    public static RealEstateAgencyEnterprise populateRealEstateAgency(Business business,EnterpriseDirectory enterpriseDirectory,String name){
        RealEstateAgencyEnterprise realEstateAgencyEnterprise = new RealEstateAgencyEnterprise(name);
        enterpriseDirectory.addNewEnterprise(realEstateAgencyEnterprise);
        OrganisationDirectory orgs = realEstateAgencyEnterprise.getOrganisationDirectory();
        for(Organisation org : orgs.getOrganisationList()){
            
            UserAccountDirectory userAccountDirectory = business.businessUserDirectory;
            if(org.getType().equals("Property Management")){
                PropertyManagementOrganisation pmo = (PropertyManagementOrganisation)org;
                EmployeeDirectory employeeDriectory = pmo.getEmployeeDirectory();
                for(int i=0;i<10;i++){
                    Broker broker = new Broker(getRandomName()+"@example.com","Password123@","100"+(i+1));
                    employeeDriectory.addNewEmployee(broker);
                    userAccountDirectory.addNewUserAccount(broker);
                    for (int j=0;j<2;j++){
                        populatePropertyForBroker(business,broker,String.valueOf(i)+String.valueOf(j));
                    }
                }
            }else{
                SupervisorOrganisation supervisorOrg = (SupervisorOrganisation)org;
                EmployeeDirectory employeeDriectory = supervisorOrg.getEmployeeDirectory();
                Supervisor supervisor = new Supervisor(name.replaceAll("\\s+", "")+"Admin"+"@example.com","Password123@","0001");
                userAccountDirectory.addNewUserAccount(supervisor);
                employeeDriectory.addNewEmployee(supervisor);
            } 
        }
        return realEstateAgencyEnterprise;
    }
    
    public static ViewerEnterprise populateViewerEnterprise(Business business,EnterpriseDirectory enterpriseDirectory,String name){
        ViewerEnterprise viewerEnterprise = new ViewerEnterprise(name);
        enterpriseDirectory.addNewEnterprise(viewerEnterprise);
        OrganisationDirectory orgs = viewerEnterprise.getOrganisationDirectory();
        for(Organisation org : orgs.getOrganisationList()){
            ViewerOrganisation viewerOrg = (ViewerOrganisation) org;
            ViewerDirectory viewerDirectory = viewerOrg.getViewerDirectory();
            UserAccountDirectory userAccountDirectory = business.businessUserDirectory;
            for(int i=0;i<10;i++){
                Viewer viewer = new Viewer(getRandomName()+"@example.com","Password123@");
                userAccountDirectory.addNewUserAccount(viewer);
                viewerDirectory.addNewViewer(viewer);
                Offer offer = placeOffer(business, viewer);
                viewer.addNewOffer(offer);
            }
        }
        return viewerEnterprise;
    }
    
    public static SystemAdminEnterprise populateSystemAdminEnterprise(Business business,EnterpriseDirectory enterpriseDirectory,String name){
        SystemAdminEnterprise systemAdminEnterprise = new SystemAdminEnterprise(name);
        enterpriseDirectory.addNewEnterprise(systemAdminEnterprise);
        OrganisationDirectory orgs = systemAdminEnterprise.getOrganisationDirectory();
        for(Organisation org : orgs.getOrganisationList()){
            SystemAdminOrganisation sysAdOrg = (SystemAdminOrganisation) org;
            SystemAdminDirectory sysAdDirectory = sysAdOrg.getSysAdDirectory();
            UserAccountDirectory userAccountDirectory = business.businessUserDirectory;
            SystemAdmin systemAdmin = new SystemAdmin("SysAdmin"+"@example.com","Password123@");
            userAccountDirectory.addNewUserAccount(systemAdmin);
            sysAdDirectory.addNewSystemAdmin(systemAdmin);

        }
        return systemAdminEnterprise;
    }
    public static String getRandomName() {
        Random random = new Random();
        int randomIndex1 = random.nextInt(names.length);
        int randomIndex2 = random.nextInt(lastNames.length);
        return names[randomIndex1]+lastNames[randomIndex2];
    }
    
    private static <T> T getRandomValue(T[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
    private static void populatePropertyForBroker(Business business,Broker broker,String id){
        Random random = new Random();
        
        ArrayList<Property> propertyList = broker.getPropertyList();
        
        String addressLine = getRandomValue(addressLines);
        String city = getRandomValue(cities);
        String zipcode = getRandomValue(zipcodes);
        String type = getRandomValue(listingTypes);
        double rate = 0.0;
        if(type.equals("Rent")){
            rate = 2000.0 + (3000.0 - 2000.0) * random.nextDouble();
        }
        else if( type.equals("Sell")){
            rate = 2000000.0 + (3000000.0 - 2000000.0) * random.nextDouble();
        }
        Property property = new Property(addressLine,city,zipcode,id,type,rate);
        business.propertyDirectory.addNewProperty(property);
        propertyList.add(property);
    }
    
    private static Offer placeOffer(Business business, Viewer viewer){
        Random random = new Random();
        Property property = selectRandomProperty(business);
        double propRate = property.getRate();
        double lower = 0.9*propRate;
        double higher = 1.1*propRate;
        double rate = lower + (higher-lower)*random.nextDouble();
        Offer offer = new Offer(property,rate,viewer);
        return offer;
    }
    
    private static Property selectRandomProperty(Business business){
        Random random = new Random();
        ArrayList <Property> propertyList = business.propertyDirectory.getPropertyList();
        int index = random.nextInt(propertyList.size());
        Property property = propertyList.get(index);
        return property;
    }
}
