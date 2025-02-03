package model;

public class Teacher extends User{

    private static int teacherId;

    public Teacher(String name, String lastName, String surName, int teacherId) {
        super(name, lastName, surName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
