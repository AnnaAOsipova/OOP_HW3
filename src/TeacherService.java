import java.util.ArrayList;
import java.util.List;

public class TeacherService implements TeacherRepository{
    private final List<Teacher> teacherList = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void editTeacherName(String name, String newName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getName().equals(name)) {
                teacher.setName(newName);
            }
        }
    }

    @Override
    public void editTeacherSurName(String surName, String newSurName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getSurName().equals(surName)) {
                teacher.setSurName(newSurName);
            }
        }
    }

    @Override
    public void editTeacherLastName(String lastName, String newLastName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getLastName().equals(lastName)) {
                teacher.setLastName(newLastName);
            }
        }
    }

//    public void editTeacher(String name, String surName, String lastName,
//                            String newName, String newSurName, String newLastName) {
//        for (Teacher teacher : teacherList) {
//            if (teacher.getName().equals(name)) {
//                teacher.setName(newName);
//            }
//            if (teacher.getSurName().equals(surName)) {
//                teacher.setSurName(newSurName);
//            }
//            if (teacher.getLastName().equals(lastName)) {
//                teacher.setLastName(newLastName);
//            }
//        }
//    }
/*
исправлен код по принципу SRP. Заменен на методы выше. Класс управляет только данными учителей
 */

        public List<Teacher> getAllTeachers(){
            return teacherList;
        }

    @Override
    public void createTeacher(String name, String surName, String lastName) {
        Teacher teacher = new Teacher(name, surName, lastName);
        teacherList.add(teacher);
    }
}

