import java.util.Comparator;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String name, String lastName, String surName) {
        super(name, lastName, surName);
    }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

}


