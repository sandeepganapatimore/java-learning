
public class Academics extends Student {
    Integer grades;
    Integer attendance;
    String performance;

    Academics(String _name, Integer _id, String _address, String _gender, Integer _marks, Integer _presenty,
            String _perfor) {
        // to initialze the super class constructor
        super(_name, _id, _address, _gender);
        name = _name;
        id = _id;
        address = _address;
        gender = _gender;
        grades = _marks;
        attendance = _presenty;
        performance = _perfor;

    }

    public void Display() {

        System.out.println(name + "\n" + id + "\n" + address + "\n" + gender + "\n" + grades);
    }

    public boolean idCard(){
        return false;
    }
}
