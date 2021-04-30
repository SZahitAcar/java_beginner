
public class Main {

	public static void main(String[] args) {
		
		//soft kullanim constructor kullanimiyla
		Product product1 =new Product(1,"lenovo V14",15000,"16 GB Ram",10);
		
		Product product2 =new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		
		Product product3 =new Product();
		product3.setId(3);
		product3.setName("Lenovo V16");
		product3.setDetail("32 GB");
		product3.setDiscount(10);
		product3.setUnitPrice(19000);

		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
				System.out.println(product.getName());
				System.out.println(product.getUnitPriceAfterDiscount());
			}
		 
		System.out.println(products.length);
		
		Category category1 = new Category(1,"Bilgisayar");
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("yemek");
		
		Category[] categories = {category1,category2};
		for (Category category : categories) {
			System.out.println(category.getName());
			System.out.println(category.getName());
		}
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
}
