package business.abstracts;

import entities.concretes.User;

public interface UserVerificationService {
	
	void emailVerification(User user);

}
