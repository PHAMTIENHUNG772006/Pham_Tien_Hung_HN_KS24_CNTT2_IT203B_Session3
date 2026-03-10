package Kha.Kha1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public record User(String username, String email, String status) {

    }


    public static void main(String[] args) {
        User user1 = new User("Hưng","hung@gmail.com","ACTIVE");
        User user2 = new User("Quang 9,5 ngón","quang@gmail.com","INACTIVE");
        User user3 = new User("Hoàn","hoan@gmail.com","ACTIVE");
        User user4 = new User("Trang","trang@gmail.com","INACTIVE");

        List<User> lists = Arrays.asList(user1,user2,user3,user4);

        lists.forEach(System.out::println);
    }
}
