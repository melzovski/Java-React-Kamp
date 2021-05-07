package Adapters;


import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean result=true;

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		

					try {
						result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
						customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
						customer.getDateofBirth());
						//System.out.println(result);
					} 
					catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return result;

		
	}

}