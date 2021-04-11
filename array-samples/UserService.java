import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    List<User> Users() {
        List<User> users = new ArrayList<User>();
        users.add(new User(101, "Sandeep"));
        users.add(new User(102, "Suraj"));
        users.add(new User(103, "Sai"));
        return users;
    }

    @Override
    public List<User> GetAll() {
        return Users();
    }

    @Override
    public User GetById(Integer userId) {
        // local variable inital value null
        User foundUser = null;
        // loop through the users list
        for (User user : Users()) {
            // check the given userid is equal to the userid of users array list
            if (user.userId == userId) {
                // then assign user to local varaible
                foundUser = user;
            }
        }
        // return the local variable
        return foundUser;
    }

}
