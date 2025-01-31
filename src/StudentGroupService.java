import java.util.*;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void removeStudentByFIO(String name, String surName, String lastName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)
                    && student.getSurName().equals(surName) && student.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String surName, String lastName) {
        studentGroup.createStudent(firstName, surName, lastName);
    }
}
