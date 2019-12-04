package lecture.Student;

public class CodeupTest {
    public static void main(String[] args) {
        String[] student = {"Sophie", "K", "Olympic", "Macbook Pro"};
        Student sophie = new CodeupStudent(student, true);
        sophie.greeting();
        sophie.study();
        System.out.println(sophie.giveBusinessCards());

    }
}
