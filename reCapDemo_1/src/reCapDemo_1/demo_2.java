package reCapDemo_1;

public class demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.3,9.6,5.2,4.6};
		double total = 0;
		double greatest = myList[0];
		
		for(double item : myList) {
			if (greatest<item) {
				greatest = item;
			}
			total += item;
		}
		System.out.println(total);
		System.out.println(greatest);
		

	}

}
