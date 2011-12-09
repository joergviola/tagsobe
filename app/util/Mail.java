package util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import play.Configuration;
import play.Logger;
import play.api.Play;
import play.api.mvc.Content;

public class Mail {

	SimpleEmail mail = new SimpleEmail();
	private String msg;

	public void setFrom(String email) throws EmailException {
		mail.setFrom(email);
	}

	public void setSubject(String subject) {
		mail.setSubject(subject);
	}

	public void setMsg(String msg) throws EmailException {
		mail.setMsg(msg);
		this.msg = msg;
	}

	public void setMsg(Content content) throws EmailException {
		setMsg(content.body());
	}

	public void addTo(String to) throws EmailException {
		mail.addTo(to);
	}

	public void send() throws EmailException {
		String mode = Play.current().mode().toString().toLowerCase() + ".";
		if ("mock".equals(Configuration.root().getString(mode + "mail.smtp")))
			sendViaMock();
		else {
			sendViaSmtp();
		}
	}

	private void sendViaMock() {
		Logger.info("Mock: " + toString());
	}

	private void sendViaSmtp() throws EmailException {
		String mode = Play.current().mode().toString().toLowerCase() + ".";
		mail.setHostName(Configuration.root()
				.getString(mode + "mail.smtp.host"));
		mail.setSmtpPort(Configuration.root().getInt(mode + "mail.smtp.port"));
		DefaultAuthenticator auth = new DefaultAuthenticator(Configuration
				.root().getString(mode + "mail.smtp.user"), Configuration
				.root().getString(mode + "mail.smtp.pass"));
		mail.setAuthenticator(auth);
		mail.setTLS(true);
		if ("stmps".equals(Configuration.root().getString(
				mode + "mail.smtp.protocol")))
			mail.setSSL(true);
		mail.send();
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("To: ");
		b.append(mail.getToAddresses());
		b.append("\nFrom: ");
		b.append(mail.getFromAddress());
		b.append("\nSubject: ");
		b.append(mail.getSubject());
		b.append("\n");
		try {
			b.append(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b.toString();
	}
}
