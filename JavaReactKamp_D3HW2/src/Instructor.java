
public class Instructor extends User {
	
	private String detail;
	
	

	public Instructor(int id, String firstName, String lastName, String email, String password, String detail) {
		super(id, firstName, lastName, email, password);
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	
	
	
	
	

}
