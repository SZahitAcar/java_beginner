package classHomeWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course_1 = new Course(1,"JAVA & REACT","Kampimiz 2 ay surecektir.","Engin Demirog");
		Course course_2 = new Course(1,"C# & ANGULAR","Kampimiz 2 ay surecektir.","Engin Demirog");
		CourseManager courseManager = new CourseManager();
		
		Course[] courses = {course_1,course_2};
		// Kurslarin ekranda listelenmesi.
		
		for (Course course :courses) {
			System.out.println(course.courseName);
		}
		
		// Tiklanan kursa kayit olusturma.
		
		courseManager.joinCourse(course_1);
		courseManager.joinCourse(course_2);
		
	}

}
