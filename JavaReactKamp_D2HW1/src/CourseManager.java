
public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println("New course "+course.name+ " is added.");
	}
	public void deleteCourse(Course course) {
		System.out.println(course.name + " was deleted.");
	}
	public void changeCourseInstructor(Course course) {
		System.out.println("New instructor of "+ course.name + " is "+ course.instructor);
	}

}
