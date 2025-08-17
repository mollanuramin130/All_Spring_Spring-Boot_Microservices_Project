package com.nit.mail;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service("mail")
public class SendingMail {
//	@Autowired
//	SimpleMailMessage sms;
	@Autowired
	private JavaMailSender sms;
	
	public String sendMail(String to) throws Exception,MessagingException{
//		sms.setTo(to);
//		sms.setCc("mollanuramin110@gmail.com");
//		sms.setSubject("I am SSN Market Testing Mail");
//		sms.send
		MimeMessage mimeMessage = sms.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setTo(to);
		mimeMessageHelper.setFrom("mon143piyali@gmail.com");
		mimeMessageHelper.setSubject("This is a auto generate Mail..");
		mimeMessageHelper.setText("<h1>Hello</h1><p>This is a test.</p>", true);
//		mimeMessageHelper.setSentDate(new Date());
		sms.send(mimeMessage);
		return "Mail Send Successfull..";
	}
	
}


//@Service("mail")
// public class SendingMail{
//	 @Autowired
//	 private JavaMailSender mailSender;
//
//	 public void sendMail() throws MessagingException {
//	     MimeMessage message = mailSender.createMimeMessage();
//
//	     // true = multipart
//	     MimeMessageHelper helper = new MimeMessageHelper(message, true);
//
//	     helper.setFrom("mon143piyali@gmail.com");
//	     helper.setTo("mollanuramin110@gmail.com");
//	     helper.setSubject("Test Email with Attachment");
//
//	     // Set body text (HTML or plain)
//	     helper.setText("<h1>Hello</h1><p>This is a test.</p>", true);
//
//	     // Optional: Add attachment
////	     File file = new File("/path/to/file.pdf");
////	     helper.addAttachment("file.pdf", file);
//
//	     mailSender.send(message);
//	 }
//
// }
