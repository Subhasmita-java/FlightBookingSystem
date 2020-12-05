package com.subha.flightreservation.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtility {
	@Value("${com.subha.flightreservation.util.email.body}")
	private String EMAIL_BODY ;
	@Value("${com.subha.flightreservation.util.email.subject}")
	private String EMAIL_SUBJECT;
	@Autowired
	private JavaMailSender sender;

	public void sendEmail(String toAddress, String filePath) {
		
		MimeMessage message =sender.createMimeMessage();
		
		try {

			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setTo(toAddress);
			helper.setSubject(EMAIL_SUBJECT);
			helper.setText(EMAIL_BODY);
			helper.addAttachment("Reservation-Details", new File(filePath));
			sender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
}
