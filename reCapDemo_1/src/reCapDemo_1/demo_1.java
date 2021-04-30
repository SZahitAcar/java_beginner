package reCapDemo_1;

public class demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 32;
		int sayi2 = 61;
		int sayi3 = 28;
		int greatestNumber = sayi1;
		
		// Benim ilk yaklasimim kod tekrari var.
		
		if(sayi1>sayi2) {
			if(sayi1>sayi3) {
				System.out.println("Greatest Number Is Sayi1");
			}else if(sayi1<sayi3) {
				System.out.println("Greatest Number Is Sayi3");	
			}
		}else if (sayi2>sayi1) {
			if(sayi2>sayi3) {
				System.out.println("Greatest Number Is Sayi2");
			}else {
				System.out.println("Greatest Number Is Sayi3");
			}
		}
		
		// Engin Demirog yaklasimi.
		if(greatestNumber< sayi2) {
			greatestNumber = sayi2;
		}
		
		if(greatestNumber < sayi3) {
			 greatestNumber = sayi3;
		}
		
		System.out.println("Greatest Number Is :" + greatestNumber);
	}

}
