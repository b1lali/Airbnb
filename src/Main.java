import Service.AnnouncementServiceImpl;
import Service.BookServiceImpl;
import Service.UserService;
import User.Address;
import User.Announcement;
import User.Booking;
import User.User;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kandybek", "Kandy", "kandy@gmail.com", LocalDate.of(2023, 8, 18));
        User user1 = new User("Adelya", "adel", "adel@gmail.com", LocalDate.of(2023, 9, 9));
        User user2 = new User("Nur", "nurbek", "nnn@gmail.com", LocalDate.of(2023, 7, 4));
        User user3 = new User("Zalkarchik", "zake", "zzzz@gmail.com", LocalDate.of(2023, 8, 10));
        User user4 = new User("Erkinbek", "erkinchik", "erkin@gmail.com", LocalDate.of(2023, 9, 12));
        User[] us = {user, user1, user2, user3, user4};

        Address address = new Address("sdfwdsC", "ASDFEV", "SDVQ");
        Address address1 = new Address("fffwfw", "rgegerge", "sff");
        Address address2 = new Address("vfvdfv", "erwr", "rgregg");
        Address address3 = new Address("zvzv", "rtwet", "etrtwrtw");
        Address address4 = new Address("fbdf", "qeq3", "hjthjt");
        Address[] addresses = {address, address1, address2, address3, address4};

        Booking booking = new Booking("Bilal", "frfwfwefwefwef");
        Booking booking1 = new Booking("Ulan", "thhgew");
        Booking booking2 = new Booking("Baku", "ruyruwy");
        Booking booking3 = new Booking("Eldan", "rewreuru");
        Booking booking4 = new Booking("Nurik", "jyujet");
        Booking[] bookings = {booking, booking1, booking2, booking3, booking4};

        Announcement announcements = new Announcement("nbxee", LocalDate.of(2023, 8, 9), "jhweh", "wew", user, true, 5, 2, address);
        Announcement announcements1 = new Announcement("rweq", LocalDate.of(2023, 5, 20), "werw", "wewe", user1, true, 4, 4, address1);
        Announcement announcements2 = new Announcement("jtyjtyjt", LocalDate.of(2023, 4, 6), "gngn", "jmh", user2, true, 2, 6, address2);
        Announcement announcements3 = new Announcement("hryjrs", LocalDate.of(2023, 9, 19), "jhweh", "wewe", user4, true, 3, 1, address4);
        Announcement announcements4 = new Announcement("BNBNBN", LocalDate.of(2023, 3, 15), "weh", "TETE", user3, true, 7, 4, address1);

        Announcement[] announcement = {announcements, announcements1, announcements2, announcements3};

        AnnouncementServiceImpl announcementService = new AnnouncementServiceImpl(announcement);
        announcementService.updateAnnouncementById(1L,"nbx");
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        announcementService.filterByType("wewe");
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        announcementService.sortByPrice(announcement);
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
//        announcementService.getAnnouncementById(2L);2L
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        System.out.println(announcementService.deleteAnnouncementById(1L));
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        System.out.println(Arrays.toString(announcementService.getAllAnnouncements()));
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        announcementService.sortAnnouncementsByRating();
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0--0-0-0-");
        announcementService.createAnnouncement(announcements4);

        System.out.println("------------------------------------------------");
        UserService userService = new UserService(announcement);
        userService.getAnnouncementsByUserId(3L);
        System.out.println("------------------------------------------------");
        userService.getAnnouncementsByAddress(address1);
        System.out.println("------------------------------------------------");
        userService.getAllUser();
        System.out.println("------------------------------------------------");
        userService.getAnnouncementsByUserId(2L);
        System.out.println("------------------------------------------------");

        BookServiceImpl bookService = new BookServiceImpl(announcement,us);
        bookService.bookAnnouncement(1,2L);
        System.out.println("------------------------------------------------");
        bookService.unBookAnnouncement(3L,2L);






    }
    }




