import java.util.List;

public class TeacherController implements UserController<Teacher>{

        private final TeacherRepository teacherRepository;
        private final TeacherView teacherView;

        public TeacherController(TeacherRepository teacherRepository, TeacherView teacherView) {
            this.teacherRepository = teacherRepository;
            this.teacherView = teacherView;
        }

        public void editTeacherName(String name, String newName) {
            teacherRepository.editTeacherName(name, newName);
        }

        public void editTeacherSurName(String surName, String newSurName) {
            teacherRepository.editTeacherSurName(surName, newSurName);
        }

        public void editTeacherLastName(String lastName, String newLastName) {
            teacherRepository.editTeacherLastName(lastName, newLastName);
        }

        public void displayAllTeachers() {
            List<Teacher> teachers = teacherRepository.getAllTeachers();
            teacherView.sendOnConsole(teachers);
        }

        @Override
        public void create(String name, String surName, String lastName) {
            teacherRepository.createTeacher(name, surName, lastName);
        }
    }

//    private final TeacherService teacherService = new TeacherService();
//    private final TeacherView teacherView = new TeacherView();
//
//    public void editTeacher(String name, String surName, String lastName, String newName, String newSurName, String newLastName) {
//        teacherService.editTeacher(name, surName, lastName, newName, newSurName, newLastName);
//    }
//
//    public void displayAllTeachers() {
//        List<Teacher> teachers = teacherService.getAllTeachers();
//        teacherView.displayAllTeachers(teachers);
//    }
//
//    @Override
//    public void create(String Name, String surName, String lastName) {
//        Teacher teacher = new Teacher(Name, surName, lastName);
//        teacherService.addTeacher(teacher);
//    }
/*
SRP - класс управляет только логикой, связанной с действиями над учителями
DIP использован интерфейс Teacher Repository для зависимостей (редактирования данных учителя по отдельности)
 */


