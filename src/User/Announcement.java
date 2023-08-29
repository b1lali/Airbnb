package User;

import java.time.LocalDate;

public class Announcement {
    private static int Index =1;
   private int  id;
   private String description;
   private LocalDate data;
   private String  title;
   private String type;//<--(Apartment, House )
    private User user;
    private boolean isBooked;
    private  int rating;
    private int price_per_day;
    private Address address;

    public Announcement(String description, LocalDate data, String title, String type, User user, boolean isBooked, int rating, int price_per_day, Address address) {
        this.id = Index++;
        this.description = description;
        this.data = data;
        this.title = title;
        this.type = type;
        this.user=user;
        this.isBooked = isBooked;
        this.rating = rating;
        this.price_per_day = price_per_day;
        this.address=address;
    }

    public static int getIndex() {
        return Index;
    }

    public static void setIndex(int index) {
        Index = index;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", data=" + data +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", owner='" + user + '\'' +
                ", isBooked=" + isBooked +
                ", rating=" + rating +
                ", price_per_day=" + price_per_day +
                '}';
    }
}
