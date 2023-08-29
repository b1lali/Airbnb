package Interface;

import User.Announcement;

public interface MethodAble {
   void createAnnouncement(Announcement announcement);
    String deleteAnnouncementById(Long id);
    void getAnnouncementById(Long id);
    Announcement [] getAllAnnouncements();
    void sortAnnouncementsByRating();
    void sortByPrice(Announcement[] announcements);
    void filterByType(String type);
    void updateAnnouncementById(Long id, String newText);




}
