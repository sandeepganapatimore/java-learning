import java.util.List;

public interface ICourse {
    
    List<String> GetAll();
    String GetByName(String name);
    void Create();
    void Update();
    void Delete();
}
