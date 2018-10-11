package lk.ijse.spring.rest.maven.dto;

public class EmailDTO {
    private String emailAddress;
    private String reply;

    public EmailDTO() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
