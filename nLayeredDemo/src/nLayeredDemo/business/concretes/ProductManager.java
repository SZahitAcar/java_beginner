package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao Productdao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao Productdao, LoggerService loggerService) {
		super();
		this.Productdao = Productdao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor");
			return;
		}
		this.Productdao.add(product);
		this.loggerService.logToSystem("Urun eklendi " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
