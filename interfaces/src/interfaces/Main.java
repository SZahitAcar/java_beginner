package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new DatabaseLogger() , new EmailLogger(), new SmsLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"engin","demirog");
		
		customerManager.add(engin);
	}

}
