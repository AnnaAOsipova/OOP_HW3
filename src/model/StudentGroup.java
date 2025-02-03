package model;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentGroup;

    public StudentGroup(Teacher teacher, List<Student> studentGroup) {
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }

    public void setStudents(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{teacher=" + teacher + ", students=" + studentGroup + "}";
    }
}

