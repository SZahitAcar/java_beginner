package odevDers_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User[] users = new User[] {new Instructor(), new Student()};
		Student zody = new Student();
		zody.id = 61;
		zody.firstName = "Zahit";
		zody.lastName = "Acar";
		zody.progress = 48;
		
		//Class yazma turleri_2
		Instructor enginDemirog = new Instructor(1,"Engin","Demirog",2200);
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.loginKodlamaIO(zody.firstName);
		userManager.loginKodlamaIO(enginDemirog.firstName);
		
		studentManager.joinCourse();
		instructorManager.createCourse("Java");
		
		
		
		
	}

}
