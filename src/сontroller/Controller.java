package сontroller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();

    public void createStudent(String name, String surName, String lastName) {
        service.create(name, surName, lastName, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> userList = service.getAllStudents();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }

    }

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public StudentGroup createStudentGroupByIds(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher)DataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentGroup = new ArrayList<>();
        for (Integer studentId : studentIds) {
            Student student = (Student)DataService.getUserById(Type.STUDENT,studentId);
            if (student != null) {
                studentGroup.add(student);
            }
        }
        return studentGroupService.createStudentGroup(teacher, studentGroup);
    }

    public void getStudentGroup(StudentGroup studentGroup) {
        System.out.println(studentGroup);
    }
}

