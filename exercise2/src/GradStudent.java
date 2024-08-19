// GradStudent class
public class GradStudent extends Student {
    public GradStudent(String name, String studentId, String major) {
        super(name, studentId, major);
    }

    @Override
    public void takeExam() {
        System.out.println("Graduate student " + getName() + " is taking the exam by giving a written paper.");
    }
}