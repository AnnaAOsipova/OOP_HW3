import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void editTeacher(String name, String surName, String lastName,
                            String newName, String newSurName, String newLastName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getName().equals(name)) {
                teacher.setName(newName);
            }
            if (teacher.getSurName().equals(surName)) {
                teacher.setSurName(newSurName);
            }
            if (teacher.getLastName().equals(lastName)) {
                teacher.setLastName(newLastName);
            }
        }
    }

        public List<Teacher> getAllTeachers(){
            return teacherList;
        }
}

