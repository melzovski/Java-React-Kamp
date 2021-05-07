package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.CheckIfRealPerson(customer)==true) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	

	
	

}
