package structural.composite;

public class Product extends CatalogComponent{
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String getName(CatalogComponent catalogComponent) {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public double getPrice(CatalogComponent catalogComponent) {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());;
	}

	@Override
	public String toString() {
		return "Product  Name : " + name + " Price : " + price ;
	}
	
	
}
