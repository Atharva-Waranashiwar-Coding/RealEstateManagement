/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem.mailer;

/**
 *
 * @author Admin
 */

import java.io.IOException;
import java.io.InputStream;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.Address;
import javax.mail.Flags;
import java.util.Date;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.mail.Header;
import javax.mail.Multipart;

public class SimpleTextMessage extends Message {

    private Address[] recipients;
    private String subject;
    private String content;

    public SimpleTextMessage(Session session, Address[] recipients, String subject, String content) {
        super(session);
        this.recipients = recipients;
        this.subject = subject;
        this.content = content;
    }
    
    @Override
    public Flags getFlags() throws MessagingException {
        // Return null or an empty Flags object, as we don't use flags for a simple text message
        return null;
    }
    
    @Override
    public Date getReceivedDate() throws MessagingException {
        // Return null as there's no specific receipt date for a simple text message
        return null;
    }
    @Override
    public void setSentDate(Date sentDate) throws MessagingException {
        // No action needed for setting the sent date of a simple text message
    }
    @Override
    public Date getSentDate() throws MessagingException {
        // Return null as there's no specific receipt date for a simple text message
        return null;
    }
    
    @Override
    public void setFlags(Flags flags, boolean set) throws MessagingException {
        // Empty implementation since we don't need to set flags for a simple text message
    }
    @Override
    public Message reply(boolean replyToAll) throws MessagingException {
        throw new UnsupportedOperationException("Reply operation is not supported for SimpleTextMessage");
    }
    
    @Override
    public void saveChanges() throws MessagingException {
        // Implement if needed
    }
    @Override
    public void writeTo(java.io.OutputStream os) throws MessagingException {
        // Implement if needed
    }

    @Override
    public Address[] getAllRecipients() throws MessagingException {
        return recipients;
    }

    @Override
    public void setRecipient(RecipientType type, Address address) throws MessagingException {
        if (type == RecipientType.TO) {
            recipients = new Address[]{address};
        }
    }

    @Override
    public String getSubject() throws MessagingException {
        return subject;
    }

    @Override
    public void setSubject(String subject) throws MessagingException {
        this.subject = subject;
    }

    @Override
    public Object getContent() throws MessagingException {
        return content;
    }

    @Override
    public void setContent(Object content, String type) throws MessagingException {
        this.content = (String) content;
    }

    @Override
    public void setText(String text) throws MessagingException {
        this.content = text;
    }

    @Override
    public String[] getHeader(String name) throws MessagingException {
        // Implement if needed
        return null;
    }

    @Override
    public void setHeader(String name, String value) throws MessagingException {
        // Implement if needed
    }

    @Override
    public Address[] getFrom() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setFrom() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setFrom(Address adrs) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addFrom(Address[] adrss) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Address[] getRecipients(RecipientType rt) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setRecipients(RecipientType rt, Address[] adrss) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addRecipients(RecipientType rt, Address[] adrss) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getLineCount() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getContentType() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isMimeType(String string) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDisposition() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDisposition(String string) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDescription() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDescription(String string) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFileName() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setFileName(String string) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public InputStream getInputStream() throws IOException, MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DataHandler getDataHandler() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDataHandler(DataHandler dh) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setContent(Multipart mltprt) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addHeader(String string, String string1) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeHeader(String string) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Enumeration<Header> getMatchingHeaders(String[] strings) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Enumeration<Header> getNonMatchingHeaders(String[] strings) throws MessagingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
