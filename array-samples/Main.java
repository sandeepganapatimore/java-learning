public class Main {
    public static void main(String[] args) {
        // Creating the instance(object) to the User Service
        IUserService userService = new UserService();

        // GetAll method returns the list of users
        // those list of users store in the variable
        var list = userService.GetAll();
        // loop all users and display them in the console
        for (User user : list) {
            System.out.println(user.userId + " " + user.userName);
        }
        // GetById method returns finds the user by userid and
        // returns found the user
        User findUser = userService.GetById(104);

        // avoiding the execption handling with null check
        if (findUser != null) {
            System.out.println(findUser.userId + " " + findUser.userName);
        } else {
            System.out.println("User not found");
        }

        // handling the exception
        try {
            System.out.println(findUser.userId + " " + findUser.userName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            userService = null;
        }

    }
}
