/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ac.iul.ajaxdemo;
import java.util.*;
import jakarta.mail.*;
import jakarta.mail.internet.*;


/**
 *
 * @author ubuntu
 */
public class SendMail {
    public void mailSender(String to,String from){
        final String username="yax1rrr.pvt@gmail.com";
        final String password="lfml chkl adne ewvj";
        Properties props=new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        Session session=Session.getInstance(props,new jakarta.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,password);
            }
        });
        try{
            Message msg=new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
            msg.setSubject("hello");
            msg.setText("How are you?");
            Transport.send(msg);
        }catch(MessagingException e){
            e.printStackTrace();
                    
        }
        
    }
    
}
