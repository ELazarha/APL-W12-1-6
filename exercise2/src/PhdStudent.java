// PhdStudent class
public class PhdStudent extends Student {
    public PhdStudent(String name, String studentId, String major) {
        super(name, studentId, major);
    }

    @Override
    public void takeExam() {
        System.out.println("PhD student " + getName() + " is taking the exam by giving a final defense presentation.");
    }
}