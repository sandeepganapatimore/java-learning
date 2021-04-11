import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {

    List<String> CourseList() {
        List<String> list = new ArrayList<String>();
        list.add("EEE");
        list.add("CSE");
        list.add("MEE");
        return list;
    }

    @Override
    public List<String> GetAll() {
        return CourseList();

    }

    @Override
    public String GetByName(String name) {
        String foundItem = "";
        for (String item : CourseList()) {
            if (item == name) {
                foundItem = item;
            }
        }
        return foundItem;
    }

    @Override
    public void Create() {
        // TODO Auto-generated method stub

    }

    @Override
    public void Update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void Delete() {
        // TODO Auto-generated method stub

    }
}
