package grocery.api.groceryapiv2.groceryUser;

import jakarta.persistence.*;

@Entity
@Table
public class GroceryUser {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String username;
    private String fname;
    private String lname;
    private String email;

    public GroceryUser() {
    }

    public GroceryUser(Long id, String username, String fname, String lname, String email) {
        this.id = id;
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public GroceryUser(String username, String fname, String lname, String email) {
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
