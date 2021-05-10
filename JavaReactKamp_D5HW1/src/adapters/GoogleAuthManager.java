package adapters;

import core.GoogleAuthService;
import entities.concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public void Register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Registered with Google Account.");
	}

}
