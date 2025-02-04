import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void editTeacher(String name, String surName, String lastName, String newName, String newSurName, String newLastName) {
        teacherService.editTeacher(name, surName, lastName, newName, newSurName, newLastName);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayAllTeachers(teachers);
    }

    @Override
    public void create(String Name, String surName, String lastName) {
        Teacher teacher = new Teacher(Name, surName, lastName);
        teacherService.addTeacher(teacher);
    }
}

