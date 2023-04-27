package view;

import model.Student;
import model.User;

import java.util.List;

public interface UserView<T extends User>{

    T sendOnConsole(List<User> userListlist);
}