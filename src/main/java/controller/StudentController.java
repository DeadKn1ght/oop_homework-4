package controller;
import model.Student;
import model.Teacher;
import model.User;
import service.StudentGroupService;
import service.StudentService;
import view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<Student> studentList = dataService.getAll();
//        studentView.sendOnConsole(studentList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);

    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);

    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();

    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();

    }
}