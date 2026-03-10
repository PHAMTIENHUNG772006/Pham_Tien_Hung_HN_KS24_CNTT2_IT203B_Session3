package Kha.Kha2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public record User(String username, String email, String status) {

    }


    public static void main(String[] args) {
        Kha.Kha1.Main.User user1 = new Kha.Kha1.Main.User("Hưng","hung@gmail.com","ACTIVE");
        Kha.Kha1.Main.User user2 = new Kha.Kha1.Main.User("Quang 9,5 ngón","quang@gmail.com","INACTIVE");
        Kha.Kha1.Main.User user3 = new Kha.Kha1.Main.User("Hoàn","bob@yahoo.com","ACTIVE");
        Kha.Kha1.Main.User user4 = new Kha.Kha1.Main.User("Trang","trang@gmail.com","INACTIVE");

        List<Kha.Kha1.Main.User> lists = Arrays.asList(user1,user2,user3,user4);

        lists.stream().filter(element -> element.email().contains("gmail.com")).forEach(System.out::println);
    }
}
