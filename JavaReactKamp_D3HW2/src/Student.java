
public class Student extends User {
	
	private String instructorName;
	private String courses;
	

	
	public Student(int id, String firstName, String lastName, String email, String password, String instructorName,
			String courses) {
		super(id, firstName, lastName, email, password);
		this.instructorName = instructorName;
		this.courses = courses;
	}
	
	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}


	
	
	



	


	
	
	
	
	

}
