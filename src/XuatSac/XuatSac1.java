package XuatSac;

import Gioi.Gioi2;

import java.util.*;

public class XuatSac1 {
    public record User(String username, String email,String status) {

    }
    public static void main(String[] args) {
        User user1 = new User("Benjamin", "hung@gmail.com", "ACTIVE");
        User user2 = new User("Quang 9,5 ngón", "quang@gmail.com", "INACTIVE");
        User user3 = new User("alexander", "hoan@gmail.com", "ACTIVE");
        User user4 = new User("hung", "trang@gmail.com", "INACTIVE");

        List<User> lists = Arrays.asList(user1, user2, user3, user4);

        lists.stream().sorted(Comparator.comparing(User::username)).limit(3).forEach(element -> System.out.println(element));
    }
}
