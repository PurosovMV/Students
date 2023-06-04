import java.util.*;

public class StudyGroup implements Iterable<Student> {

    private List<Student> students;
    private int numGroup;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public void sortByName() {
        students.sort(new StudentComparatorByName());
    }

    public void sortByAge() {
        students.sort(new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {

        return new StudentIterator(students);
    }

}
