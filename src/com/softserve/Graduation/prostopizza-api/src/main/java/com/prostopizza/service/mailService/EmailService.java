package com.prostopizza.service.mailService;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;
@Service
public class EmailService {

    public void sendmail(String subject,String content) throws MessagingException {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        Properties props =new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.debug", "false");


        Session session= Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("PASTE_YOUR_EMAIL","PASTE_YOUR_PASSWORD");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("orders@prostopizza.com", false));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("prostopizzaapi@gmail.com"));
        msg.setSubject(subject);
        msg.setContent(content,"text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/html");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
        Transport.send(msg);
        //mailSender.setPassword("");
    }
}
