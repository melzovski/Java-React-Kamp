package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerService;
	
	public NeroCustomerManager(CustomerCheckService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		
		
	}

}
