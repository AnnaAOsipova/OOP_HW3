import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getName().compareTo(o2.getName());
        if (resultOfComparing == 0){
            resultOfComparing = o1.getSurName().compareTo(o2.getSurName());
            if (resultOfComparing == 0){
                return o1.getLastName().compareTo(o2.getLastName());
            }else{
                return resultOfComparing;
            }

        } else {
           return resultOfComparing;
        }

    }
}
