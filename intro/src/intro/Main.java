package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CamelCase naming
		String internetSubeButonu = "Internet Subesi";
		
		int vade = 36;
		double dolar_yest = 8.18;
		double dolar_today = 8.18;
		boolean dustuMu = true;
		
		
		System.out.println(internetSubeButonu);
		System.out.println(vade);
		System.out.println(dolar_yest);
		System.out.println(dustuMu);
		
		if (dolar_today<dolar_yest) {
			System.out.println("Dolar Dustu Resmi");
			
		}else if(dolar_today>dolar_yest) {
			System.out.println("Dolar Artti Resmi");
		}else {
			System.out.println("Degisim yok");
		}
		String[] krediler = {
				"Hizli Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Ciftci Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kultur Bakanligi Kredisi"};
		
		for(int i=0; i<krediler.length; i++ ) {
			System.out.println(krediler[i]);
		}
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);

	}

}
