public class Main {
    public static void main(String[] args) {
        Student phdStudent = new PhdStudent("Alice", "PHD123", "Computer Science");
        Student gradStudent = new GradStudent("Bob", "GRAD456", "Electrical Engineering");

        phdStudent.takeExam();
        gradStudent.takeExam();
    }
}