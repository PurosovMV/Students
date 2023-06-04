
public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupService service = new StudyGroupService(studyGroup);

        service.addStudent("Вася", 15);
        service.addStudent("Маша", 20);
        service.addStudent("Даша", 14);
        service.addStudent("Ваня", 17);
        service.addStudent("Кирилл", 25);

        for (Student student : studyGroup) {
            System.out.println(student);
        }

        studyGroup.sortByAge();

        for (Student student : studyGroup) {
            System.out.println(student);
        }
    }

}