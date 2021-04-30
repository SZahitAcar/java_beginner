package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer zahit = new IndividualCustomer();
		zahit.id=1;
		zahit.customerNumber="123";
		zahit.firstName = "Zahit";
		zahit.lastName="Acar";
		zahit.nationalIdentity="32045522300";
		
		CorporateCustomer apple = new CorporateCustomer();
		apple.customerNumber = "1232";
		
		CustomerManager customerManager =new CustomerManager();
		
		Customer[] customers = {zahit,apple};
		
		customerManager.addMultiple(customers);
		
		
	}

}
