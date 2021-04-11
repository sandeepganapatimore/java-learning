public class Main {
    public static void main(String[] args) {

        IUserService userService = new UserService();

        // get all users and display them in the console
        for (User user : userService.GetAll()) {
            // System.out.println(user.userId + " " + user.userName);
        }

        User findUser = userService.GetById(102);
        System.out.println(findUser.userId + " " + findUser.userName);
    }
}
