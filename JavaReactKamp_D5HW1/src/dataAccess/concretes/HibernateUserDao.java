package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("New user "+user.getFirstName()+" is added.");
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("This user which is "+user.getFirstName()+" is deleted.");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("Information of "+user.getFirstName()+" is uptaded.");
		
	}
	

}
