package interface_demo;

public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Injection to database : MySql");
	}

}
