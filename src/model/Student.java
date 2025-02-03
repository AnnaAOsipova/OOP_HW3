package model;

public class Student extends User{
    private int studentId;

    public Student(String name, String lastName, String surName, int studentId) {
        super(name, lastName, surName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

@Override
    public String toString() {
        return "Student{" +
                "studentId = " + studentId + "}";
}
}
