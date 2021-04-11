package examples;

public class Person {
    // to get and set the firstname
    public String firstName;

    // to get and set the lastname
    public String lastName;

    // private boolean isvalid;

    // can be used in the child only via inheritance
    protected Integer count;

    // default constructor
    public Person() {

    }

    // parameterized constructor
    public Person(String _firstName, String _lastName) {
        firstName = _firstName;
        lastName = _lastName;
    }

    // method to get the full name
    public String FullName() {
        return firstName + " " + lastName;
    }
}
