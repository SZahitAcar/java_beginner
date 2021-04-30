package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem dortIslem = new DortIslem();
		int toplama = dortIslem.Topla(2, 4);
		int cikarma = dortIslem.cikarma(2,5);
		int carpma = dortIslem.carpma(2,5);
		int bolme = dortIslem.bolme(10,2);
		
		System.out.println(toplama);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);
	}

}
