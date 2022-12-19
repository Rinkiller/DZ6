import java.util.List;
public class WriterofFile {
   List<Student> students;

public WriterofFile(List<Student> students) {
    this.students = students;
}

@Override
public String toString() {
    return "WriterofFile [students=" + students + "]";
}

public List<Student> getStudents() {
    return students;
}

public void setStudents(List<Student> students) {
    this.students = students;
}
   
    
}
