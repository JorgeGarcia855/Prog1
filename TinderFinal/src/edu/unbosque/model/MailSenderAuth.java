package edu.unbosque.model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.smtp.SMTPAddressFailedException;

public final class MailSenderAuth {

	private static Session newSession;
	private static MimeMessage mimeMessage;

	public static void setupServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		newSession = Session.getDefaultInstance(properties, null);
	}

	public static void draftEmail(String correo, String alias, String contraseña) {
		String titulo = "¡Registro Bostinder Completo!";
		String body = "Bienvenido a Bostinder, su alias es:" + alias + "\nSu contraseña de ingreso es:" + contraseña;
		mimeMessage = new MimeMessage(newSession);
		try {
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
			mimeMessage.setSubject(titulo);
			mimeMessage.setText(body);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void sendEmail() throws MessagingException {
		String emailHost = "smtp.gmail.com";
		try {
			Transport transport = newSession.getTransport("smtp");
			String desdeAdmin = "bostinder1@gmail.com";
			String adminContra = "123Bostinder";
			transport.connect(emailHost, desdeAdmin, adminContra);
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
			transport.close();
		} catch (SMTPAddressFailedException e) {
			e.printStackTrace();
		}
	}
}
