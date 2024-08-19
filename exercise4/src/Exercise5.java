
public class Exercise5
{
	public static void main(String[] args)
	{
		Student student = new Student("robot", 1);
		student.addClass("English", 100);
		student.addClass("Math", 95);
		student.addClass("Science", 90);
		
		student.displayInfo();
		System.out.println("GPA: "+student.getGPA());
		
		student.dropClass("English");
		student.dropClass("Hello");
		
		student.displayInfo();
		System.out.println("GPA: "+student.getGPA());
	}
}
