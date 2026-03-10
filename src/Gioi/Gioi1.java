package Gioi;

import java.util.Optional;

public class Gioi1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        Optional<UserRepository.User> user =  userRepository.findUserByUsername("lan");
//        Optional<UserRepository.User> user =  userRepository.findUserByUsername("hưng");

        if (!user.isEmpty()) {
            System.out.println("Welcome a : " + user.get().username());
        }else {
            System.out.println("Guest login");
        }
    }
}
