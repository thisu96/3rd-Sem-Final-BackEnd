package lk.ijse.spring.rest.maven.dto;

public class CommentDTO {
    private int CommentId;
    private String fullName;
    private String contact;
    private String email;
    private String message;

    public CommentDTO() {
    }

    public CommentDTO(int commentId, String fullName, String contact, String email, String message) {
        CommentId = commentId;
        this.fullName = fullName;
        this.contact = contact;
        this.email = email;
        this.message = message;
    }

    public int getCommentId() {
        return CommentId;
    }

    public void setCommentId(int commentId) {
        CommentId = commentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "CommentId=" + CommentId +
                ", fullName='" + fullName + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
