package User;

public class Booking {
    private String bookedUser; // (User),
    private String announcement; //(announcement)

    public Booking(String bookedUser, String announcement) {
        this.bookedUser = bookedUser;
        this.announcement = announcement;
    }

    public String getBookedUser() {
        return announcement;
    }

    public void setBookedUser(String bookedUser) {
        this.bookedUser = bookedUser;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookedUser='" + bookedUser + '\'' +
                ", announcement='" + announcement + '\'' +
                '}';
    }
}