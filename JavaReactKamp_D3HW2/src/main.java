
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1=new Student(1,"Melisa","Yýldýz","abc@hotmail.com","12345","Engin Demiroð","Java-React");
		Instructor instructor1=new Instructor(1,"Engin","Demiroð","ed@hotmail.com","12365","Instructor, Odtü Mezunu");
		
		UserManager um1=new UserManager();
		StudentManager sm1=new StudentManager();
		InstructorManager im1=new InstructorManager();
		
		um1.AddUser(instructor1);
		um1.AddUser(student1);
		um1.log();
		um1.ChangePassword();
		um1.DeleteUser(instructor1);
		
		sm1.addCourse(student1);
		sm1.CompleteCourse(student1);
		
		im1.UpdateDetails(instructor1);
		
		System.out.println();
	}

}
