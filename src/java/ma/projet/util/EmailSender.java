
package ma.projet.util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
 static final String username = "cremo1234youss@gmail.com";
    static final String password = "1234567890AZE@a";
    static final String host = "smtp.gmail.com";
    static final String port = "465";

    

    public static void sendEmail(String recipient, String subject, String messageBody) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageBody);

            Transport.send(message);
            System.out.println("Email sent successfully to " + recipient);
        } catch (MessagingException e) {
            System.err.println("Failed to send email: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String recipient = "zrayouilkarima2003@gmail.com";
        String subject = "test sendMailer";
        String messageBody = "hello";

        EmailSender.sendEmail(recipient, subject, messageBody);
    }
}
   