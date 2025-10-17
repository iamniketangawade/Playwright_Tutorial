package Utilities;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Playwright_javaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		final String fromEmail ="annu.gawade80@gmail.com";
		final String password ="Niketan";
		final String toEmail= "iamniketangawade@gmail.com";
		
		
		//SMTP server configuration
		Properties prop =new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2"); // ✅ Force TLS 1.2
        prop.put("mail.smtp.port", "587");
		
		//Create session 
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        
        
        try {
            // Create message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail)
            );
            
            message.setSubject("Automation Test Report");
            message.setText("Hello, this is a test email sent from Java program!");

            // Send email
            Transport.send(message);

            System.out.println("✅ Email sent successfully!");
        }
        catch (MessagingException e) {
            e.printStackTrace();
        }
        		
		
	

}
	}

