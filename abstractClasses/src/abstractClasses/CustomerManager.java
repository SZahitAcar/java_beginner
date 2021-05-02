package abstractClasses;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomer() {
		
		databaseManager.getData();
	}
	
}
