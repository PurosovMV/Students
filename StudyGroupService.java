public class StudyGroupService {
    private StudyGroup group;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
    }

    private static int id;

    public void addStudent(String name, int age) {
        group.addStudent(new Student(id++, name, age));
    }
}
