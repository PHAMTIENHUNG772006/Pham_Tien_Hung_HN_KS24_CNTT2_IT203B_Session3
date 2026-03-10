package btth;

import btth.model.*;

import java.util.List;

public class UserService {
    List<User> getVerifiedUsers(List<User> users){
        return users.stream().filter(element -> element.isVerified() == true).toList();
    }

    Tier classifyTier(long months) {

        int group = (months > 24) ? 2 :
                (months > 12) ? 1 : 0;

        return switch (group) {
            case 2 -> new Gold();
            case 1 -> new Silver();
            default -> new Bronze();
        };
    }
}
