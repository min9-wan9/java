package baiLam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement implements Searchable,Storable{
	Scanner sc = new Scanner(System.in);
	List<Product> productList = new ArrayList<>();
	String fileName;
	

	@Override
	public void Add(Product product) {
		

		productList.add(product);
		
	}

	@Override
	public void Remove(Product product) {
		productList.remove(product);
		
	}

	@Override
	public Product SearchByName(String name) {
		Product product= null;
		for(int i=0;i<productList.size();i++) {
			if(productList.get(i).getName().contains(name)) {
				product= productList.get(i);
			}
		}
		if(product != null) {
			System.out.println(product);
		}else {
			System.out.println("Không tìm thấy");
		}
		return null;
	}

	@Override
	 public  Product SearchById(Long id) {
		Product product= null;
		for(int i=0;i<productList.size();i++) {
			if(productList.get(i).getId() == id) {
				product= productList.get(i);
			}
		}
		if(product != null) {
			System.out.println(product);
		}else {
			System.out.println("Không tìm thấy");
		}
		return null;
		
	}

	public int size() {
		
		return productList.size();
	}
}
