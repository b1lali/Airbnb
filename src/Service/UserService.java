package Service;

import Interface.UserInterface;
import User.Address;
import User.Announcement;
import User.User;

import java.io.FilterOutputStream;
import java.util.Arrays;


public class UserService implements UserInterface {

    private Announcement[] announcements;


    public UserService(Announcement[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public void getAllUser() {
        for (int i=0; i<announcements.length; i++) {
            System.out.println(announcements[i].getUser());
        }
    }

    @Override
    public void getAnnouncementsByUserId(long id) {
        for (Announcement a:announcements) {
            if (a.getId()==id){
                System.out.println(a);
            }
        }

    }

    @Override

    public Announcement getAnnouncementsByAddress(Address address) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getAddress().equals(address)) {
                System.out.println(announcements[i]);
            }
        }
        return null;
    }
}

