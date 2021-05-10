package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserValidationManager implements UserValidationService {
	
	String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";;
    Pattern pattern =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    private UserDao userDao;
	public UserValidationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	

	@Override
	public boolean emailFormatValidation(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		// TODO Auto-generated method stub
		   if(matcher.matches()) {
			   	
		        System.out.println("It is correct format!");
		        return true;
		        }
		        else {
		            System.out.println("Please enter correct format for email.");
		            return false;
		        }
	}

	@Override
	public boolean passwordLengthValidation(User user) {
		// TODO Auto-generated method stub
		if(user.getPassword().length()>=6) {
			System.out.println("Password validation is true.");
			return true;
		}
		else{
			System.out.println("Please enter a new password which length is longer than 6.");
			return false;
		}
	}

	@Override
	public boolean firstNameAndLastNameLengthValidation(User user) {
		// TODO Auto-generated method stub
		if(user.getFirstName().length()>=2) {
			if(user.getLastName().length()>=2) {
				System.out.println("First and Last name validation is true.");
				return true;
				
			}
			else {
				System.out.println("Please enter your last name again. It should be longer than 2.");
				return false;
			}
			
		}
		else{
			System.out.println("Please enter your first name again. It should be longer than 2.");
			return false;
		}
	}

}
