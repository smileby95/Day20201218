package kr.or.kh.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;

	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("ekslws123", "wkalsorsdodinqkh");
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
