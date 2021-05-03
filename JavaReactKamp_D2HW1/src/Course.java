
public class Course {
	
	public Course() {
		System.out.println("working");
	}
	public Course(int id, String name, String price, String instructor,String detail) {
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.price=price;
		this.detail=detail;
	}
	
	int id;
	String name;
	String instructor;
	String price;
	String detail;
}
