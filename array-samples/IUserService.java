import java.util.List;

public interface IUserService {
    List<User> GetAll();
    User GetById(Integer userId);
}
