import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<StudentGroup> {

    //public List<StudentGroup> getStudentGroupList;
    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {

        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {

        this.studentGroupList = studentGroupList;
    }


    @Override
    public Iterator<StudentGroup> iterator() {

        return new StreamIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }
}


