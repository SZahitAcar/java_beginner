package ploymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BaseLogger[] loggers = new BaseLogger[] {
//				new DatabaseLogger(),
//				new FileLogger(),
//				new EmailLogger()
//		};
//		
//		for (BaseLogger logger: loggers) {
//			logger.log("Loglama tamamlandi!");
//		}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
