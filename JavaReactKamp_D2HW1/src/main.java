
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1=new Course(1,"C#-Angular","Engin Demiro�","Free","Yaz�l�m geli�tirici yeti�tirme kursu");
		Course course2=new Course(1,"Java-React","Engin Demiro�","Free","Yaz�l�m geli�tirici yeti�tirme kursu");
		Course course3=new Course(1,"Python-Java-C#","Engin Demiro�","Free","Yaz�l�m geli�tirici yeti�tirme kursu");
		
		Course[] courses= {course1,course2,course3};
		
		Instructor instructor1= new Instructor(1,"Engin","Demiro�");
		
		Category category1=new Category(1,"Programlama");
		
		System.out.println("Courses in Kodlama.io:\n");
		for (Course course : courses) {
					System.out.println(course.name+" "+course.instructor+" "+course.detail+" "+course.price+"\n");
		}
		
		System.out.println("Instructors in Kodlama.io: "+instructor1.name+" "+instructor1.surname);
		
		System.out.println("Categories in Kodlama.io: "+category1.name );
		
	}

}
