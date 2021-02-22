package com.revature.BootPractice.App;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.revature.BootPractice.Bean.Mail;
import com.revature.BootPractice.Service.EmailService;
import com.revature.BootPractice.dao.EmailDao;

@Service
public class Consumer {
	EmailDao emailDao = new EmailDao();
	
	@KafkaListener(topics= "test_topic", groupId="group_id")
	public void consumeMessage(String message) {
		System.out.println("I fire and I thwump!");
		EmailService emailService = new EmailService();
		Mail myMail = new Mail();
		myMail.setBody(message);
		myMail.setSubject("Test");
		String[] users = emailDao.getEmail();
		for(String user : users) {
			emailService.sendEmail(user,"dontreplytothisplease45test@gmail.com", myMail);
		}
	}
	
	
}
