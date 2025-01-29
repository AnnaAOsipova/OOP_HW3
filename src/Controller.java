import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String name, String surName, String lastName) {
        studentGroupService.removeStudentByFIO(name, surName, lastName);
    }
    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedByFIO();
    }

    public List<StudentGroup> getSortedBySize(){
        return streamService.getSortedBySize();
    }
}
