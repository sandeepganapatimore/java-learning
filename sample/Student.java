// cannot initiated
// must be extends usign inheritance
// abstract class Student {
public class Student {
    String name;
    Integer id;
    String address;
    String gender;
    String game;

    // created constructor with parameter
    Student(String _name, Integer _id, String _address, String _gender) {
        name = _name;
        id = _id;
        address = _address;
        gender = _gender;

        System.out.println("first call  " + _name);
    }

    // abstract method
    // only abstract class have abstract method
    // // abstract method only have body, but not implementaion
    // abstract boolean idCard();

    public void IdCard() {
        System.out.println("YES");
    }
}