import adapters.GoogleAuthManager;
import business.abstracts.UserValidationService;
import business.abstracts.UserVerificationService;
import business.concretes.UserValidationManager;
import business.concretes.UserVerificationManager;
import core.GoogleAuthService;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 =new User("melisa","yýldýz","yildiz_melisa9@hotmail.com","123456");
		
		UserValidationService uvs1=new UserValidationManager(new HibernateUserDao());
		
		UserVerificationService uvm2=new UserVerificationManager();
		
		GoogleAuthService gas=new GoogleAuthManager();
		
		uvs1.emailFormatValidation(user1);
		
		uvs1.firstNameAndLastNameLengthValidation(user1);
		uvs1.passwordLengthValidation(user1);
		uvm2.emailVerification(user1);
		gas.Register(user1);

	}

}
