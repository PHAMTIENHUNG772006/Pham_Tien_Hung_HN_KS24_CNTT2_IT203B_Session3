package btth.model;

import java.time.LocalDate;

public class User {
    private String id;
    private String email;
    private String password;
    private boolean verified;
    private LocalDate createdAt;


    public User(String id, String email, String password, boolean verified, LocalDate createdAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.verified = verified;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "User : " +
                " ID : " + id + '\'' +
                "| Email : " + email + '\'' +
                "| Password : " + password + '\'' +
                "| Verified : " + verified +
                "| Created at : " + createdAt ;
    }
}
