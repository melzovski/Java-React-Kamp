
public class UserManager {
	
	public void log() {
		System.out.println("Login is successfull.");
	}
	
	public void ChangePassword() {
		System.out.println("Password is changed succesfully.");
	}
	
	public void AddUser(User user) {
		System.out.println("New user "+user.getFirstName()+" "+user.getLastName()+" is added.");
	}
	
	public void DeleteUser(User user) {
		
		System.out.println("This user who is "+ user.getFirstName()+" "+user.getLastName()+" is deleted.");
		
	}

}
