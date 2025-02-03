package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private static List<User> userList;

    public void create(String name, String surName, String lastName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(name, surName, lastName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(name, surName, lastName, id);
            userList.add(teacher);
        }
    }

    public static User getUserById(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type;
        User currentUser = null;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                currentUser = user;
            }
            if (user instanceof Student && itsStudent) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public List<User> getAllStudents(){
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

        private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: userList){
            if (user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentId() +1;
            }
        }
        return lastId;
    }
}
