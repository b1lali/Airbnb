package Service;

import Interface.BookInterface;
import User.Announcement;
import User.User;
import User.Booking;

import java.util.Arrays;

public class BookServiceImpl implements BookInterface {
    public Booking[] bookings;
    private Announcement [] announcements;
    private User [] users;

    public BookServiceImpl(Announcement[] announcements, User[] users) {
        this.announcements = announcements;
        this.users = users;
    }

    @Override
    public void bookAnnouncement(int id, Long announcementsId) {
        try {
            for (Announcement anon:announcements) {
                 if (anon.getId() == announcementsId&&announcementsId.equals(announcementsId)){
                     for (User us:users) {
                         if (us.getId()==id){
                             anon.setBooked(true);
                             System.out.println("The ad was successfully placed ");
                             return;
                         }
                     }
                     System.out.println("The user with the specified ID was not found");
                     break;
                 }
            }
            throw  new Exception("An ad with the specified ID was not found or is already occupied");
        }catch (Exception e) {
            System.out.println("An error occurred while canceling the ad reservation "+e.getMessage());
            System.out.println( );
        }
        }

    @Override
    public void unBookAnnouncement(Long Id, Long Id1) {
        try {
            for (Announcement aaa: announcements){
                if (aaa.getId()==Id1 && aaa.isBooked()){
                    for (User ss : users){
                        if (ss.getId()==Id){
                            aaa.setIsBooked(false);
                            System.out.println("The ad was successfully placed "+aaa);
                            return;
                        }
                    }
                    System.out.println("The user with the specified ID was not found");
                    break;
                }
            }
            throw new Exception("An ad with the specified ID was not found or is already occupied");
        }catch (Exception a){
            System.out.println("An error occurred while canceling the ad reservation "+a.getMessage());
            System.out.println( );
        }

    }


}


















