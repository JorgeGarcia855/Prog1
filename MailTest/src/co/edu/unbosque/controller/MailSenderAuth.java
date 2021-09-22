package co.edu.unbosque.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSenderAuth {
	
	private Session newSession;
	private MimeMessage mimeMessage;
	private Transport transport;
	private Properties properties;
	private String correoUsuario;
	private final String desdeAdmin = "bostinder1@gmail.com";
	private final String adminContra = "123Bostinder";
	
	public MailSenderAuth()  {
		setupServerProperties();
		draftEmail();
		sendEmail();
	}
	
	public void setupServerProperties() {
		properties = System.getProperties();
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.ssl.trust", "*");
		newSession = Session.getDefaultInstance(properties, null);
	}

	public MimeMessage draftEmail() {
		correoUsuario = "jorge.jlgp2002@gmail.com"; // deberia ir un get jtextfield o similar
		String titulo = "Registro Completo!";
		String body = "test body email";
		
		mimeMessage = new MimeMessage(newSession);
		try {
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(correoUsuario));
			mimeMessage.setSubject(titulo);
			mimeMessage.setText(body);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return mimeMessage;
	}
	
	public void sendEmail()  {
		System.out.println("sending message...");
		String emailHost = "smtp.gmail.com";
		try {
			transport = newSession.getTransport("smtp");
			transport.connect(emailHost, desdeAdmin, adminContra);
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
			transport.close();
			System.out.println("done.");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

}
