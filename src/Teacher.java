
import java.util.List;

public class Teacher extends User {
    private Long teacherId;
    private List<Teacher> teacherList;

    public Teacher(String name, String lastName, String surName) {
        super(name, lastName, surName);
    }
    public Long getTeacherId() {

        return teacherId;
    }

    public void setTeacherId(Long teacherId) {

        this.teacherId = teacherId;
    }
    public List<Teacher> getTeacherList() {

        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String surName, String lastName) {
        teacherList.add(new Teacher(firstName, lastName, surName));
    }
}
