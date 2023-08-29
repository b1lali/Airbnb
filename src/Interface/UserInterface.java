package Interface;

import User.User;
import User.Announcement;
import User.Address;

public interface UserInterface {
     void getAllUser();
      void getAnnouncementsByUserId(long id);
      Announcement getAnnouncementsByAddress(Address address);

}
