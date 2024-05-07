/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem.mailer;

/**
 *
 * @author Admin
 */
public class MessagesClass {

    String subjectAccountCreation = "Account Creation Confirmed";
    String viewerAccountCreation = """
                             Dear User,
                             
                             We are pleased to inform you that your account has been successfully created.
                             
                             You have now access to browse through all the properties and make an offer on any of the properties. 
                                   
                             Thank you for choosing Real Estate Solutions! Your account will enable you to access a range of features and services tailored to your needs.
                             
                             If you have any questions or need further assistance, please don't hesitate to contact our support team at [Support Email] or [Support Phone Number].
                             
                             Best regards,
                             Real Estate Solutions Team
                             """;

    String brokerAccountCreation = """
                                   Dear User,
                                                                
                                    We are pleased to inform you that your account has been successfully created.

                                    You have now access to create new properties and browse all offers on any of the properties you have created. 

                                    Thank you for choosing Real Estate Solutions! Your account will enable you to access a range of features and services tailored to your needs.

                                    If you have any questions or need further assistance, please don't hesitate to contact our support team at [Support Email] or [Support Phone Number].

                                    Best regards,
                                    Real Estate Solutions Team
                                   """;

    String subjectOfferStatus = "Offer status changed.";

    String acceptOfferMessage = """
                                Dear User,
                                                                                                
                                    We are pleased to inform you that your offer has been accepted by the broker.

                                    You now can connect with the broker directly and communicate on further details.
                                    
                                    The property and broker details are attached with the mail.

                                    Thank you for choosing Real Estate Solutions!

                                    If you have any questions or need further assistance, please don't hesitate to contact our support team at [Support Email] or [Support Phone Number].

                                    Best regards,
                                    Real Estate Solutions Team
                               """;
    String rejectOfferMessage = """
                                Dear User,
                                                                                                
                                    We regret to inform you that your offer has been declined by the broker.
                                
                                    You can still browse through all the properties and make an offer on any of the properties. 

                                    Thank you for choosing Real Estate Solutions!

                                    If you have any questions or need further assistance, please don't hesitate to contact our support team at [Support Email] or [Support Phone Number].

                                    Best regards,
                                    Real Estate Solutions Team
                               """;
    public String getSubjectAccountCreation() {
        return subjectAccountCreation;
    }

    public void setSubjectAccountCreation(String subjectAccountCreation) {
        this.subjectAccountCreation = subjectAccountCreation;
    }

    public String getViewerAccountCreation() {
        return viewerAccountCreation;
    }

    public void setViewerAccountCreation(String viewerAccountCreation) {
        this.viewerAccountCreation = viewerAccountCreation;
    }

    public String getBrokerAccountCreation() {
        return brokerAccountCreation;
    }

    public void setBrokerAccountCreation(String brokerAccountCreation) {
        this.brokerAccountCreation = brokerAccountCreation;
    }

    public String getSubjectOfferStatus() {
        return subjectOfferStatus;
    }

    public void setSubjectOfferStatus(String subjectOfferStatus) {
        this.subjectOfferStatus = subjectOfferStatus;
    }

    public String getAcceptOfferMessage() {
        return acceptOfferMessage;
    }

    public void setAcceptOfferMessage(String acceptOfferMessage) {
        this.acceptOfferMessage = acceptOfferMessage;
    }

    public String getRejectOfferMessage() {
        return rejectOfferMessage;
    }

    public void setRejectOfferMessage(String rejectOfferMessage) {
        this.rejectOfferMessage = rejectOfferMessage;
    }
    
    

}
