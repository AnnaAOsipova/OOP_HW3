import java.util.List;

public interface TeacherRepository {
    void addTeacher(Teacher teacher);
    void editTeacherName(String name, String newName);
    void editTeacherSurName(String surName, String newSurName);
    void editTeacherLastName(String lastName, String newLastName);
    List<Teacher> getAllTeachers();

    void createTeacher(String name, String surName, String lastName);
}

/*

OCP - интерфейс позволяет добавлять новые реализации, не изменяя при этом основной код классов
 */