package business.concretes;

import business.abstracts.UserVerificationService;
import entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {

	@Override
	public void emailVerification(User user) {
		// TODO Auto-generated method stub
		System.out.println("E-mail is sended to user.");
		
	}

}
