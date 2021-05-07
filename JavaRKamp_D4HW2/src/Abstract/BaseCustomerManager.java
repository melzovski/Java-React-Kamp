package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to database:"+customer.getFirstName());
		
	}
}
