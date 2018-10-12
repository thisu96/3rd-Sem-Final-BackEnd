package lk.ijse.spring.rest.maven.util;

import lk.ijse.spring.rest.maven.dto.EmailDTO;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class EmailService {

    private static EmailService emailService;

    public static EmailService getEmailService() {
        if (emailService == null) {
            emailService = new EmailService();
        }
        return emailService;
    }

    public EmailDTO sendEmail(String emailText, String emailAddress) {
        EmailDTO email = new EmailDTO();
        String subject = "Order Information";
        email.setReply(sendMail(emailText, emailAddress, subject));
        return email;
    }

    private String sendMail(String text, String emailAddress, String subject) {
        String reply = "";
        try {
            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");

            Authenticator auth = new EmailService.SMTPAuthenticator("\n" +
                    "vegmartorders@gmail.com", "vegmartorders@96");

            Session session = Session.getInstance(props, auth);

            MimeMessage msg = new MimeMessage(session);
            msg.setText(text);
            msg.setSubject(subject);

            msg.setFrom(new InternetAddress("webphpjava@gmail.com"));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));
            Transport.send(msg);

        } catch (AuthenticationFailedException ex) {
            reply = "Authentication failed";
            return reply;
        } catch (AddressException ex) {
            reply = "Invalid email address";
            return reply;
        } catch (MessagingException ex) {
            reply = "Cannot Send Email";
            return reply;
        }
        reply = "Email has been sent successfully";
        return reply;
    }

    private class SMTPAuthenticator extends Authenticator {

        private PasswordAuthentication authentication;

        public SMTPAuthenticator(String login, String password) {
            authentication = new PasswordAuthentication(login, password);
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }
    }
}

