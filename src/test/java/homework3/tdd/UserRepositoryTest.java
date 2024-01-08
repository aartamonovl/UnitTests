package homework3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository userRepository;
    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        User user1 = new User("user1", "pass1", false);
        User user2 = new User("user2", "pass2", true);
        User user3 = new User("user3", "pass3", false);
        user1.login("user1", "pass1");
        user2.login("user2", "pass2");
        user3.login("user3", "pass3");
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
    }

    @Test
    void logoutNotAdmin() {

        int admins = 0;
        for (User user: userRepository.data){
            if (user.isAdmin()) {
                admins++;
            }
        }

        userRepository.logoutNotAdmin();

        int usersAfterLogout = 0;
        int adminsAfterLogout = 0;
        for (User user: userRepository.data){
            if (user.isAuthenticate){
                usersAfterLogout++;
                if (user.isAdmin()) {
                    adminsAfterLogout++;
                }
            }
        }
        assertTrue((adminsAfterLogout == admins) && (usersAfterLogout == adminsAfterLogout));
    }
}