package business.abstracts;

import entities.concretes.User;

public interface UserValidationService {
	
	boolean emailFormatValidation(User user);
	boolean passwordLengthValidation(User user);
	boolean firstNameAndLastNameLengthValidation(User user);
}
