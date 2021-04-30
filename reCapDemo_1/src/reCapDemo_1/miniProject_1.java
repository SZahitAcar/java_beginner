package reCapDemo_1;

public class miniProject_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int[] dividers = {2,3,5,7};
		boolean isPrime = true;
		
		if(number<1) {
			System.out.print("Gecersiz Sayi");
		}else {
		
		for (int i=0; i<dividers.length; i++) {
			if(number != dividers[i] && number % dividers[i] == 0) {
				isPrime = false;
			}if(number==1) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("sayi asal");
		}else {
			System.out.println("sayi asal degil");
		}
		
		}

	}

}
