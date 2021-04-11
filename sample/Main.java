
public class Main {
    public static void main(String[] args) {
        // // Cannot instantiate the type Student,because its marked as abstract
        // // Student s = new Student();
        // Sports sports = new Sports("Balaji", 07, "Revangoan", "male", "Cricket");

        // Sports sports1 = new Sports("Balaji", 07, "Revangoan", "male", "Cricket");

        // System.out.println(sports.getClass());

        // System.out.println(sports.toString());

        // System.out.println(sports.hashCode());

        // System.out.println(sports.equals(sports1));

        // System.out.println(sports1.hashCode());

        ICourse course = new Course();

        var courses = course.GetAll();

        // for (String item : courses) {
        //     // System.out.println(item);
        // }
       
        System.out.println(course.GetByName("EEE"));
    }
}
