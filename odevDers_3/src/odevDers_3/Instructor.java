package odevDers_3;

public class Instructor extends User{
	
	int numberOfStudents;
	
	public Instructor(int id, String firstName, String lastName, int numberOfStudents) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfStudents = numberOfStudents;
	}

}
