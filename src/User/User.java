package User;

import java.time.LocalDate;

public class User {
    private static int nextID = 1;
   private int  id;
   private String firstName;
   private String lastname;
   private String email;
   private LocalDate registeredDate;

    public User( String firstName, String lastname, String email, LocalDate registeredDate) {
        this.id = nextID++;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.registeredDate = registeredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
