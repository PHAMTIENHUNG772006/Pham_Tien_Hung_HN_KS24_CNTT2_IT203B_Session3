package Gioi;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    public record User(String username, String email) {

    }
    private final List<User> users;



    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User("alice","alice@gmail.com"));
        users.add(new User("hưng","hung@gmail.com"));
        users.add(new User("quang","quang@yahoo"));
    }


    public Optional<User> findUserByUsername(String username) {
        return users.stream()
                .filter(u -> u.username().equalsIgnoreCase(username))
                .findFirst();
    }


}
