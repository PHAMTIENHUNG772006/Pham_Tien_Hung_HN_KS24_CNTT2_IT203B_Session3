package btth;

import btth.model.PublicUser;
import btth.model.Tier;
import btth.model.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(

                new User("U01", "alice@gmail.com", "123", true, LocalDate.now().minusMonths(30)),
                new User("U02", "bob@gmail.com", "123", false, LocalDate.now().minusMonths(5)),
                new User("U03", "charlie@gmail.com", "123", true, LocalDate.now().minusMonths(18)),
                new User("U04", "david@gmail.com", "123", true, LocalDate.now().minusMonths(10)),
                new User("U05", "emma@gmail.com", "123", false, LocalDate.now().minusMonths(40)),
                new User("U06", "frank@gmail.com", "123", true, LocalDate.now().minusMonths(2)),
                new User("U07", "grace@gmail.com", "123", false, LocalDate.now().minusMonths(25)),
                new User("U08", "henry@gmail.com", "123", true, LocalDate.now().minusMonths(14)),
                new User("U09", "irene@gmail.com", "123", true, LocalDate.now().minusMonths(8)),
                new User("U10", "jack@gmail.com", "123", false, LocalDate.now().minusMonths(50))
        );

        UserService userService = new UserService();

        List<User> userVerified = userService.getVerifiedUsers(users);

        userVerified.forEach(System.out::println);


        List<PublicUser> publicUsers = users.stream()
                .map(user -> {

                    long months = Period.between(
                            user.getCreatedAt(),
                            LocalDate.now()
                    ).toTotalMonths();

                    Tier tier = userService.classifyTier(months);

                    return new PublicUser(
                            user.getId(),
                            user.getEmail(),
                            tier
                    );

                })
                .toList();


        System.out.println("""
                
                ===== Báo cáo thống kê  =====
                Verified Users:
                """);

        publicUsers.forEach(user -> System.out.println("""
                ---------------------------
                ID: %s
                Email: %s
                %s
                """.formatted(
                user.id(),
                user.email(),
                user.tier()
        )));
    }
}
