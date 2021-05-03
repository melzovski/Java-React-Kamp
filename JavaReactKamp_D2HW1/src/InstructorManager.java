
public class InstructorManager {

	public void addToInstructor(Instructor instructor) {
		System.out.println("Our new instructor is "+ instructor.name+" "+instructor.surname);
	}
	public void deleteToInstructor(Instructor instructor) {
		System.out.println("Our instructor "+ instructor.name+" "+ instructor.surname+ " left from kodlama.io");
	}
}
