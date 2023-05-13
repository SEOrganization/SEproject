package hala;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EMAIL {
	List <String> pass1=new ArrayList <String>();

	  private static final Logger logger = Logger.getLogger(EMAIL.class.getName());

		DATABASE db=new DATABASE();
		public boolean sendemail(String string2, String string) {
			pass1.add("ruvqofqzpfdlsuzs");
			final String username = "softwareengn65@gmail.com";
	        final String password =pass1.get(0);
	          Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props,
	          new javax.mail.Authenticator() {
	            @Override
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

	            logger.info("Notification Email Sent!");

	        } 
	        catch (MessagingException e) {
	        	
	        	return false;
	        }
	       db. makepaidtrue(string);
	       
			return true;
		}

		
	}

