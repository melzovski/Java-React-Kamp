import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class main {

	public static void main(String[] args) throws RemoteException {

		
		Customer customer1=new Customer(1,"Melisa","Yýldýz",1998,"39301015956");
		BaseCustomerManager	baseManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		baseManager.Save(customer1);
		System.out.println();
		
	}

}
