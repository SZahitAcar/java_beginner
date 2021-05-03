package interface_demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.add();
		CustomerManager customerManager = new CustomerManager(new SqlServerDal());
		customerManager.add();
	}

}
