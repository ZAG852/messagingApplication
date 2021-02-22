package com.revature.BootPractice.Service;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import com.revature.BootPractice.Bean.Mail;

import javax.activation.*;
public class EmailService {
	public static void main(String args[])
	{
		System.out.println("I fire and I thwump!");
		EmailService emailService = new EmailService();
		Mail myMail = new Mail();
		myMail.setBody("Hi personal message to test this!!");
		myMail.setSubject("Test");
		emailService.sendEmail("cesocej712@tigasu.com","dontreplytothisplease45test@gmail.com",  myMail);
		String[] users = new String[2];
		users[0] = "caponi5061@hrandod.com";
		users[1] = "cesocej712@tigasu.com";
		for(String user : users) {
			emailService.sendEmail(user,"dontreplytothisplease45test@gmail.com", myMail);
		}
	}
	public void sendEmail(String to, String from, Mail email){
		Properties properties = System.getProperties();
		String host = "localhost";
		
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.port", "587");
		
		//properties.setProperty("mail.smtp.host", host);
		//The Session to send the email
		System.out.println("Before session");
		
		Session session = Session.getInstance(properties, new Authenticator() {
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,"GGBoys3345");
			}
		});
		
		//Session session = Session.getDefaultInstance(properties);
		System.out.println("past session");
		
		try {
			//Sets the pretenses of the session
			MimeMessage message = new MimeMessage(session);
			//The sender of the message
			message.setFrom(from);
			//The recipient of the email
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			//Sets the subject line
			message.setSubject(email.getSubject());
			//Sets the message of the email
			message.setText(email.getBody());
			//sends the message to the address
			Transport.send(message);
			System.out.println("Sent message successfully....");
		}catch(MessagingException mex) {
			mex.printStackTrace();
		}
		
	}
}
