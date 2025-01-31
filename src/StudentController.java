import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String name, String surName, String lastName) {
        studentGroupService.removeStudentByFIO(name, surName, lastName);
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupService.getSortedByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudentGroup> getSortedBySize(){
        return streamService.getSortedBySize();
    }

    @Override
    public void create(String firstName, String surName, String lastName) {
        studentGroupService.createStudent(firstName, surName, lastName);

    }
}
