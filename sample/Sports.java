
import java.util.Scanner;

public class Sports extends Student {
    String field;

    Sports(String _name, Integer _id, String _address, String _gender, String _field) {
        // calling the super class i.e student class constructor
        super(_name, _id, _address, _gender);
        name = _name;
        id = _id;
        address = _address;
        gender = _gender;
        field = _field;
        field = _field;

        System.out.println("second call " + _name);
    }

    public void SelectSports() {
        var playee = new Scanner(System.in);
        String player = "";
        if (field == "Soccer") {
            System.out.println("What is your position");
            player = playee.nextLine();
        } else if (field == "Cricket") {
            System.out.println("What is your role ");
            player = playee.nextLine();
        } else if (field == "Badmenton") {
            System.out.println("What is Age ");
            player = playee.nextLine();
        }

        System.out.println(player);
    }

    public void IdCard() {
        System.out.println("NO");
    }
}
