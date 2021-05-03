package interface_demo;

public class SqlServerDal implements ICustomerDal {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Injection to database : Sql Server");
	}

}
