
public class StudentManager extends UserManager {
	
	public void addCourse(Student student) {
		
		System.out.println("New course "+student.getCourses()+" is added");
		
	}
	
	public void CompleteCourse(Student student) {
		System.out.println(student.getCourses()+" is ended");
	}
	
	

}
