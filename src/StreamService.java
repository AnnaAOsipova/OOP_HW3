import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private static Stream stream;

    public StreamService() {
        this.stream = stream;
    }

    public Stream getSortedStream() {
        ArrayList<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        Collections.sort(studentGroupList);
        return stream;
    }

    public List<StudentGroup> getSortedBySize() {
        ArrayList<Stream> studentGroupList = new ArrayList(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return (List<StudentGroup>) stream;
    }
}

