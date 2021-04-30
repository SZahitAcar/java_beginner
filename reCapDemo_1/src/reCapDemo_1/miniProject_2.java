package reCapDemo_1;

public class miniProject_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		int counter = 0;
		
		for(int i= 1; i<number; i++) {
			if(number % i == 0 ) {
				counter += i;
			}
		}
		
		if (number == counter) {
			System.out.println("Sayi Mukemmeldir.");
		}
		
		
	}

}
