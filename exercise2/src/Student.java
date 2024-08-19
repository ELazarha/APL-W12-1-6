// Abstract class Student
public abstract class Student {
    private String name;
    private String studentId;
    private String major;

    // Constructor
    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Abstract method takeExam
    public abstract void takeExam();
}