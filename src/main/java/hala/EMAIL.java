package hala;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EMAIL {
	

		DATABASE db=new DATABASE();
		public boolean send_email(String string2, String string) {
			final String username = "softwareengn65@gmail.com";
	        final String password = "ruvqofqzpfdlsuzs";

	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props,
	          new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	          });

	        try {

	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("softwareengn65@gmail.com"));
	            message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse(string2));
	            message.setSubject("Notification Email");
	            message.setText("Dear user , \n your order is ready, please pick it up from the company's delivery service ."
	            		+ "\n Please contact the owner of this number: 0599516693 in case the delivery is delayed or there is an error in the order."
	            		+ " \n Thank you for dealing with our company for cleaning fabrics.");

	            Transport.send(message);

	            System.out.println("Notification Email Sent!");

	        } 
	        catch (MessagingException e) {
	        	
	        	return false;
	        }
	       db. make_paid_true(string);
	       
			return true;
		}

		
	}

