
public class InstructorManager {
	
	public void UpdateDetails(Instructor instructor) {
		instructor.setDetail("Odtü mezunu");
		System.out.println("New Details:"+ instructor.getDetail());
	}

}
