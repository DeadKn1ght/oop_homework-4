package service;
import model.User;
import java.time.LocalDate;
import java.util.List;
public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
