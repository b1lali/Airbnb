package Service;

import Interface.MethodAble;
import User.Announcement;

import java.util.Arrays;


public class AnnouncementServiceImpl implements MethodAble {

    //String[] stringArray = {"элемент1", "элемент2"};
    //String новыйЭлемент = "новый элемент";
    //
    //// Создаем новый массив на один элемент больше
    //String[] новыйМассив = new String[stringArray.length + 1];
    //
    //// Копируем существующие элементы в новый массив
    //System.arraycopy(stringArray, 0, новыйМассив, 0, stringArray.length);
    //
    //// Добавляем новый элемент в конец нового массива
    //новыйМассив[stringArray.length] = новыйЭлемент;
    //
    //// Обновляем переменную с ссылкой на массив
    //stringArray = новыйМассив;

    private Announcement[] announcements;

    public AnnouncementServiceImpl(Announcement[] announcements) {
        this.announcements = announcements;
    }

    public Announcement[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Announcement[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public void createAnnouncement(Announcement announcement) {
        int i = 0;
        for (Announcement a : announcements) {
            if (!a.equals(announcement)) {
                announcements[i]=announcement;
                i++;
            }
        }
        System.out.println(Arrays.toString(announcements));
        System.out.println("has joined");
    }

    @Override
    public String deleteAnnouncementById(Long id) {
        int index = -1;
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == id) {
                index = i;
            }
        }
        if (index != -1) {
            Announcement[] newAnnouncement = new Announcement[announcements.length - 1];
            int j = 0;
            for (int i = 0; i < announcements.length; i++) {
                if (i != index) {
                    newAnnouncement[j] = announcements[i];
                    j++;
                    announcements[i].setId(j);
                }
            }
            announcements = Arrays.copyOf(newAnnouncement, newAnnouncement.length);
            System.out.println(Arrays.toString(announcements));
            return "Deleted";
        }
        return "Not found";
    }

    @Override
    public void getAnnouncementById(Long id) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == id) {
                System.out.println(announcements[i]);
            }
        }
        System.out.println("Retrieved on id");
    }

    @Override
    public Announcement[] getAllAnnouncements() {
        for (int i = 0; i < announcements.length; i++) {
            System.out.println(announcements[i]);
        }
        return announcements;
    }

    @Override
    public void sortAnnouncementsByRating() {
        Arrays.sort(announcements, (a1, a2) -> Integer.compare(a1.getRating(), a2.getRating()));
        System.out.println("Rating боюнча сорт (по возрасте)");
        for (Announcement b : announcements) {
            System.out.println(b);
        }

    }

    @Override
    public void sortByPrice(Announcement[] announcements) {
        Arrays.sort(announcements, (a1, a2) -> Integer.compare(a1.getPrice_per_day(), a2.getPrice_per_day()));
        System.out.println("Баалары боюнча сорт (по возрасте)");
        for (Announcement a : announcements) {
            System.out.println(a);
        }
    }

    @Override
    public void filterByType(String type) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getType().equals(type)) {
                System.out.println(announcements[i]);
            }
        }
    }

    @Override
    public void updateAnnouncementById(Long id, String newText) {
        for (Announcement ana : announcements) {
            if (ana.getId() == id) {
                ana.setDescription(newText);
                System.out.println(ana);

            }
        }
    }
}


// private Announcement[] announcements;
//    public AnnouncementService(Announcement[] announcements) {
//        this.announcements = announcements;
//        for (int i = 0; i < announcements.length; i++) {
//            announcements[i].setInstanceId(i + 1 - 1);
//        }
//    }
//    @Override
//    public String deleteAnnouncement(int id) {
//        int indexToRemove = -1;
//        for (int i = 0; i < announcements.length; i++) {
//            if (announcements[i].getInstanceId() == id) {
//                indexToRemove = i;
//                break;
//            }
//        }
//        if (indexToRemove != -1) {
//            Announcement[] newAnnouncement = new Announcement[announcements.length - 1];
//            int j = 0;
//            for (int i = 0; i < announcements.length; i++) {
//                if (i != indexToRemove) {
//                    newAnnouncement[j] = announcements[i];
//                    j++;
//                    announcements[i].setInstanceId(j);
//                }
//            }
//            announcements = Arrays.copyOf(newAnnouncement, newAnnouncement.length);
//            System.out.println(Arrays.toString(announcements));
//            return "Deleted";
//        }
//        return "Not found";
//    }
//    @Override
//    public void filterByType(String type) {
//        for (int i = 0; i < announcements.length; i++) {
//            if (announcements[i].getType().equals(type)) {
//                System.out.println(announcements[i]);
//            }
//        }}
//    @Override
//    public void updateAnnouncementById(int id, String newText) {
//        for (Announcement ana : announcements) {
//            if(ana.getInstanceId()==id){
//                ana.setDescription(newText);
//                System.out.println(ana);
//            }}}
//    @Override
//    public Announcement getAnnouncementById(int id) {
//        for (int i = 0; i < announcements.length; i++) {
//            if (announcements[i].getInstanceId() == id) {
//                System.out.println(Arrays.toString(announcements));
//            }
//        }
//        return null;
//    }
//    @Override
//    public Announcement[] getAllAnnouncements() {
//        for (int i = 0; i < announcements.length; i++) {
//            System.out.println(announcements[i]);
//        }
//        return announcements;
//    }
//    @Override
//    public Announcement[] sortAnnouncementsByRating() {
//        for (int i = 0; i < announcements.length; i++) {
//            for (int j = i + 1; j < announcements.length; j++) {
//                if (announcements[i].getRating() > announcements[j].getRating()) {
//                    Announcement temp = announcements[i];
//                    announcements[i] = announcements[j];
//                    announcements[j] = temp;
//                }}}
//        return announcements;
//    }
//    @Override
//    public Announcement[] sortByPrice() {
//        for (int i = 0; i < announcements.length; i++) {
//            for (int j = i + 1; j < announcements.length; j++) {
//                if (announcements[i].getPricePerDay() > announcements[j].getPricePerDay()) {
//                    Announcement temp = announcements[i];
//                    announcements[i] = announcements[j];
//                    announcements[j] = temp;
//                    // System.out.println(temp);
//                }}}
//        return announcements;
//    }
//
//
//Adeliia
//  9:59 PM
//public class UserService implements UserInterface {
//    private Announcement[] announcements;
//    public UserService(Announcement[] announcements) {
//        this.announcements = announcements;
//    }
//    @Override
//    public Announcement getAnnouncementsByUserId(int id) {
//        for (int i = 0; i < announcements.length; i++) {
//            if (announcements[i].getUser().getInstanceId() == id) {
//                System.out.println(announcements[i]);
//            }
//        }
//        return null;
//    }@Override
//    public Announcement getAnnouncementsByAddress(Address address) {
//        for (int i = 0; i < announcements.length; i++) {
//            if (announcements[i].getAddress().equals(address)) {
//                System.out.println(announcements[i]);
//            }
//        }
//        return null;
//    }
//}


