package view;

import model.Teacher;
import model.User;
import java.util.List;
public class TeacherView implements UserView<Teacher> {


    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }


}