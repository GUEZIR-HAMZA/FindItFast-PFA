package pfa.project.finditfastbackend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotNull(message = "First Name cannot be empty")
    //@Column(name = "first_name")
    //private String firstName;

    //@NotNull(message = "Last Name cannot be empty")
    //@Column(name = "last_name")
    //private String lastName;

    @Column(name = "username", nullable = false)
    private String username;

    @Email(message = "Please enter a valid email address")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

//    @Length(min = 7, message = "Password should be atleast 7 characters long")
    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "mobile", unique = true)
    @Length(min = 10, message = "Password should be atleast 10 number long")
    private String mobile;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "locked")
    private Boolean locked = false;

    @Column(name = "enabled")
    private Boolean enabled = true;

    // Getters and Setters
    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //public String getFirstName() { return firstName; }

    //public void setFirstName(String firstName) { this.firstName = firstName;}

    public String getMobile() { return mobile; }

    public void setMobile(String mobile) { this.mobile = mobile; }

    //public String getLastName() { return lastName; }

   //public void setLastName(String lastName) { this.lastName = lastName; }

//    public String getUsername() {
//        return email;
//    }

    public String getPassword() {
        return password;
    }
}
