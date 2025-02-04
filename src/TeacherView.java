import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println(teacher.getTeacherId());

        }
    }

    public void displayAllTeachers(List<Teacher> teacherList) {

        System.out.println(teacherList);
    }
}
