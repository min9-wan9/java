package baiLam;

public class Product {
	private long id;
	private String name;
	private String category;
	private double quantity;
	public Product(long id, String name, String category, double quantity) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", quantity=" + quantity + "]";
	}
	
}
